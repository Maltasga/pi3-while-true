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
INSERT INTO MENU (Id, Nome, Caminho) VALUES (5000, 'PDV', 'ponto-venda');
INSERT INTO MENU (Id, Nome, Caminho) VALUES (6000, 'Relatório', 'rel-vendas-geral');

INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (1000, 100);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (2000, 100);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (1000, 101);

INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (3000, 300);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (3001, 300);
INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (4000, 300);

INSERT INTO MENUPERFIL (IdMenu, IdPerfil) VALUES (5000, 400);