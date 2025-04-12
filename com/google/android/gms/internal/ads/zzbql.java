/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbpu;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqi;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzccp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

public final class zzbql
implements zzbpx {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final zzbpt zzc;
    private final String zzd;

    public zzbql(zzbpt zzbpt2, String string2, zzbqa zzbqa2, zzbpz zzbpz2) {
        this.zzc = zzbpt2;
        this.zzd = string2;
        this.zzb = zzbqa2;
        this.zza = zzbpz2;
    }

    public static /* bridge */ /* synthetic */ zzbpz zzc(zzbql zzbql2) {
        return zzbql2.zza;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbql object, zzbpn zzbpn2, zzbpu object2, Object object3, zzccn zzccn2) {
        Object object4;
        try {
            zzu.zzp();
            object4 = UUID.randomUUID();
        }
        catch (Exception exception) {
            try {
                zzccn2.zzd(exception);
                object2 = "Unable to invokeJavascript";
                zzm.zzh((String)object2, exception);
                return;
            }
            finally {
                zzbpn2.zzb();
            }
        }
        object4 = ((UUID)object4).toString();
        zzbmf zzbmf2 = zzblo.zzo;
        Object object5 = new zzbqk((zzbql)object, zzbpn2, zzccn2);
        zzbmf2.zzc((String)object4, (zzbme)object5);
        zzbmf2 = new JSONObject();
        object5 = "id";
        zzbmf2.put((String)object5, object4);
        object4 = "args";
        object5 = ((zzbql)object).zzb;
        object3 = object5.zzb(object3);
        zzbmf2.put((String)object4, object3);
        object = ((zzbql)object).zzd;
        object2.zzl((String)object, (JSONObject)zzbmf2);
    }

    public final ListenableFuture zza(Object object) {
        return this.zzb(object);
    }

    public final ListenableFuture zzb(Object object) {
        zzccn zzccn2 = new zzccn();
        zzbpn zzbpn2 = this.zzc.zzb(null);
        zze.zza("callJs > getEngine: Promise created");
        zzbqi zzbqi2 = new zzbqi(this, zzbpn2, object, zzccn2);
        object = new zzbqj(this, zzccn2, zzbpn2);
        zzbpn2.zzj(zzbqi2, (zzccp)object);
        return zzccn2;
    }
}

