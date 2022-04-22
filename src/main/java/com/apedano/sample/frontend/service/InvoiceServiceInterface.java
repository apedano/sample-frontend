package com.apedano.sample.frontend.service;

import com.apedano.sample.frontend.model.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}