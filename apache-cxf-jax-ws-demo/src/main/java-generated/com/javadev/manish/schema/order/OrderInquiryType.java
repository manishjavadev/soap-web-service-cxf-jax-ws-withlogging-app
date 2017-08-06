
package com.javadev.manish.schema.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInquiryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInquiryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniqueOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInquiryType", propOrder = {
    "uniqueOrderId",
    "orderQuantity",
    "accountId",
    "isbn"
})
public class OrderInquiryType {

    protected int uniqueOrderId;
    protected int orderQuantity;
    protected int accountId;
    protected long isbn;

    /**
     * Gets the value of the uniqueOrderId property.
     * 
     */
    public int getUniqueOrderId() {
        return uniqueOrderId;
    }

    /**
     * Sets the value of the uniqueOrderId property.
     * 
     */
    public void setUniqueOrderId(int value) {
        this.uniqueOrderId = value;
    }

    /**
     * Gets the value of the orderQuantity property.
     * 
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     */
    public void setOrderQuantity(int value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     */
    public void setIsbn(long value) {
        this.isbn = value;
    }

}
