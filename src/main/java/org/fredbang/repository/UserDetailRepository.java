package org.fredbang.repository;

import org.fredbang.model.Client;
import org.fredbang.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Integer> {

}
