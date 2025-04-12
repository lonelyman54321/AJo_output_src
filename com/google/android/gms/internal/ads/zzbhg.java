/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhi;

public final class zzbhg
extends RelativeLayout {
    private static final float[] zza;
    private AnimationDrawable zzb;

    static {
        float[] fArray;
        float[] fArray2 = fArray = new float[8];
        float[] fArray3 = fArray;
        fArray2[0] = 5.0f;
        fArray3[1] = 5.0f;
        fArray2[2] = 5.0f;
        fArray3[3] = 5.0f;
        fArray2[4] = 5.0f;
        fArray3[5] = 5.0f;
        fArray2[6] = 5.0f;
        fArray3[7] = 5.0f;
        zza = fArray;
    }

    public zzbhg(Context object, zzbhf zzbhf2, RelativeLayout.LayoutParams object2) {
        super((Context)object);
        Preconditions.checkNotNull(zzbhf2);
        Object object3 = zza;
        Object object4 = new RoundRectShape(object3, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)object4);
        object4 = shapeDrawable.getPaint();
        int n3 = zzbhf2.zzd();
        object4.setColor(n3);
        this.setLayoutParams((ViewGroup.LayoutParams)object2);
        this.setBackground((Drawable)shapeDrawable);
        int n4 = -2;
        object2 = new RelativeLayout.LayoutParams(n4, n4);
        object4 = zzbhf2.zzg();
        int n7 = TextUtils.isEmpty((CharSequence)object4);
        n3 = 0;
        object3 = null;
        int n8 = 1;
        if (n7 == 0) {
            super(n4, n4);
            super((Context)object);
            shapeDrawable.setLayoutParams((ViewGroup.LayoutParams)object4);
            shapeDrawable.setId(1195835393);
            object4 = Typeface.DEFAULT;
            shapeDrawable.setTypeface((Typeface)object4);
            object4 = zzbhf2.zzg();
            shapeDrawable.setText((CharSequence)object4);
            n7 = zzbhf2.zze();
            shapeDrawable.setTextColor(n7);
            float f5 = zzbhf2.zzf();
            shapeDrawable.setTextSize(f5);
            zzay.zzb();
            n7 = 4;
            f5 = 5.6E-45f;
            int n10 = zzf.zzy((Context)object, n7);
            zzay.zzb();
            n7 = zzf.zzy((Context)object, n7);
            shapeDrawable.setPadding(n10, 0, n7, 0);
            this.addView((View)shapeDrawable);
            n4 = shapeDrawable.getId();
            object2.addRule(n8, n4);
        }
        super((Context)object);
        shapeDrawable.setLayoutParams((ViewGroup.LayoutParams)object2);
        int n14 = 1195835394;
        shapeDrawable.setId(n14);
        object = zzbhf2.zzi();
        object2 = "Error while getting drawable.";
        if (object != null && (n7 = object.size()) > n8) {
            super();
            this.zzb = object4;
            object = object.iterator();
            while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object4 = (zzbhi)object.next();
                object4 = ((zzbhi)object4).zzf();
                object4 = ObjectWrapper.unwrap((IObjectWrapper)object4);
                object4 = (Drawable)object4;
                object3 = this.zzb;
                n8 = zzbhf2.zzb();
                try {
                    object3.addFrame((Drawable)object4, n8);
                }
                catch (Exception exception) {
                    zzm.zzh((String)object2, exception);
                }
            }
            object = this.zzb;
            shapeDrawable.setBackground((Drawable)object);
        } else {
            int n15 = object.size();
            if (n15 == n8) {
                object = object.get(0);
                object = (zzbhi)object;
                object = ((zzbhi)object).zzf();
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                object = (Drawable)object;
                try {
                    shapeDrawable.setImageDrawable((Drawable)object);
                }
                catch (Exception exception) {
                    zzm.zzh((String)object2, exception);
                }
            }
        }
        this.addView((View)shapeDrawable);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

