/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class zzbwd {
    private final View zza;
    private final Map zzb;
    private final zzcbg zzc;

    public zzbwd(zzbwc object) {
        boolean bl2;
        Object object2;
        this.zza = object2 = zzbwc.zza((zzbwc)object);
        Object object3 = zzbwc.zzd((zzbwc)object);
        this.zzb = object3;
        this.zzc = object = zzbvx.zza(zzbwc.zza((zzbwc)object).getContext());
        if (object != null && !(bl2 = object3.isEmpty())) {
            object2 = ObjectWrapper.wrap(object2);
            object2 = object2.asBinder();
            object3 = ObjectWrapper.wrap(object3);
            object3 = object3.asBinder();
            zzbwe zzbwe2 = new zzbwe((IBinder)object2, (IBinder)object3);
            try {
                object.zzg(zzbwe2);
                return;
            }
            catch (RemoteException remoteException) {
                object = "Failed to call remote method.";
                zzm.zzg((String)object);
            }
        }
    }

    public final void zza(List object) {
        boolean bl2;
        if (object != null && !(bl2 = object.isEmpty())) {
            Object object2 = this.zzc;
            if (object2 == null) {
                object2 = "Failed to get internal reporting info generator in recordClick.";
                zzm.zzj((String)object2);
            }
            try {
                object2 = this.zzc;
            }
            catch (RemoteException remoteException) {
                object = ((Object)((Object)remoteException)).toString();
                zzm.zzg("RemoteException recording click: ".concat((String)object));
                return;
            }
            Object object3 = this.zza;
            object3 = ObjectWrapper.wrap(object3);
            zzbwb zzbwb2 = new zzbwb(this, (List)object);
            object2.zzh((List)object, (IObjectWrapper)object3, zzbwb2);
            return;
        }
        zzm.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List object) {
        boolean bl2;
        if (object != null && !(bl2 = object.isEmpty())) {
            zzcbg zzcbg2 = this.zzc;
            if (zzcbg2 != null) {
                Object object2;
                try {
                    object2 = this.zza;
                }
                catch (RemoteException remoteException) {
                    object = ((Object)((Object)remoteException)).toString();
                    zzm.zzg("RemoteException recording impression urls: ".concat((String)object));
                    return;
                }
                object2 = ObjectWrapper.wrap(object2);
                zzbwa zzbwa2 = new zzbwa(this, (List)object);
                zzcbg2.zzi((List)object, (IObjectWrapper)object2, zzbwa2);
                return;
            }
            zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzm.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent object) {
        zzcbg zzcbg2 = this.zzc;
        if (zzcbg2 != null) {
            try {
                object = ObjectWrapper.wrap(object);
            }
            catch (RemoteException remoteException) {
                zzm.zzg("Failed to call remote method.");
                return;
            }
            zzcbg2.zzk((IObjectWrapper)object);
            return;
        }
        zzm.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri object, UpdateClickUrlCallback updateClickUrlCallback) {
        int n3;
        Object object2 = this.zzc;
        if (object2 == null) {
            object2 = "Failed to get internal reporting info generator.";
            updateClickUrlCallback.onFailure((String)object2);
        }
        try {
            object2 = this.zzc;
            n3 = 1;
        }
        catch (RemoteException remoteException) {
            object = ((Object)((Object)remoteException)).toString();
            object = "Internal error: ".concat((String)object);
            updateClickUrlCallback.onFailure((String)object);
            return;
        }
        Object object3 = new Uri[n3];
        object3[0] = object;
        object = Arrays.asList(object3);
        ArrayList arrayList = new ArrayList(object);
        object = this.zza;
        object = ObjectWrapper.wrap(object);
        object3 = new zzbvz(this, updateClickUrlCallback);
        object2.zzl(arrayList, (IObjectWrapper)object, (zzbvv)object3);
    }

    public final void zze(List object, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        Object object2 = this.zzc;
        if (object2 == null) {
            object2 = "Failed to get internal reporting info generator.";
            updateImpressionUrlsCallback.onFailure((String)object2);
        }
        try {
            object2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object = ((Object)((Object)remoteException)).toString();
            object = "Internal error: ".concat((String)object);
            updateImpressionUrlsCallback.onFailure((String)object);
            return;
        }
        Object object3 = this.zza;
        object3 = ObjectWrapper.wrap(object3);
        zzbvy zzbvy2 = new zzbvy(this, updateImpressionUrlsCallback);
        object2.zzm((List)object, (IObjectWrapper)object3, zzbvy2);
    }
}

