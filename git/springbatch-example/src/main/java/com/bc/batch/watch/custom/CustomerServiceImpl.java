package com.bc.batch.watch.custom;

import com.bc.batch.watch.model.ResultModel;

public class CustomerServiceImpl {

	public void logCustomer(ResultModel model) {
		System.out.println("I just saved " + model);
	}

}
