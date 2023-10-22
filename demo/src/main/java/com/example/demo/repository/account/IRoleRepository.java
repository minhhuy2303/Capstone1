package com.example.demo.repository.account;

import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IRoleRepository extends JpaRepository<Role,Integer> {

    @Query(value="select r.id,r.name,r.is_delete from account_role ar\n" +
            "join role r on r.id = ar.role_id\n" +
            "join account a on a.username = ar.username\n" +
            "where ar.username =:userName ",nativeQuery = true)
    Role getRole(@Param("userName")String userName);
}
