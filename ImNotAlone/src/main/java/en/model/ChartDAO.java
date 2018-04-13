package en.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import en.dto.ChartDTO;

public class ChartDAO extends SqlSessionDaoSupport {

	public List<ChartDTO> selectMonth() {
		return getSqlSession().selectList("enadmin.selectMonth");
	}
}
