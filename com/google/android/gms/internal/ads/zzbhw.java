/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd$Image;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhv;

public final class zzbhw
extends NativeAd$Image {
    private final zzbhv zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbhw(zzbhv object) {
        double d2;
        int n3;
        Object object2;
        int n4;
        String string2;
        block11: {
            block10: {
                string2 = "";
                this.zza = object;
                n4 = 0;
                object2 = null;
                try {
                    object = object.zzf();
                    if (object == null) break block10;
                    object = ObjectWrapper.unwrap((IObjectWrapper)object);
                    object = (Drawable)object;
                    break block11;
                }
                catch (RemoteException remoteException) {}
                zzm.zzh(string2, remoteException);
            }
            n3 = 0;
            object = null;
        }
        this.zzb = object;
        try {
            object = this.zza;
            object2 = object.zze();
        }
        catch (RemoteException remoteException) {
            zzm.zzh(string2, remoteException);
        }
        this.zzc = object2;
        try {
            object = this.zza;
            d2 = object.zzb();
        }
        catch (RemoteException remoteException) {
            zzm.zzh(string2, remoteException);
            d2 = 1.0;
        }
        this.zzd = d2;
        n3 = -1;
        try {
            object2 = this.zza;
            n4 = object2.zzd();
        }
        catch (RemoteException remoteException) {
            zzm.zzh(string2, remoteException);
            n4 = -1;
        }
        this.zze = n4;
        try {
            object2 = this.zza;
            n3 = object2.zzc();
        }
        catch (RemoteException remoteException) {
            zzm.zzh(string2, remoteException);
        }
        this.zzf = n3;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}

