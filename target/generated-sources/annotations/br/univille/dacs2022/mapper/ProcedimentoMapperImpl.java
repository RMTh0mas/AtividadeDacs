package br.univille.dacs2022.mapper;

import br.univille.dacs2022.dto.ProcedimentoDTO;
import br.univille.dacs2022.entity.Procedimento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-13T20:35:07-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
public class ProcedimentoMapperImpl implements ProcedimentoMapper {

    @Override
    public List<ProcedimentoDTO> mapListProcedimento(List<Procedimento> procedimento) {
        if ( procedimento == null ) {
            return null;
        }

        List<ProcedimentoDTO> list = new ArrayList<ProcedimentoDTO>( procedimento.size() );
        for ( Procedimento procedimento1 : procedimento ) {
            list.add( mapProcedimento( procedimento1 ) );
        }

        return list;
    }

    @Override
    public List<Procedimento> mapListProcedimentoDTO(List<ProcedimentoDTO> procedimento) {
        if ( procedimento == null ) {
            return null;
        }

        List<Procedimento> list = new ArrayList<Procedimento>( procedimento.size() );
        for ( ProcedimentoDTO procedimentoDTO : procedimento ) {
            list.add( mapProcedimentoDTO( procedimentoDTO ) );
        }

        return list;
    }

    @Override
    public ProcedimentoDTO mapProcedimento(Procedimento procedimento) {
        if ( procedimento == null ) {
            return null;
        }

        ProcedimentoDTO procedimentoDTO = new ProcedimentoDTO();

        procedimentoDTO.setDescricao( procedimento.getDescricao() );
        procedimentoDTO.setId( procedimento.getId() );

        return procedimentoDTO;
    }

    @Override
    public Procedimento mapProcedimentoDTO(ProcedimentoDTO procedimento) {
        if ( procedimento == null ) {
            return null;
        }

        Procedimento procedimento1 = new Procedimento();

        procedimento1.setDescricao( procedimento.getDescricao() );
        procedimento1.setId( procedimento.getId() );

        return procedimento1;
    }
}
