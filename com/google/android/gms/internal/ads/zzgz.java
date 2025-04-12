/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhc;
import com.google.android.gms.internal.ads.zzhh;
import java.net.URLDecoder;
import java.nio.charset.Charset;

public final class zzgz
extends zzgv {
    private zzhh zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        if (n4 == 0) {
            return 0;
        }
        int n8 = this.zzd;
        if (n8 == 0) {
            return -1;
        }
        n4 = Math.min(n4, n8);
        byte[] byArray2 = this.zzb;
        int n10 = zzgd.zza;
        n10 = this.zzc;
        System.arraycopy(byArray2, n10, byArray, n3, n4);
        this.zzc = n7 = this.zzc + n4;
        this.zzd = n7 = this.zzd - n4;
        this.zzg(n4);
        return n4;
    }

    public final long zzb(zzhh object) {
        this.zzi((zzhh)object);
        this.zza = object;
        Object object2 = ((zzhh)object).zza.normalizeScheme();
        Object object3 = object2.getScheme();
        int n3 = "data".equals(object3);
        object3 = String.valueOf(object3);
        String string2 = "Unsupported scheme: ";
        object3 = string2.concat((String)object3);
        zzeq.zze(n3 != 0, object3);
        object3 = object2.getSchemeSpecificPart();
        n3 = zzgd.zza;
        Object object4 = ",";
        object3 = object3.split((String)object4, -1);
        n3 = ((String[])object3).length;
        int n4 = 2;
        if (n3 == n4) {
            int n7 = 1;
            object2 = object3[n7];
            n3 = 0;
            object4 = null;
            string2 = ";base64";
            int n8 = (object3 = object3[0]).contains(string2);
            if (n8 != 0) {
                try {
                    object3 = Base64.decode((String)object2, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object2 = String.valueOf(object2);
                    throw zzch.zzb("Error while parsing Base64 encoded string: ".concat((String)object2), illegalArgumentException);
                }
                this.zzb = (byte[])object3;
            } else {
                object3 = zzfxs.zza.name();
                object2 = URLDecoder.decode((String)object2, (String)object3);
                object3 = zzfxs.zzc;
                object2 = object2.getBytes((Charset)object3);
                this.zzb = (byte[])object2;
            }
            long l2 = ((zzhh)object).zze;
            object4 = this.zzb;
            n3 = ((Object)object4).length;
            long l3 = n3;
            n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n4 <= 0) {
                this.zzc = n8 = (int)l2;
                this.zzd = n3 -= n8;
                l2 = ((zzhh)object).zzf;
                long l4 = -1;
                long l7 = l2 - l4;
                Object object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object5 != false) {
                    l3 = n3;
                    l2 = Math.min(l3, l2);
                    this.zzd = n8 = (int)l2;
                }
                this.zzj((zzhh)object);
                l2 = ((zzhh)object).zzf;
                long l8 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (l8 != false) {
                    return l2;
                }
                return this.zzd;
            }
            this.zzb = null;
            object = new zzhc(2008);
            throw object;
        }
        object = String.valueOf(object2);
        throw zzch.zzb("Unexpected URI format: ".concat((String)object), null);
    }

    public final Uri zzc() {
        zzhh zzhh2 = this.zza;
        if (zzhh2 != null) {
            return zzhh2.zza;
        }
        return null;
    }

    public final void zzd() {
        byte[] byArray = this.zzb;
        if (byArray != null) {
            this.zzb = null;
            this.zzh();
        }
        this.zza = null;
    }
}

