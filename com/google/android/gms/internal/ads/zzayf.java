/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class zzayf {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzayf() {
        long l2;
        this.zza = l2 = (long)-1;
        this.zzb = l2;
        this.zzc = l2;
        this.zzd = l2;
        this.zze = l2;
        this.zzf = l2;
        this.zzg = l2;
        this.zzh = l2;
    }

    private static DisplayMetrics zzl(Context context) {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            context.getRealMetrics(displayMetrics);
        }
        catch (NoSuchMethodError noSuchMethodError) {
            context.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean zzm(View object) {
        boolean bl2;
        block26: {
            boolean bl3;
            Object[] objectArray;
            Object object2;
            block25: {
                bl2 = true;
                object2 = object.getClass();
                object2 = ((Class)object2).getName();
                objectArray = "DebugGestureViewWrapper";
                bl3 = ((String)object2).contains((CharSequence)objectArray);
                if (!bl3) break block25;
                object = (ViewGroup)object;
                object = object.getChildAt(0);
            }
            object2 = object.getClass();
            objectArray = "getAdConfiguration";
            object2 = ((Class)object2).getMethod((String)objectArray, null);
            object = ((Method)object2).invoke(object, null);
            object2 = object.getClass();
            objectArray = "adType";
            object2 = ((Class)object2).getField((String)objectArray);
            object2 = ((Field)object2).get(object);
            object2 = (Integer)object2;
            ((Integer)object2).intValue();
            object = object.getClass();
            objectArray = "adTypeToString";
            Class[] classArray = new Class[bl2];
            Class<Integer> clazz = Integer.TYPE;
            classArray[0] = clazz;
            object = ((Class)object).getMethod((String)objectArray, classArray);
            objectArray = new Object[bl2];
            objectArray[0] = object2;
            object = ((Method)object).invoke(null, objectArray);
            object = (String)object;
            object2 = "INTERSTITIAL";
            bl3 = ((String)object).contains((CharSequence)object2);
            if (bl3) break block26;
            object2 = "APP_OPEN";
            bl3 = ((String)object).contains((CharSequence)object2);
            if (bl3) break block26;
            object2 = "REWARDED";
            try {
                boolean bl4 = ((String)object).contains((CharSequence)object2);
                if (bl4) break block26;
                return false;
            }
            catch (ReflectiveOperationException | SecurityException exception) {
                return false;
            }
        }
        return bl2;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzb;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final void zzi() {
        long l2;
        this.zzh = l2 = this.zzg;
        this.zzg = l2 = SystemClock.uptimeMillis();
    }

    public final void zzj() {
        long l2;
        this.zzb = l2 = this.zza;
        this.zza = l2 = SystemClock.uptimeMillis();
    }

    public final void zzk(Context context, View view) {
        long l2;
        this.zzd = l2 = this.zzc;
        this.zzc = l2 = SystemClock.uptimeMillis();
        l2 = this.zze;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.zzf = l2;
        }
        context = zzayf.zzl(context);
        int n3 = context.widthPixels;
        int n4 = context.heightPixels;
        n3 *= n4;
        if (view != null) {
            n4 = view.getWidth();
            object = context.widthPixels;
            n4 = Math.min(n4, (int)object);
            object = view.getHeight();
            int n7 = context.heightPixels;
            n4 = (n7 = Math.min((int)object, n7) * n4) + n7;
            if (n4 >= n3 || n7 == 0 && (n7 = (int)(zzayf.zzm(view) ? 1 : 0)) != 0) {
                long l7;
                this.zze = l7 = this.zzc;
                return;
            }
        }
        this.zze = l3;
    }
}

