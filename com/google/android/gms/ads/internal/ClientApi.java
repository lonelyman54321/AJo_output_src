/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzeof;
import java.util.HashMap;

public class ClientApi
extends zzcd {
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String string2, zzbrf object, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3);
        zzeof zzeof2 = new zzeof((zzcjd)object, (Context)iObjectWrapper, string2);
        return zzeof2;
    }

    public final zzbu zzc(IObjectWrapper object, zzq object2, String object3, zzbrf zzbrf2, int n3) {
        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
        object2 = zzcjd.zzb((Context)object, zzbrf2, n3).zzt();
        object2.zza((String)object3);
        object2.zzb((Context)object);
        object = object2.zzc();
        object2 = zzbep.zzfp;
        object3 = zzba.zzc();
        object2 = (Integer)((zzben)object3).zza((zzbeg)object2);
        int n4 = (Integer)object2;
        if (n3 >= n4) {
            return object.zza();
        }
        object = new zzew();
        return object;
    }

    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzq2, String string2, zzbrf object, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3).zzu();
        object.zzc((Context)iObjectWrapper);
        object.zza(zzq2);
        object.zzb(string2);
        return object.zzd().zza();
    }

    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzq2, String string2, zzbrf object, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3).zzv();
        object.zzc((Context)iObjectWrapper);
        object.zza(zzq2);
        object.zzb(string2);
        return object.zzd().zza();
    }

    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzq2, String string2, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(241806000, n3, true, false);
        zzt zzt2 = new zzt((Context)iObjectWrapper, zzq2, string2, versionInfoParcel);
        return zzt2;
    }

    public final zzco zzg(IObjectWrapper iObjectWrapper, int n3) {
        return zzcjd.zzb((Context)ObjectWrapper.unwrap(iObjectWrapper), null, n3).zzc();
    }

    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf zzbrf2, int n3) {
        return zzcjd.zzb((Context)ObjectWrapper.unwrap(iObjectWrapper), zzbrf2, n3).zzm();
    }

    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        iObjectWrapper = (FrameLayout)ObjectWrapper.unwrap(iObjectWrapper);
        iObjectWrapper2 = (FrameLayout)ObjectWrapper.unwrap(iObjectWrapper2);
        zzdmp zzdmp2 = new zzdmp((FrameLayout)iObjectWrapper, (FrameLayout)iObjectWrapper2, 241806000);
        return zzdmp2;
    }

    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper object, IObjectWrapper object2) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        object = (HashMap)ObjectWrapper.unwrap((IObjectWrapper)object);
        object2 = (HashMap)ObjectWrapper.unwrap((IObjectWrapper)object2);
        zzdmn zzdmn2 = new zzdmn((View)iObjectWrapper, (HashMap)object, (HashMap)object2);
        return zzdmn2;
    }

    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf object, int n3, zzbmo zzbmo2) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3).zzk();
        object.zzb((Context)iObjectWrapper);
        object.zza(zzbmo2);
        return object.zzc().zzd();
    }

    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf zzbrf2, int n3) {
        return zzcjd.zzb((Context)ObjectWrapper.unwrap(iObjectWrapper), zzbrf2, n3).zzn();
    }

    public final zzbvg zzm(IObjectWrapper iObjectWrapper) {
        Object object = AdOverlayInfoParcel.zza((iObjectWrapper = (Activity)ObjectWrapper.unwrap(iObjectWrapper)).getIntent());
        if (object == null) {
            object = new zzu((Activity)iObjectWrapper);
        } else {
            int n3 = ((AdOverlayInfoParcel)object).zzk;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            int n7 = 5;
                            object = n3 != n7 ? new zzu((Activity)iObjectWrapper) : new zzad((Activity)iObjectWrapper);
                        } else {
                            zzz zzz2 = new zzz((Activity)iObjectWrapper, (AdOverlayInfoParcel)object);
                            object = zzz2;
                        }
                    } else {
                        object = new zzag((Activity)iObjectWrapper);
                    }
                } else {
                    object = new zzaf((Activity)iObjectWrapper);
                }
            } else {
                object = new com.google.android.gms.ads.internal.overlay.zzt((Activity)iObjectWrapper);
            }
        }
        return object;
    }

    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3).zzw();
        object.zzb((Context)iObjectWrapper);
        return object.zzc().zzb();
    }

    public final zzbza zzo(IObjectWrapper iObjectWrapper, String string2, zzbrf object, int n3) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        object = zzcjd.zzb((Context)iObjectWrapper, (zzbrf)object, n3).zzw();
        object.zzb((Context)iObjectWrapper);
        object.zza(string2);
        return object.zzc().zza();
    }

    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf zzbrf2, int n3) {
        return zzcjd.zzb((Context)ObjectWrapper.unwrap(iObjectWrapper), zzbrf2, n3).zzq();
    }
}

