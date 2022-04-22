package com.apedano.sample.frontend.repository;

import com.apedano.sample.frontend.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}