//! clase router

import java.util.ArrayList;

public class Router extends Dispositivo
{
    private int ID_Router;
    private ArrayList<Dispositivo> Conexiones;

    //* constructor
    public Router(int id, String name)
    {
        super(name);
        this.ID_Router = id;
        this.Conexiones = new ArrayList<>();
    }

    public int getHost()
    {
        return this.ID_Router;
    }

    public String getHostConectados()
    {
        return this.Conexiones.toString();
    }

}
