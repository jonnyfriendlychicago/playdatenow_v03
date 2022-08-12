package com.jonfriend.playdatenow_v03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jonfriend.playdatenow_v03.models.RsvpMdl;
import com.jonfriend.playdatenow_v03.models.PlaydateMdl;
import com.jonfriend.playdatenow_v03.repositories.RsvpRpo;

@Service
public class RsvpSrv {
	
	// adding the rsvp repository as a dependency
	private final RsvpRpo rsvpRpo;
	
	public RsvpSrv(RsvpRpo rsvpRpo) {this.rsvpRpo = rsvpRpo;}
	
	// creates one rsvp 
	public RsvpMdl create(RsvpMdl x) {
		return rsvpRpo.save(x);
	}

	// updates one rsvp 
	public RsvpMdl update(RsvpMdl x) {
		return rsvpRpo.save(x);
	}
	
	// delete rsvp by id 
	public void delete(RsvpMdl x) {
		rsvpRpo.delete(x);
	}
	
	// returns one rsvp by id 
	public RsvpMdl findById(Long id) {
		Optional<RsvpMdl> optionalRsvp = rsvpRpo.findById(id);
		if(optionalRsvp.isPresent()) {
			return optionalRsvp.get();
		}else {
			return null;
		}
	}
	
	// returns all rsvp 
	public List<RsvpMdl> returnAll(){
		return rsvpRpo.findAll();
	}
	
	// get all joined playdate 
//	public List<RsvpMdl> getAssignedPlaydates(PlaydateMdl x){
	public List<RsvpMdl> returnAllRsvpForPlaydate(PlaydateMdl x){
		return rsvpRpo.findAllByPlaydateMdl(x);
	}
//	
//	// get all un-joined rsvp 
//	public List<RsvpMdl> getUnassignedTwintwos(TwintwoMdl x){
//		return rsvpRpo.findByTwintwoMdlNotContains(x);
//	}
//	
//	// this is for removing a rsvp-twintwo join record/entry
//	
//	public void removeRsvpTwintwoJoin(TwintwoMdl c, RsvpMdl p ) {
//		List<TwintwoMdl> twintwoList = p.getTwintwoMdl(); 
//		twintwoList.remove(c); 
//		this.rsvpRpo.save(p); 
//	}
	
	
}