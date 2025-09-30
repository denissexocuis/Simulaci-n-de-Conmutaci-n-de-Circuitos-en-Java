//! clase router

import java.util.ArrayList;

public class Router
{
    private int ID_Router;
    private ArrayList<Host> HostsConectados;

    //* constructor
    public Router(int id)
    {
        this.ID_Router = id;
        this.HostsConectados = new ArrayList<Host>();
    }

    public int getHost()
    {
        return this.ID_Router;
    }

    public String getHostConectados()
    {
        return this.HostsConectados.toString();
    }

}
