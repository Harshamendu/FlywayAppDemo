package org.sag.plans.flywaydemo.flyway.repository;

import org.sag.plans.flywaydemo.flyway.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{

}
