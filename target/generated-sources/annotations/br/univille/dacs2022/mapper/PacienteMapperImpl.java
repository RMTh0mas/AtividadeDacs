package br.univille.dacs2022.mapper;

import br.univille.dacs2022.dto.PacienteDTO;
import br.univille.dacs2022.entity.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-13T20:03:26-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public List<PacienteDTO> mapListPaciente(List<Paciente> paciente) {
        if ( paciente == null ) {
            return null;
        }

        List<PacienteDTO> list = new ArrayList<PacienteDTO>( paciente.size() );
        for ( Paciente paciente1 : paciente ) {
            list.add( mapPaciente( paciente1 ) );
        }

        return list;
    }

    @Override
    public List<Paciente> mapListPacienteDTO(List<PacienteDTO> paciente) {
        if ( paciente == null ) {
            return null;
        }

        List<Paciente> list = new ArrayList<Paciente>( paciente.size() );
        for ( PacienteDTO pacienteDTO : paciente ) {
            list.add( mapPacienteDTO( pacienteDTO ) );
        }

        return list;
    }

    @Override
    public PacienteDTO mapPaciente(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();

        pacienteDTO.setDataNascimento( paciente.getDataNascimento() );
        pacienteDTO.setId( paciente.getId() );
        pacienteDTO.setNome( paciente.getNome() );
        pacienteDTO.setSexo( paciente.getSexo() );

        return pacienteDTO;
    }

    @Override
    public Paciente mapPacienteDTO(PacienteDTO paciente) {
        if ( paciente == null ) {
            return null;
        }

        Paciente paciente1 = new Paciente();

        paciente1.setDataNascimento( paciente.getDataNascimento() );
        paciente1.setId( paciente.getId() );
        paciente1.setNome( paciente.getNome() );
        paciente1.setSexo( paciente.getSexo() );

        return paciente1;
    }
}
