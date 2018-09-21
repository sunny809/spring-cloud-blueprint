package org.order.service.entity;

import java.util.Date;

public class Order {
	private long id;
	private String orderNo;
	private int totalAmount;
	private ProcessStatus status;
	private Date createTimestamp;
	private String createReference;
	private Date lastUpdateDate;
	private String lastUpdateReference;
}
