package service;

import service.bean.Bean;

public class TopService extends CategoryService {

	@Override
	void prePare() {
	}

	public Bean createTopBean(){
		Bean bean = new Bean();
		this.getCategories(bean);

		/* toppage処理をあとで書く */

		return bean;
	}

}
