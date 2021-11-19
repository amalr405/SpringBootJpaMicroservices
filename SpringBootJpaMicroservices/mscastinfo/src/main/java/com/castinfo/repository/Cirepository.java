package com.castinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.castinfo.entity.Castinfo;

@Repository
public interface Cirepository extends JpaRepository<Castinfo,Integer> {

}
