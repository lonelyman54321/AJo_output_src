/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcm;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzcw;
import com.google.android.gms.internal.gtm.zzcx;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzfg;

public class zzbq {
    private final zzbu zza;

    public zzbq(zzbu zzbu2) {
        Preconditions.checkNotNull(zzbu2);
        this.zza = zzbu2;
    }

    public static String zzD(String string2, Object object, Object object2, Object object3) {
        boolean bl2;
        object = zzbq.zza(object);
        object2 = zzbq.zza(object2);
        object3 = zzbq.zza(object3);
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            stringBuilder.append(string2);
            string2 = ": ";
        } else {
            string2 = "";
        }
        bl3 = TextUtils.isEmpty((CharSequence)object);
        String string3 = ", ";
        if (!bl3) {
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            string2 = string3;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object2))) {
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
        } else {
            string3 = string2;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl4) {
            stringBuilder.append(string3);
            stringBuilder.append((String)object3);
        }
        return stringBuilder.toString();
    }

    public static final boolean zzU() {
        return Log.isLoggable((String)((String)zzeh.zzb.zzb()), (int)2);
    }

    private static String zza(Object object) {
        if (object == null) {
            return "";
        }
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof Boolean;
        if (bl2) {
            Boolean bl3 = Boolean.TRUE;
            if (object == bl3) {
                return "true";
            }
            return "false";
        }
        bl2 = object instanceof Throwable;
        if (bl2) {
            return ((Throwable)object).toString();
        }
        return object.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzb(int n3, String string2, Object object, Object object2, Object object3) {
        int n4;
        Object object4 = this.zza;
        if (object4 != null) {
            object4 = ((zzbu)object4).zzn();
        } else {
            n4 = 0;
            object4 = null;
        }
        Object object5 = object4;
        if (object4 != null) {
            object4 = (String)zzeh.zzb.zzb();
            int n7 = Log.isLoggable((String)object4, (int)n3);
            if (n7 != 0) {
                String string3 = zzbq.zzD(string2, object, object2, object3);
                Log.println((int)n3, (String)object4, (String)string3);
            }
            if (n3 < (n4 = 5)) return;
            n7 = n3;
            ((zzeo)object5).zze(n3, string2, object, object2, object3);
            return;
        } else {
            object4 = (String)zzeh.zzb.zzb();
            boolean bl2 = Log.isLoggable((String)object4, (int)n3);
            if (!bl2) return;
            string2 = zzbq.zzD(string2, object, object2, object3);
            Log.println((int)n3, (String)object4, (String)string2);
        }
    }

    public final zzeu zzA() {
        return this.zza.zzo();
    }

    public final zzfg zzB() {
        return this.zza.zzq();
    }

    public final Clock zzC() {
        return this.zza.zzr();
    }

    public final void zzE(String string2) {
        this.zzb(3, string2, null, null, null);
    }

    public final void zzF(String string2, Object object) {
        this.zzb(3, string2, object, null, null);
    }

    public final void zzG(String string2, Object object, Object object2) {
        this.zzb(3, string2, object, object2, null);
    }

    public final void zzH(String string2, Object object, Object object2, Object object3) {
        this.zzb(3, "POST compressed size, ratio %, url", object, object2, object3);
    }

    public final void zzI(String string2) {
        this.zzb(6, string2, null, null, null);
    }

    public final void zzJ(String string2, Object object) {
        this.zzb(6, string2, object, null, null);
    }

    public final void zzK(String string2, Object object, Object object2) {
        this.zzb(6, string2, object, object2, null);
    }

    public final void zzL(String string2) {
        this.zzb(4, string2, null, null, null);
    }

    public final void zzM(String string2, Object object) {
        this.zzb(4, string2, object, null, null);
    }

    public final void zzN(String string2) {
        this.zzb(2, string2, null, null, null);
    }

    public final void zzO(String string2, Object object) {
        this.zzb(2, string2, object, null, null);
    }

    public final void zzP(String string2, Object object, Object object2) {
        this.zzb(2, string2, object, object2, null);
    }

    public final void zzQ(String string2) {
        this.zzb(5, string2, null, null, null);
    }

    public final void zzR(String string2, Object object) {
        this.zzb(5, string2, object, null, null);
    }

    public final void zzS(String string2, Object object, Object object2) {
        this.zzb(5, string2, object, object2, null);
    }

    public final void zzT(String string2, Object object, Object object2, Object object3) {
        this.zzb(5, "Deleted fewer hits then expected", object, object2, object3);
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final GoogleAnalytics zzp() {
        return this.zza.zzc();
    }

    public final zzr zzq() {
        return this.zza.zzd();
    }

    public final zzbh zzr() {
        return this.zza.zze();
    }

    public final zzbp zzs() {
        return this.zza.zzf();
    }

    public final zzbu zzt() {
        return this.zza;
    }

    public final zzce zzu() {
        return this.zza.zzh();
    }

    public final zzcm zzv() {
        return this.zza.zzi();
    }

    public final zzcs zzw() {
        return this.zza.zzj();
    }

    public final zzcw zzx() {
        return this.zza.zzk();
    }

    public final zzcx zzy() {
        return this.zza.zzl();
    }

    public final zzeo zzz() {
        return this.zza.zzm();
    }
}

