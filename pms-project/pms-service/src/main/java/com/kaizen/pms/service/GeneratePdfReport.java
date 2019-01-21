package com.kaizen.pms.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdfReport {

	
	private static String FILE = "path-to-file";
	private static Font h1Font = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
	private static Font h2Font = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
	private static Font h2FontUnderline = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD | Font.UNDERLINE);
	private static Font h3Font = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
	private static Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
	private static Font normalBoldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	private static Font normalUnderline = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL | Font.UNDERLINE);
	private static Font smallFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
	
	
	
	public static ByteArrayInputStream generatePdfInvoice() {
		
		InvoiceMock invoice = getMockInvoice();
		
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		try {
			
			PdfWriter writer = PdfWriter.getInstance(document, out);
			
			/**
			 * add header and footer before document.open()
			 */
//		    TableHeader event = new TableHeader();
//	        writer.setPageEvent(event);
			
		    /**
		     * open document
		     */
			document.open();
			
			/**
			 * add page border
			 * Get the dimensions of the page
			 */
			addPageBorder(document, document.getPageSize().getWidth(), document.getPageSize().getHeight());
			
		    /**
		     * add document metadata
		     */
			addMetaData(document);
			
			/**
			 * page title
			 */
			Paragraph paragraph = new Paragraph();
			paragraph.add(new Phrase("Invoice", h1Font));
			paragraph.setSpacingAfter(20);
			paragraph.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraph);
			
			/**
			 * Display invoice info
			 */
			PdfPTable invoiceInfotable = new PdfPTable(2);
			invoiceInfotable.setWidthPercentage(30);
			invoiceInfotable.setWidths(new int[]{1, 1});
			invoiceInfotable.setHorizontalAlignment(Element.ALIGN_RIGHT);

			createNoBorderTableRow(invoiceInfotable, "Invoice No.: ", invoice.getInvoiceNo());
			createNoBorderTableRow(invoiceInfotable, "Account No.: ", invoice.getAccountNo());
			SimpleDateFormat formatDate = new SimpleDateFormat("MM-dd-yyyy");
			String dueDate = formatDate.format(invoice.getDueDate());
			String now = formatDate.format(new Date());
			createNoBorderTableRow(invoiceInfotable, "Date: ", now);
			createNoBorderTableRow(invoiceInfotable, "Due Date: ", dueDate);
			document.add(invoiceInfotable);
			
			/**
			 * Bill To
			 * display customer info
			 */
			paragraph = new Paragraph();
			paragraph.add(new Paragraph("Bill To", h2FontUnderline));
			paragraph.setSpacingAfter(10);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(75);
			table.setWidths(new int[]{1, 2});
			table.setHorizontalAlignment(Element.ALIGN_LEFT);

			createNoBorderTableRow(table, "Name: ", "John Doe");
			createNoBorderTableRow(table, "Email Address: ", "john@mail.com");
			createNoBorderTableRow(table, "Phone Number: ", "202-123-4567");
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.YEAR, -17);
			SimpleDateFormat dob = new SimpleDateFormat("MM-dd-yyyy");
			createNoBorderTableRow(table, "Date of Birth: ", dob.format(calendar.getTime()));
			document.add(table);
			
			/**
			 * Subject line - placeholder
			 */
			paragraph = new Paragraph();
			paragraph.setSpacingBefore(20);
			paragraph.setSpacingAfter(20);
			paragraph.add(new Phrase("Subject:", normalBoldFont));
			paragraph.add(new Phrase("Whatever subject line goes here", normalUnderline));
			document.add(paragraph);

			/**
			 * Invoice main content
			 */
			PdfPTable table2 = new PdfPTable(5);
			table2.setWidthPercentage(95);
			table2.setWidths(new int[]{2, 6, 1, 2, 2});
			table2.setHorizontalAlignment(Element.ALIGN_LEFT);
			
			createTableRowHeader(table2, normalBoldFont, "Code", "Description", "Qty", "Price", "Line Total");
			for (LineItem item : invoice.getLineItems()) {
				createTableWith5Columns(table2, item.getCode(), item.getDescription(), 
						String.valueOf(item.getQty()), String.valueOf(item.getPrice()), String.valueOf(item.getLineTotal()));
			}
			createTable_2Rows_ColSpan4(table2, "", "");
			createTable_2Rows_ColSpan4(table2, "", "");
			document.add(table2);
			
			/**
			 * display summary
			 */
			PdfPTable totalTable = new PdfPTable(2);
			totalTable.setWidthPercentage(50);
			totalTable.setWidths(new int[]{1, 1});
			totalTable.setHorizontalAlignment(Element.ALIGN_RIGHT);

			createNoBorderTableRow(totalTable, "Sub total: ", "120.00");
			createNoBorderTableRow(totalTable, "Tax: ", "5.00");
			createNoBorderTableRow(totalTable, "Total: ", "125.00");
			createNoBorderTableRow(totalTable, "Credit: ", "10.00");
			createNoBorderTableRow(totalTable, "Balance Due: ", "115.00");
			document.add(totalTable);
			
			/**
			 * close document
			 */
			document.close();
		} catch (DocumentException e) {
			Logger.getLogger(GeneratePdfReport.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		}
		
		return new ByteArrayInputStream(out.toByteArray()); 
		
	}

	private static void addPageBorder(Document document, float width, float height) throws DocumentException {
		Rectangle rect= new Rectangle(width - 20, height - 20, 20, 20); 
		rect.setBorder(Rectangle.BOX);
		rect.setBorderColor(BaseColor.BLACK);
		rect.setBorderWidth(1);
		document.add(rect);
	}
	
	/**
	 * Add metadata to the PDF 
	 * When PDF opened in Adobe Reader
	 * To View properties >> under File -> Properties
	 */
	private static void addMetaData(Document document) {
		document.addTitle("Title of the document");
		document.addSubject("Subject goes here");
		document.addKeywords("Key words, important words");
		document.addAuthor("Author");
		document.addCreator("Creator");
	}
	
	private static void createNoBorderTableRow(PdfPTable table, String label, String value){
		
		PdfPCell cell = new PdfPCell();

		// row 1, cell 1
		cell = new PdfPCell(new Phrase(label, normalFont));
		cell.setBorder(Rectangle.NO_BORDER);
		table.addCell(cell);
		
		// row 1, cell 2
		cell = new PdfPCell(new Phrase(value, normalFont));
		cell.setBorder(Rectangle.NO_BORDER);
		table.addCell(cell);
	}
	
	private static void createTableRowHeader(PdfPTable table, Font font, String value1, 
			String value2, String value3, String value4, String value5){
		
		PdfPCell cell = new PdfPCell();
		// row 1, cell 1
		cell = new PdfPCell(new Phrase(value1, font));
		cell.setPadding(8);
		cell.setBorderWidthBottom(2f);
//        cell.setBackgroundColor(BaseColor.CYAN);
        cell.setGrayFill(0.95f);
		table.addCell(cell);
		// row 1, cell 2
		cell = new PdfPCell(new Phrase(value2, font));
		cell.setPadding(8);
		cell.setBorderWidthBottom(2f);
        cell.setGrayFill(0.95f);
		table.addCell(cell);
		// row 1, cell 3
		cell = new PdfPCell(new Phrase(value3, font));
		cell.setPadding(8);
		cell.setBorderWidthBottom(2f);
        cell.setGrayFill(0.95f);
		table.addCell(cell);
		// row 1, cell 3
		cell = new PdfPCell(new Phrase(value4, font));
		cell.setPadding(8);
		cell.setBorderWidthBottom(2f);
        cell.setGrayFill(0.95f);
		table.addCell(cell);
		// row 1, cell 3
		cell = new PdfPCell(new Phrase(value5, font));
		cell.setPadding(8);
		cell.setBorderWidthBottom(2f);
        cell.setGrayFill(0.95f);
		table.addCell(cell);
	}
	
	private static void createTableWith5Columns(PdfPTable table, String value1, 
			String value2, String value3, String value4, String value5){
		PdfPCell cell = new PdfPCell();
		
		// row 1, cell 1
		cell = new PdfPCell(new Phrase(value1, normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		// row 1, cell 2
		cell = new PdfPCell(new Phrase(value2, normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		// row 1, cell 3
		cell = new PdfPCell(new Phrase(value3, normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		// row 1, cell 4
		cell = new PdfPCell(new Phrase(value4, normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		table.addCell(cell);
		// row 1, cell 5
		cell = new PdfPCell(new Phrase(value5, normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		table.addCell(cell);

	}
	
	private static void createTable_2Rows_ColSpan4(PdfPTable table, String label, String value){
		PdfPCell cell = new PdfPCell();
		
		// row 1, cell 1
		cell = new PdfPCell(new Phrase(label, normalFont));
		table.addCell(cell);
		
		// row 1, cell 2
		cell = new PdfPCell(new Phrase(value, normalFont));
		cell.setColspan(4);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		table.addCell(cell);
	}
	
	
	private static InvoiceMock getMockInvoice() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 6);
		InvoiceMock invoice = new InvoiceMock("INV-001", "ACC-12345", calendar.getTime());
		invoice.addLineItem(new LineItem("CD-1", "Description for CD-1 item", 1, 100.00, 100.00));
		invoice.addLineItem(new LineItem("CD-2", "Description for CD-2 item", 3, 50.00, 150.00));
		invoice.addLineItem(new LineItem("CD-3", "Description for CD-3 item", 2, 300.00, 600.00));
		return invoice;
	}
	
}