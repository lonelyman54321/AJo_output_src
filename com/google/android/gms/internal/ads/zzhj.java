/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgu;
import com.google.android.gms.internal.ads.zzgy;
import com.google.android.gms.internal.ads.zzgz;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzic;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzig;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzhj
implements zzhb {
    private final Context zza;
    private final List zzb;
    private final zzhb zzc;
    private zzhb zzd;
    private zzhb zze;
    private zzhb zzf;
    private zzhb zzg;
    private zzhb zzh;
    private zzhb zzi;
    private zzhb zzj;
    private zzhb zzk;

    public zzhj(Context object, zzhb zzhb2) {
        this.zza = object = object.getApplicationContext();
        this.zzc = zzhb2;
        this.zzb = object;
    }

    private final zzhb zzg() {
        zzhb zzhb2 = this.zze;
        if (zzhb2 == null) {
            zzhb2 = this.zza;
            zzgu zzgu2 = new zzgu((Context)zzhb2);
            this.zze = zzgu2;
            this.zzh(zzgu2);
        }
        return this.zze;
    }

    private final void zzh(zzhb zzhb2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.zzb).size()); ++i3) {
            object = (zzie)this.zzb.get(i3);
            zzhb2.zzf((zzie)object);
        }
    }

    private static final void zzi(zzhb zzhb2, zzie zzie2) {
        if (zzhb2 != null) {
            zzhb2.zzf(zzie2);
        }
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        zzhb zzhb2 = this.zzk;
        zzhb2.getClass();
        return zzhb2.zza(byArray, n3, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh zzhh2) {
        String string2;
        int n3;
        boolean bl2;
        Object object = this.zzk;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        zzeq.zzf(bl2);
        object = zzhh2.zza.getScheme();
        Object object2 = zzhh2.zza;
        int n4 = zzgd.zza;
        object2 = object2.getScheme();
        n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n4 == 0 && (n3 = (string2 = "file").equals(object2)) == 0) {
            object2 = "asset";
            n3 = ((String)object2).equals(object);
            if (n3 != 0) {
                this.zzk = object = this.zzg();
                return this.zzk.zzb(zzhh2);
            }
            object2 = "content";
            n3 = ((String)object2).equals(object);
            if (n3 != 0) {
                object = this.zzf;
                if (object == null) {
                    object = this.zza;
                    this.zzf = object2 = new zzgy((Context)object);
                    this.zzh((zzhb)object2);
                }
                this.zzk = object = this.zzf;
                return this.zzk.zzb(zzhh2);
            }
            object2 = "rtmp";
            n3 = ((String)object2).equals(object);
            if (n3 != 0) {
                object = this.zzg;
                if (object == null) {
                    object = "androidx.media3.datasource.rtmp.RtmpDataSource";
                    try {
                        object = Class.forName((String)object);
                        n3 = 0;
                        object2 = null;
                        object = ((Class)object).getConstructor(null);
                        object = ((Constructor)object).newInstance(null);
                        this.zzg = object = (zzhb)object;
                        this.zzh((zzhb)object);
                    }
                    catch (Exception exception) {
                        object = new RuntimeException("Error instantiating RTMP extension", exception);
                        throw object;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        object = "DefaultDataSource";
                        object2 = "Attempting to play RTMP stream without depending on the RTMP extension";
                        zzfk.zzf((String)object, (String)object2);
                    }
                    object = this.zzg;
                    if (object == null) {
                        this.zzg = object = this.zzc;
                    }
                }
                this.zzk = object = this.zzg;
                return this.zzk.zzb(zzhh2);
            }
            object2 = "udp";
            n3 = ((String)object2).equals(object);
            if (n3 != 0) {
                object = this.zzh;
                if (object == null) {
                    n3 = 2000;
                    this.zzh = object = new zzig(n3);
                    this.zzh((zzhb)object);
                }
                this.zzk = object = this.zzh;
                return this.zzk.zzb(zzhh2);
            }
            object2 = "data";
            n3 = ((String)object2).equals(object);
            if (n3 != 0) {
                object = this.zzi;
                if (object == null) {
                    this.zzi = object = new zzgz();
                    this.zzh((zzhb)object);
                }
                this.zzk = object = this.zzi;
                return this.zzk.zzb(zzhh2);
            }
            object2 = "rawresource";
            n3 = (int)(((String)object2).equals(object) ? 1 : 0);
            if (n3 == 0 && !(bl2 = ((String)(object2 = "android.resource")).equals(object))) {
                object = this.zzc;
            } else {
                object = this.zzj;
                if (object == null) {
                    object = this.zza;
                    this.zzj = object2 = new zzic((Context)object);
                    this.zzh((zzhb)object2);
                }
                object = this.zzj;
            }
            this.zzk = object;
            return this.zzk.zzb(zzhh2);
        }
        object = zzhh2.zza.getPath();
        if (object != null && (bl2 = ((String)object).startsWith((String)(object2 = "/android_asset/")))) {
            this.zzk = object = this.zzg();
            return this.zzk.zzb(zzhh2);
        }
        object = this.zzd;
        if (object == null) {
            this.zzd = object = new zzhs();
            this.zzh((zzhb)object);
        }
        this.zzk = object = this.zzd;
        return this.zzk.zzb(zzhh2);
    }

    public final Uri zzc() {
        zzhb zzhb2 = this.zzk;
        if (zzhb2 == null) {
            return null;
        }
        return zzhb2.zzc();
    }

    public final void zzd() {
        zzhb zzhb2 = this.zzk;
        if (zzhb2 != null) {
            try {
                zzhb2.zzd();
                return;
            }
            finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        Object object = this.zzk;
        object = object == null ? Collections.emptyMap() : object.zze();
        return object;
    }

    public final void zzf(zzie zzie2) {
        zzie2.getClass();
        this.zzc.zzf(zzie2);
        this.zzb.add(zzie2);
        zzhj.zzi(this.zzd, zzie2);
        zzhj.zzi(this.zze, zzie2);
        zzhj.zzi(this.zzf, zzie2);
        zzhj.zzi(this.zzg, zzie2);
        zzhj.zzi(this.zzh, zzie2);
        zzhj.zzi(this.zzi, zzie2);
        zzhj.zzi(this.zzj, zzie2);
    }
}

