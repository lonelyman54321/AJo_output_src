/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.ril.ajio.R$dimen;

public class TimerBackground
extends View {
    public Paint a;
    public int b = 0;
    public int c = 0;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;

    public TimerBackground(Context context) {
        super(context);
        super();
        this.d = context;
        super();
        this.e = context;
        this.a();
    }

    public TimerBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super();
        this.d = context;
        super();
        this.e = context;
        this.a();
    }

    public TimerBackground(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super();
        this.d = context;
        super();
        this.e = context;
        this.a();
    }

    public final void a() {
        int n3;
        Object object;
        this.a = object = new Paint();
        Paint.Style style2 = Paint.Style.FILL;
        object.setStyle(style2);
        this.a.setAntiAlias(true);
        this.b = n3 = hv3_0.q(R$dimen.timer_traingle_height);
        this.c = n3 = hv3_0.q(R$dimen.timer_traingle_width);
        object = "#80000000";
        n3 = Color.parseColor((String)object);
        int n4 = 8;
        float[] fArray = new float[n4];
        int[] nArray = new int[n4];
        int n7 = 0xFFFFFF & n3;
        n3 = Color.alpha((int)n3);
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8;
            float f5 = (float)i3 / 7.0f;
            float f6 = 2.2f * f5;
            float f7 = 1.0f - f6;
            f6 = 0.6f * f5;
            float f8 = 1.8f - f6;
            f6 = f5 * f5 * f8 + f7;
            fArray[i3] = f5;
            f5 = (float)n3 * f6;
            nArray[i3] = n8 = Math.round(f5) << 24 | n7;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        object = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, nArray, fArray, tileMode);
        this.f = object;
    }

    public final void onDraw(Canvas canvas) {
        Matrix matrix = this.e;
        float f5 = this.getHeight();
        matrix.setScale(1.0f, f5);
        matrix.postTranslate(0.0f, 0.0f);
        this.f.setLocalMatrix(matrix);
        Paint paint = this.d;
        matrix = this.f;
        paint.setShader((Shader)matrix);
        int n3 = this.getHeight();
        int n4 = this.b;
        float f6 = n3 - n4;
        float f7 = this.getWidth();
        float f8 = this.getHeight();
        Canvas canvas2 = canvas;
        canvas.drawRect(0.0f, f6, f7, f8, paint);
        matrix = this.a;
        n4 = Color.parseColor((String)"#fff8eb");
        matrix.setColor(n4);
        n3 = this.getWidth() / 2;
        n4 = this.getHeight();
        int n7 = this.b;
        int n8 = this.c;
        Point point = new Point(n3, n4 -= n7);
        int n10 = n8 / 2 + n3;
        Point point2 = new Point(n10, n7 += n4);
        canvas2 = new Point(n3 += n8, n4);
        matrix = new Path();
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        matrix.setFillType(fillType);
        f5 = point.x;
        float f11 = point.y;
        matrix.moveTo(f5, f11);
        f5 = point2.x;
        f11 = point2.y;
        matrix.lineTo(f5, f11);
        f5 = canvas2.x;
        float f12 = canvas2.y;
        matrix.lineTo(f5, f12);
        matrix.close();
        fillType = this.a;
        canvas.drawPath((Path)matrix, (Paint)fillType);
        n4 = this.getWidth();
        n7 = this.getHeight();
        n8 = this.b;
        matrix = new Rect(0, 0, n4, n7 -= n8);
        fillType = this.a;
        canvas.drawRect((Rect)matrix, (Paint)fillType);
    }
}

