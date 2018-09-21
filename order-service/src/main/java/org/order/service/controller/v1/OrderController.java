package org.order.service.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Value("${application.message}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

}
