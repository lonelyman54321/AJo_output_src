/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Movie
 *  android.view.View
 */
package com.jio.jioads.native;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.view.View;
import com.jio.jioads.native.f;
import kotlin.jvm.internal.Intrinsics;

public final class c
extends View
implements f {
    public long a;
    public Movie b;
    public byte[] c;

    public c(Context context) {
        super(context);
    }

    public final void a() {
        byte[] byArray;
        Object object = this.c;
        int n3 = 0;
        byte[] byArray2 = null;
        String string2 = "gifArray";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((byArray = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            byArray2 = byArray;
        }
        n3 = byArray2.length;
        object = Movie.decodeByteArray((byte[])object, (int)0, (int)n3);
        this.b = (Movie)object;
        this.invalidate();
    }

    public final void a(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "byteArray");
        this.c = byArray;
    }

    public final void onDraw(Canvas canvas) {
        Object object;
        String string2 = "canvas";
        Intrinsics.checkNotNullParameter(canvas, string2);
        long l2 = System.currentTimeMillis();
        long l3 = this.a;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 == false) {
            this.a = l2;
        }
        if ((object = this.b) != null) {
            float f5;
            int n3 = object.duration();
            int n4 = (Integer)(object = Integer.valueOf(n3));
            if (n4 == 0) {
                n3 = 1000;
                f5 = 1.401E-42f;
                object = n3;
            }
            long l8 = this.a;
            l2 -= l8;
            n3 = (Integer)object;
            l3 = n3;
            int n7 = (int)(l2 %= l3);
            string2 = this.b;
            if (string2 != null) {
                string2.setTime(n7);
            }
            int n8 = this.getWidth();
            n7 = this.getHeight();
            object = this.b;
            n4 = 1;
            if (object != null) {
                n3 = object.width();
            } else {
                n3 = 1;
                f5 = Float.MIN_VALUE;
            }
            Movie movie = this.b;
            if (movie != null) {
                n4 = movie.height();
            }
            float f6 = n8;
            f5 = n3;
            f6 /= f5;
            float f7 = n7;
            f5 = n4;
            canvas.scale(f6, f7 /= f5);
            string2 = this.b;
            if (string2 != null) {
                n7 = 1065353216;
                f7 = 1.0f;
                string2.draw(canvas, f7, f7);
            }
            this.invalidate();
        }
    }
}

