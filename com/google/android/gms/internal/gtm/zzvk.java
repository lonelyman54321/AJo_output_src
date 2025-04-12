/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.internal.gtm.zzum;
import com.google.android.gms.internal.gtm.zzvd;
import com.google.android.gms.internal.gtm.zzve;
import com.google.android.gms.internal.gtm.zzvf;
import com.google.android.gms.internal.gtm.zzvi;
import com.google.android.gms.internal.gtm.zzvj;
import com.google.android.gms.internal.gtm.zzvm;
import com.google.android.gms.internal.gtm.zzvp;
import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class zzvk
extends zzvd {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zze;
    private static final ConcurrentLinkedQueue zzf;
    private volatile zzum zzg;

    static {
        String string2;
        boolean bl2;
        Serializable serializable = Build.FINGERPRINT;
        boolean bl3 = false;
        if (serializable == null || (bl2 = (string2 = "robolectric").equals(serializable))) {
            bl2 = true;
        } else {
            bl2 = false;
            serializable = null;
        }
        zza = bl2;
        serializable = Build.HARDWARE;
        string2 = "goldfish";
        boolean bl4 = string2.equals(serializable);
        if (bl4 || (bl2 = (string2 = "ranchu").equals(serializable))) {
            bl2 = true;
        } else {
            bl2 = false;
            serializable = null;
        }
        zzb = bl2;
        serializable = Build.TYPE;
        string2 = "eng";
        bl4 = string2.equals(serializable);
        if (bl4 || (bl2 = (string2 = "userdebug").equals(serializable))) {
            bl3 = true;
        }
        zzc = bl3;
        zzd = serializable = new Serializable();
        serializable = new Serializable();
        zze = serializable;
        serializable = new Serializable();
        zzf = serializable;
    }

    private zzvk(String object) {
        super((String)object);
        boolean bl2 = zza;
        if (!bl2 && !(bl2 = zzb)) {
            bl2 = zzc;
            if (bl2) {
                object = zzvp.zzc().zzb(false);
                String string2 = this.zza();
                this.zzg = object = ((zzvm)object).zza(string2);
                return;
            }
            this.zzg = null;
            return;
        }
        object = new zzve();
        String string3 = this.zza();
        this.zzg = object = ((zzve)object).zza(string3);
    }

    public static zzum zzb(String object) {
        Object object2 = zzd;
        Object object3 = ((AtomicReference)object2).get();
        if (object3 != null) {
            return ((zzvf)((AtomicReference)object2).get()).zza((String)object);
        }
        int n3 = ((String)object).length();
        while ((n3 += -1) >= 0) {
            char c2 = ((String)object).charAt(n3);
            char c3 = '.';
            char c5 = '$';
            if (c2 == c5) {
                object = ((String)object).replace(c5, c3);
                break;
            }
            if (c2 != c3) continue;
        }
        object2 = new zzvk((String)object);
        zzvi.zza.offer(object2);
        object = zzd.get();
        if (object != null) {
            while ((object = (zzvk)zzvi.zza.poll()) != null) {
                object3 = (zzvf)zzd.get();
                String string2 = ((zzvd)object).zza();
                ((zzvk)object).zzg = object3 = object3.zza(string2);
            }
            object = (zzvj)zzf.poll();
            if (object != null) {
                zze.getAndDecrement();
                throw null;
            }
        }
        return object2;
    }
}

