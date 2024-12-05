create table Uloga (
                       IDUloga int primary key identity (1, 1),
                       Naziv nvarchar(50) unique not null,
);

create table Korisnik (
                          IDKorisnik int primary key identity (1, 1),
                          KorisnickoIme nvarchar(50) unique not null,
                          EPosta varchar(50) not null,
                          LozinkaHash nvarchar(256) not null,
                          LozinkaSalt nvarchar(256) not null,
                          UkupnaOcjena float default 0 not null,
                          UlogaID int,
                          foreign key (UlogaID) references Uloga(IDUloga)
);