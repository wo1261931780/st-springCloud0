package wo1261931780.orderService.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.feignApi.pojo.TbUser;

/**
*Created by Intellij IDEA.
*Project:testSpringCloud
*Package:wo1261931780.userService.pojo
*@author liujiajun_junw
*@Date 2023-10-20-14  星期二
*@Description 
*/

@Mapper
public interface TbUserMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TbUser record);

    int insertOrUpdate(TbUser record);

    int insertOrUpdateSelective(TbUser record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbUser record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbUser record);

    int updateBatch(List<TbUser> list);

    int updateBatchSelective(List<TbUser> list);

    int batchInsert(@Param("list") List<TbUser> list);
}
