package com.morty.c137.dto;

import java.io.Serializable;
import java.util.Map;

public class PageableDto implements Serializable {

    private static final long serialVersionUID = 5736181137400458574L;
    private Integer page = 1;

	private Integer perPageRows = 20;

	private Map<String,String> sorts;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPageRows() {
		return perPageRows;
	}

	public void setPerPageRows(Integer perPageRows) {
		this.perPageRows = perPageRows;
	}

	public Map<String, String> getSorts() {
		return sorts;
	}

	public void setSorts(Map<String, String> sorts) {
		this.sorts = sorts;
	}
}
