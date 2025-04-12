/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ShadowGraphicsLayerElement
extends up1_0 {
    public final float b;
    public final i13 c;
    public final boolean d;
    public final long e;
    public final long f;

    public ShadowGraphicsLayerElement(float f5, i13 i132, boolean bl2, long l2, long l3) {
        this.b = f5;
        this.c = i132;
        this.d = bl2;
        this.e = l2;
        this.f = l3;
    }

    public final LP1$c b() {
        fu0_0 fu0_02 = new fu0_0(this, 1);
        jy_1 jy_12 = new jy_1(fu0_02);
        return jy_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ShadowGraphicsLayerElement;
        if (!bl3) {
            return false;
        }
        object = (ShadowGraphicsLayerElement)object;
        float f5 = this.b;
        float f6 = ((ShadowGraphicsLayerElement)object).b;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        i13 i132 = this.c;
        i13 i133 = ((ShadowGraphicsLayerElement)object).c;
        bl3 = Intrinsics.areEqual(i132, i133);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((ShadowGraphicsLayerElement)object).d;
        if (bl3 != bl4) {
            return false;
        }
        long l2 = this.e;
        long l3 = ((ShadowGraphicsLayerElement)object).e;
        bl3 = OX.c(l2, l3);
        if (!bl3) {
            return false;
        }
        l2 = this.f;
        l3 = ((ShadowGraphicsLayerElement)object).f;
        boolean bl5 = OX.c(l2, l3);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5);
        int n4 = 31;
        i13 i132 = this.c;
        int n7 = (i132.hashCode() + (n3 *= 31)) * 31;
        n3 = (int)(this.d ? 1 : 0);
        if (n3 != 0) {
            n3 = 1231;
            f5 = 1.725E-42f;
        } else {
            n3 = 1237;
            f5 = 1.733E-42f;
        }
        n7 = (n7 + n3) * 31;
        n3 = OX.m;
        long l2 = this.e;
        n3 = D70.a(n7, n4, l2);
        return mt3_0.a(this.f) + n3;
    }

    public final void j(LP1$c object) {
        object = (jy_1)object;
        boolean bl2 = true;
        Object object2 = new fu0_0(this, (int)(bl2 ? 1 : 0));
        ((jy_1)object).n = object2;
        int n3 = 2;
        object2 = go0.d((fo0)object, (int)n3).p;
        if (object2 != null) {
            object = ((jy_1)object).n;
            bl2 = true;
            ((w32_0)object2).E1((Function1)object, bl2);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        Object object = xs0_0.b(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", shape=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", clip=");
        boolean bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", ambientColor=");
        object = OX.i(this.e);
        stringBuilder.append(object);
        stringBuilder.append(", spotColor=");
        object = OX.i(this.f);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

