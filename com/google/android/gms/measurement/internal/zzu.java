/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;

public final class zzu {
    private final zzic zza;

    public zzu(zzic zzic2) {
        this.zza = zzic2;
    }

    private final boolean zzc() {
        long l2;
        zzhf zzhf2 = this.zza.zzn().zzs;
        long l3 = zzhf2.zza();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0;
    }

    private final boolean zzd() {
        zzfx zzfx2;
        Object object = this.zzc();
        if (object == 0) {
            return false;
        }
        long l2 = this.zza.zzb().currentTimeMillis();
        long l3 = this.zza.zzn().zzs.zza();
        zzai zzai2 = this.zza.zzf();
        long l4 = (l2 -= l3) - (l3 = zzai2.zzc(null, zzfx2 = zzbn.zzbd));
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0;
    }

    public final void zza() {
        Object object = this.zza.zzl();
        ((zzhv)object).zzv();
        boolean bl2 = this.zzc();
        if (!bl2) {
            return;
        }
        bl2 = this.zzd();
        long l2 = 1L;
        String string2 = "_cc";
        String string3 = null;
        if (bl2) {
            this.zza.zzn().zzr.zza(null);
            object = new Bundle();
            String string4 = "(not set)";
            object.putString("source", string4);
            object.putString("medium", string4);
            string3 = "_cis";
            string4 = "intent";
            object.putString(string3, string4);
            object.putLong(string2, l2);
            zzju zzju2 = this.zza.zzp();
            String string5 = "auto";
            string2 = "_cmpx";
            zzju2.zzc(string5, string2, (Bundle)object);
        } else {
            object = this.zza.zzn().zzr.zza();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (bl3) {
                object = this.zza.zzj().zzo();
                String string6 = "Cache still valid but referrer not found";
                ((zzgq)object).zza(string6);
            } else {
                boolean bl4;
                zzhf zzhf2 = this.zza.zzn().zzs;
                long l3 = zzhf2.zza();
                long l4 = 3600000L;
                l3 = (l3 / l4 - l2) * l4;
                object = Uri.parse((String)object);
                Object object2 = new Bundle();
                Object object3 = object.getPath();
                Pair pair = new Pair(object3, object2);
                object3 = object.getQueryParameterNames().iterator();
                while (bl4 = object3.hasNext()) {
                    String string7 = (String)object3.next();
                    String string8 = object.getQueryParameter(string7);
                    object2.putString(string7, string8);
                }
                ((Bundle)pair.second).putLong(string2, l3);
                object = pair.first;
                object = object == null ? "app" : (String)object;
                object2 = this.zza.zzp();
                pair = (Bundle)pair.second;
                string2 = "_cmp";
                ((zzju)object2).zzc((String)object, string2, (Bundle)pair);
            }
            object = this.zza.zzn().zzr;
            ((zzhh)object).zza(null);
        }
        this.zza.zzn().zzs.zza(0L);
    }

    public final void zza(String object, Bundle object2) {
        this.zza.zzl().zzv();
        zzic zzic2 = this.zza;
        boolean bl2 = zzic2.zzae();
        if (!bl2) {
            if (object2 != null && !(bl2 = object2.isEmpty())) {
                boolean bl3;
                if (object == null || (bl2 = ((String)object).isEmpty())) {
                    object = "auto";
                }
                zzic2 = new Uri.Builder();
                zzic2.path((String)object);
                object = object2.keySet().iterator();
                while (bl3 = object.hasNext()) {
                    String string2 = (String)object.next();
                    String string3 = object2.getString(string2);
                    zzic2.appendQueryParameter(string2, string3);
                }
                object = zzic2.build().toString();
            } else {
                object = null;
            }
            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
            if (!bl4) {
                this.zza.zzn().zzr.zza((String)object);
                object = this.zza.zzn().zzs;
                object2 = this.zza.zzb();
                long l2 = object2.currentTimeMillis();
                ((zzhf)object).zza(l2);
            }
        }
    }

    public final void zzb() {
        boolean bl2 = this.zzc();
        if (bl2 && (bl2 = this.zzd())) {
            zzhh zzhh2 = this.zza.zzn().zzr;
            zzhh2.zza(null);
        }
    }
}

