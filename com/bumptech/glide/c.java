/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 */
package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Registry;
import com.bumptech.glide.a$a;
import com.bumptech.glide.b$a;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.f;
import java.util.List;
import java.util.Map;

public final class c
extends ContextWrapper {
    public static final hz0_0 k;
    public final Kp a;
    public final yz0_0 b;
    public final f00 c;
    public final a$a d;
    public final List e;
    public final Map f;
    public final f g;
    public final d h;
    public final int i;
    public fk2_0 j;

    static {
        hz0_0 hz0_02;
        k = hz0_02 = new Jr3();
    }

    public c(Context object, SC1 sC1, cI2 cI22, f00 f002, b$a b$a, Jp jp, List list, f f5, d d2, int n3) {
        object = object.getApplicationContext();
        super(object);
        this.a = sC1;
        this.c = f002;
        this.d = b$a;
        this.e = list;
        this.f = jp;
        this.g = f5;
        this.h = d2;
        this.i = n3;
        super(cI22);
        this.b = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fk2_0 a() {
        synchronized (this) {
            try {
                boolean bl2;
                Object object = this.j;
                if (object != null) return this.j;
                object = this.d;
                object = (b$a)object;
                object.getClass();
                object = new fk2_0();
                ((uw_0)object).t = bl2 = true;
                this.j = object;
                return this.j;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Registry b() {
        return (Registry)this.b.get();
    }
}

