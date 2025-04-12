/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class UdpDataSource
extends Yv {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public UdpDataSource() {
        super(true);
        DatagramPacket datagramPacket;
        this.e = 8000;
        int n3 = 2000;
        byte[] byArray = new byte[n3];
        this.f = byArray;
        this.g = datagramPacket = new DatagramPacket(byArray, 0, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 ti0_12) {
        SecurityException securityException2;
        Object object;
        block6: {
            IOException iOException2;
            block5: {
                int n3;
                block4: {
                    Object object2;
                    block3: {
                        object = ti0_12.a;
                        this.h = object;
                        object = object.getHost();
                        object.getClass();
                        object2 = this.h;
                        n3 = object2.getPort();
                        this.n(ti0_12);
                        try {
                            this.k = object = InetAddress.getByName((String)object);
                            InetAddress inetAddress = this.k;
                            object = new InetSocketAddress(inetAddress, n3);
                            object2 = this.k;
                            n3 = (int)(((InetAddress)object2).isMulticastAddress() ? 1 : 0);
                            if (n3 == 0) break block3;
                            this.j = object2 = new MulticastSocket((SocketAddress)object);
                            object = this.k;
                            ((MulticastSocket)object2).joinGroup((InetAddress)object);
                            this.i = object = this.j;
                            break block4;
                        }
                        catch (IOException iOException2) {
                            break block5;
                        }
                        catch (SecurityException securityException2) {
                            break block6;
                        }
                    }
                    this.i = object2 = new DatagramSocket((SocketAddress)object);
                }
                object = this.i;
                n3 = this.e;
                ((DatagramSocket)object).setSoTimeout(n3);
                this.l = true;
                this.o(ti0_12);
                return -1;
            }
            object = new DataSourceException(iOException2, 2001);
            throw object;
        }
        object = new DataSourceException(securityException2, 2006);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        this.h = null;
        DatagramSocket datagramSocket = this.j;
        if (datagramSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                ((MulticastSocket)datagramSocket).leaveGroup(inetAddress);
            }
            catch (IOException iOException) {}
            this.j = null;
        }
        if ((datagramSocket = this.i) != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        boolean bl2 = this.l;
        if (bl2) {
            this.l = false;
            this.m();
        }
    }

    public final Uri k() {
        return this.h;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        DatagramPacket datagramPacket;
        int n8;
        block7: {
            if (n4 == 0) {
                return 0;
            }
            n8 = this.m;
            datagramPacket = this.g;
            if (n8 == 0) {
                SocketTimeoutException socketTimeoutException2;
                block9: {
                    DatagramSocket datagramSocket = this.i;
                    datagramSocket.getClass();
                    try {
                        datagramSocket.receive(datagramPacket);
                        this.m = n8 = datagramPacket.getLength();
                        this.l(n8);
                        break block7;
                    }
                    catch (IOException iOException) {
                    }
                    catch (SocketTimeoutException socketTimeoutException2) {
                        break block9;
                    }
                    UdpDataSource$UdpDataSourceException udpDataSource$UdpDataSourceException = new DataSourceException(iOException, 2001);
                    throw udpDataSource$UdpDataSourceException;
                }
                UdpDataSource$UdpDataSourceException udpDataSource$UdpDataSourceException = new DataSourceException(socketTimeoutException2, 2002);
                throw udpDataSource$UdpDataSourceException;
            }
        }
        n8 = datagramPacket.getLength();
        int n10 = this.m;
        n4 = Math.min(n10, n4);
        System.arraycopy(this.f, n8 -= n10, byArray, n3, n4);
        this.m = n7 = this.m - n4;
        return n4;
    }
}

