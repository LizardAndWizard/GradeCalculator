create table Uloga
(
    IDUloga int generated always as identity,
    Naziv   nvarchar(50) unique not null,
    primary key(IDUloga)
);

create table Korisnik
(
    IDKorisnik    int generated always as identity,
    KorisnickoIme nvarchar(50) unique not null,
    EPosta        varchar(50)         not null,
    LozinkaHash   nvarchar(256)       not null,
    LozinkaSalt   nvarchar(256)       not null,
    UkupnaOcjena  float default 0     not null,
    UlogaID       int                 not null,
    primary key(IDKorisnik),
    foreign key (UlogaID) references Uloga (IDUloga)
);

create table Godina
(
    IDGodina   int generated always as identity,
    Naziv      nvarchar(50) unique not null,
    Prosjek    float,
    KorisnikID int,
    primary key(IDGodina),
    foreign key (KorisnikID) references Korisnik (IDKorisnik)
);

create table Predmet
(
    IDPredmet int generated always as identity,
    Naziv     nvarchar(50) unique not null,
    Prosjek   float,
    GodinaID  int,
    primary key(IDPredmet),
    foreign key (GodinaID) references Godina (IDGodina)
);

create table Ocjena
(
    IDOcjena   int generated always as identity,
    Vrijednost int not null,
    PredmetID  int,
    primary key(IDOcjena),
    foreign key (PredmetID) references Predmet (IDPredmet)
);

create table Log
(
    IDLog   int generated always as identity,
    Opis    nvarchar(100) not null,
    Vrijeme datetime      not null,
    primary key(IDLog)
)