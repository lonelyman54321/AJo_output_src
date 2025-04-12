/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XE2
 */
public final class xe2_2
implements b93_0 {
    public final we2_2 a;
    public boolean b;
    public final ee_2 c;

    public xe2_2(pq2_1 we2_22) {
        Intrinsics.checkNotNullParameter(we2_22, "source");
        this.a = we2_22;
        this.c = we2_22;
    }

    public final long A0(z63_0 z63_02) {
        long l2;
        ee_2 ee_22;
        Object object;
        long l3;
        long l4;
        Object object2;
        long l7;
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(z63_02, string2);
        long l8 = l7 = 0L;
        while ((object2 = (l4 = (l3 = (object = this.a).i0(ee_22 = this.c, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l3 = ee_22.c;
            long l12 = l3 - l7;
            object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 == false) {
                l3 = l7;
            } else {
                object = ee_22.b;
                Intrinsics.checkNotNull(object);
                int n3 = ((ux2_2)object).c;
                int n4 = 8192;
                if (n3 < n4 && (n4 = (int)(((ux2_2)object).e ? 1 : 0)) != 0) {
                    object2 = ((ux2_2)object).b;
                    l2 = n3 -= object2;
                    l3 -= l2;
                }
            }
            if ((object2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) <= 0) continue;
            l8 += l3;
            z63_02.D0(ee_22, l3);
        }
        l3 = ee_22.c;
        long l14 = l3 - l7;
        object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object2 > 0) {
            l8 += l3;
            z63_02.D0(ee_22, l3);
        }
        return l8;
    }

    public final int X(int n3, byte[] byArray, int n4) {
        long l2;
        we2_2 we2_22;
        long l3;
        Intrinsics.checkNotNullParameter(byArray, "sink");
        int n7 = byArray.length;
        long l4 = n7;
        long l7 = n3;
        long l8 = n4;
        xj3_1.a(l4, l7, l8);
        ee_2 ee_22 = this.c;
        l4 = ee_22.c;
        l7 = 0L;
        long l12 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l12 == false && (l12 = (l3 = (l4 = (we2_22 = this.a).i0(ee_22, l2 = 8192L)) - (l7 = (long)-1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            return -1;
        }
        n4 -= n3;
        l4 = ee_22.c;
        n4 = (int)Math.min((long)n4, l4) + n3;
        return ee_22.X(n3, byArray, n4);
    }

    public final void close() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        this.b = true;
        this.a.close();
        ee_2 ee_22 = this.c;
        long l2 = ee_22.c;
        ee_22.skip(l2);
    }

    public final ee_2 e() {
        return this.c;
    }

    public final void f(long l2) {
        boolean bl2 = this.request(l2);
        if (bl2) {
            return;
        }
        String string2 = Ov2.a(l2, "Source doesn't contain required number of bytes (", ").");
        EOFException eOFException = new EOFException(string2);
        throw eOFException;
    }

    public final boolean g() {
        boolean bl2 = this.b;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            long l2;
            long l3;
            we2_2 we2_22;
            long l4;
            long l7;
            ee_2 ee_22 = this.c;
            boolean bl4 = ee_22.g();
            if (!bl4 || (bl2 = (l7 = (l4 = (we2_22 = this.a).i0(ee_22, l3 = 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) {
                bl3 = false;
                Object var12_10 = null;
            }
            return bl3;
        }
        String string2 = "Source is closed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final long i0(ee_2 object, long l2) {
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.b ^ true;
        if (bl2) {
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 >= 0) {
                long l7;
                ee_2 ee_22 = this.c;
                long l8 = ee_22.c;
                long l12 = l8 - l3;
                Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object4 == false && (object4 = (l7 = (l3 = (object2 = this.a).i0(ee_22, 8192L)) - (l8 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
                    return l8;
                }
                l3 = ee_22.c;
                l2 = Math.min(l2, l3);
                return ee_22.i0((ee_2)object, l2);
            }
            object = Wm2.a(l2, "byteCount: ");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        String string2 = "Source is closed.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final xe2_2 peek() {
        boolean bl2 = this.b ^ true;
        if (bl2) {
            pq2_1 pq2_12 = new pq2_1(this);
            Intrinsics.checkNotNullParameter(pq2_12, "<this>");
            xe2_2 xe2_22 = new xe2_2(pq2_12);
            return xe2_22;
        }
        String string2 = "Source is closed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final byte readByte() {
        this.f(1L);
        return this.c.readByte();
    }

    public final boolean request(long l2) {
        Object object = this.b;
        int n3 = 1;
        if ((object ^= n3) != 0) {
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) {
                block3: {
                    long l7;
                    long l8;
                    ee_2 ee_22;
                    we2_2 we2_22;
                    long l12;
                    do {
                        ee_22 = this.c;
                        l3 = ee_22.c;
                        long l14 = l3 - l2;
                        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object2 >= 0) break block3;
                    } while ((object = (Object)((l12 = (l3 = (we2_22 = this.a).i0(ee_22, l8 = 8192L)) - (l7 = (long)-1)) == 0L ? 0 : (l12 < 0L ? -1 : 1))) != 0);
                    return false;
                }
                return n3 != 0;
            }
            String string2 = Wm2.a(l2, "byteCount: ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = "Source is closed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public final void t(z63_0 z63_02, long l2) {
        ee_2 ee_22 = this.c;
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(z63_02, string2);
        try {
            this.f(l2);
            ee_22.t(z63_02, l2);
            return;
        }
        catch (EOFException eOFException) {
            long l3 = ee_22.c;
            z63_02.D0(ee_22, l3);
            throw eOFException;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffered(");
        we2_2 we2_22 = this.a;
        stringBuilder.append(we2_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

