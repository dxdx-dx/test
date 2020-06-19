package boot.activemq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import boot.activemq.dao.IDeptDAO;
import boot.activemq.service.IDeptService;
import boot.activemq.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;
	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}
	@Override
	public boolean add(Dept vo) {
		return this.deptDAO.doCreate(vo);
	}
}
