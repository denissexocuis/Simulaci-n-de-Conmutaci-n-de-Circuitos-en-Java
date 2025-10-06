import java.util.ArrayList;

//* la clase network será un grafo de routers
//* cada router estará conectado a otro router y a un host

//* esto para tener un limite de clientes que se van a conectar
public class Network
{
    int ID_Router; 
    ArrayList<Router> RoutersGrafo;

    public String getConexiones()
    {
        return this.RoutersGrafo.toString();
    }

    public addRouter(Router r)
    {
        
    }


    //* la clase Network se va a compilar para crear la topología de forma automática
    public static void main(String[] args)
    {
        //! aqui agregar los routers
        System.out.println("Creando topologia...");
        Network red = new Network();

        red.
    }
}
