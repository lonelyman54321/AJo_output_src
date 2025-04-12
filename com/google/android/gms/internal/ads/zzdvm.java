/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzdvm {
    private final zzg zza;
    private final List zzb;
    private boolean zzc;
    private boolean zzd;
    private final String zze;
    private final zzdvh zzf;

    public zzdvm(String object, zzdvh zzdvh2) {
        ArrayList arrayList;
        this.zzb = arrayList = new ArrayList();
        this.zzc = false;
        this.zzd = false;
        this.zze = object;
        this.zzf = zzdvh2;
        this.zza = object = zzu.zzo().zzi();
    }

    private final Map zzg() {
        Map map2 = this.zzf.zza();
        long l2 = zzu.zzB().elapsedRealtime();
        int n3 = 10;
        Object object = Long.toString(l2, n3);
        String string2 = "tms";
        map2.put(string2, object);
        object = this.zza;
        boolean bl2 = object.zzS();
        object = bl2 ? "" : this.zze;
        map2.put("tid", object);
        return map2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object) {
        synchronized (this) {
            object = zzbep.zzca;
            Object object2 = zzba.zzc();
            object = ((zzben)object2).zza((zzbeg)object);
            object = (Boolean)object;
            boolean bl2 = (Boolean)object;
            if (!bl2) {
                return;
            }
            object = this.zzg();
            object2 = "action";
            String string2 = "aaia";
            object.put(object2, string2);
            object2 = "aair";
            string2 = "MalformedJson";
            object.put(object2, string2);
            object2 = this.zzb;
            object2.add(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String object, String string2) {
        synchronized (this) {
            Object object2 = zzbep.zzca;
            Object object3 = zzba.zzc();
            object2 = ((zzben)object3).zza((zzbeg)object2);
            object2 = (Boolean)object2;
            boolean bl2 = (Boolean)object2;
            if (!bl2) {
                return;
            }
            object2 = this.zzg();
            object3 = "action";
            String string3 = "adapter_init_finished";
            object2.put(object3, string3);
            object3 = "ancn";
            object2.put(object3, object);
            object = "rqe";
            object2.put(object, string2);
            object = this.zzb;
            object.add(object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String object) {
        synchronized (this) {
            Object object2 = zzbep.zzca;
            Object object3 = zzba.zzc();
            object2 = ((zzben)object3).zza((zzbeg)object2);
            object2 = (Boolean)object2;
            boolean bl2 = (Boolean)object2;
            if (!bl2) {
                return;
            }
            object2 = this.zzg();
            object3 = "action";
            String string2 = "adapter_init_started";
            object2.put(object3, string2);
            object3 = "ancn";
            object2.put(object3, object);
            object = this.zzb;
            object.add(object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String object) {
        synchronized (this) {
            Object object2 = zzbep.zzca;
            Object object3 = zzba.zzc();
            object2 = ((zzben)object3).zza((zzbeg)object2);
            object2 = (Boolean)object2;
            boolean bl2 = (Boolean)object2;
            if (!bl2) {
                return;
            }
            object2 = this.zzg();
            object3 = "action";
            String string2 = "adapter_init_finished";
            object2.put(object3, string2);
            object3 = "ancn";
            object2.put(object3, object);
            object = this.zzb;
            object.add(object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    Iterator iterator = zzbep.zzca;
                    Object object = zzba.zzc();
                    iterator = ((zzben)object).zza((zzbeg)((Object)iterator));
                    iterator = (Boolean)((Object)iterator);
                    boolean bl2 = (Boolean)((Object)iterator);
                    if (bl2 && !(bl2 = this.zzd)) {
                        iterator = this.zzg();
                        object = "action";
                        Object object2 = "init_finished";
                        iterator.put(object, object2);
                        object = this.zzb;
                        object.add(iterator);
                        iterator = this.zzb;
                        iterator = iterator.iterator();
                        while (true) {
                            boolean bl3;
                            if (!(bl3 = iterator.hasNext())) {
                                this.zzd = bl2 = true;
                                return;
                            }
                            object = iterator.next();
                            object = (Map)object;
                            object2 = this.zzf;
                            ((zzdvk)object2).zzf((Map)object);
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zzbep.zzca;
                    Object object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2 && !(bl2 = this.zzc)) {
                        object = this.zzg();
                        object2 = "action";
                        String string2 = "init_started";
                        object.put(object2, string2);
                        object2 = this.zzb;
                        object2.add(object);
                        this.zzc = bl2 = true;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

