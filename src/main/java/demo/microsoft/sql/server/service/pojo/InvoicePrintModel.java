package demo.microsoft.sql.server.service.pojo;

import java.sql.Date;

public class InvoicePrintModel {

	private String lineType;
	private String customer;
	private String name;
	private String shortName;
	private String soldToAddr1;
	private String soldToAddr2;
	private String soldToAddr3;
	private String soldToAddr4;
	private String soldToAddr5;
	private String soldPostalCode;
	private String customerPoNumber;
	private Date invoiceDate;
	private String invoice;
	private String salesOrder;
	private float salesOrderLine;
	private String warehouse;
	private String product;
	private float qtyInvoiced;
	private float wWLuqEqvQty;
	private float value;
	
	public InvoicePrintModel() {
		super();
	}
	
	public InvoicePrintModel(String lineType, String customer, String name, String shortName, String soldToAddr1,
			String soldToAddr2, String soldToAddr3, String soldToAddr4, String soldToAddr5, String soldPostalCode,
			String customerPoNumber, Date invoiceDate, String invoice, String salesOrder, float salesOrderLine,
			String warehouse, String product, float qtyInvoiced, float wWLuqEqvQty, float value) {
		super();
		this.lineType = lineType;
		this.customer = customer;
		this.name = name;
		this.shortName = shortName;
		this.soldToAddr1 = soldToAddr1;
		this.soldToAddr2 = soldToAddr2;
		this.soldToAddr3 = soldToAddr3;
		this.soldToAddr4 = soldToAddr4;
		this.soldToAddr5 = soldToAddr5;
		this.soldPostalCode = soldPostalCode;
		this.customerPoNumber = customerPoNumber;
		this.invoiceDate = invoiceDate;
		this.invoice = invoice;
		this.salesOrder = salesOrder;
		this.salesOrderLine = salesOrderLine;
		this.warehouse = warehouse;
		this.product = product;
		this.qtyInvoiced = qtyInvoiced;
		this.wWLuqEqvQty = wWLuqEqvQty;
		this.value = value;
	}
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getSoldToAddr1() {
		return soldToAddr1;
	}
	public void setSoldToAddr1(String soldToAddr1) {
		this.soldToAddr1 = soldToAddr1;
	}
	public String getSoldToAddr2() {
		return soldToAddr2;
	}
	public void setSoldToAddr2(String soldToAddr2) {
		this.soldToAddr2 = soldToAddr2;
	}
	public String getSoldToAddr3() {
		return soldToAddr3;
	}
	public void setSoldToAddr3(String soldToAddr3) {
		this.soldToAddr3 = soldToAddr3;
	}
	public String getSoldToAddr4() {
		return soldToAddr4;
	}
	public void setSoldToAddr4(String soldToAddr4) {
		this.soldToAddr4 = soldToAddr4;
	}
	public String getSoldToAddr5() {
		return soldToAddr5;
	}
	public void setSoldToAddr5(String soldToAddr5) {
		this.soldToAddr5 = soldToAddr5;
	}
	public String getSoldPostalCode() {
		return soldPostalCode;
	}
	public void setSoldPostalCode(String soldPostalCode) {
		this.soldPostalCode = soldPostalCode;
	}
	public String getCustomerPoNumber() {
		return customerPoNumber;
	}
	public void setCustomerPoNumber(String customerPoNumber) {
		this.customerPoNumber = customerPoNumber;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}
	public float getSalesOrderLine() {
		return salesOrderLine;
	}
	public void setSalesOrderLine(float salesOrderLine) {
		this.salesOrderLine = salesOrderLine;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getQtyInvoiced() {
		return qtyInvoiced;
	}
	public void setQtyInvoiced(float qtyInvoiced) {
		this.qtyInvoiced = qtyInvoiced;
	}
	public float getwWLuqEqvQty() {
		return wWLuqEqvQty;
	}
	public void setwWLuqEqvQty(float wWLuqEqvQty) {
		this.wWLuqEqvQty = wWLuqEqvQty;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "InvoicePrintModel [lineType=" + lineType + ", customer=" + customer + ", name=" + name + ", shortName="
				+ shortName + ", soldToAddr1=" + soldToAddr1 + ", soldToAddr2=" + soldToAddr2 + ", soldToAddr3="
				+ soldToAddr3 + ", soldToAddr4=" + soldToAddr4 + ", soldToAddr5=" + soldToAddr5 + ", soldPostalCode="
				+ soldPostalCode + ", customerPoNumber=" + customerPoNumber + ", invoiceDate=" + invoiceDate
				+ ", invoice=" + invoice + ", salesOrder=" + salesOrder + ", salesOrderLine=" + salesOrderLine
				+ ", warehouse=" + warehouse + ", product=" + product + ", qtyInvoiced=" + qtyInvoiced
				+ ", wWLuqEqvQty=" + wWLuqEqvQty + ", value=" + value + "]";
	}

	

}
