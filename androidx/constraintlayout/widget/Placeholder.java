/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;

public class Placeholder
extends View {
    public int a = -1;
    public View b = null;
    public int c = 4;

    public Placeholder(Context context) {
        super(context);
        this.a(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        int n3 = this.c;
        super.setVisibility(n3);
        this.a = n3 = -1;
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_placeholder;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                int n7 = attributeSet.getIndex(i3);
                if (n7 == (n4 = R$styleable.ConstraintLayout_placeholder_content)) {
                    n4 = this.a;
                    this.a = n7 = attributeSet.getResourceId(n7, n4);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility;
                if (n7 != n4) continue;
                n4 = this.c;
                this.c = n7 = attributeSet.getInt(n7, n4);
            }
            attributeSet.recycle();
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    public final void onDraw(Canvas canvas) {
        int n3 = this.isInEditMode();
        if (n3 != 0) {
            n3 = 223;
            canvas.drawRGB(n3, n3, n3);
            Paint paint = new Paint();
            int n4 = 210;
            paint.setARGB(255, n4, n4, n4);
            Paint.Align align = Paint.Align.CENTER;
            paint.setTextAlign(align);
            align = Typeface.DEFAULT;
            n4 = 0;
            align = Typeface.create((Typeface)align, (int)0);
            paint.setTypeface((Typeface)align);
            align = new Rect();
            canvas.getClipBounds((Rect)align);
            float f5 = align.height();
            paint.setTextSize(f5);
            int n7 = align.height();
            int n8 = align.width();
            Paint.Align align2 = Paint.Align.LEFT;
            paint.setTextAlign(align2);
            String string2 = "?";
            paint.getTextBounds(string2, 0, 1, (Rect)align);
            float f6 = n8;
            n8 = 0x40000000;
            float f7 = 2.0f;
            f6 /= f7;
            float f8 = (float)align.width() / f7;
            f6 -= f8;
            f8 = align.left;
            f6 -= f8;
            f5 = (float)n7 / f7;
            int n10 = align.height();
            f8 = (float)n10 / f7 + f5;
            int n14 = align.bottom;
            float f11 = n14;
            canvas.drawText(string2, f6, f8 -= f11, paint);
        }
    }

    public void setContentId(int n3) {
        View view;
        int n4 = this.a;
        if (n4 == n3) {
            return;
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setVisibility(0);
            ((ConstraintLayout$LayoutParams)this.b.getLayoutParams()).f0 = false;
            n4 = 0;
            view2 = null;
            this.b = null;
        }
        this.a = n3;
        n4 = -1;
        if (n3 != n4 && (view = (view2 = (View)this.getParent()).findViewById(n3)) != null) {
            n4 = 8;
            view.setVisibility(n4);
        }
    }

    public void setEmptyVisibility(int n3) {
        this.c = n3;
    }
}

