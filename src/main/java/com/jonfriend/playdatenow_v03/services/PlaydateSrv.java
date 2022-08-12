package com.jonfriend.playdatenow_v03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.jonfriend.playdatenow_v03.models.PlaydateMdl;
import com.jonfriend.playdatenow_v03.repositories.PlaydateRpo;

@Service
public class PlaydateSrv {
	
	// adding the playdate repository as a dependency
	private final PlaydateRpo playdateRpo;
	
	public PlaydateSrv(PlaydateRpo playdateRpo) {this.playdateRpo = playdateRpo;}
	
	// creates one playdate 
	public PlaydateMdl create(PlaydateMdl x) {
		return playdateRpo.save(x);
	}

	// updates one playdate 
	public PlaydateMdl update(PlaydateMdl x) {
		return playdateRpo.save(x);
	}
	
	// delete playdate by id 
	public void delete(PlaydateMdl x) {
		playdateRpo.delete(x);
	}
	
	// returns one playdate by id 
	public PlaydateMdl findById(Long id) {
		Optional<PlaydateMdl> optionalPlaydate = playdateRpo.findById(id);
		if(optionalPlaydate.isPresent()) {
			return optionalPlaydate.get();
		}else {
			return null;
		}
	}
	
	// returns all playdate 
	public List<PlaydateMdl> returnAll(){
		return playdateRpo.findAll();
	}
	
//	// get all joined twintwo
//	public List<PlaydateMdl> getAssignedTwintwos(TwintwoMdl x){
//		return playdateRpo.findAllByTwintwoMdl(x);
//	}
//	
//	// get all un-joined twintwo
//	public List<PlaydateMdl> getUnassignedTwintwos(TwintwoMdl x){
//		return playdateRpo.findByTwintwoMdlNotContains(x);
//	}
//	
//	// this is for removing a playdate-twintwo join record/entry
//	
//	public void removePlaydateTwintwoJoin(TwintwoMdl c, PlaydateMdl p ) {
//		List<TwintwoMdl> twintwoList = p.getTwintwoMdl(); 
//		twintwoList.remove(c); 
//		this.playdateRpo.save(p); 
//	}
	// jrf add for house
	
//	// get all joined house
//		public List<PlaydateMdl> getAssignedHouse(HouseMdl x){
//			return playdateRpo.findAllByHouseMdl(x);
//		}
	
}