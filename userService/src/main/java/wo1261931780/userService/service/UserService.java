package wo1261931780.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wo1261931780.userService.mapper.TbUserMapper;
import wo1261931780.userService.pojo.TbUser;

/**
 * @author 64234
 */
@Service
public class UserService {

	@Autowired
	private TbUserMapper tbUserMapper;

	public TbUser queryById(Long id) {
		return tbUserMapper.findById(id);
	}
}
