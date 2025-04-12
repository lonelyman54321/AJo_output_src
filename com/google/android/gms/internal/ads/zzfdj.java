/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

public final class zzfdj
implements zzgfa {
    public final /* synthetic */ zzfdl zza;
    public final /* synthetic */ zzfjl zzb;
    public final /* synthetic */ zzcvx zzc;

    public /* synthetic */ zzfdj(zzfdl zzfdl2, zzfjl zzfjl2, zzcvx zzcvx2) {
        this.zza = zzfdl2;
        this.zzb = zzfjl2;
        this.zzc = zzcvx2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ListenableFuture zza(Object object) {
        boolean bl2;
        Object object2 = this.zzb;
        ((zzfjl)object2).zzb = object = (zzfhf)object;
        object2 = ((zzfhf)object).zzb.zza.iterator();
        boolean bl3 = false;
        String string2 = null;
        while (bl2 = object2.hasNext()) {
            boolean bl4;
            Iterator iterator = ((zzfgt)object2.next()).zza.iterator();
            while (bl4 = iterator.hasNext()) {
                String string3;
                string2 = (String)iterator.next();
                bl3 = string2.contains(string3 = "FirstPartyRenderer");
                if (!bl3) return zzgft.zzh(null);
                bl3 = true;
            }
        }
        if (!bl3) return zzgft.zzh(null);
        object2 = this.zzc;
        object = zzgft.zzh(object);
        return ((zzcvx)object2).zzi((ListenableFuture)object);
    }
}

