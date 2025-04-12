/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.BoxChildDataElement;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements PA,
KA {
    public final Vo0 a;
    public final long b;
    public final /* synthetic */ d c;

    public e(long l2, Vo0 vo0) {
        d d2;
        this.a = vo0;
        this.b = l2;
        this.c = d2 = d.a;
    }

    public final LP1 a(LP1 lP1, Nc nc) {
        return this.c.a(lP1, nc);
    }

    public final long b() {
        return this.b;
    }

    public final float c() {
        float f5;
        long l2 = this.b;
        boolean bl2 = c60.e(l2);
        if (bl2) {
            int n3 = c60.i(l2);
            Vo0 vo0 = this.a;
            f5 = vo0.D0(n3);
        } else {
            int n4 = 2139095040;
            f5 = 1.0f / 0.0f;
        }
        return f5;
    }

    public final float d() {
        float f5;
        long l2 = this.b;
        boolean bl2 = c60.d(l2);
        if (bl2) {
            int n3 = c60.h(l2);
            Vo0 vo0 = this.a;
            f5 = vo0.D0(n3);
        } else {
            int n4 = 2139095040;
            f5 = 1.0f / 0.0f;
        }
        return f5;
    }

    public final LP1 e(LP1 lP1) {
        this.c.getClass();
        Gx gx = Nc$a.e;
        ji1$a ji1$a = ji1.a;
        lP1 = new BoxChildDataElement(gx, true, ji1$a);
        return lP1;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof e;
        if (!bl3) {
            return false;
        }
        object = (e)object;
        Vo0 vo0 = this.a;
        Vo0 vo02 = ((e)object).a;
        bl3 = Intrinsics.areEqual(vo0, vo02);
        if (!bl3) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((e)object).b;
        boolean bl4 = c60.c(l2, l3);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final float f() {
        int n3 = c60.k(this.b);
        return this.a.D0(n3);
    }

    public final float g() {
        int n3 = c60.j(this.b);
        return this.a.D0(n3);
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = this.b;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BoxWithConstraintsScopeImpl(density=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", constraints=");
        object = c60.m(this.b);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

