package repository.database;

import domain.Utilizator;
import repository.Repository;

public class UserDatabase implements Repository<Long, Utilizator> {
    @Override
    public Utilizator findOne(Long aLong) {
        return null;
        //to do
    }

    @Override
    public Iterable<Utilizator> findAll() {
        return null;
        //to do
    }

    @Override
    public Utilizator save(Utilizator entity) {
        return null;
        //to do
    }

    @Override
    public Utilizator delete(Long aLong) {
        return null;
    }

    @Override
    public Utilizator update(Utilizator entity) {
        return null;
    }
}
