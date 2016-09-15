package demo.microsoft.sql.server.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.microsoft.sql.server.service.pojo.InvoicePrintModel;
import demo.microsoft.sql.server.service.repository.InvoiceRepository;

@RestController
public class InvoiceController {

	private final InvoiceRepository invoiceRepository;

	@Autowired
	InvoiceController(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;

	}

	@RequestMapping("/invoice")
	List<InvoicePrintModel> commodityQuery() {
		return invoiceRepository.invoiceQuery();
	}

}
