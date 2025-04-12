/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzif;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class zzig
extends zzgv {
    private final byte[] zza;
    private final DatagramPacket zzb;
    private Uri zzc;
    private DatagramSocket zzd;
    private MulticastSocket zze;
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzig() {
        throw null;
    }

    public zzig(int n3) {
        super(true);
        DatagramPacket datagramPacket;
        n3 = 2000;
        byte[] byArray = new byte[n3];
        this.zza = byArray;
        this.zzb = datagramPacket = new DatagramPacket(byArray, 0, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        int n8;
        block7: {
            if (n4 == 0) {
                return 0;
            }
            n8 = this.zzh;
            if (n8 == 0) {
                SocketTimeoutException socketTimeoutException2;
                block9: {
                    IOException iOException2;
                    block8: {
                        block6: {
                            try {
                                Object object = this.zzd;
                                if (object == null) break block6;
                                DatagramPacket datagramPacket = this.zzb;
                                ((DatagramSocket)object).receive(datagramPacket);
                                object = this.zzb;
                                this.zzh = n8 = ((DatagramPacket)object).getLength();
                                this.zzg(n8);
                                break block7;
                            }
                            catch (IOException iOException2) {
                                break block8;
                            }
                            catch (SocketTimeoutException socketTimeoutException2) {
                                break block9;
                            }
                        }
                        boolean bl2 = false;
                        byArray = null;
                        {
                            throw null;
                        }
                    }
                    zzif zzif2 = new zzif(iOException2, 2001);
                    throw zzif2;
                }
                zzif zzif3 = new zzif(socketTimeoutException2, 2002);
                throw zzif3;
            }
        }
        n8 = this.zzb.getLength();
        int n10 = this.zzh;
        n4 = Math.min(n10, n4);
        System.arraycopy(this.zza, n8 -= n10, byArray, n3, n4);
        this.zzh = n7 = this.zzh - n4;
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh zzhh2) {
        SecurityException securityException2;
        Object object;
        block6: {
            IOException iOException2;
            block5: {
                int n3;
                block4: {
                    Object object2;
                    block3: {
                        object = zzhh2.zza;
                        this.zzc = object;
                        object = object.getHost();
                        object.getClass();
                        object2 = this.zzc;
                        n3 = object2.getPort();
                        this.zzi(zzhh2);
                        try {
                            this.zzf = object = InetAddress.getByName((String)object);
                            InetAddress inetAddress = this.zzf;
                            object = new InetSocketAddress(inetAddress, n3);
                            object2 = this.zzf;
                            n3 = (int)(((InetAddress)object2).isMulticastAddress() ? 1 : 0);
                            if (n3 == 0) break block3;
                            this.zze = object2 = new MulticastSocket((SocketAddress)object);
                            object = this.zzf;
                            ((MulticastSocket)object2).joinGroup((InetAddress)object);
                            this.zzd = object = this.zze;
                            break block4;
                        }
                        catch (IOException iOException2) {
                            break block5;
                        }
                        catch (SecurityException securityException2) {
                            break block6;
                        }
                    }
                    this.zzd = object2 = new DatagramSocket((SocketAddress)object);
                }
                object = this.zzd;
                n3 = 8000;
                ((DatagramSocket)object).setSoTimeout(n3);
                this.zzg = true;
                this.zzj(zzhh2);
                return -1;
            }
            object = new zzif(iOException2, 2001);
            throw object;
        }
        object = new zzif(securityException2, 2006);
        throw object;
    }

    public final Uri zzc() {
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        this.zzc = null;
        DatagramSocket datagramSocket = this.zze;
        if (datagramSocket != null) {
            try {
                InetAddress inetAddress = this.zzf;
                if (inetAddress == null) {
                    throw null;
                }
                ((MulticastSocket)datagramSocket).leaveGroup(inetAddress);
            }
            catch (IOException iOException) {}
            this.zze = null;
        }
        if ((datagramSocket = this.zzd) != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        boolean bl2 = this.zzg;
        if (bl2) {
            this.zzg = false;
            this.zzh();
        }
    }
}

