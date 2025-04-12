/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbip;

public final class zzep
implements MediaContent {
    private final zzbhs zza;
    private final VideoController zzb;
    private final zzbip zzc;

    public zzep(zzbhs zzbhs2, zzbip zzbip2) {
        VideoController videoController;
        this.zzb = videoController = new VideoController();
        this.zza = zzbhs2;
        this.zzc = zzbip2;
    }

    public final float getAspectRatio() {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return 0.0f;
        }
        return zzbhs2.zze();
    }

    public final float getCurrentTime() {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return 0.0f;
        }
        return zzbhs2.zzf();
    }

    public final float getDuration() {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return 0.0f;
        }
        return zzbhs2.zzg();
    }

    public final Drawable getMainImage() {
        block5: {
            Object object = this.zza;
            object = object.zzi();
            if (object == null) break block5;
            object = ObjectWrapper.unwrap((IObjectWrapper)object);
            try {
                return (Drawable)object;
            }
            catch (RemoteException remoteException) {
                String string2 = "";
                zzm.zzh(string2, remoteException);
            }
        }
        return null;
    }

    public final VideoController getVideoController() {
        block7: {
            Object object = this.zza;
            object = object.zzh();
            if (object == null) break block7;
            object = this.zzb;
            Object object2 = this.zza;
            object2 = object2.zzh();
            try {
                ((VideoController)object).zzb((zzdq)object2);
            }
            catch (RemoteException remoteException) {
                object2 = "Exception occurred while getting video controller";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return this.zzb;
    }

    public final boolean hasVideoContent() {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbhs2.zzl();
    }

    public final void setMainImage(Drawable object) {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ObjectWrapper.wrap(object);
        zzbhs2.zzj((IObjectWrapper)object);
    }

    public final zzbip zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        zzbhs zzbhs2;
        try {
            zzbhs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbhs2.zzk();
    }

    public final zzbhs zzc() {
        return this.zza;
    }
}

