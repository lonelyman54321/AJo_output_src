/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eE
 */
public final class ee_2
implements b93_0,
z63_0 {
    public ux2_2 a;
    public ux2_2 b;
    public long c;

    public final long A0(z63_0 z63_02) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(z63_02, string2);
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            z63_02.D0(this, l2);
        }
        return l2;
    }

    public final void D0(ee_2 object, long l2) {
        block19: {
            long l3;
            block20: {
                long l4;
                Object object2 = "source";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                if (object == this) break block19;
                long l7 = 0L;
                l3 = ((ee_2)object).c;
                long l8 = l7 - l3;
                Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object3 > 0 || (object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) < 0 || (object3 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) < 0) break block20;
                while ((l4 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) > 0) {
                    block26: {
                        block28: {
                            long l12;
                            block25: {
                                block27: {
                                    boolean bl2;
                                    Object object4;
                                    int n3;
                                    Object object5;
                                    int n4;
                                    ux2_2 ux2_22;
                                    block24: {
                                        block21: {
                                            block23: {
                                                block22: {
                                                    ux2_2 ux2_23;
                                                    object2 = ((ee_2)object).a;
                                                    Intrinsics.checkNotNull(object2);
                                                    l4 = ((ux2_2)object2).b();
                                                    l3 = l4;
                                                    object3 = 0;
                                                    ux2_22 = null;
                                                    long l14 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                                    if (l14 >= 0) break block21;
                                                    object2 = this.b;
                                                    if (object2 != null && (n4 = ((ux2_2)object2).e) != 0) {
                                                        n4 = ((ux2_2)object2).c;
                                                        l12 = (long)n4 + l2;
                                                        object5 = ((ux2_2)object2).d;
                                                        if (object5 != null) {
                                                            n4 = (int)(((tf_0)object5).b() ? 1 : 0);
                                                        } else {
                                                            n4 = 0;
                                                            object5 = null;
                                                        }
                                                        if (n4 != 0) {
                                                            n4 = 0;
                                                            object5 = null;
                                                        } else {
                                                            n4 = ((ux2_2)object2).b;
                                                        }
                                                        long l15 = n4;
                                                        l12 -= l15;
                                                        l15 = 8192L;
                                                        n4 = (int)(l12 == l15 ? 0 : (l12 < l15 ? -1 : 1));
                                                        if (n4 <= 0) {
                                                            object5 = ((ee_2)object).a;
                                                            Intrinsics.checkNotNull(object5);
                                                            int n7 = (int)l2;
                                                            ((ux2_2)object5).g((ux2_2)object2, n7);
                                                            ((ee_2)object).c = l3 = ((ee_2)object).c - l2;
                                                            this.c = l3 = this.c + l2;
                                                            return;
                                                        }
                                                    }
                                                    object2 = ((ee_2)object).a;
                                                    Intrinsics.checkNotNull(object2);
                                                    n4 = (int)l2;
                                                    if (n4 <= 0) break block22;
                                                    l14 = ((ux2_2)object2).c;
                                                    int n8 = ((ux2_2)object2).b;
                                                    if (n4 > (l14 -= n8)) break block23;
                                                    l14 = 1024;
                                                    if (n4 >= l14) {
                                                        ux2_23 = ((ux2_2)object2).f();
                                                    } else {
                                                        ux2_23 = bx2_2.b();
                                                        n8 = ((ux2_2)object2).b;
                                                        n3 = n8 + n4;
                                                        object4 = ((ux2_2)object2).a;
                                                        byte[] byArray = ux2_23.a;
                                                        rp_1.g((byte[])object4, 0, byArray, n8, n3);
                                                    }
                                                    ux2_23.c = n8 = ux2_23.b + n4;
                                                    ((ux2_2)object2).b = n8 = ((ux2_2)object2).b + n4;
                                                    object5 = ((ux2_2)object2).g;
                                                    if (object5 != null) {
                                                        Intrinsics.checkNotNull(object5);
                                                        ((ux2_2)object5).e(ux2_23);
                                                    } else {
                                                        ux2_23.f = object2;
                                                        ((ux2_2)object2).g = ux2_23;
                                                    }
                                                    ((ee_2)object).a = ux2_23;
                                                    break block21;
                                                }
                                                object2.getClass();
                                            }
                                            String string2 = "byteCount out of range".toString();
                                            object = new IllegalArgumentException(string2);
                                            throw object;
                                        }
                                        object2 = ((ee_2)object).a;
                                        Intrinsics.checkNotNull(object2);
                                        n4 = ((ux2_2)object2).b();
                                        l12 = n4;
                                        object5 = ((ux2_2)object2).d();
                                        ((ee_2)object).a = object5;
                                        if (object5 == null) {
                                            n4 = 0;
                                            object5 = null;
                                            ((ee_2)object).b = null;
                                        }
                                        if ((object5 = this.a) != null) break block24;
                                        this.a = object2;
                                        this.b = object2;
                                        break block25;
                                    }
                                    object5 = this.b;
                                    Intrinsics.checkNotNull(object5);
                                    ((ux2_2)object5).e((ux2_2)object2);
                                    object5 = ((ux2_2)object2).g;
                                    if (object5 == null) break block26;
                                    Intrinsics.checkNotNull(object5);
                                    n4 = (int)(((ux2_2)object5).e ? 1 : 0);
                                    if (n4 == 0) break block27;
                                    n4 = ((ux2_2)object2).c;
                                    n3 = ((ux2_2)object2).b;
                                    n4 -= n3;
                                    ux2_2 ux2_24 = ((ux2_2)object2).g;
                                    Intrinsics.checkNotNull(ux2_24);
                                    n3 = ux2_24.c;
                                    n3 = 8192 - n3;
                                    object4 = ((ux2_2)object2).g;
                                    Intrinsics.checkNotNull(object4);
                                    object4 = ((ux2_2)object4).d;
                                    if (object4 != null) {
                                        bl2 = ((tf_0)object4).b();
                                    } else {
                                        bl2 = false;
                                        object4 = null;
                                    }
                                    if (!bl2) {
                                        ux2_22 = ((ux2_2)object2).g;
                                        Intrinsics.checkNotNull(ux2_22);
                                        object3 = ux2_22.b;
                                    }
                                    if (n4 > (n3 += object3)) break block27;
                                    ux2_22 = ((ux2_2)object2).g;
                                    Intrinsics.checkNotNull(ux2_22);
                                    ((ux2_2)object2).g(ux2_22, n4);
                                    object5 = ((ux2_2)object2).d();
                                    if (object5 != null) break block28;
                                    bx2_2.a((ux2_2)object2);
                                    object2 = ux2_22;
                                }
                                this.b = object2;
                                Intrinsics.checkNotNull(object2);
                                object2 = ((ux2_2)object2).g;
                                if (object2 == null) {
                                    this.a = object2 = this.b;
                                }
                            }
                            ((ee_2)object).c = l3 = ((ee_2)object).c - l12;
                            this.c = l3 = this.c + l12;
                            l2 -= l12;
                            continue;
                        }
                        String string3 = "Check failed.".toString();
                        object = new IllegalStateException(string3);
                        throw object;
                    }
                    String string4 = "cannot compact".toString();
                    object = new IllegalStateException(string4);
                    throw object;
                }
                return;
            }
            String string5 = jl0_0.b(D70.c(l2, "offset (0) and byteCount (", ") are not within the range [0..size("), l3, "))");
            object = new IllegalArgumentException(string5);
            throw object;
        }
        String string6 = "source == this".toString();
        object = new IllegalArgumentException(string6);
        throw object;
    }

    public final long J(we2_2 we2_22) {
        long l2;
        long l3;
        long l4;
        long l7;
        String string2 = "source";
        Intrinsics.checkNotNullParameter(we2_22, string2);
        long l8 = 0L;
        while ((l7 = (l4 = (l3 = we2_22.i0(this, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l8 += l3;
        }
        return l8;
    }

    public final int X(int n3, byte[] byArray, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "sink");
        int n7 = byArray.length;
        long l2 = n7;
        long l3 = n3;
        long l4 = n4;
        xj3_1.a(l2, l3, l4);
        ux2_2 ux2_22 = this.a;
        if (ux2_22 == null) {
            return -1;
        }
        n4 -= n3;
        int n8 = ux2_22.b();
        n4 = Math.min(n4, n8);
        n8 = n3 + n4;
        String string2 = "dst";
        Intrinsics.checkNotNullParameter(byArray, string2);
        int n10 = ux2_22.b;
        int n14 = n10 + (n8 -= n3);
        byte[] byArray2 = ux2_22.a;
        rp_1.g(byArray2, n3, byArray, n10, n14);
        ux2_22.b = n3 = ux2_22.b + n8;
        long l7 = this.c;
        l2 = n4;
        this.c = l7 -= l2;
        n3 = (int)(yx2_2.a(ux2_22) ? 1 : 0);
        if (n3 != 0) {
            this.b();
        }
        return n4;
    }

    public final byte a() {
        long l2 = 0L;
        long l3 = this.c;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            ux2_2 ux2_22 = this.a;
            Intrinsics.checkNotNull(ux2_22);
            return ux2_22.c(0);
        }
        CharSequence charSequence = new StringBuilder("position (0) is not within the range [0..size(");
        l2 = this.c;
        charSequence = jl0_0.b(charSequence, l2, "))");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void b() {
        ux2_2 ux2_22;
        ux2_2 ux2_23 = this.a;
        Intrinsics.checkNotNull(ux2_23);
        this.a = ux2_22 = ux2_23.f;
        if (ux2_22 == null) {
            this.b = null;
        } else {
            ux2_22.g = null;
        }
        ux2_23.f = null;
        bx2_2.a(ux2_23);
    }

    public final /* synthetic */ void c() {
        ux2_2 ux2_22;
        ux2_2 ux2_23 = this.b;
        Intrinsics.checkNotNull(ux2_23);
        this.b = ux2_22 = ux2_23.g;
        if (ux2_22 == null) {
            this.a = null;
        } else {
            ux2_22.f = null;
        }
        ux2_23.g = null;
        bx2_2.a(ux2_23);
    }

    public final void close() {
    }

    public final void d(long l2) {
        StringBuilder stringBuilder = new StringBuilder("Buffer doesn't contain required number of bytes (size: ");
        long l3 = this.c;
        stringBuilder.append(l3);
        stringBuilder.append(", required: ");
        stringBuilder.append(l2);
        stringBuilder.append(')');
        String string2 = stringBuilder.toString();
        EOFException eOFException = new EOFException(string2);
        throw eOFException;
    }

    public final ee_2 e() {
        return this;
    }

    public final void f(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            l3 = this.c;
            long l7 = l3 - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Buffer doesn't contain required number of bytes (size: ");
            long l8 = this.c;
            stringBuilder.append(l8);
            stringBuilder.append(", required: ");
            stringBuilder.append(l2);
            stringBuilder.append(')');
            String string2 = stringBuilder.toString();
            EOFException eOFException = new EOFException(string2);
            throw eOFException;
        }
        String string3 = Wm2.a(l2, "byteCount: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final void flush() {
    }

    public final boolean g() {
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public final /* synthetic */ ux2_2 h(int n3) {
        int n4 = 1;
        if (n3 >= n4 && n3 <= (n4 = 8192)) {
            ux2_2 ux2_22 = this.b;
            if (ux2_22 == null) {
                ux2_2 ux2_23;
                this.a = ux2_23 = bx2_2.b();
                this.b = ux2_23;
                return ux2_23;
            }
            Intrinsics.checkNotNull(ux2_22);
            int n7 = ux2_22.c + n3;
            if (n7 <= n4 && (n3 = (int)(ux2_22.e ? 1 : 0)) != 0) {
                return ux2_22;
            }
            ux2_2 ux2_24 = bx2_2.b();
            ux2_22.e(ux2_24);
            this.b = ux2_24;
            return ux2_24;
        }
        String string2 = Gj0.b(n3, "unexpected capacity (", "), should be in range [1, 8192]");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final long i0(ee_2 object, long l2) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            long l7 = this.c;
            long l8 = l7 - l3;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false) {
                return -1;
            }
            Object object3 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            if (object3 > 0) {
                l2 = l7;
            }
            ((ee_2)object).D0(this, l2);
            return l2;
        }
        object = Ov2.a(l2, "byteCount (", ") < 0");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void k(b93_0 object, long l2) {
        CharSequence charSequence = "source";
        Intrinsics.checkNotNullParameter(object, charSequence);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            long l7;
            long l8 = l2;
            while ((l7 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1)) > 0) {
                long l12;
                long l14 = object.i0(this, l8);
                long l15 = l14 - (l12 = (long)-1);
                Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 != false) {
                    l8 -= l14;
                    continue;
                }
                charSequence = D70.c(l2, "Source exhausted before reading ", " bytes. Only ");
                String string2 = jl0_0.b((StringBuilder)charSequence, l2 -= l8, " were read.");
                object = new EOFException(string2);
                throw object;
            }
            return;
        }
        object = Ov2.a(l2, "byteCount (", ") < 0");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void n(byte[] byArray, int n3, int n4) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(byArray, string2);
        long l2 = byArray.length;
        long l3 = n3;
        long l4 = n4;
        xj3_1.a(l2, l3, l4);
        int n7 = n3;
        while (n7 < n4) {
            int n8 = 1;
            ux2_2 ux2_22 = this.h(n8);
            int n10 = n4 - n7;
            int n14 = ux2_22.a();
            n10 = Math.min(n10, n14) + n7;
            Intrinsics.checkNotNullParameter(byArray, "src");
            byte[] byArray2 = ux2_22.a;
            int n15 = ux2_22.c;
            rp_1.g(byArray, n15, byArray2, n7, n10);
            n14 = ux2_22.c;
            ux2_22.c = n7 = n10 - n7 + n14;
            n7 = n10;
        }
        long l7 = this.c;
        long l8 = n4 - n3;
        this.c = l7 += l8;
    }

    public final void p(byte by2) {
        long l2;
        int n3;
        ux2_2 ux2_22 = this.h(1);
        int n4 = ux2_22.c;
        ux2_22.c = n3 = n4 + 1;
        ux2_22.a[n4] = by2;
        this.c = l2 = this.c + 1L;
    }

    public final xe2_2 peek() {
        pq2_1 pq2_12 = new pq2_1(this);
        Intrinsics.checkNotNullParameter(pq2_12, "<this>");
        xe2_2 xe2_22 = new xe2_2(pq2_12);
        return xe2_22;
    }

    public final byte readByte() {
        Object object = this.a;
        long l2 = 1L;
        if (object != null) {
            long l3;
            int n3;
            int n4 = ((ux2_2)object).b();
            if (n4 == 0) {
                this.b();
                return this.readByte();
            }
            int n7 = ((ux2_2)object).b;
            ((ux2_2)object).b = n3 = n7 + 1;
            object = ((ux2_2)object).a;
            Object object2 = object[n7];
            this.c = l3 = this.c - l2;
            int n8 = 1;
            if (n4 == n8) {
                this.b();
            }
            return (byte)object2;
        }
        this.d(l2);
        throw null;
    }

    public final boolean request(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            boolean bl2;
            l3 = this.c;
            long l7 = l3 - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) {
                bl2 = true;
            } else {
                bl2 = false;
                Object var7_5 = null;
            }
            return bl2;
        }
        String string2 = Ov2.a(l2, "byteCount: ", " < 0");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void skip(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            long l7;
            long l8 = l2;
            while ((l7 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1)) > 0) {
                ux2_2 ux2_22 = this.a;
                if (ux2_22 != null) {
                    int n3 = ux2_22.c;
                    int n4 = ux2_22.b;
                    long l12 = n3 - n4;
                    l12 = Math.min(l8, l12);
                    n4 = (int)l12;
                    long l14 = this.c;
                    long l15 = n4;
                    this.c = l14 -= l15;
                    l8 -= l15;
                    ux2_22.b = n3 = ux2_22.b + n4;
                    l7 = ux2_22.c;
                    if (n3 != l7) continue;
                    this.b();
                    continue;
                }
                String string2 = Ov2.a(l2, "Buffer exhausted before skipping ", " bytes.");
                EOFException eOFException = new EOFException(string2);
                throw eOFException;
            }
            return;
        }
        String string3 = Ov2.a(l2, "byteCount (", ") < 0");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final void t(z63_0 object, long l2) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 >= 0) {
            l3 = this.c;
            long l4 = l3 - l2;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 >= 0) {
                object.D0(this, l2);
                return;
            }
            object.D0(this, l3);
            CharSequence charSequence = D70.c(l2, "Buffer exhausted before writing ", " bytes. Only ");
            l3 = this.c;
            charSequence = jl0_0.b(charSequence, l3, " bytes were written.");
            object = new EOFException((String)charSequence);
            throw object;
        }
        object = Ov2.a(l2, "byteCount (", ") < 0");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final String toString() {
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return "Buffer(size=0)";
        }
        int n3 = 64;
        l3 = n3;
        l2 = Math.min(l3, l2);
        int n4 = (int)l2;
        object = n4 * 2;
        long l7 = this.c;
        long l8 = l7 - l3;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        int n7 = object2 > 0 ? 1 : 0;
        StringBuilder stringBuilder = new StringBuilder((int)(object += n7));
        ux2_2 ux2_22 = this.a;
        n7 = 0;
        while (ux2_22 != null) {
            char c2 = '\u0000';
            while (n7 < n4 && c2 < (object2 = (Object)ux2_22.b())) {
                object2 = c2 + 1;
                Intrinsics.checkNotNullParameter(ux2_22, "segment");
                c2 = (char)ux2_22.c(c2);
                ++n7;
                char[] cArray = xj3_1.a;
                char c3 = c2 >> 4 & 0xF;
                c3 = cArray[c3];
                stringBuilder.append(c3);
                c2 &= 0xF;
                c2 = cArray[c2];
                stringBuilder.append(c2);
                c2 = (char)object2;
            }
            ux2_22 = ux2_22.f;
        }
        long l12 = this.c;
        long l14 = l12 - l3;
        n4 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
        if (n4 > 0) {
            n4 = 8230;
            stringBuilder.append((char)n4);
        }
        StringBuilder stringBuilder2 = new StringBuilder("Buffer(size=");
        l3 = this.c;
        stringBuilder2.append(l3);
        stringBuilder2.append(" hex=");
        stringBuilder2.append((Object)stringBuilder);
        stringBuilder2.append(')');
        return stringBuilder2.toString();
    }
}

