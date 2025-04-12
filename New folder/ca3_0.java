/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from CA3
 */
public final class ca3_0
extends EA3
implements Iterable,
KMappedMarker {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public ca3_0() {
        mz0_2 mz0_22 = DA3.a;
        mz0_2 mz0_23 = mz0_2.a;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, mz0_22, mz0_23);
    }

    public ca3_0(String string2, float f5, float f6, float f7, float f8, float f11, float f12, float f14, List list, List list2) {
        this.a = string2;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = f11;
        this.g = f12;
        this.h = f14;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object2 = object instanceof ca3_0)) {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            float f12;
            object = (ca3_0)object;
            Object object3 = this.a;
            Object object4 = ((ca3_0)object).a;
            object2 = Intrinsics.areEqual(object3, object4);
            if (!object2) {
                return false;
            }
            float f14 = this.b;
            float f15 = ((ca3_0)object).b;
            float f16 = f14 - f15;
            object2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (!(object2 || (object2 = (f12 = (f14 = this.c) - (f15 = ((ca3_0)object).c)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) || (object2 = (f11 = (f14 = this.d) - (f15 = ((ca3_0)object).d)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) || (object2 = (f8 = (f14 = this.e) - (f15 = ((ca3_0)object).e)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) || (object2 = (f7 = (f14 = this.f) - (f15 = ((ca3_0)object).f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) || (object2 = (f6 = (f14 = this.g) - (f15 = ((ca3_0)object).g)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) || (object2 = (f5 = (f14 = this.h) - (f15 = ((ca3_0)object).h)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)))) {
                object4 = this.i;
                object3 = ((ca3_0)object).i;
                object2 = Intrinsics.areEqual(object4, object3);
                if (!object2) {
                    return false;
                }
                object4 = this.j;
                object = ((ca3_0)object).j;
                boolean bl3 = Intrinsics.areEqual(object4, object);
                if (!bl3) {
                    return false;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        n3 = UR0.a(this.d, n3, n4);
        n3 = UR0.a(this.e, n3, n4);
        n3 = UR0.a(this.f, n3, n4);
        n3 = UR0.a(this.g, n3, n4);
        n3 = UR0.a(this.h, n3, n4);
        List list = this.i;
        n3 = ne_0.a(n3, n4, list);
        return ((Object)this.j).hashCode() + n3;
    }

    public final Iterator iterator() {
        CA3$a cA3$a = new CA3$a(this);
        return cA3$a;
    }
}

