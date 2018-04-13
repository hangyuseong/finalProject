package en.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import en.dto.ChartDTO;
import en.model.ChartDAO;

public class ChartService {

	@Autowired
	ChartDAO dao;
	
	public void setDao(ChartDAO dao) {
		this.dao = dao;
	}


	public List<ChartDTO> selectMonth() {
		
		return dao.selectMonth();
	}
}
