insert into user(firstName, lastName) values('Johnny', 'Doe');
insert into user(firstName, lastName) values('Jane', 'Doe');
insert into user(firstName, lastName) values('Tyler', 'Turner');
insert into user(firstName, lastName) values('Marcia', 'Jackson');
insert into user(firstName, lastName) values('Allan', 'Wilson');
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
COMMIT;