import java.net.InetAddress;

//* clase padre 'host'
public abstract class Host extends Dispositivo
{
    public InetAddress HostIP;
    public int Port;

    public Host(InetAddress HostIp, int port, String name)
    {
        super(name);
        this.HostIP = HostIp;
        this.Port = port;
    }

    //? getters
    public InetAddress getAddress()
    {
        return this.HostIP;
    }

    public String getSocketAddress()
    {
        return this.HostIP.getHostAddress() + ':' + this.Port;
    }

    public int getPort()
    {
        return this.Port;
    }

}
