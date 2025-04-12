/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzenu;
import org.json.JSONObject;

public final class zzemq
implements zzehn {
    private final zzenu zza;
    private final zzdst zzb;

    public zzemq(zzenu zzenu2, zzdst zzdst2) {
        this.zza = zzenu2;
        this.zzb = zzdst2;
    }

    public final zzeho zza(String string2, JSONObject object) {
        Object object2;
        object = zzbep.zzbF;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        zzejh zzejh2 = null;
        if (bl2) {
            object = this.zzb;
            try {
                object = ((zzdst)object).zzb(string2);
            }
            catch (RemoteException remoteException) {
                object2 = "Coundn't create RTB adapter: ";
                zzm.zzh((String)object2, remoteException);
                bl2 = false;
                object = null;
            }
        } else {
            object = this.zza.zza(string2);
        }
        if (object == null) {
            return null;
        }
        zzejh2 = new zzejh();
        object2 = new zzeho(object, zzejh2, string2);
        return object2;
    }
}

