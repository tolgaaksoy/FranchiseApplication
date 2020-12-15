package com.tolgaaksoy.lokumcubaba.repositories;

import com.tolgaaksoy.lokumcubaba.models.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppealRepository extends JpaRepository<Appeal,Long> {
}
