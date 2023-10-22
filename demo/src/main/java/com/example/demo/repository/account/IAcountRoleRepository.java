package com.example.demo.repository.account;

import com.example.demo.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcountRoleRepository extends JpaRepository<AccountRole,Integer> {

}
