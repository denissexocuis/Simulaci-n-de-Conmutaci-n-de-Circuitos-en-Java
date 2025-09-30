import java.net.InetAddress;
import java.util.ArrayList;

public class ServerHost extends Host
{
    ArrayList<Host> HostConectados;

    public ServerHost(InetAddress HostIp, int Port, String Hostname, ArrayList<Host> hosts)
    {
        super(HostIp, Port, Hostname);
        this.HostConectados = hosts;
    }

    public ArrayList<Host> getHostConectados()
    {
        return this.HostConectados;
    }

    public int getCantidadHost()
    {
        return this.HostConectados.size();
    }
}
