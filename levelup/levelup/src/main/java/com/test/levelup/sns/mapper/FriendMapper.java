package com.test.levelup.sns.mapper;

import com.test.levelup.sns.model.FriendDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FriendMapper {
    @Select("""
            select * from friend
            """)
    List<FriendDto> findAll();

    @Insert("""
            insert into friend (user_id,friend_id,created_dt,updated_dt)
            values(#{userId},#{friendId},now(),now())
            """)
    void createAll(FriendDto friendDto);

    @Delete("""
            delete from friend
            where id = #{id}
            """)
    void deleteAll(Long id);

    @Update("""
            update friend set user_id = #{userId}, friend_id = #{friendId}, updated_dt = now()
            where id = #{id}
            """)
    void updateAll(FriendDto friendDto);
}
