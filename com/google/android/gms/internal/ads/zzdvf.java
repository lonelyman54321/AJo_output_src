/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflu;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzdvf
implements zzflu {
    private final Map zza;
    private final zzdux zzb;
    private final Clock zzc;
    private final Map zzd;

    public zzdvf(zzdux object, Set object2, Clock clock) {
        boolean bl2;
        this.zzb = object;
        object = new HashMap();
        this.zza = object;
        object = new HashMap();
        this.zzd = object;
        object = object2.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzdve)object.next();
            Map map2 = this.zzd;
            zzfln zzfln2 = zzdve.zza((zzdve)object2);
            map2.put(zzfln2, object2);
        }
        this.zzc = clock;
    }

    private final void zze(zzfln object, boolean bl2) {
        Object object2 = this.zza;
        Object object3 = zzdve.zzb((zzdve)this.zzd.get(object));
        boolean bl3 = object2.containsKey(object3);
        if (bl3) {
            bl3 = true;
            String string2 = bl3 != bl2 ? "f." : "s.";
            object2 = this.zzc;
            Object object4 = this.zza;
            long l2 = object2.elapsedRealtime();
            long l3 = (Long)object4.get(object3);
            object3 = this.zzb;
            object2 = this.zzd;
            object3 = ((zzdux)object3).zzb();
            object = zzdve.zzc((zzdve)object2.get(object));
            object2 = String.valueOf(Long.toString(l2 -= l3));
            object4 = "label.";
            object = ((String)object4).concat((String)object);
            string2 = string2.concat((String)object2);
            object3.put(object, string2);
        }
    }

    public final void zzd(zzfln zzfln2, String object) {
        boolean bl2;
        Object object2 = this.zza;
        boolean bl3 = object2.containsKey((Object)zzfln2);
        if (bl3) {
            object2 = this.zzc;
            Object object3 = this.zza;
            long l2 = object2.elapsedRealtime();
            long l3 = (Long)object3.get((Object)zzfln2);
            object2 = this.zzb;
            object = String.valueOf(object);
            object2 = ((zzdux)object2).zzb();
            object3 = String.valueOf(Long.toString(l2 -= l3));
            object = "task.".concat((String)object);
            String string2 = "s.";
            object3 = string2.concat((String)object3);
            object2.put(object, object3);
        }
        if (bl2 = (object = this.zzd).containsKey((Object)zzfln2)) {
            bl2 = true;
            this.zze(zzfln2, bl2);
        }
    }

    public final void zzdC(zzfln zzfln2, String string2) {
    }

    public final void zzdD(zzfln zzfln2, String object, Throwable object2) {
        boolean bl2;
        object2 = this.zza;
        boolean bl3 = object2.containsKey((Object)zzfln2);
        if (bl3) {
            object2 = this.zzc;
            Object object3 = this.zza;
            long l2 = object2.elapsedRealtime();
            long l3 = (Long)object3.get((Object)zzfln2);
            object2 = this.zzb;
            object = String.valueOf(object);
            object2 = ((zzdux)object2).zzb();
            object3 = String.valueOf(Long.toString(l2 -= l3));
            object = "task.".concat((String)object);
            String string2 = "f.";
            object3 = string2.concat((String)object3);
            object2.put(object, object3);
        }
        if (bl2 = (object = this.zzd).containsKey((Object)zzfln2)) {
            bl2 = false;
            object = null;
            this.zze(zzfln2, false);
        }
    }

    public final void zzdE(zzfln zzfln2, String object) {
        object = this.zzc.elapsedRealtime();
        this.zza.put(zzfln2, object);
    }
}

