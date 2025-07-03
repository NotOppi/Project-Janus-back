package com.campusdual.bfp.model.dto.dtomapper;

import com.campusdual.bfp.model.Company;
import com.campusdual.bfp.model.Offer;
import com.campusdual.bfp.model.dto.OfferDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-03T14:36:42+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
public class OfferMapperImpl implements OfferMapper {

    @Override
    public OfferDTO toDTO(Offer offer) {
        if ( offer == null ) {
            return null;
        }

        OfferDTO offerDTO = new OfferDTO();

        offerDTO.setCompanyId( offerCompanyId( offer ) );
        offerDTO.setCompanyName( offerCompanyName( offer ) );
        offerDTO.setTechLabels( techLabelsSetToList( offer.getTechLabels() ) );
        offerDTO.setId( offer.getId() );
        offerDTO.setOfferDescription( offer.getOfferDescription() );
        offerDTO.setTitle( offer.getTitle() );
        offerDTO.setActive( offer.getActive() );

        return offerDTO;
    }

    @Override
    public List<OfferDTO> toDTOList(List<Offer> offers) {
        if ( offers == null ) {
            return null;
        }

        List<OfferDTO> list = new ArrayList<OfferDTO>( offers.size() );
        for ( Offer offer : offers ) {
            list.add( toDTO( offer ) );
        }

        return list;
    }

    @Override
    public Offer toEntity(OfferDTO offerDto) {
        if ( offerDto == null ) {
            return null;
        }

        Offer offer = new Offer();

        offer.setCompany( companyIdToCompany( offerDto.getCompanyId() ) );
        offer.setTechLabels( techLabelsListToSet( offerDto.getTechLabels() ) );
        offer.setId( offerDto.getId() );
        offer.setOfferDescription( offerDto.getOfferDescription() );
        offer.setTitle( offerDto.getTitle() );
        offer.setActive( offerDto.getActive() );

        return offer;
    }

    private Integer offerCompanyId(Offer offer) {
        if ( offer == null ) {
            return null;
        }
        Company company = offer.getCompany();
        if ( company == null ) {
            return null;
        }
        int id = company.getId();
        return id;
    }

    private String offerCompanyName(Offer offer) {
        if ( offer == null ) {
            return null;
        }
        Company company = offer.getCompany();
        if ( company == null ) {
            return null;
        }
        String name = company.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
