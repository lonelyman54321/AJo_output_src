/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatToggleButton;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.customviews.widgets.managers.FontsManager;

public class PEToggleButton
extends AppCompatToggleButton {
    public PEToggleButton(Context context) {
        super(context);
        this.setSpanText();
    }

    public PEToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setSpanText();
    }

    public PEToggleButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.setSpanText();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.setSpanText();
    }

    public void setSpanText() {
        FontsManager fontsManager = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        fontsManager = fontsManager.getTypefaceWithFont((Context)aJIOApplication, 10);
        this.setTypeface((Typeface)fontsManager);
    }
}

