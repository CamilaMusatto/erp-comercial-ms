package br.com.erp.comercialms.dataprovider.table.converters;

import br.com.erp.comercialms.core.enums.UnidadeDeMedidaEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class UnidadeDeMedidaEnumConverter implements AttributeConverter<UnidadeDeMedidaEnum, String> {

    @Override
    public String convertToDatabaseColumn(UnidadeDeMedidaEnum unidadeDeMedidaEnum) {
        if(unidadeDeMedidaEnum == null){
            return null;
        };

        return unidadeDeMedidaEnum.getAbreviacao();
    }

    @Override
    public UnidadeDeMedidaEnum convertToEntityAttribute(String s) {
        if(s == null){
            return null;
        }
        return Stream.of(UnidadeDeMedidaEnum.values())
                .filter(un -> un.getAbreviacao().equals(s))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
