package com.campusdual.bfp.model.dto.dtomapper;

import com.campusdual.bfp.model.TechLabels;
import com.campusdual.bfp.model.dto.TechLabelsDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-03T14:36:42+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
public class TechLabelsMapperImpl implements TechLabelsMapper {

    @Override
    public TechLabelsDTO toDTO(TechLabels techLabels) {
        if ( techLabels == null ) {
            return null;
        }

        TechLabelsDTO techLabelsDTO = new TechLabelsDTO();

        if ( techLabels.getId() != null ) {
            techLabelsDTO.setId( techLabels.getId() );
        }
        techLabelsDTO.setName( techLabels.getName() );

        return techLabelsDTO;
    }

    @Override
    public List<TechLabelsDTO> toDTOList(List<TechLabels> techLabels) {
        if ( techLabels == null ) {
            return null;
        }

        List<TechLabelsDTO> list = new ArrayList<TechLabelsDTO>( techLabels.size() );
        for ( TechLabels techLabels1 : techLabels ) {
            list.add( toDTO( techLabels1 ) );
        }

        return list;
    }

    @Override
    public TechLabels toEntity(TechLabelsDTO techLabelsDTO) {
        if ( techLabelsDTO == null ) {
            return null;
        }

        TechLabels techLabels = new TechLabels();

        techLabels.setId( techLabelsDTO.getId() );
        techLabels.setName( techLabelsDTO.getName() );

        return techLabels;
    }
}
