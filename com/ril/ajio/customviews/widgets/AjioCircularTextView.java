/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;

public class AjioCircularTextView
extends AppCompatTextView
implements CustomTextViewImpl {
    private int backGroundColor;

    public AjioCircularTextView(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioCircularTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioCircularTextView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        int n3 = this.backGroundColor;
        paint.setColor(n3);
        n3 = 1;
        float f5 = Float.MIN_VALUE;
        paint.setFlags(n3);
        Paint paint2 = new Paint();
        int n4 = this.backGroundColor;
        paint2.setColor(n4);
        paint2.setFlags(n3);
        n3 = this.getHeight();
        n4 = this.getWidth();
        if (n3 <= n4) {
            n3 = n4;
        }
        float f6 = (float)n3 / 2.0f;
        this.setHeight(n3);
        this.setWidth(n3);
        f5 = n3 / 2;
        canvas.drawCircle(f5, f5, f6, paint2);
        canvas.drawCircle(f5, f5, f6, paint);
        super.draw(canvas);
    }

    public void initField(Context context, AttributeSet object) {
        context = context.getTheme();
        Object object2 = R$styleable.ajioCircularStylable;
        context = context.obtainStyledAttributes((AttributeSet)object, (int[])object2, 0, 0);
        object = MainWidgetManager.getInstance().getFontsManager();
        object2 = this.getContext();
        int n3 = ((FontsManager)object).getColor((Context)object2, 17170444);
        object2 = MainWidgetManager.getInstance().getFontsManager();
        Context context2 = this.getContext();
        int n4 = ((FontsManager)object2).getColor(context2, 17170443);
        int n7 = R$styleable.ajioCircularStylable_totalBackground;
        this.backGroundColor = n4 = context.getColor(n7, n4);
        n4 = R$styleable.ajioCircularStylable_fontColor;
        int n8 = context.getColor(n4, n3);
        this.setTextColor(n8);
    }
}

