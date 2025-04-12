/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ssl.SSLSockets
 */
import android.net.ssl.SSLSockets;
import javax.net.ssl.SSLSocket;

/*
 * Renamed from Ve
 */
public final class ve_0 {
    public static /* bridge */ /* synthetic */ void a(SSLSocket sSLSocket) {
        SSLSockets.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
    }
}

