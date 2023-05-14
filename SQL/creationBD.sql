/*drop table activite;
drop table chambre;
drop table voyageur;
drop table reservation;
drop table `user`;
drop table ReserActCha;
drop table Carte;
CREATE TABLE chambre (
  numero_chambre int NOT NULL,
  categorie varchar(45) NOT NULL,
  type_chambre varchar(45) NOT NULL,
  nb_occupants int NOT NULL,
  prix_htva decimal(6,2) NOT NULL,
  PRIMARY KEY (`numero_chambre`)
);
CREATE TABLE `user` (
  `id` int auto_increment,
  `user` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `Carte` (
  `id` int auto_increment,
  `numeroCarte` varchar(25) NOT NULL,
  `nomClient` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `ReserActCha` (
  `id` int auto_increment,
  `idAct` int,
  `PersRef` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `numChambre` int,
  `typeAct` varchar(45),
  `typeCha` varchar(45),
  `nbMaxCha` int,
  `nbMaxAct` int,
  `nbInscrits` int,
  `nbNuit` int,
  `dureeHeure` int(2),
  `dateDeb` date,
  `nbJour` int,
  `prixAct` decimal(6,2),
  `prixCha` decimal(6,2),
  `paye` bool,
  `dejaPaye` decimal(6,2),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `activite` (
  `id` int auto_increment,
  `type` varchar(45) NOT NULL,
  `nbMaxParticipants` int NOT NULL,
  `nbInscrits` int(2) NOT NULL,
  `dureeHeure` int(2) DEFAULT NULL,
  `dateDeb` date NOT NULL,
  `nbJour` int NOT NULL,
  `prixHTVA` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `reservation` (
  `idReservation` int NOT NULL,
  `dateDebut` date NOT NULL,
  `dateFin` date NOT NULL,
  `prixNet` decimal(6,2) NOT NULL,
  `paye` tinyint NOT NULL,
  PRIMARY KEY (`idReservation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `voyageur` (
  `idVoyageur` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `dateNaissance` date NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`idVoyageur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
  
  INSERT INTO `bd_holidays`.`ReserActCha` (
  `PersRef`,
  `type`,
  `numChambre`,
  `typeCha`,
  `nbMaxCha`,
  `nbNuit`,
  `dateDeb`,
  `prixCha`,
  `paye`,
  `dejaPaye`)
  values
  ('Olivier Collard',
  'Chambre',
  1,
  'Simple',
  1,
  '3',
  '2022-12-21',
  120.3,
  true,
  120.3
  );
  
  INSERT INTO `bd_holidays`.`ReserActCha` (
  `PersRef`,
  `type`,
  `numChambre`,
  `typeCha`,
  `nbMaxCha`,
  `nbNuit`,
  `dateDeb`,
  `prixCha`,
  `paye`,
  `dejaPaye`)
  values
  ('Olivier Collard',
  'Chambre',
  102,
  'Double',
  2,
  '5',
  '2023-05-28',
  125.5,
  true,
  125.5
  );
  
  select * from reseractcha where type = 'Chambre' and dejaPaye < prixCha;
  
  /*update reseractcha set dejaPaye = 50.5 where id = 4;*/
  /*
  select * from chambre
  where numero_chambre 
  NOT IN (select numChambre from reseractcha 
			where type ='Chambre' and date(datedeb) between '2023-01-01' and '2023-01-05');
            
INSERT into `bd_holidays`.`Carte` (
  `numeroCarte`,
  `nomClient`,
  `mdp`
) 
VALUES (
'BE123456',
'Oli',
'4653'
);

INSERT into `bd_holidays`.`Carte` (
  `numeroCarte`,
  `nomClient`,
  `mdp`
) 
VALUES (
'BE12345678',
'Oli',
'4653'
);

INSERT into `bd_holidays`.`Carte` (
  `numeroCarte`,
  `nomClient`,
  `mdp`
) 
VALUES (
'BE1234567890',
'Oli',
'4653'
);

INSERT into `bd_holidays`.`Carte` (
  `numeroCarte`,
  `nomClient`,
  `mdp`
) 
VALUES (
'BE12',
'Olivier Collard',
'4653'
);
INSERT into `bd_holidays`.`Carte` (
  `numeroCarte`,
  `nomClient`,
  `mdp`
) 
VALUES (
'BE1234',
'Olivier Collard',
'4653'
);
  
  INSERT INTO `bd_holidays`.`ReserActCha` (
  `PersRef`,
  `type`,
  `numChambre`,
  `typeCha`,
  `nbMaxCha`,
  `nbNuit`,
  `dateDeb`,
  `prixCha`,
  `paye`,
  `dejaPaye`)
  values
  ('Adrien Gerez',
  'Chambre',
  2,
  'Simple',
  1,
  2,
  '2022-12-28',
  174.2,
  true,
  174.2
  );

INSERT INTO `bd_holidays`.`user`
(`user`,
`password`)
VALUES
('Oli',
'4653');
INSERT INTO `bd_holidays`.`user`
(`user`,
`password`)
VALUES
('Adrien',
'6789');
INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('SKI NAUTIQUE',
6,
0,
3,
'2024-10-10',
1,
150);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('SKI NAUTIQUE',
6,
0,
3,
'2023-10-10',
1,
150);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PARACHUTE',
2,
0,
6,
'2023-05-30',
1,
400);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PARACHUTE',
2,
0,
6,
'2024-05-30',
1,
400);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PLONGÉE SOUS-MARINE',
5,
0,
4,
'2023-07-10',
1,
150);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PLONGÉE SOUS-MARINE',
5,
0,
4,
'2024-07-10',
3,
150);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('RANDONNÉE',
15,
0,
5,
'2023-02-10',
1,
20);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('RANDONNÉE',
15,
0,
5,
'2024-02-10',
5,
20);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('SAUT À L''ÉLATIQUE',
10,
0,
2,
'2023-06-06',
1,
100);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('SAUT À L''ÉLATIQUE',
10,
0,
2,
'2024-06-06',
1,
100);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('CHAR À VOILE',
10,
0,
3,
'2023-08-10',
1,
75);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('CHAR À VOILE',
10,
0,
3,
'2024-08-10',
1,
75);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PÊCHE À LA LIGNE',
10,
0,
6,
'2023-06-15',
1,
40);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('PÊCHE À LA LIGNE',
10,
0,
6,
'2024-06-15',
1,
40);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('DÉGUSTATION DE VINS',
12,
0,
3,
'2023-10-08',
1,
45);

INSERT INTO `bd_holidays`.`activite`
(`type`,
`nbMaxParticipants`,
`nbInscrits`,
`dureeHeure`,
`dateDeb`,
`nbJour`,
`prixHTVA`)
VALUES
('DÉGUSTATION DE VINS',
12,
0,
3,
'2024-10-08',
3,
45);
select * from chambre;
Select * from activite;
select * from user;
Select * from reseractcha where type = 'Chambre';
update activite set nbInscrits = nbInscrits - 3 where id = 2;
delete from reseractcha where id=5;

INSERT INTO `bd_holidays`.`voyageur`
(`idVoyageur`,
`nom`,
`prenom`,
`dateNaissance`,
`email`)
VALUES
('456789',
'collard',
'olivier',
'2000-01-05',
'ocollard@hotmail.com');

INSERT INTO `bd_holidays`.`voyageur`
(`idVoyageur`,
`nom`,
`prenom`,
`dateNaissance`,
`email`)
VALUES
('123789',
'trillet',
'clÃ©ment',
'2000-01-01',
'ctrillet@hotmail.com');

INSERT INTO `bd_holidays`.`voyageur`
(`idVoyageur`,
`nom`,
`prenom`,
`dateNaissance`,
`email`)
VALUES
('159753',
'mali',
'guillaume',
'2000-01-02',
'gmali@hotmail.com');

INSERT INTO `bd_holidays`.`voyageur`
(`idVoyageur`,
`nom`,
`prenom`,
`dateNaissance`,
`email`)
VALUES
('467913',
'job',
'aymeric',
'2000-01-03',
'ocollard@hotmail.com');

INSERT INTO `bd_holidays`.`voyageur`
(`idVoyageur`,
`nom`,
`prenom`,
`dateNaissance`,
`email`)
VALUES
(123456,
'gerez',
'adrien',
'1988-06-29',
'agerez@hotmail.com');

INSERT INTO bd_holidays.voyageur
(idVoyageur,
nom,
prenom,
dateNaissance,
email)
VALUES
(5978,
'collard',
'olivier',
'1995-01-01',
'ocollard@hotmail.com');

INSERT INTO bd_holidays.voyageur
(idVoyageur,
nom,
prenom,
dateNaissance,
email)
VALUES
(15,
'gerez',
'adrien',
'1988-06-29',
'agerez@hotmail.com');

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(1,
'Motel',
'Simple',
1,
75.00);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(2,
'Motel',
'Simple',
1,
150.50);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(3,
'Motel',
'Simple',
1,
50.5);

INSERT INTO `bd_holidays`.`chambre` (
  `numero_chambre`,
  `categorie`,
  `type_chambre`,
  `nb_occupants`,
  `prix_htva`
  )
  values
  (4,
  'Motel',
  'Simple',
  1,
  40.1
  );
  
  INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(5,
'Motel',
'Familiale',
4,
150.25);


INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(101,
'Village',
'Double',
2,
1000.505);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(102,
'Village',
'Double',
2,
1050.50);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(103,
'Village',
'Simple',
1,
100);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(104,
'Village',
'Simple',
1,
100);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(105,
'Village',
'Familiale',
4,
250);

INSERT INTO `bd_holidays`.`chambre`
(`numero_chambre`,
`categorie`,
`type_chambre`,
`nb_occupants`,
`prix_htva`)
VALUES
(106,
'Village',
'Familiale',
4,
100);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(111111,
'2022-06-18',
'2022-06-26',
1750,
1);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(222222,
'2023-05-18',
'2023-05-26',
1750,
0);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(333333,
'2022-07-19',
'2022-07-25',
1200,
1);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(444444,
'2023-05-01',
'2023-06-15',
3550,
0);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(555555,
'2022-09-18',
'2022-09-19',
150,
1);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(666666,
'2022-12-25',
'2023-01-01',
2050,
0);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(777777,
'2022-05-17',
'2022-05-19',
300,
1);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(888888,
'2022-06-01',
'2022-06-3',
450,
1);

INSERT INTO `bd_holidays`.`reservation`
(`idReservation`,
`dateDebut`,
`dateFin`,
`prixNet`,
`paye`)
VALUES
(99999,
'2022-06-04',
'2022-06-06',
400,
1);*/