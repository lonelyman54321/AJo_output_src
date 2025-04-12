/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  dalvik.system.VMStack
 */
package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.internal.gtm.zzum;
import com.google.android.gms.internal.gtm.zzvb;
import com.google.android.gms.internal.gtm.zzvc;
import com.google.android.gms.internal.gtm.zzvg$1;
import com.google.android.gms.internal.gtm.zzvg$zza;
import com.google.android.gms.internal.gtm.zzvk;
import com.google.android.gms.internal.gtm.zzvl;
import com.google.android.gms.internal.gtm.zzvq;
import dalvik.system.VMStack;

public final class zzvg
extends zzvc {
    private static final boolean zza;
    private static final boolean zzb;
    private static final zzvb zzc;

    static {
        String string2;
        boolean bl2;
        zza = bl2 = zzvg$zza.zza();
        Object object = Build.FINGERPRINT;
        boolean bl3 = true;
        if (object != null && !(bl2 = (string2 = "robolectric").equals(object))) {
            bl3 = false;
        }
        zzb = bl3;
        zzc = object = new zzvg$1();
    }

    public static Class zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        Class clazz;
        try {
            clazz = VMStack.getStackClass2();
        }
        catch (Throwable throwable) {
            return null;
        }
        return clazz.getName();
    }

    public static /* bridge */ /* synthetic */ boolean zzr() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzs() {
        return zza;
    }

    public static boolean zzt() {
        Object object;
        Object object2 = "dalvik.system.VMStack";
        try {
            object2 = Class.forName((String)object2);
            object = "getStackClass2";
        }
        catch (Throwable throwable) {
            return false;
        }
        ((Class)object2).getMethod((String)object, null);
        object2 = zzvg.zzq();
        object = zzvg$zza.class;
        object = ((Class)object).getName();
        return ((String)object).equals(object2);
    }

    public zzum zze(String string2) {
        return zzvk.zzb(string2);
    }

    public zzvb zzh() {
        return zzc;
    }

    public zzvq zzj() {
        return zzvl.zzb();
    }

    public String zzm() {
        return "platform: Android";
    }
}

