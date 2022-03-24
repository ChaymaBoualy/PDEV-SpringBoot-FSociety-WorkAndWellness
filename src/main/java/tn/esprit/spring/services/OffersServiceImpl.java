package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Offers;
import tn.esprit.spring.repositories.OfferRepository;

@Service
public class OffersServiceImpl implements IServiceOffers {
	@Autowired
	OfferRepository offerRepository;

	@Override
	public List<Offers> retrieveAllOffers() {

		return (List<Offers>) offerRepository.findAll();
	}

	@Override
	public Offers addOffers(Offers o) {

		return offerRepository.save(o);
	}

	@Override
	public void deleteOffers(int id) {
		offerRepository.deleteById(id);

	}

	@Override
	public Offers updateOffers(Offers o) {

		return offerRepository.save(o);
	}

	@Override
	public Offers retrieveOffers(int id) {
		Offers O = offerRepository.findById(id).get();
		return O;
	}
	// @Override
	
	//@Scheduled(cron = "*/30 * * * * *")
		
	/*	public void OfferNumberPerPartner() {
				log.info("--- Black_Friday Offers :"  + offerRepository.numberByOffer(OfferType.Black_Friday));
				log.info("--- Happy_hours Offers : " + offerRepository.numberByOffer(OfferType.Happy_hours));
				log.info("--- Happy_Days Offers : " + offerRepository.numberByOffer(OfferType.Happy_Days));
				log.info("--- Weekend_OFFERS Offers : " + offerRepository.numberByOffer(OfferType.Weekend_OFFERS));

			}	*/
		
		}


