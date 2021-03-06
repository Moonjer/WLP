package com.farm.learn.dao;

import com.farm.learn.domain.ClassTag;
import org.hibernate.Session;
import com.farm.core.sql.query.DBRule;
import com.farm.core.sql.query.DataQuery;
import com.farm.core.sql.result.DataResult;
import java.util.List;
import java.util.Map;


 
public interface ClasstagDaoInter  {
  
 public void deleteEntity(ClassTag classtag) ;
  
 public ClassTag getEntity(String classtagid) ;
  
 public  ClassTag insertEntity(ClassTag classtag);
  
 public int getAllListNum();
  
 public void editEntity(ClassTag classtag);
  
 public Session getSession();
  
 public DataResult runSqlQuery(DataQuery query);
  
 public void deleteEntitys(List<DBRule> rules);

  
 public List<ClassTag> selectEntitys(List<DBRule> rules);

  
 public void updataEntitys(Map<String, Object> values, List<DBRule> rules);
  
 public int countEntitys(List<DBRule> rules);
}