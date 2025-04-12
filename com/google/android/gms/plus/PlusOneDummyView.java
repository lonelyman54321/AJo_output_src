/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.FrameLayout
 */
package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.plus.PlusOneDummyView$zza;
import com.google.android.gms.plus.PlusOneDummyView$zzc;

public class PlusOneDummyView
extends FrameLayout {
    public static final String TAG = "PlusOneDummyView";

    public PlusOneDummyView(Context object, int n3) {
        super((Context)object);
        float f5;
        float f6;
        int n4;
        Button button = new Button((Context)object);
        int n7 = 0;
        button.setEnabled(false);
        Context context = this.getContext();
        int n8 = 0;
        super(context, null);
        int n10 = object.isValid();
        if (n10 == 0) {
            context = this.getContext();
            object = new PlusOneDummyView$zzc(context, null);
        }
        if ((n10 = object.isValid()) == 0) {
            context = this.getContext();
            object = new PlusOneDummyView$zza(context, null);
        }
        object = object.getDrawable(n3);
        button.setBackgroundDrawable((Drawable)object);
        object = new Point();
        n10 = 24;
        float f7 = 3.4E-44f;
        n8 = 1;
        if (n3 != 0) {
            n4 = 20;
            f6 = 2.8E-44f;
            if (n3 != n8) {
                int n14 = 2;
                if (n3 != n14) {
                    n3 = 38;
                    f5 = 5.3E-44f;
                    n10 = 38;
                    f7 = 5.3E-44f;
                    n4 = 24;
                    f6 = 3.4E-44f;
                } else {
                    n10 = 50;
                    f7 = 7.0E-44f;
                }
            } else {
                n10 = 32;
                f7 = 4.5E-44f;
            }
        } else {
            n3 = 14;
            f5 = 2.0E-44f;
            n4 = 14;
            f6 = 2.0E-44f;
        }
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        f7 = n10;
        f7 = TypedValue.applyDimension((int)n8, (float)f7, (DisplayMetrics)displayMetrics);
        f6 = n4;
        f5 = TypedValue.applyDimension((int)n8, (float)f6, (DisplayMetrics)displayMetrics);
        double d2 = f7;
        double d5 = 0.5;
        ((Point)object).x = n10 = (int)(d2 + d5);
        ((Point)object).y = n3 = (int)((double)f5 + d5);
        n10 = ((Point)object).x;
        n7 = ((Point)object).y;
        super(n10, n7, 17);
        this.addView((View)button, (ViewGroup.LayoutParams)displayMetrics);
    }
}

