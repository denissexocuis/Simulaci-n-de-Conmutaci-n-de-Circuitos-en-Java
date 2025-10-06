//* esta clase es una clase padre que la van a heredar las clases 'host' y 'router'
//* esto con la finalidad de que, cuando se haga el grafo, el router pueda tener una lista de adyacencia con routers o hosts

public class Dispositivo
{
    String nombre;

    public Dispositivo(String nom)
    {
        this.nombre = nom;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nom)
    {
        this.nombre = nom;
    }
}
