package com.jonfriend.playdatenow_v03.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.playdatenow_v03.models.PlaydateMdl;

@Repository
public interface PlaydateRpo extends CrudRepository<PlaydateMdl, Long> {
	
	List<PlaydateMdl> findAll();
	
	PlaydateMdl findByIdIs(Long id);
	
	
}
