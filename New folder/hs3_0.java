/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;

/*
 * Renamed from hs3
 */
public final class hs3_0 {
    public static final hs3_0 e;
    public int a;
    public int b;
    public final be3_1 c;
    public Object[] d;

    static {
        hs3_0 hs3_02;
        Object[] objectArray = new Object[]{};
        e = hs3_02 = new hs3_0(0, 0, objectArray, null);
    }

    public hs3_0(int n3, int n4, Object[] objectArray, be3_1 be3_12) {
        this.a = n3;
        this.b = n4;
        this.c = be3_12;
        this.d = objectArray;
    }

    public static hs3_0 j(int n3, Object object, Object object2, int n4, Object object3, Object object4, int n7, be3_1 be3_12) {
        int n8;
        be3_1 be3_13 = be3_12;
        int n10 = 3;
        int n14 = 2;
        int n15 = 4;
        int n16 = 1;
        int n17 = 30;
        if (n7 > n17) {
            Object[] objectArray = new Object[n15];
            objectArray[0] = object;
            objectArray[n16] = object2;
            objectArray[n14] = object3;
            objectArray[n10] = object4;
            hs3_0 hs3_02 = new hs3_0(0, 0, objectArray, be3_12);
            return hs3_02;
        }
        n17 = n3;
        int n18 = ls3_0.d(n3, n7);
        if (n18 != (n8 = ls3_0.d(n4, n7))) {
            Object[] objectArray;
            if (n18 < n8) {
                objectArray = new Object[n15];
                objectArray[0] = object;
                objectArray[n16] = object2;
                objectArray[n14] = object3;
                objectArray[n10] = object4;
            } else {
                objectArray = new Object[n15];
                objectArray[0] = object3;
                objectArray[n16] = object4;
                objectArray[n14] = object;
                objectArray[n10] = object2;
            }
            n14 = n16 << n18;
            n15 = n16 << n8;
            hs3_0 hs3_03 = new hs3_0(n14 |= n15, 0, objectArray, be3_13);
            return hs3_03;
        }
        n8 = n7 + 5;
        Object object5 = object;
        n15 = n4;
        hs3_0 hs3_04 = hs3_0.j(n3, object, object2, n4, object3, object4, n8, be3_12);
        n14 = n16 << n18;
        Object[] objectArray = new Object[n16];
        objectArray[0] = hs3_04;
        object5 = new hs3_0(0, n14, objectArray, be3_12);
        return object5;
    }

    public final Object[] a(int n3, int n4, int n7, Object object, Object objectArray, int n8, be3_1 be3_12) {
        hs3_0 hs3_02;
        int n10;
        hs3_0 hs3_03 = this;
        int n14 = n3;
        Object object2 = this.d[n3];
        int n15 = 0;
        if (object2 != null) {
            n10 = object2.hashCode();
        } else {
            n10 = 0;
            hs3_02 = null;
        }
        Object object3 = this.x(n3);
        int n16 = n8 + 5;
        Object[] objectArray2 = objectArray;
        hs3_02 = hs3_0.j(n10, object2, object3, n7, object, objectArray, n16, be3_12);
        int n17 = n4;
        n17 = this.t(n4);
        int n18 = n17 + 1;
        Object[] objectArray3 = hs3_03.d;
        int n19 = n17 + -1;
        objectArray2 = new Object[objectArray3.length + -1];
        rp_1.k(objectArray3, 0, objectArray2, n3, 6);
        n15 = n14 + 2;
        rp_1.i(objectArray3, n3, objectArray2, n15, n18);
        objectArray2[n19] = hs3_02;
        n14 = objectArray3.length;
        rp_1.i(objectArray3, n17, objectArray2, n18, n14);
        return objectArray2;
    }

    public final int b() {
        int n3 = this.b;
        if (n3 == 0) {
            return this.d.length / 2;
        }
        n3 = Integer.bitCount(this.a);
        Object[] objectArray = this.d;
        int n4 = objectArray.length;
        for (int i3 = n3 * 2; i3 < n4; ++i3) {
            hs3_0 hs3_02 = this.s(i3);
            int n7 = hs3_02.b();
            n3 += n7;
        }
        return n3;
    }

