import java.net.InetAddress;

//* clase padre 'host'
public abstract class Host
{
    public InetAddress HostIP;
    public int Port;
    public String Hostname;

    public Host(InetAddress HostIp, int port, String name)
    {
        this.HostIP = HostIp;
        this.Port = port;
        this.Hostname = name;
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

    public String getHostname()
    {
        return this.Hostname;
    }

}
