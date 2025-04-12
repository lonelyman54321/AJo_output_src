/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aw2
 */
public final class aw2_0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final List k;
    public final long l;
    public l60_0 m;

    public aw2_0() {
        throw null;
    }

    public aw2_0(long l2, long l3, long l4, boolean bl2, float f5, long l7, long l8, boolean bl3, int n3, ArrayList arrayList, long l12, long l14) {
        this(l2, l3, l4, bl2, f5, l7, l8, bl3, false, n3, l12);
        this.k = arrayList;
        this.l = l14;
    }

    public aw2_0(long l2, long l3, long l4, boolean bl2, float f5, long l7, long l8, boolean bl3, boolean bl4, int n3, long l12) {
        l60_0 l60_02;
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = bl2;
        this.e = f5;
        this.f = l7;
        this.g = l8;
        this.h = bl3;
        this.i = n3;
        this.j = l12;
        this.l = 0L;
        l60_02.a = bl4;
        l60_02.b = bl4;
        this.m = l60_02;
    }

    public final void a() {
        boolean bl2;
        l60_0 l60_02 = this.m;
        l60_02.b = bl2 = true;
        l60_02.a = bl2;
    }

    public final boolean b() {
        boolean bl2;
        l60_0 l60_02 = this.m;
        boolean bl3 = l60_02.b;
        if (!bl3 && !(bl2 = l60_02.a)) {
            bl2 = false;
            l60_02 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PointerInputChange(id=");
        Object object = Yv2.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", uptimeMillis=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", position=");
        object = e72.k(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", pressed=");
        int n3 = this.d;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", pressure=");
        float f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", previousUptimeMillis=");
        l2 = this.f;
        stringBuilder.append(l2);
        stringBuilder.append(", previousPosition=");
        l2 = this.g;
        object = e72.k(l2);
        stringBuilder.append(object);
        stringBuilder.append(", previousPressed=");
        n3 = this.h;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", isConsumed=");
        n3 = this.b();
        stringBuilder.append(n3 != 0);
        object = ", type=";
        stringBuilder.append((String)object);
        n3 = 1;
        f5 = Float.MIN_VALUE;
        int n4 = this.i;
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
        stringBuilder.append(", historical=");
        object = this.k;
        if (object == null) {
            object = mz0_2.a;
        }
        stringBuilder.append(object);
        stringBuilder.append(",scrollDelta=");
        object = e72.k(this.j);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

