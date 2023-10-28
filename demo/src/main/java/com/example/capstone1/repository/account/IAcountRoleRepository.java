package com.example.capstone1.repository.account;

import com.example.capstone1.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcountRoleRepository extends JpaRepository<AccountRole,Integer> {

}
