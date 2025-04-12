/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.util;

import android.os.CountDownTimer;
import com.jio.jioads.util.c;
import com.jio.jioads.util.e;
import com.jio.jioads.util.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public long a;
    public double b = -1.0;
    public double c;
    public double d;
    public double e;
    public double f;
    public long g;
    public CountDownTimer h;
    public boolean i;
    public final int j;

    public f() {
        int n3;
        double d2;
        this.c = d2 = 1.0;
        this.d = d2;
        this.f = 1440.0;
        long l2 = this.a;
        long l3 = 1000;
        this.j = n3 = (int)(l2 / l3);
    }

    public final void a(c c2) {
        long l2;
        Object object;
        int n3;
        Object object2 = "onFiboFinish";
        Intrinsics.checkNotNullParameter(c2, (String)object2);
        this.i = n3 = 1;
        double d2 = this.b;
        long l3 = -4616189618054758400L;
        double d5 = -1.0;
        double d7 = 0.0;
        double d9 = 1.0;
        double d12 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (d12 == false) {
            this.b = d7;
        } else {
            d2 = this.e;
            double d13 = d2 - d7;
            Object object3 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object3 == false) {
                this.e = d9;
            } else {
                d5 = this.f;
                double d14 = d2 - d5;
                object = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                if (object < 0) {
                    d2 = this.c;
                    d5 = this.d;
                    this.e = d2 += d5;
                    this.c = d5;
                    this.d = d2;
                } else if (object == false) {
                    this.e = d5;
                }
            }
            d9 = this.e;
        }
        d2 = 60;
        d9 *= d2;
        n3 = 1000;
        d2 = n3;
        this.g = l2 = (long)(d9 *= d2);
        object2 = this.h;
        if (object2 != null) {
            object2.cancel();
            n3 = 0;
            object2 = null;
            this.h = null;
        }
        l2 = this.g;
        l3 = 0L;
        d5 = 0.0;
        object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            object2 = new e(this, c2);
            s.d((Function0)object2);
        }
    }
}

