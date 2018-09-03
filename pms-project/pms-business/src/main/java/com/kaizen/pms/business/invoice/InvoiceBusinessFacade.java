package com.kaizen.pms.business.invoice;

import com.kaizen.pms.domain.model.event.ShoppingCart;
import com.kaizen.pms.domain.model.invoice.Invoice;

public interface InvoiceBusinessFacade {

	Invoice performInvoiceGeneration(ShoppingCart shoppingCart);
}
