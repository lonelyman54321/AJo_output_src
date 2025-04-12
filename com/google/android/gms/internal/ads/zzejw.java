/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzejv;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhv;

public final class zzejw
implements zzehr {
    private final Context zza;
    private final zzdjh zzb;

    public zzejw(Context context, zzdjh zzdjh2) {
        this.zza = context;
        this.zzb = zzdjh2;
    }

    public final void zzb(zzfhf object, zzfgt object2, zzeho zzeho2) {
        Object object3;
        try {
            object3 = zzeho2.zzb;
        }
        catch (RemoteException remoteException) {
            zze.zzb("Remote exception loading a interstitial RTB ad", remoteException);
            object2 = new zzfhv(remoteException);
            throw object2;
        }
        object3 = (zzbte)object3;
        Object object4 = ((zzfgt)object2).zzaa;
        object3.zzq((String)object4);
        object4 = object3 = zzeho2.zzb;
        object4 = (zzbte)object3;
        String string2 = ((zzfgt)object2).zzV;
        object2 = ((zzfgt)object2).zzw;
        String string3 = object2.toString();
        object = ((zzfhf)object).zza;
        object = ((zzfhc)object).zza;
        zzl zzl2 = ((zzfho)object).zzd;
        object = this.zza;
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
        object = null;
        zzejv zzejv2 = new zzejv(this, zzeho2, null);
        Object object5 = object = zzeho2.zzc;
        object5 = (zzbrl)object;
        object4.zzl(string2, string3, zzl2, iObjectWrapper, zzejv2, (zzbrl)object5);
    }
}

