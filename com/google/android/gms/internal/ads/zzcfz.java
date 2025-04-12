/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcga;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

final class zzcfz
extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcga zzb;

    public zzcfz(zzcga object) {
        this.zzb = object;
        this.zza = object = (SSLSocketFactory)SSLSocketFactory.getDefault();
    }

    private final Socket zza(Socket socket) {
        zzcga zzcga2 = this.zzb;
        int n3 = zzcga.zzk(zzcga2);
        if (n3 > 0) {
            int n4 = zzcga.zzk(zzcga2);
            socket.setReceiveBufferSize(n4);
        }
        zzcga.zzl(this.zzb, socket);
        return socket;
    }

    public final Socket createSocket(String object, int n3) {
        object = this.zza.createSocket((String)object, n3);
        this.zza((Socket)object);
        return object;
    }

    public final Socket createSocket(String object, int n3, InetAddress inetAddress, int n4) {
        object = this.zza.createSocket((String)object, n3, inetAddress, n4);
        this.zza((Socket)object);
        return object;
    }

    public final Socket createSocket(InetAddress object, int n3) {
        object = this.zza.createSocket((InetAddress)object, n3);
        this.zza((Socket)object);
        return object;
    }

    public final Socket createSocket(InetAddress object, int n3, InetAddress inetAddress, int n4) {
        object = this.zza.createSocket((InetAddress)object, n3, inetAddress, n4);
        this.zza((Socket)object);
        return object;
    }

    public final Socket createSocket(Socket socket, String string2, int n3, boolean bl2) {
        socket = this.zza.createSocket(socket, string2, n3, bl2);
        this.zza(socket);
        return socket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }
}

