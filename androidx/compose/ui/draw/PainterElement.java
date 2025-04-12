/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import kotlin.jvm.internal.Intrinsics;

final class PainterElement
extends up1_0 {
    public final im2 b;
    public final boolean c;
    public final Nc d;
    public final i70_0 e;
    public final float f;
    public final TX g;

    public PainterElement(im2 im22, boolean bl2, Nc nc, i70_0 i70_02, float f5, TX tX) {
        this.b = im22;
        this.c = bl2;
        this.d = nc;
        this.e = i70_02;
        this.f = f5;
        this.g = tX;
    }

    public final LP1$c b() {
        float f5;
        boolean bl2;
        jm2 jm22 = new LP1$c();
        Object object = this.b;
        jm22.n = object;
        jm22.o = bl2 = this.c;
        jm22.p = object = this.d;
        jm22.q = object = this.e;
        jm22.r = f5 = this.f;
        jm22.s = object = this.g;
        return jm22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PainterElement;
        if (n3 == 0) {
            return false;
        }
        object = (PainterElement)object;
        Object object2 = this.b;
        Object object3 = ((PainterElement)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((PainterElement)object).c;
        if (n3 != n4) {
            return false;
        }
        object3 = this.d;
        object2 = ((PainterElement)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((PainterElement)object).e;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.f;
        float f6 = ((PainterElement)object).f;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object3 = this.g;
        object = ((PainterElement)object).g;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5;
        Object object = this.b;
        int n3 = object.hashCode();
        int n4 = 31;
        n3 *= 31;
        int n7 = this.c;
        if (n7 != 0) {
            n7 = 1231;
            f5 = 1.725E-42f;
        } else {
            n7 = 1237;
            f5 = 1.733E-42f;
        }
        n3 = (n3 + n7) * 31;
        Nc nc = this.d;
        n7 = (nc.hashCode() + n3) * 31;
        object = this.e;
        n3 = (object.hashCode() + n7) * 31;
        f5 = this.f;
        n3 = UR0.a(f5, n3, n4);
        TX tX = this.g;
        if (tX == null) {
            n4 = 0;
            tX = null;
        } else {
            n4 = tX.hashCode();
        }
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        float f5;
        long l2;
        Object object;
        long l3;
        lP1$c = (jm2)lP1$c;
        boolean bl2 = ((jm2)lP1$c).o;
        Object object2 = this.b;
        boolean bl3 = this.c;
        if (bl2 == bl3 && (!bl3 || (bl2 = C63.a(l3 = ((im2)(object = ((jm2)lP1$c).n)).getIntrinsicSize-NH-jbRc(), l2 = ((im2)object2).getIntrinsicSize-NH-jbRc())))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        ((jm2)lP1$c).n = object2;
        ((jm2)lP1$c).o = bl3;
        ((jm2)lP1$c).p = object2 = this.d;
        ((jm2)lP1$c).q = object2 = this.e;
        ((jm2)lP1$c).r = f5 = this.f;
        ((jm2)lP1$c).s = object2 = this.g;
        if (bl2) {
            object = go0.f(lP1$c);
            ((xp1_0)object).I();
        }
        jt0_0.a((it0_0)((Object)lP1$c));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PainterElement(painter=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", sizeToIntrinsics=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", alignment=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", contentScale=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", alpha=");
        float f5 = this.f;
        stringBuilder.append(f5);
        stringBuilder.append(", colorFilter=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

