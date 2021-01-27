package cn.xjt.batis.controller;

import cn.xjt.batis.mapper.UserMapper;
import cn.xjt.batis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/5-17:02
 */

@RestController
public class UserController {

	@Autowired
	UserMapper userMapper;

	@RequestMapping("/user")
	public String queryUserList()
	{
		List<User> users = userMapper.queryUserList();
		String user = users.toString();
		return user;
	}

	@RequestMapping("/q/{id}")
	public String queryById(@PathVariable("id") Integer id)
	{
		User user = userMapper.queryById(id);
		String u = user.toString();
		return u;
	}

	@RequestMapping("/adduser")
	public int addUser()
	{
		int i = userMapper.addUser(new User(null,"xujiangtao","123456"));
		return i;
	}

	@RequestMapping("/updateuser")
	public int updateUser()
	{
		int i = userMapper.updateUser(new User(2,"老师","147258369"));
		return i;
	}

	@RequestMapping("/deleteuser/{id}")
	public int deleteUser(@PathVariable("id") Integer id)
	{
		int i = userMapper.deleteUser(id);
		return i;
	}
}
