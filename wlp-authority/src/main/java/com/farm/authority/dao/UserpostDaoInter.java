package com.farm.authority.dao;

import com.farm.authority.domain.Userpost;
import org.hibernate.Session;
import com.farm.core.sql.query.DBRule;
import com.farm.core.sql.query.DataQuery;
import com.farm.core.sql.result.DataResult;
import java.util.List;
import java.util.Map;

 
public interface UserpostDaoInter {
	 
	public void deleteEntity(Userpost userpost);

	 
	public Userpost getEntity(String userpostid);

	 
	public Userpost insertEntity(Userpost userpost);

	 
	public int getAllListNum();

	 
	public void editEntity(Userpost userpost);

	 
	public Session getSession();

	 
	public DataResult runSqlQuery(DataQuery query);

	 
	public void deleteEntitys(List<DBRule> rules);

	 
	public List<Userpost> selectEntitys(List<DBRule> rules);

	 
	public void updataEntitys(Map<String, Object> values, List<DBRule> rules);

	 
	public int countEntitys(List<DBRule> rules);

	 
	public List<Userpost> getTempUserPost(String userId);
}