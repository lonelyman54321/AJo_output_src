/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzhc;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhu;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzhv
extends zzhc {
    public final zzhh zzb;
    public final int zzc;

    public zzhv(zzhh zzhh2, int n3, int n4) {
        n4 = 1;
        n3 = zzhv.zzb(2008, n4);
        super(n3);
        this.zzb = zzhh2;
        this.zzc = n4;
    }

    public zzhv(IOException iOException, zzhh zzhh2, int n3, int n4) {
        n3 = zzhv.zzb(n3, n4);
        super(iOException, n3);
        this.zzb = zzhh2;
        this.zzc = n4;
    }

    public zzhv(String string2, zzhh zzhh2, int n3, int n4) {
        n3 = zzhv.zzb(n3, n4);
        super(string2, n3);
        this.zzb = zzhh2;
        this.zzc = n4;
    }

    public zzhv(String string2, IOException iOException, zzhh zzhh2, int n3, int n4) {
        n3 = zzhv.zzb(n3, n4);
        super(string2, iOException, n3);
        this.zzb = zzhh2;
        this.zzc = n4;
    }

    public static zzhv zza(IOException iOException, zzhh zzhh2, int n3) {
        zzhv zzhv2;
        int n4;
        String string2 = iOException.getMessage();
        int n7 = iOException instanceof SocketTimeoutException;
        int n8 = 2007;
        if (n7 != 0) {
            n4 = 2002;
        } else {
            n7 = iOException instanceof InterruptedIOException;
            if (n7 != 0) {
                n4 = 1004;
            } else {
                String string3;
                n7 = 2001;
                n4 = string2 != null && (n4 = (int)((string2 = zzfxm.zza(string2)).matches(string3 = "cleartext.*not permitted.*") ? 1 : 0)) != 0 ? 2007 : 2001;
            }
        }
        if (n4 == n8) {
            zzhv2 = new zzhu(iOException, zzhh2);
        } else {
            zzhv zzhv3 = new zzhv(iOException, zzhh2, n4, n3);
            zzhv2 = zzhv3;
        }
        return zzhv2;
    }

    private static int zzb(int n3, int n4) {
        int n7 = 2000;
        if (n3 == n7) {
            n3 = 1;
            n3 = n4 != n3 ? 2000 : 2001;
        }
        return n3;
    }
}

