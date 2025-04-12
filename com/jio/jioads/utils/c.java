/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Movie
 *  android.view.View
 */
package com.jio.jioads.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.view.View;
import com.jio.jioads.utils.d;
import kotlin.jvm.internal.Intrinsics;

public final class c
extends View
implements d {
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
        Movie movie;
        String string2 = "canvas";
        Intrinsics.checkNotNullParameter(canvas, string2);
        long l2 = System.currentTimeMillis();
        long l3 = this.a;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 == false) {
            this.a = l2;
        }
        if ((movie = this.b) != null) {
            float f5;
            Intrinsics.checkNotNull(movie);
            int n3 = movie.duration();
            if (n3 == 0) {
                n3 = 1000;
                f5 = 1.401E-42f;
            }
            long l8 = this.a;
            l2 -= l8;
            l3 = n3;
            int n4 = (int)(l2 %= l3);
            string2 = this.b;
            Intrinsics.checkNotNull(string2);
            string2.setTime(n4);
            int n7 = this.getWidth();
            n4 = this.getHeight();
            movie = this.b;
            Intrinsics.checkNotNull(movie);
            n3 = movie.width();
            Movie movie2 = this.b;
            Intrinsics.checkNotNull(movie2);
            int n8 = movie2.height();
            float f6 = n7;
            f5 = n3;
            f6 /= f5;
            float f7 = n4;
            f5 = n8;
            canvas.scale(f6, f7 /= f5);
            string2 = this.b;
            Intrinsics.checkNotNull(string2);
            n4 = 1065353216;
            f7 = 1.0f;
            string2.draw(canvas, f7, f7);
            this.invalidate();
        }
    }
}

