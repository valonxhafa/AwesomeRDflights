insert into user(firstName, lastName, email) values('Johnny', 'Doe', 'joendoe@email.com');
insert into user(firstName, lastName, email) values('Jane', 'Doe','joendoe2@email.com');
insert into user(firstName, lastName, email) values('Tyler', 'Turner', 'TylerTurner@email.com');
insert into user(firstName, lastName, email) values('Marcia', 'Jackson', 'MarciaJackson@email.com');
insert into user(firstName, lastName, email) values('Allan', 'Wilson', 'AllanWilson@email.com');
COMMIT;

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

insert into Airport(airportCode, airportName, country, available, region_id) values('BELC', 'Airport Brussel Zaventem', 'Belgium', TRUE, 4 );
insert into Airport(airportCode, airportName, country, available, region_id) values('GERK', 'Kassel Calden', 'Germany', TRUE, 4);
COMMIT;

INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,1,2,{ts '2016-09-12 19:15:10.'},{ts '2016-09-12 18:00:00.'}, 2 , 'ASI-1234');
INSERT INTO Flight (updateTime,version,airportarrival_id,airportdeparture_id,arrivalTime,departureTime,airlinecompany_id,flightnumber) VALUES (null,1,2,1,{ts '2016-09-12 19:15:10.'},{ts '2016-09-12 18:00:00.'}, 3 , 'ASI-4567');
COMMIT;