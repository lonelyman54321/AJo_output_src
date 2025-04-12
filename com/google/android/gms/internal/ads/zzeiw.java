/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzeiv;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeiw
implements zzehr {
    private final Context zza;
    private final zzctg zzb;
    private View zzc;
    private zzbro zzd;

    public zzeiw(Context context, zzctg zzctg2) {
        this.zza = context;
        this.zzb = zzctg2;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzeiw zzeiw2, zzbro zzbro2) {
        zzeiw2.zzd = zzbro2;
    }

    public static /* bridge */ /* synthetic */ void zze(zzeiw zzeiw2, View view) {
        zzeiw2.zzc = view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzfhf object, zzfgt object2, zzeho zzeho2) {
        RemoteException remoteException2;
        block3: {
            Object object3;
            try {
                object3 = zzeho2.zzb;
                object3 = (zzbte)object3;
                Object object4 = ((zzfgt)object2).zzaa;
                object3.zzq((String)object4);
                object3 = zzbep.zzhU;
                object4 = zzba.zzc();
                object3 = ((zzben)object4).zza((zzbeg)object3);
                object3 = (Boolean)object3;
                boolean bl2 = (Boolean)object3;
                object4 = null;
                if (bl2 && (bl2 = ((zzfgt)object2).zzah)) {
                    Object object5 = object3 = zzeho2.zzb;
                    object5 = (zzbte)object3;
                    String string2 = ((zzfgt)object2).zzV;
                    object2 = ((zzfgt)object2).zzw;
                    String string3 = object2.toString();
                    object2 = ((zzfhf)object).zza;
                    object2 = ((zzfhc)object2).zza;
                    zzl zzl2 = ((zzfho)object2).zzd;
                    object2 = this.zza;
                    IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object2);
                    zzeiv zzeiv2 = new zzeiv(this, zzeho2, null);
                    Object object6 = object2 = zzeho2.zzc;
                    object6 = (zzbrl)object2;
                    object = ((zzfhf)object).zza;
                    object = ((zzfhc)object).zza;
                    zzq zzq2 = ((zzfho)object).zze;
                    object5.zzk(string2, string3, zzl2, iObjectWrapper, zzeiv2, (zzbrl)object6, zzq2);
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            Object object7 = object3 = zzeho2.zzb;
            object7 = (zzbte)object3;
            String string4 = ((zzfgt)object2).zzV;
            object2 = ((zzfgt)object2).zzw;
            String string5 = object2.toString();
            object2 = ((zzfhf)object).zza;
            object2 = ((zzfhc)object2).zza;
            zzl zzl3 = ((zzfho)object2).zzd;
            object2 = this.zza;
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object2);
            zzeiv zzeiv3 = new zzeiv(this, zzeho2, null);
            Object object8 = object2 = zzeho2.zzc;
            object8 = (zzbrl)object2;
            object = ((zzfhf)object).zza;
            object = ((zzfhc)object).zza;
            zzq zzq3 = ((zzfho)object).zze;
            object7.zzj(string4, string5, zzl3, iObjectWrapper, zzeiv3, (zzbrl)object8, zzq3);
            return;
        }
        object2 = new zzfhv(remoteException2);
        throw object2;
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfgt zzfgt2, Object object) {
        return zzgft.zzh((Object)zzcub.zza(this.zza, view, zzfgt2));
    }
}

