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
import androidx.appcompat.widget.AppCompatEditText;
import com.ril.ajio.R$attr;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;
import kotlin.jvm.internal.Intrinsics;

public class AjioEditText
extends AppCompatEditText
implements CustomTextViewImpl {
    public AjioEditText(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioEditText(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public void initField(Context context, AttributeSet object) {
        int n3 = R$attr.facet_edit_text_color;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int n4 = tm3_0.b(n3, context);
        object = MainWidgetManager.getInstance().getFontsManager();
        Context context2 = this.getContext();
        n4 = ((FontsManager)object).getColor(context2, n4);
        this.setTextColor(n4);
        this.setHintTextColor(n4);
        this.setImeOptions(-1 << -1);
    }
}

