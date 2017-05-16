INSERT INTO PERFIL (Id, Nome) VALUES (100, 'Administrador');
INSERT INTO PERFIL (Id, Nome) VALUES (101, 'TI');
INSERT INTO PERFIL (Id, Nome) VALUES (200, 'Gestor');
INSERT INTO PERFIL (Id, Nome) VALUES (300, 'Back-office');
INSERT INTO PERFIL (Id, Nome) VALUES (400, 'Vendedor');

INSERT INTO MENU (Id, Nome, Caminho) VALUES (1000, 'Usuários', 'usuarios');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (2000, 'Filiais', 'filiais');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (3000, 'Produtos', 'produtos');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (3001, 'Coleções', 'colecoes');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (4000, 'Controle de Estoque', 'estoque');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (5000, 'PDV', 'venda');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (6000, 'Relatório', 'rel-vendas-geral');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (7000, 'Clientes', 'clientes');

INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (1000, 100);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (2000, 100);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (1000, 101);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (3000, 300);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (3001, 300);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (4000, 300);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (5000, 400);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (7000, 400);

INSERT INTO COLECAO (Nome, Periodo, Ano, Ativo, DataCadastro) VALUES ('Fashion Week', 'Ano Todo', 2017, TRUE, '2017-05-01');
INSERT INTO COLECAO (Nome, Periodo, Ano, Ativo, DataCadastro) VALUES ('Curtindo o verão', 'Verão', 2017, TRUE, '2017-05-01');
INSERT INTO COLECAO (Nome, Periodo, Ano, Ativo, DataCadastro) VALUES ('Universo Marvel', 'Ano todo', 2017, TRUE, '2017-05-01');
INSERT INTO COLECAO (Nome, Periodo, Ano, Ativo, DataCadastro) VALUES ('Básico', 'Ano todo', 2017, TRUE, '2017-05-01');

INSERT INTO PRODUTO (Codigo, Nome, Descricao, IdColecao, Tipo, Cor, ValorProducao, ValorVenda, Ativo, DataCadastro) VALUES ('02CABR0010', 'Camiseta', 'Camiseta básica gola V', 1, 'tipo01', 'Azul', 9.7, 19.9, TRUE, '2017-05-16');
INSERT INTO PRODUTO (Codigo, Nome, Descricao, IdColecao, Tipo, Cor, ValorProducao, ValorVenda, Ativo, DataCadastro) VALUES ('02CABR0011', 'Vestido', 'Vestido com estampa florida para dia a dia', 1, 'tipo01', 'Estapado', 11.70, 59.9, TRUE, '2017-05-16');
INSERT INTO PRODUTO (Codigo, Nome, Descricao, IdColecao, Tipo, Cor, ValorProducao, ValorVenda, Ativo, DataCadastro) VALUES ('02CABR0012', 'Moletom Marvel', 'Agasalho com capuz', 3, 'tipo01', 'Vermelho', 31.0, 129.1, TRUE, '2017-05-16');
INSERT INTO PRODUTO (Codigo, Nome, Descricao, IdColecao, Tipo, Cor, ValorProducao, ValorVenda, Ativo, DataCadastro) VALUES ('02CABR0013', 'Pcte Meias', 'Conjunto com 6 pares de meia', 4, 'tipo01', 'Branco/Cinza', 6.8, 23.5, TRUE, '2017-05-16');
INSERT INTO PRODUTO (Codigo, Nome, Descricao, IdColecao, Tipo, Cor, ValorProducao, ValorVenda, Ativo, DataCadastro) VALUES ('02CABR0014', 'Calça jeans', 'Calça jeans slim', 1, 'tipo01', 'Azul', 17.8, 99.0, TRUE, '2017-05-16');

INSERT INTO FILIAL (Nome, Cnpj, Matriz, Ativo, DataCadastro) VALUES ('MATRIZ - SP', '0885453000154', TRUE, TRUE, '2017-05-10');
INSERT INTO FILIAL (Nome, Cnpj, Matriz, Ativo, DataCadastro) VALUES ('Loja 1 - PR', '0885453000254', FALSE, TRUE, '2017-05-10');
INSERT INTO FILIAL (Nome, Cnpj, Matriz, Ativo, DataCadastro) VALUES ('Loja 2 - MG', '0885453000354', FALSE, TRUE, '2017-05-10');


INSERT INTO USUARIO (IdPerfil, IdFilial, Nome, Email, Login, Senha, Ativo, DataCadastro) VALUES (100, 1, 'Adminitrador', 'admin@kkcoolwear.com.br', 'admin', '$2a$10$wPu4O.TXLeIsfcbxwZ9UQuf5yDyiX4fASk5QlOPAZ3OfCZZg./XEi', TRUE, '2017-05-01');

