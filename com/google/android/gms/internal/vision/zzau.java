/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import com.google.android.gms.internal.vision.zzaw;
import com.google.android.gms.internal.vision.zzax;
import com.google.android.gms.internal.vision.zzay;
import com.google.android.gms.internal.vision.zzaz;
import com.google.android.gms.internal.vision.zzba;
import com.google.android.gms.internal.vision.zzbb;
import com.google.android.gms.internal.vision.zzbi;
import com.google.android.gms.internal.vision.zzde;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzau
implements zzay {
    private static final Map zza;
    private static final String[] zzh;
    private final ContentResolver zzb;
    private final Uri zzc;
    private final ContentObserver zzd;
    private final Object zze;
    private volatile Map zzf;
    private final List zzg;

    static {
        Jp jp = new Jp();
        zza = jp;
        zzh = new String[]{"key", "value"};
    }

    private zzau(ContentResolver contentResolver, Uri uri) {
        zzaw zzaw2 = new zzaw(this, null);
        this.zzd = zzaw2;
        ArrayList arrayList = new ArrayList();
        this.zze = arrayList;
        this.zzg = arrayList = new ArrayList();
        zzde.zza(contentResolver);
        zzde.zza(uri);
        this.zzb = contentResolver;
        this.zzc = uri;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)zzaw2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzau zza(ContentResolver contentResolver, Uri uri) {
        Class<zzau> clazz = zzau.class;
        synchronized (clazz) {
            try {
                Object object;
                block8: {
                    zzau zzau2;
                    Map map2 = zza;
                    object = map2.get(uri);
                    object = (zzau)object;
                    if (object != null) return object;
                    try {
                        zzau2 = new zzau(contentResolver, uri);
                    }
                    catch (SecurityException securityException) {}
                    try {
                        map2.put(uri, zzau2);
                        return zzau2;
                    }
                    catch (SecurityException securityException) {}
                    break block8;
                    return zzau2;
                }
                return object;
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
    public static void zzb() {
        Class<zzau> clazz = zzau.class;
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
                    object2 = (zzau)object2;
                    ContentResolver contentResolver = ((zzau)object2).zzb;
                    object2 = ((zzau)object2).zzd;
                    contentResolver.unregisterContentObserver(object2);
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
    private final Map zzd() {
        Map map2;
        block7: {
            map2 = this.zzf;
            if (map2 == null) {
                Object object = this.zze;
                synchronized (object) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                map2 = this.zzf;
                                if (map2 != null) break block5;
                                this.zzf = map2 = this.zze();
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

    private final Map zze() {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            Object object = new zzax(this);
            object = zzbb.zza((zzba)object);
            object = (Map)object;
            return object;
        }
        catch (SQLiteException | IllegalStateException | SecurityException throwable) {
            return null;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public final /* synthetic */ Object zza(String string2) {
        return (String)this.zzd().get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzaz zzaz2;
        boolean bl2;
        Iterator iterator = this.zze;
        synchronized (iterator) {
            bl2 = false;
            zzaz2 = null;
            this.zzf = null;
            zzbi.zza();
        }
        synchronized (this) {
            try {
                iterator = this.zzg;
                iterator = iterator.iterator();
                while (true) {
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    zzaz2 = (zzaz)iterator.next();
                    zzaz2 = zzaz2;
                    zzaz2.zza();
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
    public final Map zzc() {
        Throwable throwable2;
        ContentResolver contentResolver;
        block8: {
            int n3;
            String string2;
            float f5;
            int n4;
            Object object;
            Object object2;
            block6: {
                block7: {
                    block5: {
                        contentResolver = this.zzb;
                        object2 = this.zzc;
                        object = zzh;
                        n4 = 0;
                        f5 = 0.0f;
                        string2 = null;
                        if ((contentResolver = contentResolver.query(object2, (String[])object, null, null, null)) == null) {
                            return Collections.emptyMap();
                        }
                        try {
                            n3 = contentResolver.getCount();
                            if (n3 != 0) break block5;
                            object2 = Collections.emptyMap();
                        }
                        catch (Throwable throwable2) {}
                        contentResolver.close();
                        return object2;
                    }
                    int n7 = 256;
                    if (n3 > n7) break block7;
                    object = new a53(n3);
                    break block6;
                    break block8;
                }
                n4 = 1065353216;
                f5 = 1.0f;
                object = new HashMap(n3, f5);
            }
            while ((n3 = (int)(contentResolver.moveToNext() ? 1 : 0)) != 0) {
                n3 = 0;
                object2 = null;
                object2 = contentResolver.getString(0);
                n4 = 1;
                f5 = Float.MIN_VALUE;
                string2 = contentResolver.getString(n4);
                object.put(object2, string2);
            }
            contentResolver.close();
            return object;
        }
        contentResolver.close();
        throw throwable2;
    }
}

