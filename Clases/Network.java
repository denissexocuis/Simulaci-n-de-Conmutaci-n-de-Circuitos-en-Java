import java.util.ArrayList;

//* la clase network será un grafo de routers
//* cada router estará conectado a otro router y a un host

//* esto para tener un limite de clientes que se van a conectar
public class Network
{
    ArrayList<ArrayList<Router>> Conexiones;

    public String getConexiones()
    {
        return this.Conexiones.toString();
    }
}
