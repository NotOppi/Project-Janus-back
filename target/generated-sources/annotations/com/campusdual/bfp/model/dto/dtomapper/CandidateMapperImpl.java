package com.campusdual.bfp.model.dto.dtomapper;

import com.campusdual.bfp.model.Candidate;
import com.campusdual.bfp.model.dto.CandidateDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-03T14:36:42+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
public class CandidateMapperImpl implements CandidateMapper {

    @Override
    public CandidateDTO toDTO(Candidate candidate) {
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

    @Override
    public List<CandidateDTO> toDTOList(List<Candidate> candidates) {
        if ( candidates == null ) {
            return null;
        }

        List<CandidateDTO> list = new ArrayList<CandidateDTO>( candidates.size() );
        for ( Candidate candidate : candidates ) {
            list.add( toDTO( candidate ) );
        }

        return list;
    }

    @Override
    public Candidate toEntity(CandidateDTO candidatedto) {
        if ( candidatedto == null ) {
            return null;
        }

        Candidate candidate = new Candidate();

        candidate.setId( candidatedto.getId() );
        candidate.setName( candidatedto.getName() );
        candidate.setSurname1( candidatedto.getSurname1() );
        candidate.setSurname2( candidatedto.getSurname2() );
        candidate.setPhone( candidatedto.getPhone() );
        candidate.setEmail( candidatedto.getEmail() );
        candidate.setLinkedin( candidatedto.getLinkedin() );

        return candidate;
    }
}
