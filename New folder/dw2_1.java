/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dw2
 */
public final class dw2_1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public dw2_1() {
        throw null;
    }

    public dw2_1(long l2, long l3, long l4, long l7, boolean bl2, float f5, int n3, boolean bl3, ArrayList arrayList, long l8, long l12) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l7;
        this.e = bl2;
        this.f = f5;
        this.g = n3;
        this.h = bl3;
        this.i = arrayList;
        this.j = l8;
        this.k = l12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof dw2_1;
        if (object2 == 0) {
            return false;
        }
        object = (dw2_1)object;
        long l2 = this.a;
        long l3 = ((dw2_1)object).a;
        object2 = Yv2.a(l2, l3);
        if (object2 == 0) {
            return false;
        }
        l3 = this.b;
        l2 = ((dw2_1)object).b;
        long l4 = l3 - l2;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        l3 = this.c;
        l2 = ((dw2_1)object).c;
        object2 = e72.b(l3, l2);
        if (object2 == 0) {
            return false;
        }
        l3 = this.d;
        l2 = ((dw2_1)object).d;
        object2 = e72.b(l3, l2);
        if (object2 == 0) {
            return false;
        }
        object2 = this.e;
        int n3 = ((dw2_1)object).e;
        if (object2 != n3) {
            return false;
        }
        float f5 = this.f;
        float f6 = ((dw2_1)object).f;
        object2 = Float.compare(f5, f6);
        if (object2 != 0) {
            return false;
        }
        object2 = this.g;
        n3 = ((dw2_1)object).g;
        if ((object2 = (Object)lw2_0.a(object2, n3)) == 0) {
            return false;
        }
        object2 = this.h;
        n3 = (int)(((dw2_1)object).h ? 1 : 0);
        if (object2 != n3) {
            return false;
        }
        List list = this.i;
        List list2 = ((dw2_1)object).i;
        object2 = Intrinsics.areEqual(list, list2);
        if (object2 == 0) {
            return false;
        }
        l3 = this.j;
        l2 = ((dw2_1)object).j;
        object2 = e72.b(l3, l2);
        if (object2 == 0) {
            return false;
        }
        l3 = this.k;
        l2 = ((dw2_1)object).k;
        boolean bl3 = e72.b(l3, l2);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        float f5 = 4.5E-44f;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3);
        int n7 = 31;
        n4 *= 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n8 = (int)(l3 ^ l4);
        n4 = (n4 + n8) * 31;
        long l7 = this.c;
        n3 = (e72.f(l7) + n4) * 31;
        l3 = this.d;
        n4 = (e72.f(l3) + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        n8 = 1237;
        if (n3 != 0) {
            n3 = 1231;
            f5 = 1.725E-42f;
        } else {
            n3 = 1237;
            f5 = 1.733E-42f;
        }
        n4 = (n4 + n3) * 31;
        f5 = this.f;
        n4 = UR0.a(f5, n4, n7);
        n3 = this.g;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.h ? 1 : 0);
        if (n3 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        List list = this.i;
        n4 = ne_0.a(n4, n7, list);
        n3 = (e72.f(this.j) + n4) * 31;
        return e72.f(this.k) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PointerInputEventData(id=");
        Object object = Yv2.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", uptime=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", positionOnScreen=");
        object = e72.k(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", position=");
        l2 = this.d;
        object = e72.k(l2);
        stringBuilder.append(object);
        stringBuilder.append(", down=");
        int n3 = this.e;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", pressure=");
        float f5 = this.f;
        stringBuilder.append(f5);
        object = ", type=";
        stringBuilder.append((String)object);
        n3 = 1;
        f5 = Float.MIN_VALUE;
        int n4 = this.g;
        if (n4 != n3) {
            n3 = 2;
            f5 = 2.8E-45f;
            if (n4 != n3) {
                n3 = 3;
                f5 = 4.2E-45f;
                if (n4 != n3) {
                    n3 = 4;
                    f5 = 5.6E-45f;
                    object = n4 != n3 ? "Unknown" : "Eraser";
                } else {
                    object = "Stylus";
                }
            } else {
                object = "Mouse";
            }
        } else {
            object = "Touch";
        }
        stringBuilder.append(object);
        stringBuilder.append(", activeHover=");
        n3 = (int)(this.h ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", historical=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", scrollDelta=");
        object = e72.k(this.j);
        stringBuilder.append(object);
        stringBuilder.append(", originalEventPosition=");
        object = e72.k(this.k);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

