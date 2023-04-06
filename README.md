# demo-dao-jdbc
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/PedroRSilveira/demo-dao-jdbc/blob/main/LICENSE)
# Sobre o projeto

demo-dao-jdbc é um software para demonstração de acesso a um banco de dados com JDBC usando o padrão de projeto DAO.

O software consiste em um sistema para acessar, buscar e editar informações de departamentos e vendedores armazenados em um banco de dados MySQL.

# Modelo conceitual

Foi feita uma injeção de dependência usando o padrão de projeto Factory:

![alt text](https://media.discordapp.net/attachments/1057825601798549596/1093322522658873394/image.png)

# Tecnologias utilizadas

- Java
- MySQL

# Funcionalidades do software

- Seller find by id (findById): Procura no banco de dados o vendedor que tiver o id selecionado e retorna suas informações.

- Seller find by department (findByDepartment): Procura no banco de dados os vendedores que trabalham no departamento escolhido e retorna uma lista desses vendedores.

- Seller find all (findAll): Retorna uma lista com todos os vendedores cadastrados no banco de dados.

- Seller insert (insert): Adiciona um vendedor ao banco de dados com as informações especificadas no código.

- Seller update (update): Atualiza as informações especificadas de um vendedor selecionado.

- Seller delete (delete): Exclui o vendedor selecionado do banco de dados.

- Department find by id (findById): Procura no banco de dados o departamento que tiver o id selecionado e retorna suas informações.

- Department find all (findAll): Retorna uma lista com todos os departamentos cadastrados no banco de dados.

- Department insert (insert): Adiciona um departamento ao banco de dados com o nome especificado no código.

- Department update (update): Atualiza o nome do departamento selecionado.

- Department delete (delete): Exclui o departamento selecionado do banco de dados.
