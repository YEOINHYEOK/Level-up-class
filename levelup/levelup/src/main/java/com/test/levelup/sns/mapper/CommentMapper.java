package com.test.levelup.sns.mapper;

import com.test.levelup.sns.model.CommentDto;
import com.test.levelup.sns.model.CommentPostDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("""
            SELECT * FROM comment
            """)
    List<CommentDto> findAll();

    @Insert("""
            insert into comment (post_id, comment_user, created_dt, updated_dt)
            values (#{postId},#{commentUser},now(),now())
            """)
    void createAll(CommentDto commentDto);

    @Delete("""
            delete from comment
            where id = #{id};
            """)
    void deleteCom(Long id);

    @Update("""
            update comment set post_id = #{postId}, comment_user = #{commentUser}, updated_dt = now()
            where id = #{id};
            """)
    void updateCom(CommentDto commentDto);

    List<CommentPostDto> commentWithPost();
}