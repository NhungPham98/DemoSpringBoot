package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
@Mapper
public interface UserMyBatisRepository {
	
	@Select("select * from User")
	public List<User> findAll();
	
	@Select("SELECT * FROM User WHERE id = #{id}")
    public User findById(int id);
	
	@Delete("DELETE FROM User WHERE id = #{id}")
    public int deleteById(int id);
	
	@Insert("INSERT INTO User(id, name, pass) " +
	        " VALUES (#{id}, #{name}, #{pass})")
	    public int insert(User user);
	
	@Update("update user set name=#{name}, pass=#{pass} where id=#{id}")
	int update(User user);
}
