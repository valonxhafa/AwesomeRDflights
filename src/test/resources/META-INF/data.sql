--------------------------------------------------------
--  Inserting Customers
--------------------------------------------------------
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Johnny', 'Doe', 'joendoe@email.com', 'M', 'test123', 'CUSTOMER');
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Jane', 'Doe','joendoe2@email.com', 'M', 'test123','CUSTOMER');
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Tyler', 'Turner', 'TylerTurner@email.com', 'M', 'test123','CUSTOMER');
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Marcia', 'Jackson', 'MarciaJackson@email.com', 'M', 'test123','CUSTOMER');
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Allan', 'Wilson', 'AllanWilson@email.com', 'M', 'test123','CUSTOMER');
INSERT INTO user(firstName, lastName, email, gender, password, role) values('Test', 'test', 'test@test.com', 'M', 'test123','CUSTOMER');
COMMIT;

--------------------------------------------------------
--  Inserting Regions
--------------------------------------------------------
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Pacific');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'America');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Atlantic');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Africa');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Europe');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Arctic');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Indian');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Asia');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Australia');
INSERT INTO region (updateTime,version,regionName) VALUES (null,1,'Antarctica');
COMMIT;

--------------------------------------------------------
--  Inserting AirlineCompanies
--------------------------------------------------------
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@jetairfly.com', 'M', 'test123', 'JetairFly', 'JET','AIRLINECOMPANY');
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@brusselsairline.com', 'M', 'test123', 'Brussels Airline', 'BrA','AIRLINECOMPANY');
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@emirates.com', 'F', 'test123', 'Emirates Airlines', 'EMA','AIRLINECOMPANY');
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@klm.com', 'M', 'test123', 'KLM', 'KLM','AIRLINECOMPANY');
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@ryanair.com', 'M', 'test123', 'Ryanair', 'RYA','AIRLINECOMPANY')
INSERT INTO user(firstName, lastName, email, gender, password, airlineCompanyName, airlineCompanyCode, role) values('Johnny', 'Doe', 'johnny@mahan.com', 'M', 'test123', 'Mahan Airline', 'MHA','AIRLINECOMPANY');
commit;

