/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package com.skydoves.balloon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.skydoves.balloon.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class Balloon$a {
    public qc1_2 A;
    public int B;
    public int C;
    public final int D;
    public final int E;
    public float F;
    public final float G;
    public Integer H;
    public boolean I;
    public final boolean J;
    public final long K;
    public mu1_1 L;
    public final int M;
    public final int N;
    public vu_2 O;
    public final av_2 P;
    public final long Q;
    public final wu_2 R;
    public final int S;
    public final boolean T;
    public final int U;
    public boolean V;
    public final boolean W;
    public final boolean X;
    public int a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final int k;
    public int l;
    public float m;
    public xp_2 n;
    public final wp_2 o;
    public a p;
    public final float q;
    public float r;
    public int s;
    public float t;
    public CharSequence u;
    public int v;
    public float w;
    public int x;
    public final int y;
    public Drawable z;

    public Balloon$a(Context context) {
        long l2;
        int n3;
        Object object;
        float f5;
        int n4;
        int n7;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        this.a = n7 = -1 << -1;
        int n8 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int n10 = Resources.getSystem().getDisplayMetrics().heightPixels;
        Point point = new Point(n8, n10);
        this.b = n4 = point.x;
        this.c = n7;
        n4 = 1;
        this.j = n4;
        this.k = n7;
        this.l = n8 = on_2.b(12, n4);
        this.m = 0.5f;
        Object object2 = xp_2.ALIGN_BALLOON;
        this.n = object2;
        object2 = wp_2.ALIGN_ANCHOR;
        this.o = object2;
        object2 = com.skydoves.balloon.a.BOTTOM;
        this.p = object2;
        this.q = 2.5f;
        this.s = -16777216;
        object2 = Resources.getSystem().getDisplayMetrics();
        this.t = f5 = TypedValue.applyDimension((int)n4, (float)5.0f, (DisplayMetrics)object2);
        object2 = StringCompanionObject.INSTANCE;
        this.u = object2 = "";
        n8 = -1;
        f5 = 0.0f / 0.0f;
        this.v = n8;
        this.w = 12.0f;
        this.y = 17;
        this.A = object = qc1_2.START;
        float f6 = 28;
        this.B = n3 = on_2.b(f6, n4);
        this.C = n10 = on_2.b(f6, n4);
        this.D = n10 = on_2.b(8, n4);
        this.E = n7;
        n10 = 1065353216;
        this.F = 1.0f;
        object = Resources.getSystem().getDisplayMetrics();
        n3 = 0x40000000;
        float f7 = 2.0f;
        this.G = f6 = TypedValue.applyDimension((int)n4, (float)f7, (DisplayMetrics)object);
        object = cv_2.a;
        this.I = n4;
        this.J = n4;
        this.K = -1;
        this.M = n7;
        this.N = n7;
        object = vu_2.FADE;
        this.O = object;
        object = av_2.FADE;
        this.P = object;
        this.Q = l2 = 500L;
        object = wu_2.NONE;
        this.R = object;
        this.S = n7;
        context = context.getResources().getConfiguration();
        int n14 = context.getLayoutDirection();
        if (n14 == n4) {
            n14 = 1;
        } else {
            n14 = 0;
            context = null;
        }
        this.T = n14;
        if (n14 == 0) {
            n8 = 1;
            f5 = Float.MIN_VALUE;
        }
        this.U = n8;
        this.V = n4;
        this.W = n4;
        this.X = n4;
    }
}

