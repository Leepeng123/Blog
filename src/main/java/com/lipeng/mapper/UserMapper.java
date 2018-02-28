package com.lipeng.mapper;

import com.lipeng.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dllo on 18/2/26.
 */

@Repository
public interface UserMapper {

    void register(User user);

    User login(User user);
}
