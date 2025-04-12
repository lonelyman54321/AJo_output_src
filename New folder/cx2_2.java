/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CX2
 */
public final class cx2_2
extends ff_2 {
    public final transient byte[][] e;
    public final transient int[] f;

    public cx2_2(byte[][] byArray, int[] nArray) {
        Intrinsics.checkNotNullParameter(byArray, "segments");
        Intrinsics.checkNotNullParameter(nArray, "directory");
        byte[] byArray2 = ff_2.d.a;
        super(byArray2);
        this.e = byArray;
        this.f = nArray;
    }

    private final Object writeReplace() {
        ff_2 ff_22 = this.t();
        Intrinsics.checkNotNull(ff_22, "null cannot be cast to non-null type java.lang.Object");
        return ff_22;
    }

    public final String a() {
        throw null;
    }

    public final ff_2 c(String object) {
        Intrinsics.checkNotNullParameter(object, "algorithm");
        object = MessageDigest.getInstance((String)object);
        Object object2 = this.e;
        int n3 = ((byte[][])object2).length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = n3 + i3;
            int[] nArray = this.f;
            n7 = nArray[n7];
            int n8 = nArray[i3];
            byte[] byArray = object2[i3];
            n4 = n8 - n4;
            ((MessageDigest)object).update(byArray, n7, n4);
            n4 = n8;
        }
        object = ((MessageDigest)object).digest();
        object2 = new ff_2;
        Intrinsics.checkNotNull(object);
        object2((byte[])object);
        return object2;
    }

    public final int d() {
        int n3 = this.e.length + -1;
        return this.f[n3];
    }

    public final String e() {
        return this.t().e();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3 = true;
        if (!(object == this || (n4 = object instanceof ff_2) != 0 && (n4 = ((ff_2)(object = (ff_2)object)).d()) == (n3 = this.d()) && (bl2 = this.l(0, (ff_2)object, n4 = this.d())))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int f(int n3, byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "other");
        return this.t().f(n3, byArray);
    }

    public final byte[] h() {
        return this.s();
    }

    public final int hashCode() {
        int n3 = this.b;
        if (n3 == 0) {
            byte[][] byArray = this.e;
            int n4 = byArray.length;
            int n7 = 1;
            int n8 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = n4 + i3;
                int[] nArray = this.f;
                int n14 = nArray[i3];
                byte[] byArray2 = byArray[i3];
                n8 = n14 - n8 + n10;
                for (n10 = nArray[n10]; n10 < n8; ++n10) {
                    n7 *= 31;
                    byte by2 = byArray2[n10];
                    n7 += by2;
                }
                n8 = n14;
            }
            this.b = n7;
            n3 = n7;
        }
        return n3;
    }

    public final byte i(int n3) {
        int n4;
        Object object = this.e;
        int n7 = ((byte[][])object).length + -1;
        int[] nArray = this.f;
        long l2 = nArray[n7];
        long l3 = n3;
        long l4 = 1L;
        l_0.b(l2, l3, l4);
        n7 = k_0.a(this, n3);
        if (n7 == 0) {
            n4 = 0;
        } else {
            n4 = n7 + -1;
            n4 = nArray[n4];
        }
        int n8 = ((byte[][])object).length + n7;
        int n10 = nArray[n8];
        object = object[n7];
        n3 = n3 - n4 + n10;
        return (byte)object[n3];
    }

    public final int j(int n3, byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "other");
        return this.t().j(n3, byArray);
    }

    public final boolean l(int n3, ff_2 ff_22, int n4) {
        boolean bl2;
        block5: {
            int n7;
            Intrinsics.checkNotNullParameter(ff_22, "other");
            bl2 = false;
            if (n3 >= 0 && n3 <= (n7 = this.d() - n4)) {
                n4 += n3;
                n7 = k_0.a(this, n3);
                int n8 = 0;
                while (n3 < n4) {
                    int n10;
                    Object[] objectArray = this.f;
                    if (n7 == 0) {
                        n10 = 0;
                    } else {
                        n10 = n7 + -1;
                        n10 = objectArray[n10];
                    }
                    int n14 = objectArray[n7] - n10;
                    byte[][] byArray = this.e;
                    int n15 = byArray.length + n7;
                    int n16 = objectArray[n15];
                    n14 += n10;
                    n14 = Math.min(n4, n14) - n3;
                    n10 = n3 - n10 + n16;
                    objectArray = byArray[n7];
                    n16 = (int)(ff_22.m(n8, (byte[])objectArray, n10, n14) ? 1 : 0);
                    if (n16 != 0) {
                        n8 += n14;
                        n3 += n14;
                        ++n7;
                        continue;
                    }
                    break block5;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean m(int n3, byte[] byArray, int n4, int n7) {
        boolean bl2;
        block5: {
            int n8;
            Intrinsics.checkNotNullParameter(byArray, "other");
            bl2 = false;
            if (n3 >= 0 && n3 <= (n8 = this.d() - n7) && n4 >= 0 && n4 <= (n8 = byArray.length - n7)) {
                n7 += n3;
                n8 = k_0.a(this, n3);
                while (n3 < n7) {
                    int n10;
                    Object[] objectArray = this.f;
                    if (n8 == 0) {
                        n10 = 0;
                    } else {
                        n10 = n8 + -1;
                        n10 = objectArray[n10];
                    }
                    int n14 = objectArray[n8] - n10;
                    byte[][] byArray2 = this.e;
                    int n15 = byArray2.length + n8;
                    int n16 = objectArray[n15];
                    n14 += n10;
                    n14 = Math.min(n7, n14) - n3;
                    n10 = n3 - n10 + n16;
                    objectArray = byArray2[n8];
                    n16 = (int)(l_0.a((byte[])objectArray, n10, byArray, n4, n14) ? 1 : 0);
                    if (n16 != 0) {
                        n4 += n14;
                        n3 += n14;
                        ++n8;
                        continue;
                    }
                    break block5;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    public final ff_2 n(int n3, int n4) {
        n4 = l_0.c(this, n4);
        if (n3 >= 0) {
            int n7 = this.d();
            String string2 = "endIndex=";
            if (n4 <= n7) {
                n7 = n4 - n3;
                if (n7 >= 0) {
                    ff_2 ff_22;
                    int n8;
                    if (n3 == 0 && n4 == (n8 = this.d())) {
                        ff_22 = this;
                    } else if (n3 == n4) {
                        ff_22 = ff_2.d;
                    } else {
                        n8 = k_0.a(this, n3);
                        n4 += -1;
                        n4 = k_0.a(this, n4);
                        int n10 = n4 + 1;
                        byte[][] byArray = this.e;
                        byte[][] byArray2 = (byte[][])rp_1.m((Object[])byArray, n8, n10);
                        int n14 = byArray2.length * 2;
                        int[] nArray = new int[n14];
                        int n15 = 0;
                        int[] nArray2 = this.f;
                        if (n8 <= n4) {
                            int n16 = n8;
                            int n17 = 0;
                            while (true) {
                                int n18;
                                nArray[n17] = n18 = Math.min(nArray2[n16] - n3, n7);
                                n18 = n17 + 1;
                                int n19 = byArray2.length;
                                n17 += n19;
                                n19 = byArray.length + n16;
                                nArray[n17] = n19 = nArray2[n19];
                                if (n16 == n4) break;
                                ++n16;
                                n17 = n18;
                            }
                        }
                        if (n8 != 0) {
                            n15 = nArray2[n8 += -1];
                        }
                        n4 = byArray2.length;
                        n7 = nArray[n4];
                        nArray[n4] = n3 = n3 - n15 + n7;
                        ff_22 = new cx2_2(byArray2, nArray);
                    }
                    return ff_22;
                }
                String string3 = D70.b(n4, n3, string2, " < beginIndex=");
                string3 = string3.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                throw illegalArgumentException;
            }
            CharSequence charSequence = wk0_0.a(n4, string2, " > length(");
            n4 = this.d();
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append(')');
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        String string4 = Gj0.b(n3, "beginIndex=", " < 0");
        string4 = string4.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }

    public final ff_2 p() {
        return this.t().p();
    }

    public final void r(ce_2 ce_22, int n3) {
        Intrinsics.checkNotNullParameter(ce_22, "buffer");
        int n4 = k_0.a(this, 0);
        int n7 = 0;
        while (n7 < n3) {
            vx2_2 vx2_22;
            int n8;
            Object object = this.f;
            if (n4 == 0) {
                n8 = 0;
                vx2_22 = null;
            } else {
                n8 = n4 + -1;
                n8 = object[n8];
            }
            int n10 = object[n4] - n8;
            byte[][] byArray = this.e;
            int n14 = byArray.length + n4;
            int n15 = object[n14];
            n10 += n8;
            n10 = Math.min(n3, n10) - n7;
            n8 = n7 - n8;
            int n16 = n8 + n15;
            byte[] byArray2 = byArray[n4];
            object = new vx2_2;
            int n17 = n16 + n10;
            boolean bl2 = true;
            object(byArray2, n16, n17, bl2, false);
            vx2_22 = ce_22.a;
            if (vx2_22 == null) {
                object.g = object;
                object.f = object;
                ce_22.a = object;
            } else {
                Intrinsics.checkNotNull(vx2_22);
                vx2_22 = vx2_22.g;
                Intrinsics.checkNotNull(vx2_22);
                vx2_22.b((vx2_2)object);
            }
            n7 += n10;
            ++n4;
        }
        long l2 = ce_22.b;
        long l3 = n3;
        ce_22.b = l2 += l3;
    }

    public final byte[] s() {
        int n3 = this.d();
        byte[] byArray = new byte[n3];
        byte[][] byArray2 = this.e;
        int n4 = byArray2.length;
        int n7 = 0;
        int n8 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n10 = n4 + i3;
            int[] nArray = this.f;
            n10 = nArray[n10];
            int n14 = nArray[i3];
            byte[] byArray3 = byArray2[i3];
            n7 = n14 - n7;
            int n15 = n10 + n7;
            rp_1.g(byArray3, n8, byArray, n10, n15);
            n8 += n7;
            n7 = n14;
        }
        return byArray;
    }

    public final ff_2 t() {
        byte[] byArray = this.s();
        ff_2 ff_22 = new ff_2(byArray);
        return ff_22;
    }

    public final String toString() {
        return this.t().toString();
    }
}

