/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhb;
import com.google.android.gms.internal.ads.zzfgt;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzdhc
extends zzdez
implements zzban {
    private final Map zzb;
    private final Context zzc;
    private final zzfgt zzd;

    public zzdhc(Context context, Set weakHashMap, zzfgt zzfgt2) {
        super((Set)((Object)weakHashMap));
        this.zzb = weakHashMap = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfgt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(View object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object object3;
                block5: {
                    try {
                        object3 = this.zzb;
                        object3 = object3.get(object);
                        object3 = (zzbao)object3;
                        if (object3 != null) break block5;
                        object3 = this.zzc;
                        object2 = new zzbao((Context)object3, (View)object);
                        ((zzbao)object2).zzc(this);
                        object3 = this.zzb;
                        object3.put(object, object2);
                        object3 = object2;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object = this.zzd;
                boolean bl2 = ((zzfgt)object).zzY;
                if (bl2) {
                    object = zzbep.zzbp;
                    object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    bl2 = (Boolean)(object = (Boolean)object);
                    if (bl2) {
                        object = zzbep.zzbo;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        object = (Long)object;
                        long l2 = (Long)object;
                        ((zzbao)object3).zzg(l2);
                        return;
                    }
                }
                ((zzbao)object3).zzf();
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
    public final void zzb(View view) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.zzb;
                    boolean bl2 = object.containsKey(view);
                    if (bl2) {
                        object = this.zzb;
                        object = object.get(view);
                        object = (zzbao)object;
                        ((zzbao)object).zze(this);
                        object = this.zzb;
                        object.remove(view);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdp(zzbam zzbam2) {
        synchronized (this) {
            zzdhb zzdhb2 = new zzdhb(zzbam2);
            this.zzq(zzdhb2);
            return;
        }
    }
}

