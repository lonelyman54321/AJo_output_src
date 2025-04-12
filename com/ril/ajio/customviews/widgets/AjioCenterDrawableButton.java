/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;

public class AjioCenterDrawableButton
extends LinearLayout
implements CustomTextViewImpl {
    private ImageView internal_right_drawable;
    private AjioTextView internal_textview;

    public AjioCenterDrawableButton(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioCenterDrawableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioCenterDrawableButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public AjioCenterDrawableButton(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        this.initField(context, attributeSet);
    }

    public String getFontText() {
        return this.internal_textview.getText().toString();
    }

    public AjioTextView getInternal_textview() {
        return this.internal_textview;
    }

    public void initField(Context context, AttributeSet attributeSet) {
        AjioTextView ajioTextView;
        AjioCenterDrawableButton ajioCenterDrawableButton = this;
        Object object = context.getTheme();
        int[] nArray = R$styleable.ajioCenterDrawableButtonStylable;
        ImageView imageView = null;
        AttributeSet attributeSet2 = attributeSet;
        object = object.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n3 = R$styleable.ajioCenterDrawableButtonStylable_fontSize;
        int n4 = 0;
        attributeSet2 = null;
        float f5 = object.getDimension(n3, 0.0f);
        int n7 = R$styleable.ajioCenterDrawableButtonStylable_fontText;
        String string2 = object.getString(n7);
        int n8 = R$styleable.ajioCenterDrawableButtonStylable_toUnderline;
        n8 = (int)(object.getBoolean(n8, false) ? 1 : 0);
        int n10 = R$styleable.ajioCenterDrawableButtonStylable_fontAllCaps;
        n10 = (int)(object.getBoolean(n10, false) ? 1 : 0);
        FontsManager fontsManager = MainWidgetManager.getInstance().getFontsManager();
        Context context2 = this.getContext();
        int n14 = fontsManager.getColor(context2, 17170444);
        int n15 = R$styleable.ajioCenterDrawableButtonStylable_fontColor;
        n14 = object.getColor(n15, n14);
        n15 = R$styleable.ajioCenterDrawableButtonStylable_leftDrawableReference;
        context2 = object.getDrawable(n15);
        int n16 = R$styleable.ajioCenterDrawableButtonStylable_rightDrawableReference;
        Drawable drawable2 = object.getDrawable(n16);
        int n17 = R$styleable.ajioCenterDrawableButtonStylable_leftDrawableRightPadding;
        float f6 = object.getDimension(n17, 0.0f);
        n17 = (int)f6;
        int n18 = R$styleable.ajioCenterDrawableButtonStylable_rightDrawableLeftPadding;
        float f7 = object.getDimension(n18, 0.0f);
        n18 = (int)f7;
        int n19 = R$styleable.ajioCenterDrawableButtonStylable_leftDrawableHeight;
        float f8 = object.getDimension(n19, 0.0f);
        n19 = (int)f8;
        int n20 = R$styleable.ajioCenterDrawableButtonStylable_leftDrawableWidth;
        float f11 = object.getDimension(n20, 0.0f);
        n20 = (int)f11;
        int n21 = R$styleable.ajioCenterDrawableButtonStylable_rightDrawableHeight;
        float f12 = object.getDimension(n21, 0.0f);
        n21 = (int)f12;
        int n22 = R$styleable.ajioCenterDrawableButtonStylable_rightDrawableWidth;
        float f14 = object.getDimension(n22, 0.0f);
        n22 = (int)f14;
        if (context2 != null) {
            context2.mutate();
        }
        if (drawable2 != null) {
            drawable2.mutate();
        }
        attributeSet2 = LayoutInflater.from((Context)context);
        Resources.Theme theme = object;
        int n24 = R$layout.ajio_center_drawable_button;
        int n25 = n8;
        object = (LinearLayout)attributeSet2.inflate(n24, (ViewGroup)ajioCenterDrawableButton, true);
        n4 = R$id.ajio_center_drawable_button_center_layout;
        object = (LinearLayout)object.findViewById(n4);
        n4 = R$id.internal_left_drawable;
        attributeSet2 = (ImageView)object.findViewById(n4);
        n8 = R$id.internal_textview;
        ajioCenterDrawableButton.internal_textview = ajioTextView = (AjioTextView)object.findViewById(n8);
        n8 = R$id.internal_right_drawable;
        object = (ImageView)object.findViewById(n8);
        ajioCenterDrawableButton.internal_right_drawable = object;
        attributeSet2.setImageDrawable((Drawable)context2);
        n24 = 8;
        if (context2 != null) {
            n8 = 0;
            ajioTextView = null;
            attributeSet2.setVisibility(0);
        } else {
            n8 = 0;
            ajioTextView = null;
            attributeSet2.setVisibility(n24);
        }
        if (n19 > 0 && n20 > 0) {
            context2 = new LinearLayout.LayoutParams(n20, n19);
            context2.setMargins(0, 0, n17, 0);
            attributeSet2.setLayoutParams((ViewGroup.LayoutParams)context2);
        }
        attributeSet2 = ajioCenterDrawableButton.internal_right_drawable;
        attributeSet2.setImageDrawable(drawable2);
        if (drawable2 != null) {
            object = ajioCenterDrawableButton.internal_right_drawable;
            object.setVisibility(0);
        } else {
            attributeSet2 = ajioCenterDrawableButton.internal_right_drawable;
            attributeSet2.setVisibility(n24);
        }
        if (n21 > 0 && n22 > 0) {
            object = new LinearLayout.LayoutParams(n22, n21);
            object.setMargins(n18, 0, 0, 0);
            imageView = ajioCenterDrawableButton.internal_right_drawable;
            imageView.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        object = null;
        float f15 = f5 - 0.0f;
        n24 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
        if (n24 > 0) {
            object = ajioCenterDrawableButton.internal_textview;
            ((AppCompatTextView)object).setTextSize(0, f5);
        }
        object = ajioCenterDrawableButton.internal_textview;
        object.setTextColor(n14);
        if (string2 != null && (n24 = (int)(string2.isEmpty() ? 1 : 0)) == 0) {
            object = ajioCenterDrawableButton.internal_textview;
            if (n10 != 0) {
                string2 = string2.toUpperCase();
            }
            object.setText((CharSequence)string2);
        }
        if (n25 != 0) {
            object = ajioCenterDrawableButton.internal_textview;
            ((AjioTextView)object).underlineText();
        }
        theme.recycle();
    }

    public void setFontText(String string2) {
        this.internal_textview.setText(string2);
    }

    public void setInternal_right_drawable(Drawable drawable2) {
        this.internal_right_drawable.setImageDrawable(drawable2);
    }
}

