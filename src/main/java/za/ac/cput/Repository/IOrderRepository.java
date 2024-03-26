package za.ac.cput.Repository;

import java.util.List;

public interface IOrderRepository<T,Id> {


    public T create (T object);
    public T read (Id id);

    public T update (T object);

    public T delete (T object);

    public List<T> getAll();



}
