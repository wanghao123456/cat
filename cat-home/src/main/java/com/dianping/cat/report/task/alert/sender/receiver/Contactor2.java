package com.dianping.cat.report.task.alert.sender.receiver;

import java.util.List;

public interface Contactor2 {
	
	public String getId();

	public List<String> queryEmailContactors(String id);

	public List<String> queryWeiXinContactors(String id);

	public List<String> querySmsContactors(String id);
}
