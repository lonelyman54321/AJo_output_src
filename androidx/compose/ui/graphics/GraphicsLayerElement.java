/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.graphics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class GraphicsLayerElement
extends up1_0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final i13 m;
    public final boolean n;
    public final long o;
    public final long p;
    public final int q;

    public GraphicsLayerElement(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, float f16, float f17, long l2, i13 i132, boolean bl2, long l3, long l4, int n3) {
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = f11;
        this.g = f12;
        this.h = f14;
        this.i = f15;
        this.j = f16;
        this.k = f17;
        this.l = l2;
        this.m = i132;
        this.n = bl2;
        this.o = l3;
        this.p = l4;
        this.q = n3;
    }

    public final LP1$c b() {
        int n3;
        long l2;
        float f5;
        g53 g532 = new LP1$c();
        g532.n = f5 = this.b;
        g532.o = f5 = this.c;
        g532.p = f5 = this.d;
        g532.q = f5 = this.e;
        g532.r = f5 = this.f;
        g532.s = f5 = this.g;
        g532.t = f5 = this.h;
        g532.u = f5 = this.i;
        g532.v = f5 = this.j;
        g532.w = f5 = this.k;
        g532.x = l2 = this.l;
        Object object = this.m;
        g532.y = object;
        g532.z = n3 = this.n;
        g532.A = l2 = this.o;
        g532.B = l2 = this.p;
        g532.C = n3 = this.q;
        g532.D = object = new f53(g532);
        return g532;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof GraphicsLayerElement;
        if (n3 == 0) {
            return false;
        }
        object = (GraphicsLayerElement)object;
        float f5 = this.b;
        float f6 = ((GraphicsLayerElement)object).b;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.c;
        f5 = ((GraphicsLayerElement)object).c;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        f5 = ((GraphicsLayerElement)object).d;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.e;
        f5 = ((GraphicsLayerElement)object).e;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.f;
        f5 = ((GraphicsLayerElement)object).f;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.g;
        f5 = ((GraphicsLayerElement)object).g;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.h;
        f5 = ((GraphicsLayerElement)object).h;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.i;
        f5 = ((GraphicsLayerElement)object).i;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.j;
        f5 = ((GraphicsLayerElement)object).j;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.k;
        f5 = ((GraphicsLayerElement)object).k;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.l;
        long l3 = ((GraphicsLayerElement)object).l;
        n3 = (int)(Oq3.a(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        i13 i132 = this.m;
        i13 i133 = ((GraphicsLayerElement)object).m;
        n3 = (int)(Intrinsics.areEqual(i132, i133) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.n ? 1 : 0);
        int n4 = ((GraphicsLayerElement)object).n;
        if (n3 != n4) {
            return false;
        }
        f6 = 0.0f;
        i132 = null;
        n3 = (int)(Intrinsics.areEqual(null, null) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        l2 = this.o;
        l3 = ((GraphicsLayerElement)object).o;
        n3 = (int)(OX.c(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        l2 = this.p;
        l3 = ((GraphicsLayerElement)object).p;
        n3 = (int)(OX.c(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.q;
        int n7 = ((GraphicsLayerElement)object).q;
        if ((n7 = (int)(y30_0.a(n3, n7) ? 1 : 0)) == 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.c, n3, n4);
        n3 = UR0.a(this.d, n3, n4);
        n3 = UR0.a(this.e, n3, n4);
        n3 = UR0.a(this.f, n3, n4);
        n3 = UR0.a(this.g, n3, n4);
        n3 = UR0.a(this.h, n3, n4);
        n3 = UR0.a(this.i, n3, n4);
        n3 = UR0.a(this.j, n3, n4);
        n3 = UR0.a(this.k, n3, n4);
        int n7 = Oq3.c;
        long l2 = this.l;
        long l3 = l2 >>> 32;
        long l4 = l2 ^ l3;
        int n8 = ((int)l4 + n3) * 31;
        i13 i132 = this.m;
        n3 = (i132.hashCode() + n8) * 31;
        n7 = (int)(this.n ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 961;
        n7 = OX.m;
        l4 = this.o;
        n3 = D70.a(n3, n4, l4);
        l4 = this.p;
        n3 = D70.a(n3, n4, l4);
        n4 = this.q;
        return n3 + n4;
    }

    public final void j(LP1$c object) {
        int n3;
        long l2;
        float f5;
        object = (g53)object;
        ((g53)object).n = f5 = this.b;
        ((g53)object).o = f5 = this.c;
        ((g53)object).p = f5 = this.d;
        ((g53)object).q = f5 = this.e;
        ((g53)object).r = f5 = this.f;
        ((g53)object).s = f5 = this.g;
        ((g53)object).t = f5 = this.h;
        ((g53)object).u = f5 = this.i;
        ((g53)object).v = f5 = this.j;
        ((g53)object).w = f5 = this.k;
        ((g53)object).x = l2 = this.l;
        Object object2 = this.m;
        ((g53)object).y = object2;
        ((g53)object).z = n3 = this.n;
        ((g53)object).A = l2 = this.o;
        ((g53)object).B = l2 = this.p;
        ((g53)object).C = n3 = this.q;
        n3 = 2;
        f5 = 2.8E-45f;
        object2 = go0.d((fo0)object, (int)n3).p;
        if (object2 != null) {
            object = ((g53)object).D;
            boolean bl2 = true;
            ((w32_0)object2).E1((Function1)object, bl2);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GraphicsLayerElement(scaleX=");
        float f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", scaleY=");
        f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", alpha=");
        f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(", translationX=");
        f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", translationY=");
        f5 = this.f;
        stringBuilder.append(f5);
        stringBuilder.append(", shadowElevation=");
        f5 = this.g;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationX=");
        f5 = this.h;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationY=");
        f5 = this.i;
        stringBuilder.append(f5);
        stringBuilder.append(", rotationZ=");
        f5 = this.j;
        stringBuilder.append(f5);
        stringBuilder.append(", cameraDistance=");
        f5 = this.k;
        stringBuilder.append(f5);
        stringBuilder.append(", transformOrigin=");
        Object object = Oq3.d(this.l);
        stringBuilder.append(object);
        stringBuilder.append(", shape=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(", clip=");
        boolean bl2 = this.n;
        stringBuilder.append(bl2);
        stringBuilder.append(", renderEffect=null, ambientShadowColor=");
        object = OX.i(this.o);
        stringBuilder.append(object);
        stringBuilder.append(", spotShadowColor=");
        object = OX.i(this.p);
        stringBuilder.append(object);
        stringBuilder.append(", compositingStrategy=");
        object = new StringBuilder("CompositingStrategy(value=");
        int c2 = this.q;
        ((StringBuilder)object).append(c2);
        char c3 = ')';
        ((StringBuilder)object).append(c3);
        object = ((StringBuilder)object).toString();
        stringBuilder.append(object);
        stringBuilder.append(c3);
        return stringBuilder.toString();
    }
}

