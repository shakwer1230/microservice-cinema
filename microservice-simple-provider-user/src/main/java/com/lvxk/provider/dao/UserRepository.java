package com.lvxk.provider.dao;

import com.lvxk.provider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // @Component
public interface UserRepository extends JpaRepository<User,Long> {
}
