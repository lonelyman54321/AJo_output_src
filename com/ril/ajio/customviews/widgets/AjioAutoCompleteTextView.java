/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.ril.ajio.R$color;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;

public class AjioAutoCompleteTextView
extends AppCompatAutoCompleteTextView
implements CustomTextViewImpl {
    public AjioAutoCompleteTextView(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioAutoCompleteTextView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public void initField(Context object, AttributeSet attributeSet) {
        object = MainWidgetManager.getInstance().getFontsManager();
        attributeSet = this.getContext();
        int n3 = R$color.font_title1_dark_gray;
        int n4 = ((FontsManager)object).getColor((Context)attributeSet, n3);
        this.setTextColor(n4);
        this.setImeOptions(-1 << -1);
    }
}

