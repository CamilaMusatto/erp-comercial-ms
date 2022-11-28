package br.com.erp.comercialms.dataprovider.repository;

import br.com.erp.comercialms.dataprovider.table.ProdutoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ProdutoRepository  extends JpaRepository<ProdutoTable, Long > {
}
