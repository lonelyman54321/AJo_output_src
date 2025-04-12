/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

public final class mr2
extends j1_0 {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public mr2(Object[] object, int n3, int n4, Object[] objectArray) {
        this.b = object;
        this.c = objectArray;
        this.d = n3;
        this.e = n4;
        int n7 = this.a();
        n3 = 32;
        if (n7 > n3) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        if (n7 != 0) {
            n7 = objectArray.length;
            return;
        }
        super("Trie-based persistent vector should have at least 33 elements, got ");
        n3 = this.a();
        ((StringBuilder)object).append(n3);
        sn2.b(((StringBuilder)object).toString());
        throw null;
    }

    public static Object[] d(Object[] object, int n3, int n4, Object object2, q62 q622) {
        int n7 = Oz3.a(n4, n3);
        Object[] objectArray = "copyOf(this, newSize)";
        int n8 = 32;
        if (n3 == 0) {
            Object[] objectArray2;
            if (n7 == 0) {
                objectArray2 = new Object[n8];
            } else {
                objectArray2 = Arrays.copyOf(object, n8);
                Intrinsics.checkNotNullExpressionValue(objectArray2, (String)objectArray);
            }
            n4 = n7 + 1;
            int n10 = 31;
            rp_1.i(object, n4, objectArray2, n7, n10);
            q622.a = object = object[n10];
            objectArray2[n7] = object2;
            return objectArray2;
        }
        Object[] objectArray3 = Arrays.copyOf(object, n8);
        Intrinsics.checkNotNullExpressionValue(objectArray3, (String)objectArray);
        objectArray = object[n7];
        String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.checkNotNull(objectArray, string2);
        objectArray = objectArray;
        Object[] objectArray4 = mr2.d(objectArray, n3 += -5, n4, object2, q622);
        objectArray3[n7] = objectArray4;
        while (++n7 < n8 && (objectArray4 = objectArray3[n7]) != null) {
            objectArray4 = object[n7];
            Intrinsics.checkNotNull(objectArray4, string2);
            object2 = q622.a;
            boolean bl2 = false;
            objectArray = null;
            objectArray3[n7] = objectArray4 = mr2.d(objectArray4, n3, 0, object2, q622);
        }
        return objectArray3;
    }

    public static Object[] f(Object[] objectArray, int n3, int n4, q62 q622) {
        Object[] objectArray2;
        int n7 = Oz3.a(n4, n3);
        int n8 = 5;
        if (n3 == n8) {
            objectArray2 = objectArray[n7];
            q622.a = objectArray2;
            n3 = 0;
            objectArray2 = null;
        } else {
            Object[] objectArray3 = objectArray[n7];
            String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(objectArray3, string2);
            objectArray3 = objectArray3;
            objectArray2 = mr2.f(objectArray3, n3 -= n8, n4, q622);
        }
        if (objectArray2 == null && n7 == 0) {
            return null;
        }
        objectArray = Arrays.copyOf(objectArray, 32);
        Intrinsics.checkNotNullExpressionValue(objectArray, "copyOf(this, newSize)");
        objectArray[n7] = objectArray2;
        return objectArray;
    }

    public static Object[] m(int n3, int n4, Object object, Object[] objectArray) {
        int n7 = Oz3.a(n4, n3);
        int n8 = 32;
        objectArray = Arrays.copyOf(objectArray, n8);
        Object[] objectArray2 = "copyOf(this, newSize)";
        Intrinsics.checkNotNullExpressionValue(objectArray, (String)objectArray2);
        if (n3 == 0) {
            objectArray[n7] = object;
        } else {
            Object[] objectArray3;
            objectArray2 = objectArray[n7];
            String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(objectArray2, string2);
            objectArray2 = objectArray2;
            objectArray[n7] = objectArray3 = mr2.m(n3 += -5, n4, object, objectArray2);
        }
        return objectArray;
    }

    public final ir2 A(j1$a j1$a) {
        nr2 nr22 = this.c();
        nr22.G(j1$a);
        return nr22.d();
    }

    public final int a() {
        return this.d;
    }

    public final ir2 add(int n3, Object object) {
        int n4 = this.d;
        bv1_0.b(n3, n4);
        if (n3 == n4) {
            return this.add(object);
        }
        n4 = this.l();
        Object[] objectArray = this.b;
        if (n3 >= n4) {
            return this.e(objectArray, n3 -= n4, object);
        }
        q62 q622 = new q62(null);
        int n7 = this.e;
        Object[] objectArray2 = mr2.d(objectArray, n7, n3, object, q622);
        object = q622.a;
        return this.e(objectArray2, 0, object);
    }

    public final ir2 add(Object object) {
        int n3 = this.l();
        int n4 = this.d;
        n3 = n4 - n3;
        int n7 = 32;
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        if (n3 < n7) {
            Object[] objectArray3 = Arrays.copyOf(objectArray2, n7);
            Intrinsics.checkNotNullExpressionValue(objectArray3, "copyOf(this, newSize)");
            objectArray3[n3] = object;
            n3 = this.e;
            object = new mr2(objectArray, ++n4, n3, objectArray3);
            return object;
        }
        Object[] objectArray4 = new Object[n7];
        objectArray4[0] = object;
        return this.g(objectArray, objectArray2, objectArray4);
    }

    public final nr2 c() {
        Object[] objectArray = this.c;
        int n3 = this.e;
        Object[] objectArray2 = this.b;
        nr2 nr22 = new nr2(this, objectArray2, objectArray, n3);
        return nr22;
    }

    public final mr2 e(Object[] objectArray, int n3, Object object) {
        int n4 = this.l();
        int n7 = this.d;
        n4 = n7 - n4;
        Object[] objectArray2 = this.c;
        int n8 = 32;
        Object[] objectArray3 = Arrays.copyOf(objectArray2, n8);
        String string2 = "copyOf(this, newSize)";
        Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
        if (n4 < n8) {
            n8 = n3 + 1;
            rp_1.i(objectArray2, n8, objectArray3, n3, n4);
            objectArray3[n3] = object;
            int n10 = this.e;
            mr2 mr22 = new mr2(objectArray, ++n7, n10, objectArray3);
            return mr22;
        }
        Object object2 = objectArray2[31];
        int n14 = n3 + 1;
        rp_1.i(objectArray2, n14, objectArray3, n3, n4 += -1);
        objectArray3[n3] = object;
        Object[] objectArray4 = new Object[n8];
        objectArray4[0] = object2;
        return this.g(objectArray, objectArray3, objectArray4);
    }

    public final mr2 g(Object[] objectArray, Object[] object, Object[] objectArray2) {
        int n3 = this.d;
        int n4 = n3 >> 5;
        int n7 = 1;
        int n8 = this.e;
        int n10 = n7 << n8;
        if (n4 > n10) {
            Object[] objectArray3 = new Object[32];
            objectArray3[0] = objectArray;
            objectArray = this.h(objectArray3, (Object[])object, n8 += 5);
            object = new mr2(objectArray, n3 += n7, n8, objectArray2);
            return object;
        }
        objectArray = this.h(objectArray, (Object[])object, n8);
        object = new mr2(objectArray, n3 += n7, n8, objectArray2);
        return object;
    }

    public final Object get(int n3) {
        Object object;
        int n4 = this.a();
        bv1_0.a(n3, n4);
        n4 = this.l();
        if (n4 <= n3) {
            object = this.c;
        } else {
            object = this.b;
            for (int i3 = this.e; i3 > 0; i3 += -5) {
                int n7 = Oz3.a(n3, i3);
                object = object[n7];
                String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
                Intrinsics.checkNotNull(object, string2);
            }
        }
        return object[n3 &= 0x1F];
    }

    public final Object[] h(Object[] objectArray, Object[] objectArray2, int n3) {
        Object[] objectArray3;
        int n4;
        int n7;
        block6: {
            block5: {
                n7 = Oz3.a(this.a() + -1, n3);
                n4 = 32;
                if (objectArray == null) break block5;
                objectArray = Arrays.copyOf(objectArray, n4);
                objectArray3 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(objectArray, (String)objectArray3);
                if (objectArray != null) break block6;
            }
            objectArray = new Object[n4];
        }
        if (n3 == (n4 = 5)) {
            objectArray[n7] = objectArray2;
        } else {
            objectArray3 = (Object[])objectArray[n7];
            objectArray[n7] = objectArray2 = this.h(objectArray3, objectArray2, n3 -= n4);
        }
        return objectArray;
    }

    public final Object[] i(Object[] objectArray, int n3, int n4, q62 q622) {
        Object[] objectArray2;
        int n7 = Oz3.a(n4, n3);
        int n8 = 31;
        String string2 = "copyOf(this, newSize)";
        int n10 = 32;
        if (n3 == 0) {
            Object object;
            Object[] objectArray3;
            if (n7 == 0) {
                objectArray3 = new Object[n10];
            } else {
                objectArray3 = Arrays.copyOf(objectArray, n10);
                Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            }
            n4 = n7 + 1;
            rp_1.i(objectArray, n7, objectArray3, n4, n10);
            objectArray3[n8] = object = q622.a;
            q622.a = objectArray = objectArray[n7];
            return objectArray3;
        }
        Object[] objectArray4 = objectArray[n8];
        if (objectArray4 == null) {
            n8 = Oz3.a(this.l() + -1, n3);
        }
        objectArray = Arrays.copyOf(objectArray, n10);
        Intrinsics.checkNotNullExpressionValue(objectArray, string2);
        n3 += -5;
        int n14 = n7 + 1;
        String string3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        if (n14 <= n8) {
            while (true) {
                objectArray4 = objectArray[n8];
                Intrinsics.checkNotNull(objectArray4, string3);
                objectArray4 = objectArray4;
                objectArray[n8] = objectArray4 = this.i(objectArray4, n3, 0, q622);
                if (n8 == n14) break;
                n8 += -1;
            }
        }
        Object[] objectArray5 = objectArray[n7];
        Intrinsics.checkNotNull(objectArray5, string3);
        objectArray5 = objectArray5;
        objectArray[n7] = objectArray2 = this.i(objectArray5, n3, n4, q622);
        return objectArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final j1_0 j(Object[] objectArray, int n3, int n4, int n7) {
        int n8 = this.d - n3;
        int n10 = 1;
        String string2 = "copyOf(this, newSize)";
        int n14 = 32;
        if (n8 == n10) {
            if (n4 == 0) {
                n3 = objectArray.length;
                n4 = 33;
                if (n3 != n4) return new s73_0(objectArray);
                objectArray = Arrays.copyOf(objectArray, n14);
                Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                return new s73_0(objectArray);
            }
            Object[] objectArray2 = new q62(null);
            n8 = n3 + -1;
            objectArray = mr2.f(objectArray, n4, n8, (q62)objectArray2);
            Intrinsics.checkNotNull(objectArray);
            objectArray2 = objectArray2.a;
            Object object = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(objectArray2, (String)object);
            objectArray2 = objectArray2;
            Object object2 = objectArray[n10];
            if (object2 != null) return new mr2(objectArray, n3, n4, objectArray2);
            n10 = 0;
            object2 = null;
            objectArray = objectArray[0];
            Intrinsics.checkNotNull(objectArray, (String)object);
            object = new mr2(objectArray, n3, n4 += -5, objectArray2);
            return object;
        }
        Object[] objectArray3 = this.c;
        Object[] objectArray4 = Arrays.copyOf(objectArray3, n14);
        Intrinsics.checkNotNullExpressionValue(objectArray4, string2);
        int n15 = n8 + -1;
        if (n7 < n15) {
            int n16 = n7 + 1;
            rp_1.i(objectArray3, n7, objectArray4, n16, n8);
        }
        objectArray4[n15] = null;
        n3 = n3 + n8 - n10;
        return new mr2(objectArray, n3, n4, objectArray4);
    }

    public final ir2 k(int n3) {
        int n4 = this.d;
        bv1_0.a(n3, n4);
        n4 = this.l();
        Object[] objectArray = this.b;
        int n7 = this.e;
        if (n3 >= n4) {
            return this.j(objectArray, n4, n7, n3 -= n4);
        }
        Object object = this.c[0];
        q62 q622 = new q62(object);
        Object[] objectArray2 = this.i(objectArray, n7, n3, q622);
        return this.j(objectArray2, n4, n7, 0);
    }

    public final int l() {
        return this.d + -1 & 0xFFFFFFE0;
    }

    public final ListIterator listIterator(int n3) {
        int n4 = this.a();
        bv1_0.b(n3, n4);
        int n7 = this.a();
        int n8 = this.e / 5 + 1;
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        or2 or22 = new or2(objectArray, n3, objectArray2, n7, n8);
        return or22;
    }

    public final ir2 set(int n3, Object object) {
        int n4 = this.d;
        bv1_0.a(n3, n4);
        int n7 = this.l();
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        int n8 = this.e;
        if (n7 <= n3) {
            Object[] objectArray3 = Arrays.copyOf(objectArray2, 32);
            Intrinsics.checkNotNullExpressionValue(objectArray3, "copyOf(this, newSize)");
            objectArray3[n3 &= 0x1F] = object;
            mr2 mr22 = new mr2(objectArray, n4, n8, objectArray3);
            return mr22;
        }
        Object[] objectArray4 = mr2.m(n8, n3, object, objectArray);
        object = new mr2(objectArray4, n4, n8, objectArray2);
        return object;
    }
}

