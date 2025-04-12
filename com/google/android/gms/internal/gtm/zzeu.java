/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzes;
import com.google.android.gms.internal.gtm.zzfb;

public final class zzeu
extends zzbr {
    private SharedPreferences zza;
    private long zzb;
    private long zzc = -1;
    private final zzes zzd;

    public zzeu(zzbu object) {
        super((zzbu)object);
        this.zzw();
        long l2 = (Long)zzeh.zzD.zzb();
        this.zzd = object = new zzes(this, "monitoring", l2, null);
    }

    public static /* bridge */ /* synthetic */ SharedPreferences zzc(zzeu zzeu2) {
        return zzeu2.zza;
    }

    public final long zza() {
        zzr.zzh();
        this.zzV();
        long l2 = this.zzb;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            Object object = this.zza;
            String string2 = "first_run";
            long l7 = object.getLong(string2, l3);
            long l8 = l7 - l3;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false) {
                this.zzb = l7;
                l2 = l7;
            } else {
                l3 = this.zzC().currentTimeMillis();
                object = this.zza.edit();
                object.putLong(string2, l3);
                object2 = object.commit();
                if (object2 == false) {
                    object = "Failed to commit first run time";
                    this.zzQ((String)object);
                }
                this.zzb = l3;
                l2 = l3;
            }
        }
        return l2;
    }

    public final long zzb() {
        zzr.zzh();
        this.zzV();
        long l2 = this.zzc;
        long l3 = -1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            SharedPreferences sharedPreferences2 = this.zza;
            String string2 = "last_dispatch";
            l3 = 0L;
            this.zzc = l2 = sharedPreferences2.getLong(string2, l3);
        }
        return l2;
    }

    public final void zzd() {
        SharedPreferences sharedPreferences2;
        this.zza = sharedPreferences2 = this.zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzes zze() {
        return this.zzd;
    }

    public final zzfb zzf() {
        Clock clock = this.zzC();
        long l2 = this.zza();
        zzfb zzfb2 = new zzfb(clock, l2);
        return zzfb2;
    }

    public final String zzg() {
        zzr.zzh();
        this.zzV();
        Object object = this.zza;
        String string2 = "installation_campaign";
        object = object.getString(string2, null);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return null;
        }
        return object;
    }

    public final void zzh(String string2) {
        zzr.zzh();
        this.zzV();
        SharedPreferences.Editor editor = this.zza.edit();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "installation_campaign";
        if (bl2) {
            editor.remove(string3);
        } else {
            editor.putString(string3, string2);
        }
        boolean bl3 = editor.commit();
        if (!bl3) {
            string2 = "Failed to commit campaign data";
            this.zzQ(string2);
        }
    }

    public final void zzi() {
        zzr.zzh();
        this.zzV();
        long l2 = this.zzC().currentTimeMillis();
        SharedPreferences.Editor editor = this.zza.edit();
        editor.putLong("last_dispatch", l2);
        editor.apply();
        this.zzc = l2;
    }
}

