/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;

public class MockView
extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public boolean e;
    public String f;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;

    public MockView(Context context) {
        super(context);
        int n3;
        Rect rect;
        boolean bl2;
        Paint paint;
        this.a = paint = new Paint();
        this.b = paint = new Paint();
        this.c = paint = new Paint();
        this.d = bl2 = true;
        this.e = bl2;
        this.f = null;
        this.g = rect = new Rect();
        int n4 = 255;
        this.h = n3 = Color.argb((int)n4, (int)0, (int)0, (int)0);
        n3 = 200;
        this.i = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        n3 = 50;
        this.j = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        this.k = 4;
        this.a(context, null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        Paint paint;
        this.a = paint = new Paint();
        this.b = paint = new Paint();
        this.c = paint = new Paint();
        this.d = n3 = 1;
        this.e = n3;
        this.f = null;
        super();
        this.g = paint;
        int n4 = 255;
        this.h = n3 = Color.argb((int)n4, (int)0, (int)0, (int)0);
        n3 = 200;
        this.i = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        n3 = 50;
        this.j = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        this.k = 4;
        this.a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        Paint paint;
        this.a = paint = new Paint();
        this.b = paint = new Paint();
        this.c = paint = new Paint();
        n3 = 1;
        this.d = n3;
        this.e = n3;
        this.f = null;
        super();
        this.g = paint;
        int n4 = 255;
        this.h = n3 = Color.argb((int)n4, (int)0, (int)0, (int)0);
        n3 = 200;
        this.i = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        n3 = 50;
        this.j = n3 = Color.argb((int)n4, (int)n3, (int)n3, (int)n3);
        this.k = 4;
        this.a(context, attributeSet);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context object, AttributeSet object2) {
        int n3;
        String string2;
        void var2_6;
        if (var2_6 != null) {
            int[] nArray = R$styleable.MockView;
            TypedArray typedArray = object.obtainStyledAttributes((AttributeSet)var2_6, nArray);
            int n4 = typedArray.getIndexCount();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                int n8 = typedArray.getIndex(i3);
                if (n8 == (n7 = R$styleable.MockView_mock_label)) {
                    String string3;
                    this.f = string3 = typedArray.getString(n8);
                    continue;
                }
                n7 = R$styleable.MockView_mock_showDiagonals;
                if (n8 == n7) {
                    n7 = (int)(this.d ? 1 : 0);
                    n8 = (int)(typedArray.getBoolean(n8, n7 != 0) ? 1 : 0);
                    this.d = n8;
                    continue;
                }
                n7 = R$styleable.MockView_mock_diagonalsColor;
                if (n8 == n7) {
                    n7 = this.h;
                    this.h = n8 = typedArray.getColor(n8, n7);
                    continue;
                }
                n7 = R$styleable.MockView_mock_labelBackgroundColor;
                if (n8 == n7) {
                    n7 = this.j;
                    this.j = n8 = typedArray.getColor(n8, n7);
                    continue;
                }
                n7 = R$styleable.MockView_mock_labelColor;
                if (n8 == n7) {
                    n7 = this.i;
                    this.i = n8 = typedArray.getColor(n8, n7);
                    continue;
                }
                n7 = R$styleable.MockView_mock_showLabel;
                if (n8 != n7) continue;
                n7 = (int)(this.e ? 1 : 0);
                n8 = (int)(typedArray.getBoolean(n8, n7 != 0) ? 1 : 0);
                this.e = n8;
            }
            typedArray.recycle();
        }
        if ((string2 = this.f) == null) {
            try {
                String string4;
                Resources resources = object.getResources();
                n3 = this.getId();
                this.f = string4 = resources.getResourceEntryName(n3);
            }
            catch (Exception exception) {}
        }
        int n10 = this.h;
        Paint paint = this.a;
        paint.setColor(n10);
        n10 = 1;
        paint.setAntiAlias(n10 != 0);
        n3 = this.i;
        Paint paint2 = this.b;
        paint2.setColor(n3);
        paint2.setAntiAlias(n10 != 0);
        Paint paint3 = this.c;
        n3 = this.j;
        paint3.setColor(n3);
        float f5 = this.k;
        this.k = n10 = Math.round(this.getResources().getDisplayMetrics().xdpi / 160.0f * f5);
    }

    public void onDraw(Canvas canvas) {
        int n3;
        Rect rect;
        Paint paint;
        int n4;
        String string2;
        super.onDraw(canvas);
        int n7 = this.getWidth();
        int n8 = this.getHeight();
        int n10 = this.d;
        if (n10 != 0) {
            float f5 = n7 += -1;
            float f6 = n8 += -1;
            Paint paint2 = this.a;
            string2 = canvas;
            canvas.drawLine(0.0f, 0.0f, f5, f6, paint2);
            paint2 = this.a;
            canvas.drawLine(0.0f, f6, f5, 0.0f, paint2);
            paint2 = this.a;
            n4 = 0;
            canvas.drawLine(0.0f, 0.0f, f5, 0.0f, paint2);
            paint2 = this.a;
            canvas.drawLine(f5, 0.0f, f5, f6, paint2);
            paint = null;
            paint2 = this.a;
            canvas.drawLine(f5, f6, 0.0f, f6, paint2);
            rect = null;
            paint2 = this.a;
            n3 = 0;
            canvas.drawLine(0.0f, f6, 0.0f, 0.0f, paint2);
        }
        if ((string2 = this.f) != null && (n3 = this.e) != 0) {
            n4 = string2.length();
            paint = this.b;
            rect = this.g;
            paint.getTextBounds(string2, 0, n4, rect);
            n10 = rect.width();
            float f7 = n7 -= n10;
            float f8 = 2.0f;
            f7 /= f8;
            n3 = rect.height();
            float f11 = (float)(n8 -= n3) / f8;
            f8 = rect.height();
            n10 = (int)f7;
            n3 = (int)(f11 += f8);
            rect.offset(n10, n3);
            n10 = rect.left;
            n3 = this.k;
            n4 = rect.top - n3;
            int n14 = rect.right + n3;
            int n15 = rect.bottom + n3;
            rect.set(n10 -= n3, n4, n14, n15);
            string2 = this.c;
            canvas.drawRect(rect, (Paint)string2);
            string2 = this.f;
            canvas.drawText(string2, f7, f11, paint);
        }
    }
}

