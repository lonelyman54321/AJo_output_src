/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.auth.zzcf;
import com.google.android.gms.internal.auth.zzch;
import com.google.android.gms.internal.auth.zzcl;
import com.google.android.gms.internal.auth.zzdc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzcg
implements zzcl {
    public static final String[] zza;
    private static final Map zzb;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;

    static {
        Jp jp = new Jp();
        zzb = jp;
        zza = new String[]{"key", "value"};
    }

    private zzcg(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        zzcf zzcf2 = new zzcf(this, null);
        this.zzf = zzcf2;
        ArrayList arrayList = new ArrayList();
        this.zzg = arrayList;
        this.zzi = arrayList = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable2;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)zzcf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static zzcg zza(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        Class<zzcg> clazz = zzcg.class;
        // MONITORENTER : clazz
        Map map2 = zzb;
        Object object = map2.get(uri);
        object = (zzcg)object;
        if (object == null) {
            zzcg zzcg2;
            try {
                zzcg2 = new zzcg(contentResolver, uri, runnable2);
            }
            catch (SecurityException securityException) {}
            try {
                map2.put(uri, zzcg2);
            }
            catch (SecurityException securityException) {}
            object = zzcg2;
            return object;
        }
        // MONITOREXIT : clazz
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzd() {
        Class<zzcg> clazz = zzcg.class;
        synchronized (clazz) {
            try {
                Object object = zzb;
                object = object.values();
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = zzb;
                        object.clear();
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (zzcg)object2;
                    ContentResolver contentResolver = ((zzcg)object2).zzc;
                    object2 = ((zzcg)object2).zzf;
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
                        contentResolver = this.zzc;
                        object2 = this.zzd;
                        object = zza;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        zzch zzch2;
        boolean bl2;
        Iterator iterator = this.zzg;
        synchronized (iterator) {
            bl2 = false;
            zzch2 = null;
            this.zzh = null;
            zzdc.zzd();
        }
        synchronized (this) {
            try {
                iterator = this.zzi;
                iterator = iterator.iterator();
                while (true) {
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    zzch2 = (zzch)iterator.next();
                    zzch2 = zzch2;
                    zzch2.zza();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

