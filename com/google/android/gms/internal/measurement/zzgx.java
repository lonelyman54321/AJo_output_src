/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzgy;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhb;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhe;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzgx
implements zzgy {
    private final AtomicBoolean zza;
    private HashMap zzb;
    private final HashMap zzc;
    private final HashMap zzd;
    private final HashMap zze;
    private final HashMap zzf;
    private Object zzg;
    private boolean zzh;
    private String[] zzi;
    private final zzhe zzj;

    public zzgx() {
        HashMap hashMap;
        Object object = new AtomicBoolean();
        this.zza = object;
        this.zzb = null;
        int n3 = 16;
        float f5 = 1.0f;
        this.zzc = hashMap = new HashMap(n3, f5);
        this.zzd = hashMap = new HashMap(n3, f5);
        this.zze = hashMap = new HashMap(n3, f5);
        this.zzf = hashMap = new HashMap(n3, f5);
        this.zzg = null;
        this.zzh = false;
        object = new String[]{};
        this.zzi = object;
        this.zzj = object;
    }

    public static /* bridge */ /* synthetic */ AtomicBoolean zza(zzgx zzgx2) {
        return zzgx2.zza;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza(ContentResolver object, String string2, String object2) {
        Object object3;
        Object object4;
        block25: {
            boolean bl2;
            if (object == null) {
                object = new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
                throw object;
            }
            synchronized (this) {
                boolean bl3;
                Object object5;
                int n3;
                Set set;
                int n4;
                try {
                    int n7;
                    object2 = this.zzb;
                    bl2 = true;
                    n4 = 0;
                    set = null;
                    object4 = null;
                    if (object2 == null) {
                        object2 = this.zza;
                        ((AtomicBoolean)object2).set(false);
                        n7 = 16;
                        n3 = 1065353216;
                        float f5 = 1.0f;
                        this.zzb = object2 = new HashMap(n7, f5);
                        this.zzg = object2 = new Object();
                        object2 = zzgw.zza;
                        object5 = new zzgz(this, null);
                        object.registerContentObserver((Uri)object2, bl2, (ContentObserver)object5);
                    } else {
                        object2 = this.zza;
                        bl3 = ((AtomicBoolean)object2).getAndSet(false);
                        if (bl3) {
                            object2 = this.zzb;
                            ((HashMap)object2).clear();
                            object2 = this.zzc;
                            ((HashMap)object2).clear();
                            object2 = this.zzd;
                            ((HashMap)object2).clear();
                            object2 = this.zze;
                            ((HashMap)object2).clear();
                            object2 = this.zzf;
                            ((HashMap)object2).clear();
                            this.zzg = object2 = new Object();
                            this.zzh = false;
                        }
                    }
                    object2 = this.zzg;
                    object5 = this.zzb;
                    n7 = (int)(object5.containsKey(string2) ? 1 : 0);
                    if (n7 != 0) {
                        object = this.zzb;
                        object = object.get(string2);
                        if ((object = (String)object) == null) return object4;
                        return object;
                    }
                    object5 = this.zzi;
                    n3 = ((String[])object5).length;
                }
                catch (Throwable throwable) {}
                throw throwable;
                while (n4 < n3) {
                    String string3 = object5[n4];
                    boolean bl4 = string2.startsWith(string3);
                    if (bl4) {
                        block23: {
                            bl3 = this.zzh;
                            if (bl3) return null;
                            object2 = this.zzi;
                            set = this.zzj;
                            object5 = new zzha();
                            object = set.zza((ContentResolver)object, (String[])object2, (zzhb)object5);
                            object = (HashMap)object;
                            bl3 = object.isEmpty();
                            if (bl3) break block23;
                            object2 = object.keySet();
                            set = this.zzc;
                            set = ((HashMap)((Object)set)).keySet();
                            object2.removeAll(set);
                            set = this.zzd;
                            set = ((HashMap)((Object)set)).keySet();
                            object2.removeAll(set);
                            set = this.zze;
                            set = ((HashMap)((Object)set)).keySet();
                            object2.removeAll(set);
                            set = this.zzf;
                            set = ((HashMap)((Object)set)).keySet();
                            object2.removeAll(set);
                        }
                        if (!(bl3 = object.isEmpty())) {
                            object2 = this.zzb;
                            bl3 = ((HashMap)object2).isEmpty();
                            if (bl3) {
                                this.zzb = object;
                            } else {
                                object2 = this.zzb;
                                ((HashMap)object2).putAll(object);
                            }
                        }
                        this.zzh = bl2;
                        break block24;
                    }
                    ++n4;
                }
            }
            try {
                object3 = this.zzj;
                object = object3.zza((ContentResolver)object, string2);
                if (object == null || !(bl2 = object.equals(null))) break block25;
                boolean bl5 = false;
                object = null;
            }
            catch (zzhd zzhd2) {
                return null;
            }
        }
        synchronized (this) {
            try {
                object3 = this.zzg;
                if (object2 == object3) {
                    object2 = this.zzb;
                    ((HashMap)object2).put(string2, object);
                }
                // MONITOREXIT @DISABLED, blocks:[3, 7] lbl109 : MonitorExitStatement: MONITOREXIT : this
                if (object == null) return null;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        {
            boolean bl6;
            block24: {
                catch (zzhd zzhd3) {}
            }
            if (!(bl6 = (object = this.zzb).containsKey(string2))) return null;
            object = this.zzb;
            object = object.get(string2);
            if ((object = (String)object) == null) return object4;
            return object;
        }
    }
}

