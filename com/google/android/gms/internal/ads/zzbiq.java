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
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbip;

public final class zzbiq {
    private final zzbip zza;
    private final MediaView zzb;
    private final VideoController zzc;

    public zzbiq(zzbip object) {
        boolean bl2;
        Object object2;
        String string2;
        block11: {
            string2 = "";
            this.zzc = object2 = new VideoController();
            this.zza = object;
            object2 = null;
            object = object.zzh();
            object = ObjectWrapper.unwrap((IObjectWrapper)object);
            try {
                object = (Context)object;
                break block11;
            }
            catch (RemoteException remoteException) {
            }
            catch (NullPointerException nullPointerException) {
                // empty catch block
            }
            zzm.zzh(string2, (Throwable)object);
            bl2 = false;
            object = null;
        }
        if (object != null) {
            MediaView mediaView = new MediaView((Context)object);
            object = this.zza;
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap((Object)mediaView);
            try {
                bl2 = object.zzs(iObjectWrapper);
                boolean bl3 = true;
                if (bl3 == bl2) {
                    object2 = mediaView;
                }
            }
            catch (RemoteException remoteException) {
                zzm.zzh(string2, remoteException);
            }
        }
        this.zzb = object2;
    }

    public final zzbip zza() {
        return this.zza;
    }

    public final String zzb() {
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
}