--------------------------------------------------------
--  Inserting Airports
--------------------------------------------------------
insert into Airport(airportCode, airportName, country, available, region_id) values('BELC', 'Airport Brussel Zaventem', 'Belgium', TRUE, 4 );
insert into Airport(airportCode, airportName, country, available, region_id) values('GERK', 'Kassel Calden', 'Germany', TRUE, 4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (100,null,1,TRUE,'YOW','Canada','Ottawa Macdonald Cartier Intl',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (200,null,1,TRUE,'YZT','Canada','Port Hardy',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (400,null,1,TRUE,'KSF','Germany','Kassel Calden',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (500,null,1,TRUE,'ESH','United Kingdom','Shoreham',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (600,null,1,TRUE,'NOC','Ireland','Ireland West Knock',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (800,null,1,TRUE,'ELS','South Africa','East London',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (900,null,1,TRUE,'NGE','Cameroon','Ngaoundere',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1000,null,1,TRUE,'FYT','Chad','Faya Largeau',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1100,null,1,TRUE,'FAA','Guinea','Faranah',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1200,null,1,TRUE,'DBV','Croatia','Dubrovnik',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1300,null,1,TRUE,'RCO','France','St Agnant',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1500,null,1,TRUE,'CRV','Italy','Crotone',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1800,null,1,TRUE,'CZM','Mexico','Cozumel Intl',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (1900,null,1,TRUE,'AVI','Cuba','Maximo Gomez',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2000,null,1,TRUE,'LIF','New Caledonia','Lifou',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2300,null,1,TRUE,'OIR','Japan','Okushiri',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2400,null,1,TRUE,'CGY','Philippines','Cagayan De Oro',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2500,null,1,TRUE,'RZA','Argentina','Santa Cruz',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2800,null,1,TRUE,'CHH','Peru','Chachapoyas',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (2900,null,1,TRUE,'AXA','Anguilla','Wallblake',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3000,null,1,TRUE,'IXG','India','Belgaum',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3100,null,1,TRUE,'IXJ','India','Jammu',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3200,null,1,TRUE,'NHA','Vietnam','Nhatrang',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3300,null,1,TRUE,'KTE','Malaysia','Kerteh',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3400,null,1,TRUE,'HRB','China','Taiping',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3500,null,1,TRUE,'MXF','United States','Maxwell Afb',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3600,null,1,TRUE,'LOU','United States','Bowman Fld',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3700,null,1,TRUE,'ACT','United States','Waco Rgnl',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3800,null,1,TRUE,'FLV','United States','Sherman Aaf',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (3900,null,1,TRUE,'PCB','Indonesia','Pondok Cabe',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (4000,null,1,TRUE,'URT','Thailand','Surat Thani',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (4100,null,1,TRUE,'IDA','United States','Idaho Falls Rgnl',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (4200,null,1,TRUE,'BXU','Philippines','Butuan',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (4300,null,1,TRUE,'CJM','Thailand','Chumphon',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (5500,null,1,TRUE,'YHC','Canada','Vancouver Harbour Water Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (5600,null,1,TRUE,'HIL','Ethiopia','Shilavo Airport',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (5700,null,1,TRUE,'ATB','Sudan','Atbara Airport',3);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (5800,null,1,TRUE,'ADF','Turkey','Adiyaman Airport',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (5900,null,1,TRUE,'PBJ','Vanuatu','Tavie Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6000,null,1,TRUE,'ONJ','Japan','Odate Noshiro Airport',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6100,null,1,TRUE,'UJE','Marshall Islands','Ujae Atoll Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6200,null,1,TRUE,'MNU','Burma','Mawlamyine Airport',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6300,null,1,TRUE,'MRZ','Australia','Moree Airport',9);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6400,null,1,TRUE,'MIG','China','Mianyang Airport',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6500,null,1,TRUE,'MCW','United States','Mason City Municipal',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (6800,null,1,TRUE,'ESC','United States','Delta County Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7000,null,1,TRUE,'MLD','United States','Malad City',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7100,null,1,TRUE,'KEK','United States','Ekwok Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7200,null,1,TRUE,'SXP','United States','Sheldon Point Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7500,null,1,TRUE,'ZAJ','Afghanistan','Zaranj Airport',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7700,null,1,TRUE,'PHA','Vietnam','Phan Rang Airport',7);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (7800,null,1,TRUE,'ESX','Germany','Essen HBF',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (8000,null,1,TRUE,'GML','Ukraine','Gostomel Antonov',4);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (8200,null,1,TRUE,'OOK','United States','Toksook Bay Airport',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (8300,null,1,TRUE,'CTJ','United States','West Georgia Regional Airport - O V Gray Field',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (8800,null,1,TRUE,'CDK','United States','CedarKey',1);
INSERT INTO airport (id,updateTime,version,available,airportCode,country,airportName,region_id) VALUES (9200,null,1,TRUE,'X26','United States','Sebastian Municipal',1);
commit;

--------------------------------------------------------
--  Inserting Flights
--------------------------------------------------------

INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,2,{ts '2017-09-20 19:15:10.'},{ts '2017-09-20 18:00:00.'}, 7 , 'ASI-1234');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,2,1,{ts '2017-09-22 15:15:10.'},{ts '2017-09-22 14:00:00.'}, 7 , 'ASI-1234');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,2,1,{ts '2017-09-22 13:15:10.'},{ts '2017-09-22 12:00:00.'}, 7 , 'ASI-1234');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,2,1,{ts '2017-09-22 19:15:10.'},{ts '2017-09-22 18:00:00.'}, 8 , 'ASI-4567');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,100,{ts '2017-09-20 19:15:10.'},{ts '2017-09-20 18:00:00.'}, 9 , 'ASI-4567');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,200,{ts '2017-09-20 19:15:10.'},{ts '2017-09-20 18:00:00.'}, 10 , 'ASI-4098');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,400,{ts '2017-09-20 19:15:10.'},{ts '2017-09-20 18:00:00.'}, 11 , 'ASI-4027');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,500,{ts '2017-09-20 19:15:10.'},{ts '2017-09-20 18:00:00.'}, 12 , 'ASI-2367');
COMMIT;

