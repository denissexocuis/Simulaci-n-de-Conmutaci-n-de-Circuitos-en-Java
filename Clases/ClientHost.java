import java.net.InetAddress;

public class ClientHost extends Host
{
    public ClientHost(InetAddress HostIp, int Port, String Hostname)
    {
        super(HostIp, Port, Hostname);
    }

    public boolean enviarMensaje()
    {
        // TODO
        return true;
    }

    public boolean enviarMensaje(String hola)
    {
        // TODO
        return true;
    }


}
