/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzdlt;

public final class zzdlc
extends zzbhr {
    private final zzdlt zza;
    private IObjectWrapper zzb;

    public zzdlc(zzdlt zzdlt2) {
        this.zza = zzdlt2;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        int n3;
        int n4;
        if (iObjectWrapper != null && (iObjectWrapper = (Drawable)ObjectWrapper.unwrap(iObjectWrapper)) != null && (n4 = iObjectWrapper.getIntrinsicWidth()) != (n3 = -1) && (n4 = iObjectWrapper.getIntrinsicHeight()) != n3) {
            float f5 = iObjectWrapper.getIntrinsicWidth();
            float f6 = iObjectWrapper.getIntrinsicHeight();
            return f5 / f6;
        }
        return 0.0f;
    }

    public final float zze() {
        Object object = zzbep.zzgv;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        Object object2 = (Boolean)object;
        boolean bl2 = false;
        float f5 = 0.0f;
        if (object2) {
            object = this.zza;
            float f6 = ((zzdlt)object).zzb();
            float f7 = f6 - 0.0f;
            object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2) {
                return this.zza.zzb();
            }
            object = this.zza.zzj();
            if (object != null) {
                object = this.zza;
                object = ((zzdlt)object).zzj();
                try {
                    f5 = object.zze();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Remote exception getting video controller aspect ratio.";
                    zzm.zzh(string2, remoteException);
                }
            } else {
                object = this.zzb;
                if (object != null) {
                    f5 = zzdlc.zzb((IObjectWrapper)object);
                } else {
                    object = this.zza.zzm();
                    if (object != null) {
                        float f8;
                        float f11;
                        int n3 = object.zzd();
                        int n4 = -1;
                        float f12 = 0.0f / 0.0f;
                        if (n3 != n4 && (n3 = object.zzc()) != n4) {
                            n3 = object.zzd();
                            f11 = n3;
                            n4 = object.zzc();
                            f12 = n4;
                            f11 /= f12;
                        } else {
                            n3 = 0;
                            f11 = 0.0f;
                            Object var6_8 = null;
                        }
                        bl2 = (f8 = f11 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                        if (!bl2) {
                            return zzdlc.zzb(object.zzf());
                        }
                        f5 = f11;
                    }
                }
            }
        }
        return f5;
    }

    public final float zzf() {
        Object object = zzbep.zzgw;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zza.zzj()) != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    public final float zzg() {
        Object object = zzbep.zzgw;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zza.zzj()) != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    public final zzdq zzh() {
        Object object = zzbep.zzgw;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        return this.zza.zzj();
    }

    public final IObjectWrapper zzi() {
        Object object = this.zzb;
        if (object != null) {
            return object;
        }
        object = this.zza.zzm();
        if (object == null) {
            return null;
        }
        return object.zzf();
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    public final boolean zzk() {
        Object object = zzbep.zzgw;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return false;
        }
        return this.zza.zzaf();
    }

    public final boolean zzl() {
        Object object = zzbep.zzgw;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return false;
        }
        object = this.zza.zzj();
        return object != null;
    }

    public final void zzm(zzbjd zzbjd2) {
        Object object = zzbep.zzgw;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = (object = this.zza.zzj()) instanceof zzcif)) {
            object = (zzcif)this.zza.zzj();
            ((zzcif)object).zzv(zzbjd2);
        }
    }
}

