package com.movieinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieinfo.entity.Movieinfo;

@Repository
public interface Mirepository extends JpaRepository<Movieinfo,Integer>{

}
