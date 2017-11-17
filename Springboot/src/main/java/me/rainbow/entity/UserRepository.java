package me.rainbow.entity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author guojinpeng
 * @date 17.11.13 16:50
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String userName);

    User findByNameOrId(String username, Integer id);

}