insert into Uloga (Naziv)
values
    ('korisnik'),
    ('admin');

insert into Person(KorisnickoIme, Email, PswdHash, PswSalt, UlogaID)
values
    ('pero', 'pp@gmail.com', 'dkjcb+7/V0WM3ZZuwhbxrVQphOWvcD69HqL3y0lonUk=', '[B@1476f38b', 0),
    ('viki', 'vpetrina@algebra.hr', 'uYi2Yfpi/j9yJ6Ex7Hv31bvYgP+HUJX17FjTKuaL3Ec=', '[B@3e0144ad', 0),
    ('mico', 'mvukusic@algebra.hr', 'LwJNV8vfg7Y0IpmImTNIrnu6ELTb9dNlcfnzP6qiIv4=', '[B@2640f4e1', 0),
    ('miki', 'mjurela@algebra.hr', 'zxmYRwfqu/yc3BtxSNCZ3gl1QzQmbISkTWRwqtKL4+g=', '[B@1aa9735f', 0),
    ('sudo', 'super@user.do', 'Bw+iB2uMnRKfzyDny1Fx30GIIdX5TqWnhQ0hbrZZOkc=', '[B@5cddb13a', 1);
