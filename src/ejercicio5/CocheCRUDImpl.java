package ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("metodo save invocado");
    }

    @Override
    public void findAll() {
        System.out.println("metodo findAll invocado");
    }

    @Override
    public void delete() {
        System.out.println("metodo delete invocado");
    }
}
