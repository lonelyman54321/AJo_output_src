/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd$Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbun;
import java.util.List;

public final class zzbuu
implements NativeCustomFormatAd {
    private final zzbip zza;
    private NativeCustomFormatAd$DisplayOpenMeasurement zzb;

    public zzbuu(zzbip zzbip2) {
        this.zza = zzbip2;
    }

    public final void destroy() {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbip2.zzl();
    }

    public final List getAvailableAssetNames() {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbip2.zzk();
    }

    public final String getCustomFormatId() {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbip2.zzi();
    }

    public final NativeCustomFormatAd$DisplayOpenMeasurement getDisplayOpenMeasurement() {
        block8: {
            Object object = this.zzb;
            if (object != null) break block8;
            object = this.zza;
            boolean bl2 = object.zzq();
            if (!bl2) break block8;
            Object object2 = this.zza;
            object = new zzbum((zzbip)object2);
            try {
                this.zzb = object;
            }
            catch (RemoteException remoteException) {
                object2 = "";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return this.zzb;
    }

    public final NativeAd$Image getImage(String object) {
        block5: {
            Object object2 = this.zza;
            object = object2.zzg((String)object);
            if (object == null) break block5;
            try {
                object2 = new zzbun((zzbhv)object);
                return object2;
            }
            catch (RemoteException remoteException) {
                object2 = "";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return null;
    }

    public final MediaContent getMediaContent() {
        block8: {
            Object object = this.zza;
            object = object.zzf();
            if (object == null) break block8;
            Object object2 = this.zza;
            object2 = object2.zzf();
            zzbip zzbip2 = this.zza;
            try {
                object = new zzep((zzbhs)object2, zzbip2);
                return object;
            }
            catch (RemoteException remoteException) {
                object2 = "";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return null;
    }

    public final CharSequence getText(String string2) {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbip2.zzj(string2);
    }

    public final void performClick(String string2) {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbip2.zzn(string2);
    }

    public final void recordImpression() {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbip2.zzo();
    }
}

