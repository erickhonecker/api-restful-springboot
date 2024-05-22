package br.com.crud.springboot.repositories;

import br.com.crud.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/*
*
*  Spring possui 4 esteriótipos diferentes
* @Component -> Usado para classes mais genericas que mostra para o spring que vai ser
*               uma bean gerenciada pelo spring
*
* @Service -> Usado para classes de serviço, isso inclui regras de negocios
*
* @Repository -> é utilizada para indicar que uma classe é responsável por acessar e manipular dados no banco de dados
*                 ou em outra fonte de dados externa. Em outras palavras, ela é utilizada para indicar
*                 que a classe é um repositório de dados.
*
*@Controller -> A classe ou a interface será um bean gerenciado por ele, usadop para
*               Endpoints.
*
* */

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
