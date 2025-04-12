/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.ads.zzd;
import com.google.android.gms.ads.zze;
import com.google.android.gms.ads.zzf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;

public abstract class BaseAdView
extends ViewGroup {
    protected final zzea zza;

    public BaseAdView(Context object, int n3) {
        super(object);
        super(this, n3);
        this.zza = object;
    }

    public BaseAdView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet);
        super(this, attributeSet, false, n3);
        this.zza = object;
    }

    public BaseAdView(Context object, AttributeSet attributeSet, int n3, int n4) {
        super(object, attributeSet, n3);
        super(this, attributeSet, false, n4);
        this.zza = object;
    }

    public BaseAdView(Context object, AttributeSet attributeSet, int n3, int n4, boolean bl2) {
        super(object, attributeSet, n3);
        super(this, attributeSet, bl2, n4);
        this.zza = object;
    }

    public BaseAdView(Context object, AttributeSet attributeSet, boolean bl2) {
        super(object, attributeSet);
        super(this, attributeSet, bl2);
        this.zza = object;
    }

    public void destroy() {
        zzbep.zza(this.getContext());
        Object object = (Boolean)zzbgi.zze.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzld;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = zzb.zzb;
                object2 = new zzd(this);
                object.execute((Runnable)object2);
                return;
            }
        }
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    public void loadAd(AdRequest object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(this.getContext());
        Object object2 = (Boolean)zzbgi.zzf.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = zzb.zzb;
                object3 = new zzf(this, (AdRequest)object);
                object2.execute((Runnable)object3);
                return;
            }
        }
        object2 = this.zza;
        object = ((AdRequest)object).zza;
        ((zzea)object2).zzm((zzdx)object);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        View view = this.getChildAt(0);
        if (view != null && (n14 = view.getVisibility()) != (n10 = 8)) {
            n14 = view.getMeasuredWidth();
            n10 = view.getMeasuredHeight();
            n7 = n7 - n3 - n14;
            n8 = n8 - n4 - n10;
            view.layout(n7, n8, n14 += (n7 /= 2), n10 += (n8 /= 2));
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        int n8;
        int n10;
        int n14 = 0;
        Context context = null;
        Object object = this.getChildAt(0);
        if (object != null && (n10 = object.getVisibility()) != (n8 = 8)) {
            this.measureChild((View)object, n3, n4);
            n14 = object.getMeasuredWidth();
            n7 = object.getMeasuredHeight();
        } else {
            try {
                object = this.getAdSize();
            }
            catch (NullPointerException nullPointerException) {
                String string2 = "Unable to retrieve ad size.";
                zzm.zzh(string2, nullPointerException);
                n7 = 0;
                object = null;
            }
            if (object != null) {
                context = this.getContext();
                n10 = ((AdSize)object).getWidthInPixels(context);
                n7 = ((AdSize)object).getHeightInPixels(context);
                n14 = n10;
            } else {
                n7 = 0;
                object = null;
            }
        }
        n10 = this.getSuggestedMinimumWidth();
        n14 = Math.max(n14, n10);
        n10 = this.getSuggestedMinimumHeight();
        n7 = Math.max(n7, n10);
        n3 = View.resolveSize((int)n14, (int)n3);
        n4 = View.resolveSize((int)n7, (int)n4);
        this.setMeasuredDimension(n3, n4);
    }

    public void pause() {
        zzbep.zza(this.getContext());
        Object object = (Boolean)zzbgi.zzg.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzle;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = zzb.zzb;
                object2 = new zze(this);
                object.execute((Runnable)object2);
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbep.zza(this.getContext());
        Object object = (Boolean)zzbgi.zzh.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzlc;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = zzb.zzb;
                object2 = new zzc(this);
                object.execute((Runnable)object2);
                return;
            }
        }
        this.zza.zzp();
    }

    public void setAdListener(AdListener object) {
        zzea zzea2 = this.zza;
        zzea2.zzr((AdListener)object);
        if (object == null) {
            this.zza.zzq(null);
            return;
        }
        boolean bl2 = object instanceof zza;
        if (bl2) {
            zzea2 = this.zza;
            Object object2 = object;
            object2 = (zza)object;
            zzea2.zzq((zza)object2);
        }
        if (bl2 = object instanceof AppEventListener) {
            zzea2 = this.zza;
            object = (AppEventListener)object;
            zzea2.zzv((AppEventListener)object);
        }
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArray = new AdSize[]{adSize};
        this.zza.zzs(adSizeArray);
    }

    public void setAdUnitId(String string2) {
        this.zza.zzu(string2);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }
}

