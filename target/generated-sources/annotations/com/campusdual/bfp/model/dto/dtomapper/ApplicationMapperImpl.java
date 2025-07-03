package com.campusdual.bfp.model.dto.dtomapper;

import com.campusdual.bfp.model.Application;
import com.campusdual.bfp.model.Candidate;
import com.campusdual.bfp.model.Offer;
import com.campusdual.bfp.model.dto.ApplicationDTO;
import com.campusdual.bfp.model.dto.CandidateDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-03T14:36:42+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public ApplicationDTO toDTO(Application application) {
        if ( application == null ) {
            return null;
        }

        ApplicationDTO applicationDTO = new ApplicationDTO();

        applicationDTO.setId_candidate( applicationCandidateId( application ) );
        Long id1 = applicationOfferId( application );
        if ( id1 != null ) {
            applicationDTO.setId_offer( id1.intValue() );
        }
        applicationDTO.setId( application.getId() );
        applicationDTO.setCandidate( candidateToCandidateDTO( application.getCandidate() ) );

        return applicationDTO;
    }

    @Override
    public List<ApplicationDTO> toDTOList(List<Application> applications) {
        if ( applications == null ) {
            return null;
        }

        List<ApplicationDTO> list = new ArrayList<ApplicationDTO>( applications.size() );
        for ( Application application : applications ) {
            list.add( toDTO( application ) );
        }

        return list;
    }

    @Override
    public Application toEntity(ApplicationDTO applicationDTO) {
        if ( applicationDTO == null ) {
            return null;
        }

        Application application = new Application();

        application.setCandidate( idCandidateToCandidate( applicationDTO.getId_candidate() ) );
        application.setOffer( idOfferToOffer( applicationDTO.getId_offer() ) );
        application.setId( applicationDTO.getId() );

        return application;
    }

    private Integer applicationCandidateId(Application application) {
        if ( application == null ) {
            return null;
        }
        Candidate candidate = application.getCandidate();
        if ( candidate == null ) {
            return null;
        }
        int id = candidate.getId();
        return id;
    }

    private Long applicationOfferId(Application application) {
        if ( application == null ) {
            return null;
        }
        Offer offer = application.getOffer();
        if ( offer == null ) {
            return null;
        }
        Long id = offer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected CandidateDTO candidateToCandidateDTO(Candidate candidate) {
        if ( candidate == null ) {
            return null;
        }

        CandidateDTO candidateDTO = new CandidateDTO();

        candidateDTO.setId( candidate.getId() );
        candidateDTO.setName( candidate.getName() );
        candidateDTO.setSurname1( candidate.getSurname1() );
        candidateDTO.setSurname2( candidate.getSurname2() );
        candidateDTO.setPhone( candidate.getPhone() );
        candidateDTO.setEmail( candidate.getEmail() );
        candidateDTO.setLinkedin( candidate.getLinkedin() );

        return candidateDTO;
    }
}