    public final boolean c(Object object) {
        int n3 = this.d.length;
        c c2 = f.m(0, n3);
        c2 = f.l(2, c2);
        int n4 = c2.a;
        int n7 = c2.b;
        n3 = c2.c;
        if (n3 > 0 && n4 <= n7 || n3 < 0 && n7 <= n4) {
            while (true) {
                Object object2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(object, object2 = this.d[n4])) {
                    return true;
                }
                if (n4 == n7) break;
                n4 += n3;
            }
        }
        return false;
    }

    public final boolean d(int n3, int n4, Object object) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1 << n7;
        if ((n7 = (int)(this.h(n8) ? 1 : 0)) != 0) {
            n3 = this.f(n8);
            Object object2 = this.d[n3];
            return Intrinsics.areEqual(object, object2);
        }
        n7 = (int)(this.i(n8) ? 1 : 0);
        if (n7 != 0) {
            n8 = this.t(n8);
            hs3_0 hs3_02 = this.s(n8);
            n7 = 30;
            if (n4 == n7) {
                return hs3_02.c(object);
            }
            return hs3_02.d(n3, n4 += 5, object);
        }
        return false;
    }

    public final boolean e(hs3_0 hs3_02) {
        boolean bl2 = true;
        if (this == hs3_02) {
            return bl2;
        }
        int n3 = this.b;
        int n4 = hs3_02.b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.a;
        n4 = hs3_02.a;
        if (n3 != n4) {
            return false;
        }
        Object[] objectArray = this.d;
        n3 = objectArray.length;
        for (n4 = 0; n4 < n3; ++n4) {
            Object object = this.d[n4];
            Object object2 = hs3_02.d[n4];
            if (object == object2) continue;
            return false;
        }
        return bl2;
    }

    public final int f(int n3) {
        int n4 = this.a;
        return Integer.bitCount(n3 + -1 & n4) * 2;
    }

    public final Object g(int n3, int n4, Object object) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1 << n7;
        n7 = (int)(this.h(n8) ? 1 : 0);
        Object object2 = null;
        if (n7 != 0) {
            n3 = this.f(n8);
            Object object3 = this.d[n3];
            n4 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
            if (n4 != 0) {
                return this.x(n3);
            }
            return null;
        }
        n7 = (int)(this.i(n8) ? 1 : 0);
        if (n7 != 0) {
            n8 = this.t(n8);
            hs3_0 hs3_02 = this.s(n8);
            n7 = 30;
            if (n4 == n7) {
                n3 = hs3_02.d.length;
                Object var7_8 = null;
                c c2 = f.m(0, n3);
                c2 = f.l(2, c2);
                n4 = c2.a;
                n7 = c2.b;
                n3 = c2.c;
                if (n3 > 0 && n4 <= n7 || n3 < 0 && n7 <= n4) {
                    while (true) {
                        Object object4;
                        boolean bl2;
                        if (bl2 = Intrinsics.areEqual(object, object4 = hs3_02.d[n4])) {
                            object2 = hs3_02.x(n4);
                            break;
                        }
                        if (n4 == n7) break;
                        n4 += n3;
                    }
                }
                return object2;
            }
            return hs3_02.g(n3, n4 += 5, object);
        }
        return null;
    }

    public final boolean h(int n3) {
        int n4 = this.a;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean i(int n3) {
        int n4 = this.b;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final hs3_0 k(int n3, Uq2 object) {
        int n4 = ((Uq2)object).e() + -1;
        ((Uq2)object).h(n4);
        Object object2 = this.x(n3);
        ((Uq2)object).d = object2;
        object2 = this.d;
        int n7 = ((Object[])object2).length;
        int n8 = 2;
        if (n7 == n8) {
            return null;
        }
        be3_1 be3_12 = this.c;
        be3_1 be3_13 = ((Uq2)object).b;
        if (be3_12 == be3_13) {
            Object[] objectArray = ls3_0.b(n3, object2);
            this.d = objectArray;
            return this;
        }
        Object[] objectArray = ls3_0.b(n3, object2);
        object = ((Uq2)object).b;
        object2 = new hs3_0(0, 0, objectArray, (be3_1)object);
        return object2;
    }

    public final hs3_0 l(int n3, Object object, Object object2, int n4, Uq2 object3) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1;
        n7 = n8 << n7;
        int n10 = this.h(n7);
        String string2 = "copyOf(this, size)";
        Object object4 = this.c;
        if (n10 != 0) {
            int n14 = this.f(n7);
            Object object5 = this.d[n14];
            n10 = Intrinsics.areEqual(object, object5);
            if (n10 != 0) {
                Object object6 = this.x(n14);
                object3.d = object6;
                object6 = this.x(n14);
                if (object6 == object2) {
                    return this;
                }
                object6 = object3.b;
                if (object4 == object6) {
                    object6 = this.d;
                    object6[n14 += n8] = object2;
                    object = this;
                } else {
                    object3.e = n3 = object3.e + n8;
                    object6 = this.d;
                    int n15 = ((Object[])object6).length;
                    object6 = Arrays.copyOf(object6, n15);
                    Intrinsics.checkNotNullExpressionValue(object6, string2);
                    object6[n14 += n8] = object2;
                    int n16 = this.a;
                    n4 = this.b;
                    object3 = object3.b;
                    object = new hs3_0(n16, n4, (Object[])object6, (be3_1)object3);
                }
                return object;
            }
            n10 = object3.f + n8;
            object3.h(n10);
            object3 = object3.b;
            if (object4 == object3) {
                object5 = this;
                int n17 = n14;
                int n18 = n7;
                n14 = n3;
                Object[] objectArray = object;
                int n19 = n4;
                Object[] objectArray2 = this.a(n17, n7, n3, object, object2, n4, (be3_1)object3);
                this.d = objectArray2;
                this.a = n3 = this.a ^ n7;
                this.b = n3 = this.b | n7;
                object = this;
            } else {
                object5 = this;
                int n20 = n14;
                int n21 = n7;
                n14 = n3;
                Object[] objectArray = object;
                int n22 = n4;
                Object[] objectArray3 = this.a(n20, n7, n3, object, object2, n4, (be3_1)object3);
                int n24 = this.a ^ n7;
                n4 = this.b | n7;
                object = new hs3_0(n24, n4, objectArray3, (be3_1)object3);
            }
            return object;
        }
        n10 = this.i(n7);
        if (n10 != 0) {
            Object object7;
            hs3_0 hs3_02;
            block18: {
                n7 = this.t(n7);
                hs3_02 = this.s(n7);
                int n25 = 30;
                if (n4 == n25) {
                    n3 = hs3_02.d.length;
                    n4 = 0;
                    object7 = f.m(0, n3);
                    object7 = f.l(2, (IntRange)object7);
                    n25 = object7.a;
                    int n26 = object7.b;
                    n3 = object7.c;
                    if (n3 > 0 && n25 <= n26 || n3 < 0 && n26 <= n25) {
                        while (true) {
                            Object object8;
                            boolean bl2;
                            if (bl2 = Intrinsics.areEqual(object, object8 = hs3_02.d[n25])) {
                                object7 = hs3_02.x(n25);
                                object3.d = object7;
                                object = hs3_02.c;
                                object7 = object3.b;
                                if (object == object7) {
                                    object7 = hs3_02.d;
                                    object7[n25 += n8] = object2;
                                    object = hs3_02;
                                } else {
                                    object3.e = n3 = object3.e + n8;
                                    object7 = hs3_02.d;
                                    int n27 = ((Object[])object7).length;
                                    object7 = Arrays.copyOf(object7, n27);
                                    Intrinsics.checkNotNullExpressionValue(object7, string2);
                                    object7[n25 += n8] = object2;
                                    object2 = object3.b;
                                    object = new hs3_0(0, 0, (Object[])object7, (be3_1)object2);
                                }
                                break block18;
                            }
                            if (n25 == n26) break;
                            n25 += n3;
                        }
                    }
                    n3 = object3.f + n8;
                    object3.h(n3);
                    object7 = hs3_02.d;
                    object7 = ls3_0.a(object, object2, object7, 0);
                    object2 = object3.b;
                    object = new hs3_0(0, 0, (Object[])object7, (be3_1)object2);
                } else {
                    int n28 = n4 + 5;
                    object4 = hs3_02;
                    int n29 = n3;
                    Object[] objectArray = object;
                    object = hs3_02.l(n3, object, object2, n28, (Uq2)object3);
                }
            }
            if (hs3_02 == object) {
                return this;
            }
            object7 = object3.b;
            return this.r(n7, (hs3_0)object, (be3_1)object7);
        }
        n3 = object3.f + n8;
        object3.h(n3);
        Object[] objectArray = object3.b;
        n4 = this.f(n7);
        if (object4 == objectArray) {
            objectArray = this.d;
            objectArray = ls3_0.a(object, object2, objectArray, n4);
            this.d = objectArray;
            this.a = n3 = this.a | n7;
            object2 = this;
        } else {
            object3 = this.d;
            object = ls3_0.a(object, object2, object3, n4);
            n4 = this.a | n7;
            int n30 = this.b;
            object2 = new hs3_0(n4, n30, (Object[])object, (be3_1)objectArray);
        }
        return object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final hs3_0 m(hs3_0 hs3_02, int n3, To0 objectArray, Uq2 uq2) {
        void var30_55;
        Object[] objectArray2;
        void var30_52;
        Object object;
        Object object2;
        Object object3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        Uq2 uq22;
        Object[] objectArray3;
        int n19;
        hs3_0 hs3_03;
        hs3_0 hs3_04;
        block35: {
            int n20;
            String string2;
            int n21;
            Object[] objectArray4;
            be3_1 be3_12;
            block33: {
                int n22;
                int n24;
                block34: {
                    block32: {
                        hs3_04 = this;
                        hs3_03 = hs3_02;
                        n19 = n3;
                        objectArray3 = objectArray;
                        uq22 = uq2;
                        if (this == hs3_02) {
                            int n25 = this.b();
                            objectArray.a = n19 = objectArray.a + n25;
                            return this;
                        }
                        n18 = 2;
                        n17 = 1;
                        n16 = 30;
                        n15 = 0;
                        if (n3 <= n16) break block32;
                        be3_12 = uq2.b;
                        n16 = hs3_02.b;
                        objectArray4 = this.d;
                        int n26 = objectArray4.length;
                        n21 = hs3_02.d.length;
                        objectArray4 = Arrays.copyOf(objectArray4, n26 += n21);
                        string2 = "copyOf(this, newSize)";
                        Intrinsics.checkNotNullExpressionValue(objectArray4, string2);
                        Object[] objectArray5 = this.d;
                        n21 = objectArray5.length;
                        n24 = hs3_02.d.length;
                        IntRange intRange = f.m(0, n24);
                        c c2 = f.l(n18, intRange);
                        n24 = c2.a;
                        n22 = c2.b;
                        n18 = c2.c;
                        if ((n18 <= 0 || n24 > n22) && (n18 >= 0 || n22 > n24)) break block33;
                        break block34;
                    }
                    n16 = this.b;
                    n14 = hs3_02.b;
                    n16 |= n14;
                    n14 = this.a;
                    n10 = hs3_02.a;
                    n8 = n14 ^ n10;
                    n7 = ~n16;
                    n14 &= n10;
                    n4 = n8 &= n7;
                    break block35;
                }
                while (true) {
                    Object object4;
                    int n27;
                    if ((n27 = hs3_04.c(object4 = hs3_03.d[n24])) == 0) {
                        Object object5;
                        Object object6;
                        Object[] objectArray6 = hs3_03.d;
                        objectArray4[n21] = object6 = objectArray6[n24];
                        int n28 = n21 + 1;
                        int n29 = n24 + 1;
                        objectArray4[n28] = object5 = objectArray6[n29];
                        n21 += 2;
                    } else {
                        objectArray3.a = n27 = objectArray3.a + n17;
                    }
                    if (n24 == n22) break;
                    n24 += n18;
                }
            }
            if (n21 == (n20 = (objectArray3 = hs3_04.d).length)) {
                return hs3_04;
            }
            objectArray3 = hs3_03.d;
            n20 = objectArray3.length;
            if (n21 == n20) {
                return hs3_03;
            }
            int n30 = objectArray4.length;
            if (n21 == n30) {
                return new hs3_0(0, 0, objectArray4, be3_12);
            }
            objectArray3 = Arrays.copyOf(objectArray4, n21);
            Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            return new hs3_0(0, 0, objectArray3, be3_12);
        }
        while (n14 != 0) {
            n10 = Integer.lowestOneBit(n14);
            n8 = hs3_04.f(n10);
            Object object7 = hs3_04.d[n8];
            Object[] objectArray7 = hs3_03.d;
            n7 = hs3_03.f(n10);
            object3 = objectArray7[n7];
            if ((n8 = (int)(Intrinsics.areEqual(object7, object3) ? 1 : 0)) != 0) {
                n4 = n8 = n4 | n10;
            } else {
                n16 |= n10;
            }
            n14 ^= n10;
        }
        n14 = n16 & n4;
        if (n14 == 0) {
            n14 = 1;
        } else {
            n14 = 0;
            object2 = null;
        }
        n10 = 0;
        Object object8 = null;
        if (n14 == 0) {
            sn2.c("Check failed.");
            throw null;
        }
        be3_1 be3_13 = hs3_04.c;
        object2 = uq22.b;
        n14 = (int)(Intrinsics.areEqual(be3_13, object2) ? 1 : 0);
        if (n14 != 0 && (n14 = hs3_04.a) == n4 && (n14 = hs3_04.b) == n16) {
            hs3_0 hs3_05 = hs3_04;
        } else {
            n14 = Integer.bitCount(n4) * 2;
            n18 = Integer.bitCount(n16) + n14;
            object = new Object[n18];
            object2 = new hs3_0(n4, n16, (Object[])object, null);
            Object[] objectArray8 = object2;
        }
        int n32 = 0;
        for (int i3 = n16; i3 != 0; ++n32, i3 ^= n15) {
            block31: {
                int n34;
                Object[] objectArray9;
                Object[] objectArray10;
                block36: {
                    int n35;
                    block40: {
                        block39: {
                            block38: {
                                block37: {
                                    n7 = Integer.lowestOneBit(i3);
                                    objectArray10 = var30_52.d;
                                    int n36 = objectArray10.length - n17 - n32;
                                    n18 = (int)(hs3_04.i(n7) ? 1 : 0);
                                    if (n18 == 0) break block36;
                                    n18 = hs3_04.t(n7);
                                    object = hs3_04.s(n18);
                                    n16 = (int)(hs3_03.i(n7) ? 1 : 0);
                                    if (n16 == 0) break block37;
                                    n16 = hs3_03.t(n7);
                                    objectArray2 = hs3_03.s(n16);
                                    n14 = n19 + 5;
                                    object = ((hs3_0)object).m((hs3_0)objectArray2, n14, (To0)objectArray3, uq22);
                                    break block38;
                                }
                                n16 = (int)(hs3_03.h(n7) ? 1 : 0);
                                if (n16 == 0) break block38;
                                n16 = hs3_03.f(n7);
                                object2 = hs3_03.d[n16];
                                object8 = hs3_03.x(n16);
                                n16 = uq22.f;
                                if (object2 == null) break block39;
                                n35 = object2.hashCode();
                                break block40;
                            }
                            objectArray9 = objectArray10;
                            n15 = n7;
                            break block31;
                        }
                        n35 = 0;
                        objectArray9 = null;
                    }
                    int n37 = n19 + 5;
                    n15 = n16;
                    n16 = n35;
                    objectArray9 = objectArray10;
                    n8 = n37;
                    n34 = n7;
                    object3 = uq2;
                    object = ((hs3_0)object).l(n35, object2, object8, n37, uq2);
                    n16 = uq22.f;
                    if (n16 == n15) {
                        objectArray3.a = n16 = objectArray3.a + n17;
                    }
                    n15 = n34;
                    break block31;
                }
                objectArray9 = objectArray10;
                n15 = n7;
                n18 = (int)(hs3_03.i(n7) ? 1 : 0);
                if (n18 != 0) {
                    n18 = hs3_03.t(n7);
                    object = hs3_03.s(n18);
                    n16 = (int)(hs3_04.h(n7) ? 1 : 0);
                    if (n16 != 0) {
                        n16 = hs3_04.f(n7);
                        object2 = hs3_04.d[n16];
                        if (object2 != null) {
                            n10 = object2.hashCode();
                        } else {
                            n10 = 0;
                            object8 = null;
                        }
                        n8 = n19 + 5;
                        n10 = (int)(((hs3_0)object).d(n10, n8, object2) ? 1 : 0);
                        if (n10 != 0) {
                            objectArray3.a = n16 = objectArray3.a + n17;
                        } else {
                            object8 = hs3_04.x(n16);
                            if (object2 != null) {
                                n16 = object2.hashCode();
                            } else {
                                n16 = 0;
                                objectArray2 = null;
                            }
                            object3 = uq2;
                            object = ((hs3_0)object).l(n16, object2, object8, n8, uq2);
                        }
                    }
                } else {
                    n18 = hs3_04.f(n7);
                    Object object9 = hs3_04.d[n18];
                    Object object10 = hs3_04.x(n18);
                    n18 = hs3_03.f(n7);
                    objectArray2 = hs3_03.d;
                    Object object11 = objectArray2[n18];
                    Object object12 = hs3_03.x(n18);
                    n34 = object9 != null ? (n18 = object9.hashCode()) : 0;
                    int n38 = object11 != null ? (n18 = object11.hashCode()) : 0;
                    int n39 = n19 + 5;
                    object = uq22.b;
                    object = hs3_0.j(n34, object9, object10, n38, object11, object12, n39, (be3_1)object);
                }
            }
            objectArray9[n36] = object;
            n15 = 0;
        }
        n15 = 0;
        while (n4 != 0) {
            n19 = Integer.lowestOneBit(n4);
            n18 = n15 * 2;
            n16 = (int)(hs3_03.h(n19) ? 1 : 0);
            if (n16 == 0) {
                n16 = hs3_04.f(n19);
                object2 = var30_52.d;
                object2[n18] = object8 = hs3_04.d[n16];
                objectArray2 = hs3_04.x(n16);
                object2[++n18] = objectArray2;
            } else {
                n16 = hs3_03.f(n19);
                object2 = var30_52.d;
                object2[n18] = object8 = hs3_03.d[n16];
                objectArray2 = hs3_03.x(n16);
                object2[++n18] = objectArray2;
                n18 = (int)(hs3_04.h(n19) ? 1 : 0);
                if (n18 != 0) {
                    objectArray3.a = n18 = objectArray3.a + n17;
                }
            }
            ++n15;
            n4 ^= n19;
        }
        n19 = (int)(hs3_04.e((hs3_0)var30_52) ? 1 : 0);
        if (n19 != 0) {
            hs3_0 hs3_06 = hs3_04;
            return var30_55;
        }
        n19 = (int)(hs3_03.e((hs3_0)var30_52) ? 1 : 0);
        if (n19 == 0) return var30_55;
        hs3_0 hs3_07 = hs3_03;
        return var30_55;
    }

    public final hs3_0 n(int n3, Object object, int n4, Uq2 uq2) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1 << n7;
        int n10 = this.h(n8);
        if (n10 != 0) {
            n3 = this.f(n8);
            Object object2 = this.d[n3];
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                return this.p(n3, n8, uq2);
            }
            return this;
        }
        n10 = this.i(n8);
        if (n10 != 0) {
            Object object3;
            hs3_0 hs3_02;
            int n14;
            block8: {
                n14 = this.t(n8);
                hs3_02 = this.s(n14);
                n10 = 30;
                if (n4 == n10) {
                    n3 = hs3_02.d.length;
                    Object var8_9 = null;
                    object3 = f.m(0, n3);
                    object3 = f.l(2, (IntRange)object3);
                    n4 = ((c)object3).a;
                    n10 = ((c)object3).b;
                    n3 = ((c)object3).c;
                    if (n3 > 0 && n4 <= n10 || n3 < 0 && n10 <= n4) {
                        while (true) {
                            Object object4;
                            if ((n7 = (int)(Intrinsics.areEqual(object, object4 = hs3_02.d[n4]) ? 1 : 0)) != 0) {
                                object3 = hs3_02.k(n4, uq2);
                                break block8;
                            }
                            if (n4 == n10) break;
                            n4 += n3;
                        }
                    }
                    object3 = hs3_02;
                } else {
                    object3 = hs3_02.n(n3, object, n4 += 5, uq2);
                }
            }
            be3_1 be3_12 = uq2.b;
            return this.q(hs3_02, (hs3_0)object3, n14, n8, be3_12);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final hs3_0 o(int n3, Object object, Object object2, int n4, Uq2 uq2) {
        Object object3;
        Object object4;
        hs3_0 hs3_02;
        hs3_0 hs3_03;
        int n7;
        int n8;
        int n10;
        Uq2 uq22;
        Object object5;
        block5: {
            block7: {
                int n14;
                int n15;
                int n16;
                block8: {
                    block6: {
                        hs3_0 hs3_04 = this;
                        object5 = object;
                        n16 = n4;
                        uq22 = uq2;
                        n10 = n3;
                        n15 = ls3_0.d(n3, n4);
                        n8 = 1 << n15;
                        n14 = this.h(n8);
                        if (n14 != 0) {
                            n16 = this.f(n8);
                            Object object6 = this.d[n16];
                            n14 = Intrinsics.areEqual(object, object6);
                            if (n14 != 0 && (n14 = (int)(Intrinsics.areEqual(object2, object6 = this.x(n16)) ? 1 : 0)) != 0) {
                                return this.p(n16, n8, uq2);
                            }
                            return hs3_04;
                        }
                        n14 = this.i(n8);
                        if (n14 == 0) {
                            return this;
                        }
                        n7 = this.t(n8);
                        hs3_03 = this.s(n7);
                        n14 = 30;
                        if (n4 != n14) break block6;
                        n16 = hs3_03.d.length;
                        hs3_02 = null;
                        object4 = f.m(0, n16);
                        object4 = f.l(2, (IntRange)object4);
                        n14 = ((c)object4).a;
                        n10 = ((c)object4).b;
                        n16 = ((c)object4).c;
                        if ((n16 <= 0 || n14 > n10) && (n16 >= 0 || n10 > n14)) break block7;
                        break block8;
                    }
                    n15 = n4 + 5;
                    object4 = hs3_03;
                    n14 = n3;
                    n10 = n15;
                    object3 = uq2;
                    object4 = hs3_03.o(n3, object, object2, n15, uq2);
                    break block5;
                }
                while (true) {
                    if ((n15 = (int)(Intrinsics.areEqual(object, object3 = hs3_03.d[n14]) ? 1 : 0)) != 0 && (n15 = (int)(Intrinsics.areEqual(object2, object3 = hs3_03.x(n14)) ? 1 : 0)) != 0) {
                        object4 = hs3_03.k(n14, uq22);
                        break block5;
                    }
                    if (n14 == n10) break;
                    n14 += n16;
                }
            }
            object4 = hs3_03;
        }
        object5 = object4;
        object3 = uq22.b;
        object4 = this;
        hs3_02 = hs3_03;
        n10 = n8;
        return this.q(hs3_03, (hs3_0)object5, n7, n8, (be3_1)object3);
    }

    public final hs3_0 p(int n3, int n4, Uq2 object) {
        int n7 = ((Uq2)object).e() + -1;
        ((Uq2)object).h(n7);
        Object object2 = this.x(n3);
        ((Uq2)object).d = object2;
        object2 = this.d;
        int n8 = ((Object[])object2).length;
        int n10 = 2;
        if (n8 == n10) {
            return null;
        }
        be3_1 be3_12 = this.c;
        be3_1 be3_13 = ((Uq2)object).b;
        if (be3_12 == be3_13) {
            Object[] objectArray = ls3_0.b(n3, object2);
            this.d = objectArray;
            this.a = n3 = this.a ^ n4;
            return this;
        }
        Object[] objectArray = ls3_0.b(n3, object2);
        n8 = this.a;
        n4 ^= n8;
        n8 = this.b;
        object = ((Uq2)object).b;
        object2 = new hs3_0(n4, n8, objectArray, (be3_1)object);
        return object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final hs3_0 q(hs3_0 object, hs3_0 hs3_02, int n3, int n4, be3_1 be3_12) {
        int n7;
        void var5_14;
        void var1_10;
        hs3_0 hs3_03;
        block7: {
            block6: {
                be3_1 be3_13;
                block5: {
                    int n8;
                    int n10;
                    be3_13 = this.c;
                    if (hs3_03 != null) break block5;
                    Object[] objectArray = this.d;
                    int n14 = objectArray.length;
                    int n15 = 1;
                    if (n14 == n15) {
                        return var1_10;
                    }
                    if (be3_13 != var5_14) {
                        Object[] objectArray2 = ls3_0.c(n7, objectArray);
                        n7 = this.a;
                        int n16 = this.b;
                        hs3_0 hs3_04 = hs3_03 = new hs3_0(n7, n8 ^= n16, objectArray2, (be3_1)var5_14);
                        return var1_10;
                    }
                    Object[] objectArray3 = ls3_0.c(n7, objectArray);
                    this.d = objectArray3;
                    this.b = n10 = this.b ^ n8;
                    break block6;
                }
                if (be3_13 == var5_14 || object != hs3_03) break block7;
            }
            hs3_0 hs3_05 = this;
            return var1_10;
        }
        hs3_0 hs3_06 = this.r(n7, hs3_03, (be3_1)var5_14);
        return var1_10;
    }

    public final hs3_0 r(int n3, hs3_0 hs3_02, be3_1 be3_12) {
        Object object;
        Object[] objectArray = this.d;
        int n4 = objectArray.length;
        int n7 = 1;
        if (n4 == n7 && (n4 = ((Object[])(object = hs3_02.d)).length) == (n7 = 2) && (n4 = hs3_02.b) == 0) {
            hs3_02.a = n3 = this.b;
            return hs3_02;
        }
        object = this.c;
        if (object == be3_12) {
            objectArray[n3] = hs3_02;
            return this;
        }
        n4 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray, "copyOf(this, size)");
        objectArray[n3] = hs3_02;
        int n8 = this.a;
        n4 = this.b;
        hs3_0 hs3_03 = new hs3_0(n8, n4, objectArray, be3_12);
        return hs3_03;
    }

    public final hs3_0 s(int n3) {
        Object object = this.d[n3];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (hs3_0)object;
    }

    public final int t(int n3) {
        int n4 = this.d.length + -1;
        int n7 = this.b;
        n3 = Integer.bitCount(n3 + -1 & n7);
        return n4 - n3;
    }

    public final hs3$a u(Object object, int n3, int n4, Object object2) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1;
        n7 = n8 << n7;
        int n10 = this.h(n7);
        int n14 = 0;
        String string2 = "copyOf(this, size)";
        if (n10 != 0) {
            int n15 = this.f(n7);
            Object object3 = this.d[n15];
            n10 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
            if (n10 != 0) {
                object = this.x(n15);
                if (object == object2) {
                    return null;
                }
                object = this.d;
                n3 = ((Object[])object).length;
                object = Arrays.copyOf(object, n3);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object[n15 += n8] = object2;
                n4 = this.a;
                int n16 = this.b;
                hs3_0 hs3_02 = new hs3_0(n4, n16, (Object[])object, null);
                object = new hs3$a(hs3_02, 0);
                return object;
            }
            object3 = this;
            n14 = n15;
            n15 = n3;
            Object object4 = object2;
            object = this.a(n14, n7, n3, object, object2, n4, null);
            n4 = this.a ^ n7;
            int n17 = this.b | n7;
            hs3_0 hs3_03 = new hs3_0(n4, n17, (Object[])object, null);
            object = new hs3$a(hs3_03, n8);
            return object;
        }
        n10 = this.i(n7);
        if (n10 != 0) {
            Object object5;
            n10 = this.t(n7);
            hs3_0 hs3_04 = this.s(n10);
            int n18 = 30;
            if (n4 == n18) {
                block13: {
                    n3 = hs3_04.d.length;
                    object5 = f.m(0, n3);
                    object5 = f.l(2, (IntRange)object5);
                    n4 = object5.a;
                    n18 = object5.b;
                    n3 = object5.c;
                    if (n3 > 0 && n4 <= n18 || n3 < 0 && n18 <= n4) {
                        while (true) {
                            Object object6;
                            boolean bl2;
                            if (bl2 = Intrinsics.areEqual(object, object6 = hs3_04.d[n4])) {
                                object = hs3_04.x(n4);
                                if (object2 == object) {
                                    object = null;
                                } else {
                                    object = hs3_04.d;
                                    n3 = ((Object[])object).length;
                                    object = Arrays.copyOf(object, n3);
                                    Intrinsics.checkNotNullExpressionValue(object, string2);
                                    object[n4 += n8] = object2;
                                    object5 = new hs3_0(0, 0, (Object[])object, null);
                                    object = new hs3$a((hs3_0)object5, 0);
                                }
                                break block13;
                            }
                            if (n4 == n18) break;
                            n4 += n3;
                        }
                    }
                    object5 = hs3_04.d;
                    object = ls3_0.a(object, object2, object5, 0);
                    object5 = new hs3_0(0, 0, (Object[])object, null);
                    object = new hs3$a((hs3_0)object5, n8);
                }
                if (object == null) {
                    return null;
                }
            } else if ((object = hs3_04.u(object, n3, n4 += 5, object2)) == null) {
                return null;
            }
            object5 = object.a;
            object5 = this.w(n10, n7, (hs3_0)object5);
            object.a = object5;
            return object;
        }
        n3 = this.f(n7);
        Object[] objectArray = this.d;
        object = ls3_0.a(object, object2, objectArray, n3);
        n4 = this.a | n7;
        int n19 = this.b;
        hs3_0 hs3_05 = new hs3_0(n4, n19, (Object[])object, null);
        object = new hs3$a(hs3_05, n8);
        return object;
    }

    public final hs3_0 v(int n3, int n4, Object object) {
        int n7 = ls3_0.d(n3, n4);
        int n8 = 1;
        n7 = n8 << n7;
        int n10 = this.h(n7);
        int n14 = 2;
        Object object2 = null;
        if (n10 != 0) {
            n3 = this.f(n7);
            Object object3 = this.d[n3];
            n4 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
            if (n4 != 0) {
                object3 = this.d;
                int n15 = ((Object[])object3).length;
                if (n15 != n14) {
                    Object[] objectArray = ls3_0.b(n3, object3);
                    n15 = this.a ^ n7;
                    n7 = this.b;
                    object2 = object3 = new hs3_0(n15, n7, objectArray, null);
                }
                return object2;
            }
            return this;
        }
        n10 = this.i(n7);
        if (n10 != 0) {
            int n16;
            Object[] objectArray;
            hs3_0 hs3_02;
            hs3_0 hs3_03;
            block14: {
                n10 = this.t(n7);
                hs3_03 = this.s(n10);
                int n17 = 30;
                if (n4 == n17) {
                    n3 = hs3_03.d.length;
                    n4 = 0;
                    hs3_02 = null;
                    objectArray = f.m(0, n3);
                    objectArray = f.l(n14, (IntRange)objectArray);
                    n17 = objectArray.a;
                    int n18 = objectArray.b;
                    n3 = objectArray.c;
                    if (n3 > 0 && n17 <= n18 || n3 < 0 && n18 <= n17) {
                        while (true) {
                            Object object4;
                            boolean bl2;
                            if (bl2 = Intrinsics.areEqual(object, object4 = hs3_03.d[n17])) {
                                objectArray = hs3_03.d;
                                n16 = objectArray.length;
                                if (n16 == n14) {
                                    n16 = 0;
                                    object = null;
                                } else {
                                    objectArray = ls3_0.b(n17, objectArray);
                                    object = new hs3_0(0, 0, objectArray, null);
                                }
                                break block14;
                            }
                            if (n17 == n18) break;
                            n17 += n3;
                        }
                    }
                    object = hs3_03;
                } else {
                    object = hs3_03.v(n3, n4 += 5, object);
                }
            }
            if (object == null) {
                objectArray = this.d;
                n4 = objectArray.length;
                if (n4 != n8) {
                    objectArray = ls3_0.c(n10, objectArray);
                    n16 = this.a;
                    n8 = this.b;
                    hs3_02 = new hs3_0(n16, n7 ^= n8, objectArray, null);
                    object2 = hs3_02;
                }
            } else {
                object2 = hs3_03 != object ? this.w(n10, n7, (hs3_0)object) : this;
            }
            return object2;
        }
        return this;
    }

    public final hs3_0 w(int n3, int n4, hs3_0 hs3_02) {
        Object object = hs3_02.d;
        int n7 = ((Object[])object).length;
        int n8 = 2;
        String string2 = "copyOf(this, newSize)";
        if (n7 == n8 && (n7 = hs3_02.b) == 0) {
            Object[] objectArray = this.d;
            n7 = objectArray.length;
            n8 = 1;
            if (n7 == n8) {
                hs3_02.a = n3 = this.b;
                return hs3_02;
            }
            int n10 = this.f(n4);
            objectArray = this.d;
            Object object2 = object[0];
            object = object[n8];
            int n14 = objectArray.length + n8;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n14);
            Intrinsics.checkNotNullExpressionValue(objectArray2, string2);
            int n15 = n3 + 2;
            int n16 = n3 + 1;
            n7 = objectArray.length;
            rp_1.i(objectArray2, n15, objectArray2, n16, n7);
            n7 = n10 + 2;
            rp_1.i(objectArray2, n7, objectArray2, n10, n3);
            objectArray2[n10] = object2;
            objectArray2[n10 += n8] = object;
            n10 = this.a ^ n4;
            int n17 = this.b;
            hs3_0 hs3_03 = new hs3_0(n10, n4 ^= n17, objectArray2, null);
            return hs3_03;
        }
        Object[] objectArray = this.d;
        int n18 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n18);
        Intrinsics.checkNotNullExpressionValue(objectArray, string2);
        objectArray[n3] = hs3_02;
        int n19 = this.a;
        n18 = this.b;
        hs3_0 hs3_04 = new hs3_0(n19, n18, objectArray, null);
        return hs3_04;
    }

    public final Object x(int n3) {
        Object[] objectArray = this.d;
        return objectArray[++n3];
    }
}

