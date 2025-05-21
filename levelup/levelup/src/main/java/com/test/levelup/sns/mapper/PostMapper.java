package com.test.levelup.sns.mapper;

import com.test.levelup.sns.model.PostDetailDto;
import com.test.levelup.sns.model.PostDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("""
            SELECT *
            FROM post
            """)
    List<PostDto> findAll();



    @Insert("""
            INSERT INTO post (user_id, post_img, post_text, post_tag, created_dt, updated_dt, post_state)
            VALUES (#{userId}, #{postImg}, #{postText}, #{postTag}, NOW(), NOW(), #{postState})
            """)
    void createPost(PostDto postDto);

    @Delete("""
            delete from post
            where id = #{id}
            """)
    void deletePost(Long id);

    @Update("""
            update post set user_id = #{userId}, post_img = #{postImg}, post_text = #{postText}, post_tag = #{postTag},
            updated_dt = now(), post_state = #{postState}
            where id = #{id}
            """)
    void updatePost(PostDto postDto);

    List<PostDto> findpost(Long userId);

    List<PostDetailDto> findDetailPost();
}