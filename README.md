# Sistema de Leilões — LeiloesTDSat

Projeto acadêmico Java de um sistema para uma casa de leilões, desenvolvido para apoiar o cadastro e a listagem de produtos e o acompanhamento de seu status de venda.

## Tecnologias utilizadas

- Java
- Apache NetBeans (projeto com arquivos `nbproject`)
- MySQL/MariaDB
- JDBC (MySQL Connector/J)
- Apache Ant (arquivo `build.xml`)

## Estrutura do projeto

- `src/`: código-fonte Java e formulários da interface.
- `lib/`: bibliotecas do conector MySQL.
- `nbproject/`: configurações do NetBeans.
- `build.xml`: script de construção do projeto.
- `uc11.sql`: script do banco de dados, fornecido separadamente no material da atividade.

## Banco de dados

O script `uc11.sql` define a tabela `produtos`, com os campos `id`, `nome`, `valor` e `status`, e inclui registros de exemplo. Crie o banco `uc11` no MySQL/MariaDB e importe o script antes de executar a aplicação. Confira as configurações de conexão no arquivo `src/conectaDAO.java` e ajuste-as ao seu ambiente local, sem publicar credenciais pessoais.

## Versionamento

Este repositório é utilizado na atividade acadêmica de versionamento com Git Bash e GitHub.
