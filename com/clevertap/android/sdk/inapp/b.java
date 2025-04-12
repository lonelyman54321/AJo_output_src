/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.view.View$OnClickListener
 *  android.view.WindowManager
 *  android.widget.Button
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.a$a;

public abstract class b
extends CTInAppBaseFullFragment {
    public final void cb(Button button, CTInAppNotificationButton paint, int n3) {
        Button button2 = button;
        Paint paint2 = paint;
        int n4 = 7;
        int n7 = 6;
        int n8 = 5;
        int n10 = 4;
        int n14 = 3;
        int n15 = 2;
        int n16 = 8;
        int n17 = 1;
        if (paint != null) {
            Object object;
            Object object2;
            button.setVisibility(0);
            Object object3 = n3;
            button.setTag(object3);
            object3 = paint.f;
            button.setText((CharSequence)object3);
            int n18 = Color.parseColor((String)paint.g);
            button.setTextColor(n18);
            object3 = new a$a(this);
            button.setOnClickListener((View.OnClickListener)object3);
            object3 = paint.c;
            n18 = (int)(((String)object3).isEmpty() ? 1 : 0);
            if (n18 == 0) {
                int n19;
                float f5;
                int n20;
                object3 = paint.c;
                float f6 = Float.parseFloat((String)object3);
                Context context = this.c;
                Object object4 = "window";
                if ((context = (WindowManager)context.getSystemService((String)object4)) == null) {
                    n20 = 0;
                    f5 = 0.0f;
                    object2 = null;
                } else {
                    n19 = Build.VERSION.SDK_INT;
                    n20 = 30;
                    f5 = 4.2E-44f;
                    if (n19 >= n20) {
                        object2 = this.c.getResources().getConfiguration();
                        n20 = object2.densityDpi;
                    } else {
                        object2 = new DisplayMetrics();
                        context = context.getDefaultDisplay();
                        context.getMetrics(object2);
                        n20 = object2.densityDpi;
                    }
                }
                f5 = n20;
                float f7 = 480.0f / f5 * f6;
                n18 = 0x40000000;
                f6 = 2.0f;
                object4 = new float[n16];
                object4[0] = f7 *= f6;
                object4[n17] = f7;
                object4[n15] = f7;
                object4[n14] = f7;
                object4[n10] = f7;
                object4[n8] = f7;
                object4[n7] = f7;
                object4[n4] = f7;
                Object object5 = object = (Object)new float[n16];
                object5[0] = 0.0f;
                object5[1] = 0.0f;
                object5[2] = 0.0f;
                object5[3] = 0.0f;
                object5[4] = 0.0f;
                object5[5] = 0.0f;
                object5[6] = 0.0f;
                object5[7] = 0.0f;
                object2 = new RoundRectShape((float[])object4, null, (float[])object);
                object3 = new ShapeDrawable((Shape)object2);
                object = object3.getPaint();
                n7 = Color.parseColor((String)paint2.a);
                object.setColor(n7);
                object = object3.getPaint();
                Paint.Style style2 = Paint.Style.FILL;
                object.setStyle(style2);
                object3.getPaint().setAntiAlias(n17 != 0);
                object2 = new float[n16];
                object2[0] = (DisplayMetrics)f7;
                object2[n17] = (DisplayMetrics)f7;
                object2[n15] = (DisplayMetrics)f7;
                object2[n14] = (DisplayMetrics)f7;
                object2[n10] = (DisplayMetrics)f7;
                object2[n8] = (DisplayMetrics)f7;
                n19 = 6;
                object2[n19] = (DisplayMetrics)f7;
                int n21 = 7;
                object2[n21] = (DisplayMetrics)f7;
                float[] fArray = new float[n16];
                fArray[0] = f7;
                fArray[n17] = f7;
                fArray[n15] = f7;
                fArray[n14] = f7;
                fArray[n10] = f7;
                fArray[n8] = f7;
                fArray[n19] = f7;
                fArray[n21] = f7;
                n8 = 0;
                style2 = new RoundRectShape((float[])object2, null, fArray);
                object = new ShapeDrawable((Shape)style2);
                object2 = object;
            } else {
                n8 = 0;
                n18 = 0;
                object3 = null;
                float f8 = 0.0f;
                boolean bl2 = false;
                object2 = null;
                float f11 = 0.0f;
            }
            object = paint2.b;
            n4 = (int)(((String)object).isEmpty() ? 1 : 0);
            if (n4 == 0 && object2 != null) {
                object = object2.getPaint();
                int n22 = Color.parseColor((String)paint2.b);
                object.setColor(n22);
                object2.setPadding(n17, n17, n17, n17);
                paint2 = object2.getPaint();
                object = Paint.Style.FILL;
                paint2.setStyle((Paint.Style)object);
            }
            if (object3 != null) {
                paint2 = new Drawable[n15];
                paint2[0] = object2;
                paint2[n17] = object3;
                object = new LayerDrawable((Drawable[])paint2);
                button2.setBackground((Drawable)object);
            }
        } else {
            button.setVisibility(n16);
        }
    }
}

