package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.FuncionarioEntity;
import br.com.erp.comercialms.dataprovider.table.FuncionarioTable;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-03T21:29:42-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class FuncionarioMapperImpl implements FuncionarioMapper {

    @Override
    public FuncionarioEntity funcionarioTableToFuncionarioEntity(FuncionarioTable table) {
        if ( table == null ) {
            return null;
        }

        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();

        return funcionarioEntity;
    }

    @Override
    public FuncionarioTable funcionarioEntityToFuncionarioTable(FuncionarioEntity entity) {
        if ( entity == null ) {
            return null;
        }

        FuncionarioTable funcionarioTable = new FuncionarioTable();

        return funcionarioTable;
    }
}
