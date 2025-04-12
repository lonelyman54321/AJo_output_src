/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.zzb;
import com.google.android.gms.ads.nativead.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhz;

public final class NativeAdView
extends FrameLayout {
    private final FrameLayout zza;
    private final zzbhz zzb;

    public NativeAdView(Context object) {
        super(object);
        object = this.zzd((Context)object);
        this.zza = object;
        object = this.zze();
        this.zzb = object;
    }

    public NativeAdView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        object = this.zzd((Context)object);
        this.zza = object;
        object = this.zze();
        this.zzb = object;
    }

    public NativeAdView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        object = this.zzd((Context)object);
        this.zza = object;
        object = this.zze();
        this.zzb = object;
    }

    public NativeAdView(Context object, AttributeSet attributeSet, int n3, int n4) {
        super(object, attributeSet, n3, n4);
        object = this.zzd((Context)object);
        this.zza = object;
        object = this.zze();
        this.zzb = object;
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int n3 = -1;
        context = new FrameLayout.LayoutParams(n3, n3);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)context);
        this.addView((View)frameLayout);
        return frameLayout;
    }

    private final zzbhz zze() {
        boolean bl2 = this.isInEditMode();
        if (bl2) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        zzaw zzaw2 = zzay.zza();
        Context context = frameLayout.getContext();
        return zzaw2.zzh(context, this, frameLayout);
    }

    private final void zzf(String string2, View object) {
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        try {
            object = ObjectWrapper.wrap(object);
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to call setAssetView on delegate", remoteException);
            return;
        }
        zzbhz2.zzdv(string2, (IObjectWrapper)object);
    }

    public final void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n3, layoutParams);
        view = this.zza;
        super.bringChildToFront(view);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront((View)frameLayout);
        }
    }

    public void destroy() {
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        try {
            zzbhz2.zzc();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to destroy native ad view", remoteException);
            return;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object object = this.zzb;
        if (object != null) {
            object = zzbep.zzlA;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            if (bl2) {
                object = this.zzb;
                object2 = ObjectWrapper.wrap(motionEvent);
                try {
                    object.zzd((IObjectWrapper)object2);
                }
                catch (RemoteException remoteException) {
                    object2 = "Unable to call handleTouchEvent on delegate";
                    zzm.zzh((String)object2, remoteException);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View view = this.zza("3011");
        boolean bl2 = view instanceof AdChoicesView;
        if (bl2) {
            return (AdChoicesView)view;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return this.zza("3005");
    }

    public final View getBodyView() {
        return this.zza("3004");
    }

    public final View getCallToActionView() {
        return this.zza("3002");
    }

    public final View getHeadlineView() {
        return this.zza("3001");
    }

    public final View getIconView() {
        return this.zza("3003");
    }

    public final View getImageView() {
        return this.zza("3008");
    }

    public final MediaView getMediaView() {
        Object object = this.zza("3010");
        boolean bl2 = object instanceof MediaView;
        if (bl2) {
            return (MediaView)((Object)object);
        }
        if (object != null) {
            object = "View is not an instance of MediaView";
            zzm.zze((String)object);
        }
        return null;
    }

    public final View getPriceView() {
        return this.zza("3007");
    }

    public final View getStarRatingView() {
        return this.zza("3009");
    }

    public final View getStoreView() {
        return this.zza("3006");
    }

    public final void onVisibilityChanged(View object, int n3) {
        super.onVisibilityChanged(object, n3);
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        try {
            object = ObjectWrapper.wrap(object);
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to call onVisibilityChanged on delegate", remoteException);
            return;
        }
        zzbhz2.zze((IObjectWrapper)object, n3);
    }

    public final void removeAllViews() {
        super.removeAllViews();
        FrameLayout frameLayout = this.zza;
        this.addView((View)frameLayout);
    }

    public final void removeView(View view) {
        FrameLayout frameLayout = this.zza;
        if (frameLayout == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        this.zzf("3011", (View)adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        this.zzf("3005", view);
    }

    public final void setBodyView(View view) {
        this.zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        this.zzf("3002", view);
    }

    public final void setClickConfirmingView(View object) {
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        try {
            object = ObjectWrapper.wrap(object);
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", remoteException);
            return;
        }
        zzbhz2.zzdw((IObjectWrapper)object);
    }

    public final void setHeadlineView(View view) {
        this.zzf("3001", view);
    }

    public final void setIconView(View view) {
        this.zzf("3003", view);
    }

    public final void setImageView(View view) {
        this.zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        Object object = "3010";
        this.zzf((String)object, (View)mediaView);
        if (mediaView == null) {
            return;
        }
        object = new zzb(this);
        mediaView.zza((zzb)object);
        object = new zzc(this);
        mediaView.zzb((zzc)object);
    }

    public void setNativeAd(NativeAd object) {
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        try {
            object = ((NativeAd)object).zza();
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to call setNativeAd on delegate", remoteException);
            return;
        }
        zzbhz2.zzdz((IObjectWrapper)object);
    }

    public final void setPriceView(View view) {
        this.zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        this.zzf("3009", view);
    }

    public final void setStoreView(View view) {
        this.zzf("3006", view);
    }

    public final View zza(String object) {
        block5: {
            Object object2 = this.zzb;
            if (object2 != null) {
                object = object2.zzb((String)object);
                if (object == null) break block5;
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                try {
                    return (View)object;
                }
                catch (RemoteException remoteException) {
                    object2 = "Unable to call getAssetView on delegate";
                    zzm.zzh((String)object2, remoteException);
                }
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzb(MediaContent object) {
        RemoteException remoteException2;
        zzbhz zzbhz2 = this.zzb;
        if (zzbhz2 == null) {
            return;
        }
        boolean bl2 = object instanceof zzep;
        if (bl2) {
            try {
                object = (zzep)object;
                object = ((zzep)object).zzc();
                zzbhz2.zzdx((zzbhs)object);
                return;
            }
            catch (RemoteException remoteException2) {}
        } else {
            if (object == null) {
                object = null;
                zzbhz2.zzdx(null);
                return;
            }
            object = "Use MediaContent provided by NativeAd.getMediaContent";
            zzm.zze((String)object);
            return;
        }
        zzm.zzh("Unable to call setMediaContent on delegate", remoteException2);
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType object) {
        Object object2 = this.zzb;
        if (object2 != null && object != null) {
            object = ObjectWrapper.wrap(object);
            try {
                object2.zzdy((IObjectWrapper)object);
                return;
            }
            catch (RemoteException remoteException) {
                object2 = "Unable to call setMediaViewImageScaleType on delegate";
                zzm.zzh((String)object2, remoteException);
            }
        }
    }
}

