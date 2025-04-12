/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Tls12SocketFactory
extends SSLSocketFactory {
    public static final String SSLProtocolV12 = "TLSv1.2";
    private static final String[] TLS_V12_ONLY = new String[]{"TLSv1.2"};
    private final SSLSocketFactory base;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.base = sSLSocketFactory;
    }

    private Socket patch(Socket socket) {
        boolean bl2 = socket instanceof SSLSocket;
        if (bl2) {
            Socket socket2 = socket;
            socket2 = (SSLSocket)socket;
            String[] stringArray = TLS_V12_ONLY;
            ((SSLSocket)socket2).setEnabledProtocols(stringArray);
        }
        return socket;
    }

    public Socket createSocket(String object, int n3) {
        object = this.base.createSocket((String)object, n3);
        return this.patch((Socket)object);
    }

    public Socket createSocket(String object, int n3, InetAddress inetAddress, int n4) {
        object = this.base.createSocket((String)object, n3, inetAddress, n4);
        return this.patch((Socket)object);
    }

    public Socket createSocket(InetAddress object, int n3) {
        object = this.base.createSocket((InetAddress)object, n3);
        return this.patch((Socket)object);
    }

    public Socket createSocket(InetAddress object, int n3, InetAddress inetAddress, int n4) {
        object = this.base.createSocket((InetAddress)object, n3, inetAddress, n4);
        return this.patch((Socket)object);
    }

    public Socket createSocket(Socket socket, String string2, int n3, boolean bl2) {
        socket = this.base.createSocket(socket, string2, n3, bl2);
        return this.patch(socket);
    }

    public String[] getDefaultCipherSuites() {
        return this.base.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.base.getSupportedCipherSuites();
    }
}

