package br.univille.dacs2022.mapper;

import br.univille.dacs2022.dto.MedicoDTO;
import br.univille.dacs2022.dto.ProcedimentoDTO;
import br.univille.dacs2022.entity.Medico;
import br.univille.dacs2022.entity.Procedimento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-13T20:10:01-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
public class MedicoMapperImpl implements MedicoMapper {

    @Override
    public List<MedicoDTO> mapListMedico(List<Medico> medico) {
        if ( medico == null ) {
            return null;
        }

        List<MedicoDTO> list = new ArrayList<MedicoDTO>( medico.size() );
        for ( Medico medico1 : medico ) {
            list.add( mapMedico( medico1 ) );
        }

        return list;
    }

    @Override
    public List<Medico> mapListMedicoDTO(List<MedicoDTO> medico) {
        if ( medico == null ) {
            return null;
        }

        List<Medico> list = new ArrayList<Medico>( medico.size() );
        for ( MedicoDTO medicoDTO : medico ) {
            list.add( mapMedicoDTO( medicoDTO ) );
        }

        return list;
    }

    @Override
    public MedicoDTO mapMedico(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        MedicoDTO medicoDTO = new MedicoDTO();

        medicoDTO.setCRM( medico.getCRM() );
        medicoDTO.setId( medico.getId() );
        medicoDTO.setListaProcedimentos( procedimentoListToProcedimentoDTOList( medico.getListaProcedimentos() ) );
        medicoDTO.setNome( medico.getNome() );

        return medicoDTO;
    }

    @Override
    public Medico mapMedicoDTO(MedicoDTO medico) {
        if ( medico == null ) {
            return null;
        }

        Medico medico1 = new Medico();

        medico1.setCRM( medico.getCRM() );
        medico1.setId( medico.getId() );
        medico1.setListaProcedimentos( procedimentoDTOListToProcedimentoList( medico.getListaProcedimentos() ) );
        medico1.setNome( medico.getNome() );

        return medico1;
    }

    protected ProcedimentoDTO procedimentoToProcedimentoDTO(Procedimento procedimento) {
        if ( procedimento == null ) {
            return null;
        }

        ProcedimentoDTO procedimentoDTO = new ProcedimentoDTO();

        procedimentoDTO.setDescricao( procedimento.getDescricao() );
        procedimentoDTO.setId( procedimento.getId() );

        return procedimentoDTO;
    }

    protected List<ProcedimentoDTO> procedimentoListToProcedimentoDTOList(List<Procedimento> list) {
        if ( list == null ) {
            return null;
        }

        List<ProcedimentoDTO> list1 = new ArrayList<ProcedimentoDTO>( list.size() );
        for ( Procedimento procedimento : list ) {
            list1.add( procedimentoToProcedimentoDTO( procedimento ) );
        }

        return list1;
    }

    protected Procedimento procedimentoDTOToProcedimento(ProcedimentoDTO procedimentoDTO) {
        if ( procedimentoDTO == null ) {
            return null;
        }

        Procedimento procedimento = new Procedimento();

        procedimento.setDescricao( procedimentoDTO.getDescricao() );
        procedimento.setId( procedimentoDTO.getId() );

        return procedimento;
    }

    protected List<Procedimento> procedimentoDTOListToProcedimentoList(List<ProcedimentoDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Procedimento> list1 = new ArrayList<Procedimento>( list.size() );
        for ( ProcedimentoDTO procedimentoDTO : list ) {
            list1.add( procedimentoDTOToProcedimento( procedimentoDTO ) );
        }

        return list1;
    }
}
