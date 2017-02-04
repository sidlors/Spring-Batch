package com.bc.batch.watch.particioner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import com.bc.batch.watch.util.WatchBatchHelper;

public class RangePartitioner implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {

		Map<String, ExecutionContext> result = new HashMap<String, ExecutionContext>();

		int limit = WatchBatchHelper.TOTAL / gridSize;
		int skip = 0;

		for (int i = 0; i < gridSize; i++) {
			ExecutionContext value = new ExecutionContext();
			skip=i * limit;	
			value.putString("name", "Thread" + i);
			value.putInt("skip", i * skip);
			if (i == gridSize - 1) {
				value.putInt("limit", (WatchBatchHelper.TOTAL-(i * limit)));
			}else{
				
				value.putInt("limit", limit);
			}
			System.out.println("\nStarting : Thread" + (i + 1));
			System.out.println("rango : ["+skip+","+(skip+limit)+"]");
			System.out.println("limit : " + limit);
			result.put("partition" + i, value);

		}

		return result;
	}

}