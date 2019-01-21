package com.kaizen.pms.service.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kaizen.pms.service.GeneratePdfReport;



@RestController
public class PdfController {
	

	@RequestMapping(value = "/pdfreport/invoice/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generatePdfInvoice(@PathVariable("userId") Long userId) throws IOException {

		ByteArrayInputStream bis = GeneratePdfReport.generatePdfInvoice();

		HttpHeaders headers = new HttpHeaders();
		String filename = "invoice";
		headers.add("Content-Disposition", "inline; filename=" + filename + ".pdf");

		return ResponseEntity
				.ok()
				.headers(headers)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}
	
}