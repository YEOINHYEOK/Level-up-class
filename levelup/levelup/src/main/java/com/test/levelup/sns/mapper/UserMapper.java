package com.test.levelup.sns.mapper;


import com.test.levelup.sns.model.UserDto;
import com.test.levelup.sns.model.UserLikeDto;
import com.test.levelup.sns.model.UserPostDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    // 유저 추가
    @Insert("""
            Insert into user (login_id,password,age,gender,name,phone_number,email,user_birth,created_dt,updated_dt)
            values (#{loginId},#{password},#{age},#{gender},#{name},#{phoneNumber},#{email},#{userBirth},NOW(),NOW())
            """)
    void createUser(UserDto userDto);

    @Delete("""
            Delete from user where id = #{id}
            """)
    void deleteUser(Long id);

    @Update("""
            update user set
            password = #{password},
            age = #{age},
            gender = #{gender},
            name  = #{name},
            phone_number = #{phoneNumber},
            email = #{email},
            user_birth = #{userBirth},
            updated_dt = now()
            where id = #{id}
            """)
    void updateUser(UserDto userDto);

    // 모두 조회
    @Select("""
            Select * from user
            """)
    List<UserDto> findAll();

    // 단건 조회
    @Select("""
            Select * from user where id = #{id}
            """)
    UserDto findById(Long id);

    List<UserPostDto> userWithPost();


    List<UserLikeDto> userWithLike();
}
