/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.Button
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R$color;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;

public final class zaaa
extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int n3, int n4, int n7, int n8) {
        if (n3 != 0) {
            n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    return n8;
                }
                String string2 = hj0_0.a(n3, "Unknown color scheme: ");
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            return n7;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zaa(Resources object, int n3, int n4) {
        int n7;
        int n8;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.setTypeface(typeface);
        this.setTextSize(14.0f);
        typeface = object.getDisplayMetrics();
        float f5 = typeface.density * 48.0f;
        float f6 = 0.5f;
        int n10 = (int)(f5 += f6);
        this.setMinHeight(n10);
        this.setMinWidth(n10);
        n10 = R$drawable.common_google_signin_btn_icon_dark;
        int n14 = R$drawable.common_google_signin_btn_icon_light;
        n10 = zaaa.zab(n8, n10, n14, n14);
        n14 = R$drawable.common_google_signin_btn_text_dark;
        int n15 = R$drawable.common_google_signin_btn_text_light;
        n14 = zaaa.zab(n8, n14, n15, n15);
        String string2 = "Unknown button size: ";
        int n16 = 2;
        int n17 = 1;
        if (n7 != 0 && n7 != n17) {
            if (n7 != n16) {
                String string3 = hj0_0.a(n7, string2);
                IllegalStateException illegalStateException = new IllegalStateException(string3);
                throw illegalStateException;
            }
        } else {
            n10 = n14;
        }
        typeface = ut0_0.h(object.getDrawable(n10));
        n14 = R$color.common_google_signin_btn_tint;
        ColorStateList colorStateList = object.getColorStateList(n14);
        typeface.setTintList(colorStateList);
        colorStateList = PorterDuff.Mode.SRC_ATOP;
        typeface.setTintMode((PorterDuff.Mode)colorStateList);
        this.setBackgroundDrawable((Drawable)typeface);
        n10 = R$color.common_google_signin_btn_text_dark;
        n14 = R$color.common_google_signin_btn_text_light;
        n8 = zaaa.zab(n8, n10, n14, n14);
        ColorStateList colorStateList2 = (ColorStateList)Preconditions.checkNotNull(object.getColorStateList(n8));
        this.setTextColor(colorStateList2);
        n8 = 0;
        colorStateList2 = null;
        if (n7 != 0) {
            if (n7 != n17) {
                if (n7 != n16) {
                    String string4 = hj0_0.a(n7, string2);
                    IllegalStateException illegalStateException = new IllegalStateException(string4);
                    throw illegalStateException;
                }
                this.setText(null);
            } else {
                n7 = R$string.common_signin_button_text_long;
                String string5 = object.getString(n7);
                this.setText(string5);
            }
        } else {
            n7 = R$string.common_signin_button_text;
            String string6 = object.getString(n7);
            this.setText(string6);
        }
        this.setTransformationMethod(null);
        Context context = this.getContext();
        int n18 = DeviceProperties.isWearable(context);
        if (n18 != 0) {
            n18 = 19;
            this.setGravity(n18);
        }
    }
}

