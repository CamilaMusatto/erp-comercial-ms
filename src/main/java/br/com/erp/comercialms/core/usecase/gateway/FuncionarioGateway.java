package br.com.erp.comercialms.core.usecase.gateway;

import br.com.erp.comercialms.core.usecase.CadastrarFuncionarioUsecase;
import org.springframework.stereotype.Component;
import br.com.erp.comercialms.core.entity.FuncionarioEntity;

@Component
public interface FuncionarioGateway {

    FuncionarioEntity buscarFuncionarioById(Long id);

    void salvarFuncionario(FuncionarioEntity entity);


}
