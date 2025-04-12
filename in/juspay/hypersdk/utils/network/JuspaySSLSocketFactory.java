/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.utils.network;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class JuspaySSLSocketFactory
extends SSLSocketFactory {
    private final SSLSocketFactory delegate;

    public JuspaySSLSocketFactory() {
        Object object = SSLContext.getInstance("TLS");
        ((SSLContext)object).init(null, null, null);
        this.delegate = object = ((SSLContext)object).getSocketFactory();
    }

    private Socket enableTLSOnSocket(Socket socket) {
        boolean bl2 = socket instanceof SSLSocket;
        if (bl2) {
            Socket socket2 = socket;
            socket2 = (SSLSocket)socket;
            String string2 = "TLSv1.2";
            String[] stringArray = new String[]{"TLSv1.1", string2};
            ((SSLSocket)socket2).setEnabledProtocols(stringArray);
        }
        return socket;
    }

    public Socket createSocket() {
        Socket socket = this.delegate.createSocket();
        return this.enableTLSOnSocket(socket);
    }

    public Socket createSocket(String object, int n3) {
        object = this.delegate.createSocket((String)object, n3);
        return this.enableTLSOnSocket((Socket)object);
    }

    public Socket createSocket(String object, int n3, InetAddress inetAddress, int n4) {
        object = this.delegate.createSocket((String)object, n3, inetAddress, n4);
        return this.enableTLSOnSocket((Socket)object);
    }

    public Socket createSocket(InetAddress object, int n3) {
        object = this.delegate.createSocket((InetAddress)object, n3);
        return this.enableTLSOnSocket((Socket)object);
    }

    public Socket createSocket(InetAddress object, int n3, InetAddress inetAddress, int n4) {
        object = this.delegate.createSocket((InetAddress)object, n3, inetAddress, n4);
        return this.enableTLSOnSocket((Socket)object);
    }

    public Socket createSocket(Socket socket, String string2, int n3, boolean bl2) {
        socket = this.delegate.createSocket(socket, string2, n3, bl2);
        return this.enableTLSOnSocket(socket);
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }
}

