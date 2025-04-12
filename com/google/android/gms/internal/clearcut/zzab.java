/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 */
package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.gms.internal.clearcut.zzad;
import com.google.android.gms.internal.clearcut.zzae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzab {
    private static final ConcurrentHashMap zzde;
    private static final String[] zzdl;
    private final Uri uri;
    private final ContentResolver zzdf;
    private final ContentObserver zzdg;
    private final Object zzdh;
    private volatile Map zzdi;
    private final Object zzdj;
    private final List zzdk;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzde = concurrentHashMap = new ConcurrentHashMap();
        zzdl = new String[]{"key", "value"};
    }

    private zzab(ContentResolver object, Uri uri) {
        ArrayList arrayList = new ArrayList();
        this.zzdh = arrayList;
        arrayList = new ArrayList();
        this.zzdj = arrayList;
        this.zzdk = arrayList = new ArrayList();
        this.zzdf = object;
        this.uri = uri;
        super(this, null);
        this.zzdg = object;
    }

    public static zzab zza(ContentResolver object, Uri uri) {
        ConcurrentHashMap concurrentHashMap = zzde;
        zzab zzab2 = (zzab)concurrentHashMap.get(uri);
        if (zzab2 == null) {
            zzab2 = new zzab((ContentResolver)object, uri);
            if ((object = concurrentHashMap.putIfAbsent(uri, zzab2)) == null) {
                object = zzab2.zzdf;
                uri = zzab2.uri;
                concurrentHashMap = null;
                ContentObserver contentObserver = zzab2.zzdg;
                object.registerContentObserver(uri, false, contentObserver);
            } else {
                zzab2 = object;
            }
        }
        return zzab2;
    }

    public static /* synthetic */ void zza(zzab zzab2) {
        zzab2.zzj();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Map zzi() {
        block13: {
            block14: {
                var1_1 = new HashMap<Uri, String[]>();
                var2_3 = this.zzdf;
                var3_4 /* !! */  = this.uri;
                var4_5 /* !! */  = zzab.zzdl;
                var2_3 = var2_3.query(var3_4 /* !! */ , var4_5 /* !! */ , null, null, null);
                if (var2_3 == null) break block13;
                while (true) {
                    var5_6 = var2_3.moveToNext();
                    if (!var5_6) break block14;
                    var5_6 = false;
                    var3_4 /* !! */  = null;
                    break;
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl32
                }
                {
                    var3_4 /* !! */  = var2_3.getString(0);
                    var6_7 = 1;
                    var4_5 /* !! */  = var2_3.getString(var6_7);
                    var1_1.put(var3_4 /* !! */ , var4_5 /* !! */ );
                    continue;
                }
            }
            try {
                var2_3.close();
                break block13;
lbl32:
                // 1 sources

                var2_3.close();
                throw var1_2;
            }
            catch (SQLiteException | SecurityException v0) {
                return null;
            }
        }
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzj() {
        Object object = this.zzdj;
        synchronized (object) {
            try {
                Object object2 = this.zzdk;
                object2 = object2.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    Object object3 = object2.next();
                    object3 = (zzad)object3;
                    object3.zzk();
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
    public final Map zzg() {
        Object object;
        block7: {
            object = "gms:phenotype:phenotype_flag:debug_disable_caching";
            Object object2 = null;
            boolean bl2 = zzae.zza((String)object, false);
            if ((object = bl2 ? this.zzi() : this.zzdi) == null) {
                object2 = this.zzdh;
                synchronized (object2) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                object = this.zzdi;
                                if (object != null) break block5;
                                this.zzdi = object = this.zzi();
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
        if (object != null) {
            return object;
        }
        return Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh() {
        Object object = this.zzdh;
        synchronized (object) {
            Object var2_2 = null;
            this.zzdi = null;
            return;
        }
    }
}

