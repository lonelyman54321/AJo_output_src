/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzcdk;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class zzcef {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbfb zze;
    private final zzbfe zzf;
    private final zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcdk zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        Random random = zzay.zze();
        int n3 = random.nextInt(100);
        Object object = zzbep.zzmF;
        zzben zzben2 = zzba.zzc();
        object = (Integer)zzben2.zza((zzbeg)object);
        int n4 = (Integer)object;
        if (n3 < n4) {
            n3 = 1;
        } else {
            n3 = 0;
            random = null;
        }
        zza = n3;
    }

    public zzcef(Context objectArray, VersionInfoParcel object, String object2, zzbfe zzbfe2, zzbfb zzbfb2) {
        long l2;
        zzbf zzbf2 = new zzbf();
        Object object3 = zzbf2;
        zzbf2.zza("min_1", Double.MIN_VALUE, 1.0);
        zzbf2.zza("1_5", 1.0, 5.0);
        zzbf2.zza("5_10", 5.0, 10.0);
        zzbf2.zza("10_20", 10.0, 20.0);
        zzbf2.zza("20_30", 20.0, 30.0);
        double d2 = 30.0;
        double d5 = Double.MAX_VALUE;
        String string2 = "30_max";
        zzbf2.zza(string2, d2, d5);
        this.zzg = object3 = zzbf2.zzb();
        object3 = null;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = l2 = (long)-1;
        this.zzb = objectArray;
        this.zzd = object;
        this.zzc = object2;
        this.zzf = zzbfe2;
        this.zze = zzbfb2;
        objectArray = zzbep.zzA;
        object = zzba.zzc();
        objectArray = (String)((zzben)object).zza((zzbeg)objectArray);
        if (objectArray == null) {
            objectArray = new String[]{};
            this.zzi = objectArray;
            objectArray = new long[0];
            this.zzh = (long[])objectArray;
            return;
        }
        objectArray = TextUtils.split((String)objectArray, (String)",");
        int n3 = objectArray.length;
        object2 = new String[n3];
        this.zzi = object2;
        object = new long[n3];
        this.zzh = (long[])object;
        for (int i3 = 0; i3 < (n3 = objectArray.length); ++i3) {
            object = this.zzh;
            object2 = objectArray[i3];
            long l3 = Long.parseLong((String)object2);
            try {
                object[i3] = l3;
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                object2 = "Unable to parse frame hash target time number.";
                com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, numberFormatException);
                object = this.zzh;
                object[i3] = l2;
            }
        }
    }

    public final void zza(zzcdk zzcdk2) {
        Object object = new String[]{"vpc2"};
        Object object2 = this.zzf;
        zzbfb zzbfb2 = this.zze;
        zzbew.zza((zzbfe)object2, zzbfb2, (String[])object);
        this.zzj = true;
        object = this.zzf;
        object2 = zzcdk2.zzj();
        ((zzbfe)object).zzd("vpn", (String)object2);
        this.zzo = zzcdk2;
    }

    public final void zzb() {
        boolean bl2 = this.zzj;
        if (bl2 && !(bl2 = this.zzk)) {
            zzbfe zzbfe2 = this.zzf;
            zzbfb zzbfb2 = this.zze;
            String[] stringArray = new String[]{"vfr2"};
            zzbew.zza(zzbfe2, zzbfb2, stringArray);
            this.zzk = bl2 = true;
        }
    }

    public final void zzc() {
        boolean bl2;
        this.zzn = bl2 = true;
        boolean bl3 = this.zzk;
        if (bl3 && !(bl3 = this.zzl)) {
            zzbfe zzbfe2 = this.zzf;
            zzbfb zzbfb2 = this.zze;
            String[] stringArray = new String[]{"vfp2"};
            zzbew.zza(zzbfe2, zzbfb2, stringArray);
            this.zzl = bl2;
        }
    }

    public final void zzd() {
        int n3 = zza;
        if (n3 != 0 && (n3 = this.zzp) == 0) {
            int n4;
            String string2;
            String string3;
            Object object;
            boolean bl2;
            Bundle bundle = E1.a("type", "native-player-metrics");
            Object object2 = this.zzc;
            bundle.putString("request", (String)object2);
            object2 = this.zzo.zzj();
            Object object3 = "player";
            bundle.putString((String)object3, (String)object2);
            object2 = this.zzg.zza().iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (zzbe)object2.next();
                object = String.valueOf(((zzbe)object3).zza);
                int n7 = ((zzbe)object3).zze;
                string3 = Integer.toString(n7);
                string2 = "fps_c_";
                object = string2.concat((String)object);
                bundle.putString((String)object, string3);
                object = String.valueOf(((zzbe)object3).zza);
                double d2 = ((zzbe)object3).zzd;
                object3 = Double.toString(d2);
                string3 = "fps_p_";
                object = string3.concat((String)object);
                bundle.putString((String)object, (String)object3);
            }
            object2 = null;
            for (n3 = 0; n3 < (n4 = ((Object)(object3 = (Object)this.zzh)).length); ++n3) {
                object = this.zzi[n3];
                if (object == null) continue;
                Object object4 = object3[n3];
                object3 = (long)object4;
                string3 = "fh_";
                object3 = object3.toString();
                object3 = string3.concat((String)object3);
                bundle.putString((String)object3, (String)object);
            }
            string3 = this.zzb;
            object2 = this.zzd;
            object = zzu.zzp();
            string2 = ((VersionInfoParcel)object2).afmaVersion;
            String string4 = "gmob-apps";
            boolean bl3 = true;
            ((zzt)object).zzh((Context)string3, string2, string4, bundle, bl3);
            n3 = 1;
            this.zzp = n3;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzf(zzcdk zzcdk2) {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object;
        Object object2;
        String[] stringArray;
        zzcef zzcef2 = this;
        String string2 = null;
        int n3 = 1;
        boolean bl2 = this.zzl;
        if (bl2 && !(bl2 = this.zzm)) {
            bl2 = com.google.android.gms.ads.internal.util.zze.zzc();
            if (bl2 && !(bl2 = this.zzm)) {
                stringArray = "VideoMetricsMixin first frame";
                com.google.android.gms.ads.internal.util.zze.zza((String)stringArray);
            }
            stringArray = zzcef2.zzf;
            object2 = zzcef2.zze;
            object = new String[]{"vff2"};
            zzbew.zza((zzbfe)stringArray, (zzbfb)object2, (String[])object);
            zzcef2.zzm = n3;
        }
        stringArray = zzu.zzB();
        long l8 = stringArray.nanoTime();
        int n4 = zzcef2.zzn;
        long l12 = 1L;
        long l14 = -1;
        if (n4 != 0 && (n4 = zzcef2.zzq) != 0 && (n4 = (l7 = (l4 = zzcef2.zzr) - l14) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != 0) {
            l4 = TimeUnit.SECONDS.toNanos(l12);
            double d2 = l4;
            l3 = zzcef2.zzr;
            l3 = l8 - l3;
            object = zzcef2.zzg;
            double d5 = l3;
            ((zzbh)object).zzb(d2 /= d5);
        }
        zzcef2.zzq = n4 = zzcef2.zzn;
        zzcef2.zzr = l8;
        stringArray = zzbep.zzB;
        object2 = zzba.zzc();
        stringArray = (Long)((zzben)object2).zza((zzbeg)stringArray);
        l8 = stringArray.longValue();
        l4 = zzcdk2.zza();
        n4 = 0;
        object = null;
        while (true) {
            long[] lArray;
            long l15;
            long l16;
            String[] stringArray2;
            int n7;
            if (n4 >= (n7 = (stringArray2 = zzcef2.zzi).length)) {
                return;
            }
            String string3 = stringArray2[n4];
            if (string3 == null && (l16 = (l15 = l8 - (l3 = Math.abs(l4 - (l2 = (lArray = zzcef2.zzh)[n4])))) == 0L ? 0 : (l15 < 0L ? -1 : 1)) > 0) break;
            zzcdk zzcdk3 = zzcdk2;
            n4 += n3;
            l12 = 1L;
        }
        stringArray = zzcef2.zzi;
        int n8 = 8;
        zzcdk zzcdk4 = zzcdk2;
        Bitmap bitmap = zzcdk2.getBitmap(n8, n8);
        long l17 = 0L;
        l2 = 63;
        long l18 = l17;
        int n10 = 0;
        while (true) {
            if (n10 >= n8) {
                object2 = l18;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                stringArray[n4] = string2 = String.format("%016X", objectArray);
                return;
            }
            for (int i3 = 0; i3 < n8; l18 |= (l19 <<= n8), l2 += l14, i3 += n3) {
                int n14 = bitmap.getPixel(i3, n10);
                int n15 = Color.blue((int)n14);
                int n16 = Color.red((int)n14) + n15;
                long l19 = (n14 = Color.green((int)n14) + n16) > (n8 = 128) ? 1L : l17;
                n8 = (int)l2;
                n8 = 8;
            }
            n10 += n3;
            n8 = 8;
            l12 = 1L;
        }
    }
}

