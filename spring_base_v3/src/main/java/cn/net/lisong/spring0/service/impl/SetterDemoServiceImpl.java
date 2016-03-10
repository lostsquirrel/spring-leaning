package cn.net.lisong.spring0.service.impl;

import cn.net.lisong.spring0.dao.SetterDemoDAO;
import cn.net.lisong.spring0.service.SetterDemoService;

public class SetterDemoServiceImpl implements SetterDemoService {

	private SetterDemoDAO setterDemoDAO;

	public SetterDemoDAO getSetterDemoDAO() {
		return setterDemoDAO;
	}

	public void setSetterDemoDAO(SetterDemoDAO setterDemoDAO) {
		this.setterDemoDAO = setterDemoDAO;
	}

	@Override
	public String toString() {
		return "SetterDemoServiceImpl [setterDemoDAO=" + setterDemoDAO + "]";
	}

}
