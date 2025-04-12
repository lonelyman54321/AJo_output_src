/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.search.DynamicHeightSearchAdRequest;
import com.google.android.gms.ads.search.SearchAdRequest;

public final class SearchAdView
extends ViewGroup {
    private final zzea zza;

    public SearchAdView(Context object) {
        super(object);
        super(this);
        this.zza = object;
    }

    public SearchAdView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        super(this, attributeSet, false);
        this.zza = object;
    }

    public SearchAdView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        super(this, attributeSet, false);
        this.zza = object;
    }

    public void destroy() {
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

    public void loadAd(DynamicHeightSearchAdRequest object) {
        Object object2 = AdSize.SEARCH;
        AdSize adSize = this.getAdSize();
        boolean bl2 = ((AdSize)object2).equals(adSize);
        if (bl2) {
            object2 = this.zza;
            object = ((DynamicHeightSearchAdRequest)object).zza();
            ((zzea)object2).zzm((zzdx)object);
            return;
        }
        object = new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        throw object;
    }

    public void loadAd(SearchAdRequest object) {
        zzea zzea2 = this.zza;
        object = ((SearchAdRequest)object).zza();
        zzea2.zzm((zzdx)object);
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
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArray = new AdSize[]{adSize};
        this.zza.zzs(adSizeArray);
    }

    public void setAdUnitId(String string2) {
        this.zza.zzu(string2);
    }
}

