package com.jonfriend.playdatenow_v03.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.playdatenow_v03.models.StateterritoryMdl;


@Repository
public interface StateterritoryRpo extends CrudRepository<StateterritoryMdl, Long> {
	
	List<StateterritoryMdl> findAll();
	
//	RsvpMdl findByIdIs(Long id);
//	
//	List<RsvpMdl> findAllByPlaydateMdl(PlaydateMdl playdateMdl);
//	
//	List<RsvpMdl> findByTwintwoMdlNotContains(TwintwoMdl twintwoMdl);
}
