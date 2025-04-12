/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzcw;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhj;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzij;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzig
implements zzhl {
    private static final Map zza;
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map zzf;
    private final List zzg;

    static {
        Jp jp = new Jp();
        zza = jp;
    }

    private zzig(SharedPreferences sharedPreferences2, Runnable runnable2) {
        zzij zzij2 = new zzij(this);
        this.zzd = zzij2;
        ArrayList arrayList = new ArrayList();
        this.zze = arrayList;
        this.zzg = arrayList = new ArrayList();
        this.zzb = sharedPreferences2;
        this.zzc = runnable2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)zzij2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static SharedPreferences zza(Context context, String string2) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block5: {
            Object object;
            block4: {
                threadPolicy = StrictMode.allowThreadDiskReads();
                object = "direct_boot:";
                try {
                    int n3 = string2.startsWith((String)object);
                    if (n3 == 0) break block4;
                    n3 = zzhg.zza();
                    if (n3 != 0) {
                        context = yx_0.a(context);
                    }
                    n3 = 12;
                    string2 = string2.substring(n3);
                    object = zzcs.zza;
                    context = zzcw.zza(context, string2, 0, (zzco)object);
                }
                catch (Throwable throwable2) {}
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return context;
            }
            object = zzcs.zza;
            context = zzcw.zza(context, string2, 0, (zzco)object);
            break block5;
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return context;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzig zza(Context context, String string2, Runnable runnable2) {
        Object object;
        boolean bl2 = zzhg.zza();
        bl2 = bl2 && !(bl2 = string2.startsWith((String)(object = "direct_boot:"))) ? zzhg.zzb(context) : true;
        if (!bl2) {
            return null;
        }
        object = zzig.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    try {
                        Map map2 = zza;
                        object2 = map2.get(string2);
                        object2 = (zzig)object2;
                        if (object2 != null) break block4;
                        context = zzig.zza(context, string2);
                        object2 = new Object((SharedPreferences)context, runnable2);
                        map2.put(string2, object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza() {
        Class<zzig> clazz = zzig.class;
        synchronized (clazz) {
            try {
                Object object = zza;
                object = object.values();
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = zza;
                        object.clear();
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (zzig)object2;
                    SharedPreferences sharedPreferences2 = ((zzig)object2).zzb;
                    object2 = ((zzig)object2).zzd;
                    sharedPreferences2.unregisterOnSharedPreferenceChangeListener(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzig zzig2, SharedPreferences object, String object2) {
        boolean bl2;
        object = zzig2.zze;
        synchronized (object) {
            bl2 = false;
            object2 = null;
            zzig2.zzf = null;
            object2 = zzig2.zzc;
            object2.run();
        }
        synchronized (zzig2) {
            try {
                object = zzig2.zzg;
                object = object.iterator();
                while (true) {
                    if (!(bl2 = object.hasNext())) {
                        return;
                    }
                    object2 = object.next();
                    object2 = (zzhj)object2;
                    object2.zza();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(String string2) {
        Map map2;
        block8: {
            map2 = this.zzf;
            if (map2 != null) break block8;
            Object object = this.zze;
            synchronized (object) {
                Throwable throwable2;
                block9: {
                    block7: {
                        Object object2;
                        try {
                            map2 = this.zzf;
                            if (map2 != null) break block7;
                            map2 = StrictMode.allowThreadDiskReads();
                        }
                        catch (Throwable throwable2) {}
                        try {
                            object2 = this.zzb;
                            object2 = object2.getAll();
                            this.zzf = object2;
                        }
                        catch (Throwable throwable3) {
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)map2);
                            throw throwable3;
                        }
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)map2);
                        map2 = object2;
                        break block7;
                        break block9;
                    }
                    break block8;
                }
                throw throwable2;
            }
        }
        if (map2 != null) {
            return map2.get(string2);
        }
        return null;
    }
}

