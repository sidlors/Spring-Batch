package com.bc.batch.watch.listener;

import java.util.List;
import org.springframework.batch.core.ItemWriteListener;

import com.bc.batch.watch.model.ResultModel;


public class CustomItemWriterListener implements ItemWriteListener<ResultModel> {
	
	
	private String name;

	@Override
	public void beforeWrite(List<? extends ResultModel> items) {
		//System.out.println(this.name+ " ItemWriteListener - beforeWrite");
	}

	@Override
	public void afterWrite(List<? extends ResultModel> items) {
		//System.out.println(this.name+ " ItemWriteListener - afterWrite");
	}

	@Override
	public void onWriteError(Exception exception, List<? extends ResultModel> items) {
		System.err.println(this.name+ " ItemWriteListener - onWriteError");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}