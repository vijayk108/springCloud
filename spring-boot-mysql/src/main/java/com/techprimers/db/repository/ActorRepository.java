package com.techprimers.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.techprimers.db.model.actor;



public interface ActorRepository extends JpaRepository <actor, Integer>{

}
