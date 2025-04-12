/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

public final class e$a {
    public Integer A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public Integer E;
    public Bundle F;
    public ImmutableList G;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public byte[] i;
    public Integer j;
    public Uri k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Boolean o;
    public Boolean p;
    public Integer q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public CharSequence w;
    public CharSequence x;
    public CharSequence y;
    public Integer z;

    public final void a(int n3, byte[] byArray) {
        block3: {
            Integer n4;
            block2: {
                Integer n7;
                Object object = this.i;
                if (object == null) break block2;
                object = n3;
                int n8 = 3;
                Integer n10 = n8;
                boolean bl2 = object.equals(n10);
                if (!bl2 && (bl2 = Objects.equals(object = this.j, n7 = Integer.valueOf(n8)))) break block3;
            }
            byArray = (byte[])byArray.clone();
            this.i = byArray;
            this.j = n4 = Integer.valueOf(n3);
        }
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void c(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void d(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void e(CharSequence charSequence) {
        this.x = charSequence;
    }

    public final void f(CharSequence charSequence) {
        this.y = charSequence;
    }

    public final void g(CharSequence charSequence) {
        this.B = charSequence;
    }

    public final void h(Integer n3) {
        this.s = n3;
    }

    public final void i(Integer n3) {
        this.r = n3;
    }

    public final void j(Integer n3) {
        this.q = n3;
    }

    public final void k(Integer n3) {
        this.v = n3;
    }

    public final void l(Integer n3) {
        this.u = n3;
    }

    public final void m(Integer n3) {
        this.t = n3;
    }

    public final void n(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void o(Integer n3) {
        this.m = n3;
    }

    public final void p(Integer n3) {
        this.l = n3;
    }

    public final void q(CharSequence charSequence) {
        this.w = charSequence;
    }
}

