package com.test.levelup.sns.mapper;

import com.test.levelup.sns.model.LikeDto;
import com.test.levelup.sns.model.UserLikeDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LikeMapper {

    @Select("""
            select * from `like`
            """)
    List<LikeDto> findAll();

    @Insert("""
            insert into `like` (user_id, post_id, comment_id, created_dt, updated_dt)
            values (#{userId},#{postId},#{commentId},now(),now())
            """)
    void createAll(LikeDto likeDto);

    @Delete("""
            delete from `like`
            where id = #{id}
            """)
    void deleteAll(Long id);

    @Select("""
            select count(*) from `like`
            where post_id = #{postId}
            """)
    int findPost(Long postId);

    @Select("""
            select count(*) from `like`
            where comment_id = #{commentId}
            """)
    int findComment(Long commentId);

    List<UserLikeDto> userWithComment(Long id);
}