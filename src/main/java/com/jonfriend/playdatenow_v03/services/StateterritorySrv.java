package com.jonfriend.playdatenow_v03.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.jonfriend.playdatenow_v03.models.StateterritoryMdl;
import com.jonfriend.playdatenow_v03.repositories.StateterritoryRpo;

@Service
public class StateterritorySrv {
	
	// adding the playdate repository as a dependency
	private final StateterritoryRpo stateterritoryRpo;
	
	public StateterritorySrv(StateterritoryRpo stateterritoryRpo) {this.stateterritoryRpo = stateterritoryRpo;}
	
//	// creates one playdate 
//	public PlaydateMdl create(PlaydateMdl x) {
//		return playdateRpo.save(x);
//	}
//
//	// updates one playdate 
//	public PlaydateMdl update(PlaydateMdl x) {
//		return playdateRpo.save(x);
//	}
//	
//	// delete playdate by id 
//	public void delete(PlaydateMdl x) {
//		playdateRpo.delete(x);
//	}
//	
//	// returns one playdate by id 
//	public PlaydateMdl findById(Long id) {
//		Optional<PlaydateMdl> optionalPlaydate = playdateRpo.findById(id);
//		if(optionalPlaydate.isPresent()) {
//			return optionalPlaydate.get();
//		}else {
//			return null;
//		}
//	}
	
	// returns all stateterritory 
	public List<StateterritoryMdl> returnAll(){
		return stateterritoryRpo.findAll();
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