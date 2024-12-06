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
                          UlogaID int not null,
                          foreign key (UlogaID) references Uloga(IDUloga)
);

create table Godina (
                        IDGodina int primary key identity (1, 1),
                        Naziv nvarchar(50) unique not null,
                        Prosjek float,
                        KorisnikID int,
                        foreign key (KorisnikID) references Korisnik(IDKorisnik)
);

create table Predmet (
                         IDPredmet int primary key identity (1, 1),
                         Naziv nvarchar(50) unique not null,
                         Prosjek float,
                         GodinaID int,
                         foreign key (GodinaID) references Godina(IDGodina)
);

create table Ocjena (
                        IDOcjena int primary key identity (1, 1),
                        Vrijednost int not null,
                        PredmetID int,
                        foreign key (PredmetID) references Predmet(IDPredmet)
);

create table Log(
                        IDLog int primary key identity (1, 1),
                        Opis nvarchar(100) not null,
                        Vrijeme datetime not null
)