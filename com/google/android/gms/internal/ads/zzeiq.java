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
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfim;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzeiq
implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private final Executor zzc;

    public zzeiq(Context context, zzctg zzctg2, Executor executor) {
        this.zza = context;
        this.zzb = zzctg2;
        this.zzc = executor;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzb(zzfhf object, zzfgt object2, zzeho zzeho2) {
        Object object3;
        int n3;
        Object object4;
        Object object5 = ((zzfhf)object).zza.zza.zze;
        boolean bl2 = ((zzq)object5).zzn;
        if (bl2) {
            object4 = this.zza;
            int n4 = ((zzq)object5).zze;
            n3 = ((zzq)object5).zzb;
            object5 = com.google.android.gms.ads.zzb.zzd(n4, n3);
            object3 = new zzq((Context)object4, (AdSize)object5);
        } else {
            object4 = zzbep.zzhU;
            object3 = zzba.zzc();
            object4 = (Boolean)((zzben)object3).zza((zzbeg)object4);
            bl2 = (Boolean)object4;
            if (bl2 && (bl2 = ((zzfgt)object2).zzah)) {
                object4 = this.zza;
                int n7 = ((zzq)object5).zze;
                n3 = ((zzq)object5).zzb;
                object5 = com.google.android.gms.ads.zzb.zze(n7, n3);
                object3 = new zzq((Context)object4, (AdSize)object5);
            } else {
                object5 = this.zza;
                object4 = ((zzfgt)object2).zzv;
                object3 = zzfhu.zza((Context)object5, (List)object4);
            }
        }
        Object object6 = object3;
        object5 = zzbep.zzhU;
        object4 = zzba.zzc();
        object5 = (Boolean)((zzben)object4).zza((zzbeg)object5);
        n3 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(((zzfgt)object2).zzah ? 1 : 0)) != 0) {
            object5 = zzeho2.zzb;
            Context context = this.zza;
            Object object7 = object5;
            object7 = (zzfim)object5;
            object = ((zzfhf)object).zza.zza;
            String string2 = ((zzfgt)object2).zzw.toString();
            String string3 = zzbw.zzm(((zzfgt)object2).zzt);
            object2 = zzeho2.zzc;
            zzl zzl2 = ((zzfho)object).zzd;
            Object object8 = object2;
            object8 = (zzbrl)object2;
            ((zzfim)object7).zzn(context, (zzq)object3, zzl2, string2, string3, (zzbrl)object8);
            return;
        }
        object5 = zzeho2.zzb;
        Context context = this.zza;
        Object object9 = object5;
        object9 = (zzfim)object5;
        object = ((zzfhf)object).zza.zza;
        String string4 = ((zzfgt)object2).zzw.toString();
        String string5 = zzbw.zzm(((zzfgt)object2).zzt);
        object2 = zzeho2.zzc;
        zzl zzl3 = ((zzfho)object).zzd;
        Object object10 = object2;
        object10 = (zzbrl)object2;
        ((zzfim)object9).zzm(context, (zzq)object6, zzl3, string4, string5, (zzbrl)object10);
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfgt zzfgt2, Object object) {
        return zzgft.zzh((Object)zzcub.zza(this.zza, view, zzfgt2));
    }
}

