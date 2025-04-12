/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdps;
import java.util.Collections;
import java.util.Map;

public final class zzdpt
extends zzbob
implements ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
zzbhh {
    private View zza;
    private zzdq zzb;
    private zzdlo zzc;
    private boolean zzd;
    private boolean zze;

    public zzdpt(zzdlo object, zzdlt zzdlt2) {
        Object object2;
        this.zza = object2 = zzdlt2.zzf();
        object2 = zzdlt2.zzj();
        this.zzb = object2;
        this.zzc = object;
        this.zzd = false;
        this.zze = false;
        object = zzdlt2.zzs();
        if (object != null) {
            object = zzdlt2.zzs();
            object.zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdlo zzdlo2 = this.zzc;
        if (zzdlo2 != null && (view = this.zza) != null) {
            Map map2 = Collections.emptyMap();
            Map map3 = Collections.emptyMap();
            View view2 = this.zza;
            boolean bl2 = zzdlo.zzX(view2);
            zzdlo2.zzB(view, map2, map3, bl2);
        }
    }

    private final void zzh() {
        boolean bl2;
        View view = this.zza;
        if (view != null && (bl2 = (view = view.getParent()) instanceof ViewGroup)) {
            view = (ViewGroup)view;
            View view2 = this.zza;
            view.removeView(view2);
        }
    }

    private static final void zzi(zzbof zzbof2, int n3) {
        try {
            zzbof2.zze(n3);
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onGlobalLayout() {
        this.zzg();
    }

    public final void onScrollChanged() {
        this.zzg();
    }

    public final zzdq zzb() {
        String string2 = "#008 Must be called on the main UI thread.";
        Preconditions.checkMainThread(string2);
        boolean bl2 = this.zzd;
        if (bl2) {
            zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    public final zzbhs zzc() {
        zzdlq zzdlq2;
        Object object = "#008 Must be called on the main UI thread.";
        Preconditions.checkMainThread((String)object);
        boolean bl2 = this.zzd;
        if (bl2) {
            zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        object = this.zzc;
        if (object != null && (zzdlq2 = ((zzdlo)object).zzc()) != null) {
            return ((zzdlo)object).zzc().zza();
        }
        return null;
    }

    public final void zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzh();
        zzdlo zzdlo2 = this.zzc;
        if (zzdlo2 != null) {
            zzdlo2.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdps zzdps2 = new zzdps(this);
        this.zzf(iObjectWrapper, zzdps2);
    }

    public final void zzf(IObjectWrapper object, zzbof zzbof2) {
        zzdq zzdq2;
        String string2 = "#008 Must be called on the main UI thread.";
        Preconditions.checkMainThread(string2);
        boolean bl2 = this.zzd;
        if (bl2) {
            zzm.zzg("Instream ad can not be shown after destroy().");
            zzdpt.zzi(zzbof2, 2);
            return;
        }
        string2 = this.zza;
        if (string2 != null && (zzdq2 = this.zzb) != null) {
            bl2 = this.zze;
            int n3 = 1;
            if (bl2) {
                zzm.zzg("Instream ad should not be used again.");
                zzdpt.zzi(zzbof2, n3);
                return;
            }
            this.zze = n3;
            this.zzh();
            object = (ViewGroup)ObjectWrapper.unwrap((IObjectWrapper)object);
            string2 = this.zza;
            int n4 = -1;
            zzdq2 = new ViewGroup.LayoutParams(n4, n4);
            object.addView((View)string2, (ViewGroup.LayoutParams)zzdq2);
            zzu.zzx();
            zzccv.zza(this.zza, this);
            zzu.zzx();
            object = this.zza;
            zzccv.zzb((View)object, this);
            this.zzg();
            try {
                zzbof2.zzf();
                return;
            }
            catch (RemoteException remoteException) {
                zzm.zzl("#007 Could not call remote method.", remoteException);
                return;
            }
        }
        object = string2 == null ? "can not get video view." : "can not get video controller.";
        zzm.zzg("Instream internal error: ".concat((String)object));
        zzdpt.zzi(zzbof2, 0);
    }
}

