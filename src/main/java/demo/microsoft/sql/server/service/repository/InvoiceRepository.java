package demo.microsoft.sql.server.service.repository;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import demo.microsoft.sql.server.service.pojo.InvoicePrintModel;

@Service
public class InvoiceRepository implements Repository<String, Long> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public InvoiceRepository() {
		super();
	}

	public List<InvoicePrintModel> invoiceQuery() {
		return jdbcTemplate.query("exec [tcWW].[procWoolworthsInvoice] @SalesOrder='049858'", new BeanPropertyRowMapper<InvoicePrintModel>(InvoicePrintModel.class));
	}

}
