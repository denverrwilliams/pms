package com.kaizen.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaizen.pms.persistence.dao.FooDao;
import com.kaizen.pms.persistence.model.Foo;

@Service
@Transactional
public class FooService {
	
	@Autowired
	private FooDao fooDao;
	
	public Optional<Foo> findById(long id) {
		return fooDao.findById(id);
	}
	
	public List<Foo> findAll() {
		return fooDao.findAll();
	}
	
	public void create(Foo foo) {
		fooDao.save(foo);
	}

}
