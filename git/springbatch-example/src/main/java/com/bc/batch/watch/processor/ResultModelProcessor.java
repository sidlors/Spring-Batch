package com.bc.batch.watch.processor;
import org.springframework.batch.item.ItemProcessor;

import com.bc.batch.watch.model.ResultModel;

public class ResultModelProcessor implements ItemProcessor<ResultModel,ResultModel> {
	
	
	private String threadName;

	@Override
	public ResultModel process(ResultModel item) throws Exception {
		
		return item;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	
	

}
