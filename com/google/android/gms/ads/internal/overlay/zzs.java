/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageButton
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R$drawable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

public final class zzs
extends FrameLayout
implements View.OnClickListener {
    private final ImageButton zza;
    private final zzae zzb;

    public zzs(Context object, zzr object2, zzae zzae2) {
        super((Context)object);
        this.zzb = zzae2;
        this.setOnClickListener(this);
        super((Context)object);
        this.zza = zzae2;
        this.zzc();
        zzae2.setBackgroundColor(0);
        zzae2.setOnClickListener(this);
        zzay.zzb();
        int n3 = ((zzr)object2).zza;
        n3 = zzf.zzy((Context)object, n3);
        zzay.zzb();
        int n4 = zzf.zzy((Context)object, 0);
        zzay.zzb();
        int n7 = ((zzr)object2).zzb;
        n7 = zzf.zzy((Context)object, n7);
        zzay.zzb();
        int n8 = ((zzr)object2).zzc;
        n8 = zzf.zzy((Context)object, n8);
        zzae2.setPadding(n3, n4, n7, n8);
        zzae2.setContentDescription("Interstitial close button");
        zzay.zzb();
        n3 = ((zzr)object2).zzd;
        n7 = ((zzr)object2).zza;
        n3 += n7;
        n7 = ((zzr)object2).zzb;
        n3 += n7;
        n3 = zzf.zzy((Context)object, n3);
        zzay.zzb();
        n7 = ((zzr)object2).zzd;
        int n10 = ((zzr)object2).zzc;
        int n14 = zzf.zzy((Context)object, n7 += n10);
        n10 = 17;
        Object object3 = new FrameLayout.LayoutParams(n3, n14, n10);
        this.addView((View)zzae2, (ViewGroup.LayoutParams)object3);
        object = zzbep.zzbd;
        object2 = zzba.zzc();
        object = (Long)((zzben)object2).zza((zzbeg)object);
        long l2 = (Long)object;
        long l3 = 0L;
        n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n7 <= 0) {
            return;
        }
        object3 = zzbep.zzbe;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        n4 = (int)(object3.booleanValue() ? 1 : 0);
        if (n4 != 0) {
            super(this);
        } else {
            n4 = 0;
            object3 = null;
        }
        zzae2.setAlpha(0.0f);
        zzae2.animate().alpha(1.0f).setDuration(l2).setListener((Animator.AnimatorListener)object3);
    }

    public static /* bridge */ /* synthetic */ ImageButton zza(zzs zzs2) {
        return zzs2.zza;
    }

    private final void zzc() {
        Object object = zzbep.zzbc;
        Object object2 = zzba.zzc();
        object = (String)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = PlatformVersion.isAtLeastLollipop();
        int n3 = 17301527;
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object)) && !(bl2 = ((String)(object2 = "default")).equals(object))) {
            object2 = zzu.zzo().zze();
            if (object2 != null) {
                Drawable drawable2;
                block11: {
                    String string2;
                    block10: {
                        drawable2 = null;
                        string2 = "white";
                        boolean bl3 = string2.equals(object);
                        if (!bl3) break block10;
                        int n4 = R$drawable.admob_close_button_white_circle_black_cross;
                        drawable2 = object2.getDrawable(n4);
                    }
                    string2 = "black";
                    int n7 = string2.equals(object);
                    if (n7 == 0) break block11;
                    n7 = R$drawable.admob_close_button_black_circle_white_cross;
                    try {
                        drawable2 = object2.getDrawable(n7);
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        object = "Close button resource not found, falling back to default.";
                        zzm.zze((String)object);
                    }
                }
                if (drawable2 == null) {
                    this.zza.setImageResource(n3);
                    return;
                }
                this.zza.setImageDrawable(drawable2);
                object = this.zza;
                object2 = ImageView.ScaleType.CENTER;
                object.setScaleType((ImageView.ScaleType)object2);
                return;
            }
            this.zza.setImageResource(n3);
            return;
        }
        this.zza.setImageResource(n3);
    }

    public final void onClick(View object) {
        object = this.zzb;
        if (object != null) {
            object.zzj();
        }
    }

    public final void zzb(boolean n3) {
        if (n3 != 0) {
            Object object = this.zza;
            int n4 = 8;
            object.setVisibility(n4);
            object = zzbep.zzbd;
            zzben zzben2 = zzba.zzc();
            object = (Long)zzben2.zza((zzbeg)object);
            long l2 = (Long)object;
            long l3 = 0L;
            n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (n3 > 0) {
                this.zza.animate().cancel();
                object = this.zza;
                object.clearAnimation();
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}

