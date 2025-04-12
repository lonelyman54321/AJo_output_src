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
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.google.android.gms.internal.vision.zzas;
import com.google.android.gms.internal.vision.zzay;
import com.google.android.gms.internal.vision.zzaz;
import com.google.android.gms.internal.vision.zzbi;
import com.google.android.gms.internal.vision.zzbt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzbq
implements zzay {
    private static final Map zza;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile Map zze;
    private final List zzf;

    static {
        Jp jp = new Jp();
        zza = jp;
    }

    private zzbq(SharedPreferences sharedPreferences2) {
        zzbt zzbt2 = new zzbt(this);
        this.zzc = zzbt2;
        ArrayList arrayList = new ArrayList();
        this.zzd = arrayList;
        this.zzf = arrayList = new ArrayList();
        this.zzb = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)zzbt2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbq zza(Context context, String string2) {
        Object object;
        boolean bl2 = zzas.zza();
        bl2 = bl2 && !(bl2 = string2.startsWith((String)(object = "direct_boot:"))) ? zzas.zza(context) : true;
        if (!bl2) {
            return null;
        }
        object = zzbq.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    try {
                        Map map2 = zza;
                        object2 = map2.get(string2);
                        object2 = (zzbq)object2;
                        if (object2 != null) break block4;
                        context = zzbq.zzb(context, string2);
                        object2 = new Object((SharedPreferences)context);
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
        Class<zzbq> clazz = zzbq.class;
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
                    object2 = (zzbq)object2;
                    SharedPreferences sharedPreferences2 = ((zzbq)object2).zzb;
                    object2 = ((zzbq)object2).zzc;
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
    private static SharedPreferences zzb(Context context, String string2) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block5: {
            block4: {
                threadPolicy = StrictMode.allowThreadDiskReads();
                String string3 = "direct_boot:";
                try {
                    int n3 = string2.startsWith(string3);
                    if (n3 == 0) break block4;
                    n3 = zzas.zza();
                    if (n3 != 0) {
                        context = yx_0.a(context);
                    }
                    n3 = 12;
                    string2 = string2.substring(n3);
                    context = context.getSharedPreferences(string2, 0);
                }
                catch (Throwable throwable2) {}
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return context;
            }
            context = context.getSharedPreferences(string2, 0);
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
    public final Object zza(String string2) {
        Map map2;
        block8: {
            map2 = this.zze;
            if (map2 != null) break block8;
            Object object = this.zzd;
            synchronized (object) {
                Throwable throwable2;
                block9: {
                    block7: {
                        Object object2;
                        try {
                            map2 = this.zze;
                            if (map2 != null) break block7;
                            map2 = StrictMode.allowThreadDiskReads();
                        }
                        catch (Throwable throwable2) {}
                        try {
                            object2 = this.zzb;
                            object2 = object2.getAll();
                            this.zze = object2;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zza(SharedPreferences object, String object2) {
        boolean bl2;
        object = this.zzd;
        synchronized (object) {
            bl2 = false;
            object2 = null;
            this.zze = null;
            zzbi.zza();
        }
        synchronized (this) {
            try {
                object = this.zzf;
                object = object.iterator();
                while (true) {
                    if (!(bl2 = object.hasNext())) {
                        return;
                    }
                    object2 = object.next();
                    object2 = (zzaz)object2;
                    object2.zza();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

