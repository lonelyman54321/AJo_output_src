/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhj;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import com.google.android.gms.internal.measurement.zzho;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzhi
implements zzhl {
    private static final Map zza;
    private static final String[] zzb;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;

    static {
        Jp jp = new Jp();
        zza = jp;
        zzb = new String[]{"key", "value"};
    }

    private zzhi(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        zzhk zzhk2 = new zzhk(this, null);
        this.zzf = zzhk2;
        ArrayList arrayList = new ArrayList();
        this.zzg = arrayList;
        this.zzi = arrayList = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable2;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)zzhk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhi zza(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        Class<zzhi> clazz = zzhi.class;
        synchronized (clazz) {
            try {
                Object object;
                block8: {
                    zzhi zzhi2;
                    Map map2 = zza;
                    object = map2.get(uri);
                    object = (zzhi)object;
                    if (object != null) return object;
                    try {
                        zzhi2 = new zzhi(contentResolver, uri, runnable2);
                    }
                    catch (SecurityException securityException) {}
                    try {
                        map2.put(uri, zzhi2);
                        return zzhi2;
                    }
                    catch (SecurityException securityException) {}
                    break block8;
                    return zzhi2;
                }
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ Map zza(zzhi zzhi2) {
        return zzhi2.zzd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzb() {
        Class<zzhi> clazz = zzhi.class;
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
                    object2 = (zzhi)object2;
                    ContentResolver contentResolver = ((zzhi)object2).zzc;
                    object2 = ((zzhi)object2).zzf;
                    contentResolver.unregisterContentObserver(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Map zzd() {
        block20: {
            block18: {
                var1_1 = this.zzc;
                var2_2 /* !! */  = this.zzd;
                if ((var1_1 = var1_1.acquireUnstableContentProviderClient(var2_2 /* !! */ )) == null) {
                    return Collections.emptyMap();
                }
                var3_5 = this.zzd;
                var4_6 /* !! */  = zzhi.zzb;
                var5_7 /* !! */  = var1_1;
                var2_2 /* !! */  = var1_1.query((Uri)var3_5, var4_6 /* !! */ , null, null, null);
                if (var2_2 /* !! */  == null) {
                }
                ** GOTO lbl-1000
                {
                    block21: {
                        block22: {
                            block19: {
                                catch (RemoteException v0) {
                                    break block18;
                                }
                                try {
                                    var5_7 /* !! */  = Collections.emptyMap();
                                    if (var2_2 /* !! */  == null) break block19;
                                }
                                catch (Throwable var5_8) {
                                    break block21;
                                }
                                catch (Throwable var2_3) {
                                    break block20;
                                }
                                {
                                    var2_2 /* !! */ .close();
                                }
                            }
                            var1_1.release();
                            return var5_7 /* !! */ ;
lbl-1000:
                            // 1 sources

                            {
                                var6_9 = var2_2 /* !! */ .getCount();
                                if (var6_9 != 0) break block22;
                                var5_7 /* !! */  = Collections.emptyMap();
                            }
                            {
                                var2_2 /* !! */ .close();
                            }
                            var1_1.release();
                            return var5_7 /* !! */ ;
                        }
                        var7_10 = 256;
                        if (var6_9 > var7_10) ** GOTO lbl40
                        {
                            block23: {
                                var3_5 = new a53(var6_9);
                                break block23;
lbl40:
                                // 1 sources

                                var8_11 = 1065353216;
                                var9_12 = 1.0f;
                                var3_5 = new HashMap(var6_9, var9_12);
                            }
                            while ((var6_9 = (int)var2_2 /* !! */ .moveToNext()) != 0) {
                                var6_9 = 0;
                                var5_7 /* !! */  = null;
                                var5_7 /* !! */  = var2_2 /* !! */ .getString(0);
                                var8_11 = 1;
                                var9_12 = 1.4E-45f;
                                var4_6 /* !! */  = var2_2 /* !! */ .getString(var8_11);
                                var3_5.put(var5_7 /* !! */ , var4_6 /* !! */ );
                            }
                            var6_9 = (int)var2_2 /* !! */ .isAfterLast();
                            if (var6_9 != 0) ** GOTO lbl-1000
                            var5_7 /* !! */  = Collections.emptyMap();
                        }
                        {
                            var2_2 /* !! */ .close();
                        }
                        var1_1.release();
                        return var5_7 /* !! */ ;
lbl-1000:
                        // 1 sources

                        {
                            var2_2 /* !! */ .close();
                        }
                        var1_1.release();
                        return var3_5;
                    }
                    if (var2_2 /* !! */  == null) throw var5_8;
                    try {
                        var2_2 /* !! */ .close();
                        throw var5_8;
                    }
                    catch (Throwable var2_4) {}
                    {
                        var5_8.addSuppressed(var2_4);
                        throw var5_8;
                    }
                }
            }
            var2_2 /* !! */  = Collections.emptyMap();
            var1_1.release();
            return var2_2 /* !! */ ;
        }
        var1_1.release();
        throw var2_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Map zze() {
        Throwable throwable2222222;
        StrictMode.ThreadPolicy threadPolicy;
        block4: {
            threadPolicy = StrictMode.allowThreadDiskReads();
            Object object = new zzhh(this);
            object = zzho.zza((zzhn)object);
            object = (Map)object;
            {
                Map map2;
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (SQLiteException | IllegalStateException | SecurityException throwable3) {}
                {
                    map2 = Collections.emptyMap();
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return map2;
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2222222;
    }

    public final /* synthetic */ Object zza(String string2) {
        return (String)this.zza().get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zza() {
        Map map2;
        block7: {
            map2 = this.zzh;
            if (map2 == null) {
                Object object = this.zzg;
                synchronized (object) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                map2 = this.zzh;
                                if (map2 != null) break block5;
                                this.zzh = map2 = this.zze();
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        Object object;
        boolean bl2;
        Iterator iterator = this.zzg;
        synchronized (iterator) {
            bl2 = false;
            object = null;
            this.zzh = null;
            object = this.zze;
            object.run();
        }
        synchronized (this) {
            try {
                iterator = this.zzi;
                iterator = iterator.iterator();
                while (true) {
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    object = iterator.next();
                    object = (zzhj)object;
                    object.zza();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

