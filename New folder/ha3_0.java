/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HA3
 */
public final class ha3_0
extends EA3 {
    public final String a;
    public final List b;
    public final int c;
    public final ZD d;
    public final float e;
    public final ZD f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public ha3_0() {
        throw null;
    }

    public ha3_0(String string2, List list, int n3, ZD zD, float f5, ZD zD3, float f6, float f7, int n4, int n7, float f8, float f11, float f12, float f14) {
        this.a = string2;
        this.b = list;
        this.c = n3;
        this.d = zD;
        this.e = f5;
        this.f = zD3;
        this.g = f6;
        this.h = f7;
        this.i = n4;
        this.j = n7;
        this.k = f8;
        this.l = f11;
        this.m = f12;
        this.n = f14;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = ha3_0.class) == (object2 = object.getClass())) {
            object = (ha3_0)object;
            object2 = this.a;
            object3 = ((ha3_0)object).a;
            Object object4 = Intrinsics.areEqual(object2, object3);
            if (object4 == 0) {
                return false;
            }
            object2 = this.d;
            object3 = ((ha3_0)object).d;
            object4 = Intrinsics.areEqual(object2, object3);
            if (object4 == 0) {
                return false;
            }
            float f5 = this.e;
            float f6 = ((ha3_0)object).e;
            float f7 = f5 - f6;
            object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object4 == 0) {
                float f8;
                object2 = this.f;
                object3 = ((ha3_0)object).f;
                object4 = Intrinsics.areEqual(object2, object3);
                if (object4 == 0) {
                    return false;
                }
                f5 = this.g;
                f6 = ((ha3_0)object).g;
                float f11 = f5 - f6;
                object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (object4 == 0 && (object4 = (f8 = (f5 = this.h) - (f6 = ((ha3_0)object).h)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) == 0) {
                    float f12;
                    float f14;
                    float f15;
                    object4 = this.i;
                    int n3 = ((ha3_0)object).i;
                    if ((object4 = (Object)Se3.a(object4, n3)) == 0) {
                        return false;
                    }
                    object4 = this.j;
                    n3 = ((ha3_0)object).j;
                    if ((object4 = (Object)Ue3.b(object4, n3)) == 0) {
                        return false;
                    }
                    f5 = this.k;
                    f6 = ((ha3_0)object).k;
                    float f16 = f5 - f6;
                    object4 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                    if (object4 == 0 && (object4 = (Object)((f15 = (f5 = this.l) - (f6 = ((ha3_0)object).l)) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1))) == 0 && (object4 = (Object)((f14 = (f5 = this.m) - (f6 = ((ha3_0)object).m)) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1))) == 0 && (object4 = (Object)((f12 = (f5 = this.n) - (f6 = ((ha3_0)object).n)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1))) == 0 && (object4 = this.c) == (n3 = ((ha3_0)object).c)) {
                        object2 = this.b;
                        object = ((ha3_0)object).b;
                        boolean bl3 = Intrinsics.areEqual(object2, object);
                        if (!bl3) {
                            return false;
                        }
                        return bl2;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float f5;
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode();
        int n7 = 31;
        n4 *= 31;
        List list = this.b;
        n4 = ne_0.a(n4, n7, list);
        int n8 = 0;
        list = null;
        ZD zD = this.d;
        if (zD != null) {
            n3 = zD.hashCode();
        } else {
            n3 = 0;
            f5 = 0.0f;
            zD = null;
        }
        n4 = (n4 + n3) * 31;
        f5 = this.e;
        n4 = UR0.a(f5, n4, n7);
        zD = this.f;
        if (zD != null) {
            n8 = zD.hashCode();
        }
        n4 = (n4 + n8) * 31;
        n4 = UR0.a(this.g, n4, n7);
        n4 = UR0.a(this.h, n4, n7);
        n8 = this.i;
        n4 = (n4 + n8) * 31;
        n8 = this.j;
        n4 = (n4 + n8) * 31;
        n4 = UR0.a(this.k, n4, n7);
        n4 = UR0.a(this.l, n4, n7);
        n4 = UR0.a(this.m, n4, n7);
        n4 = UR0.a(this.n, n4, n7);
        n7 = this.c;
        return n4 + n7;
    }
}

