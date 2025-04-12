/*
 * Decompiled with CFR 0.152.
 */
package coil.compose;

import kotlin.jvm.internal.Intrinsics;

public final class ContentPainterElement
extends up1_0 {
    public final im2 b;
    public final Nc c;
    public final i70_0 d;
    public final float e;
    public final TX f;

    public ContentPainterElement(im2 im22, Nc nc, i70_0 i70_02, float f5, TX tX) {
        this.b = im22;
        this.c = nc;
        this.d = i70_02;
        this.e = f5;
        this.f = tX;
    }

    public final LP1$c b() {
        float f5;
        h70 h702 = new LP1$c();
        Object object = this.b;
        h702.n = object;
        h702.o = object = this.c;
        h702.p = object = this.d;
        h702.q = f5 = this.e;
        h702.r = object = this.f;
        return h702;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ContentPainterElement;
        if (n3 == 0) {
            return false;
        }
        object = (ContentPainterElement)object;
        Object object2 = this.b;
        Object object3 = ((ContentPainterElement)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((ContentPainterElement)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((ContentPainterElement)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.e;
        float f6 = ((ContentPainterElement)object).e;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object3 = this.f;
        object = ((ContentPainterElement)object).f;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode();
        int n4 = 31;
        Nc nc = this.c;
        int n7 = (nc.hashCode() + (n3 *= 31)) * 31;
        i70_0 i70_02 = this.d;
        n3 = (i70_02.hashCode() + n7) * 31;
        float f5 = this.e;
        n3 = UR0.a(f5, n3, n4);
        TX tX = this.f;
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
        lP1$c = (h70)lP1$c;
        Object object = ((h70)lP1$c).n;
        long l2 = ((im2)object).getIntrinsicSize-NH-jbRc();
        im2 im22 = this.b;
        long l3 = im22.getIntrinsicSize-NH-jbRc();
        boolean bl2 = C63.a(l2, l3) ^ true;
        ((h70)lP1$c).n = im22;
        Object object2 = this.c;
        ((h70)lP1$c).o = object2;
        ((h70)lP1$c).p = object2 = this.d;
        ((h70)lP1$c).q = f5 = this.e;
        ((h70)lP1$c).r = object2 = this.f;
        if (bl2) {
            object = go0.f(lP1$c);
            ((xp1_0)object).I();
        }
        jt0_0.a((it0_0)((Object)lP1$c));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentPainterElement(painter=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", alignment=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", contentScale=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", alpha=");
        float f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", colorFilter=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

