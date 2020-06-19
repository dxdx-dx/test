package boot.activemq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.activemq.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
	public boolean doCreate(Dept vo) ;
}
