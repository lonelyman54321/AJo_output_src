/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;

public final class nr2
extends e1_0
implements Collection,
KMutableCollection {
    public ir2 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public be3_1 e;
    public Object[] f;
    public Object[] g;
    public int h;

    public nr2(ir2 ir22, Object[] objectArray, Object[] objectArray2, int n3) {
        int n4;
        be3_1 be3_12;
        this.a = ir22;
        this.b = objectArray;
        this.c = objectArray2;
        this.d = n3;
        this.e = be3_12;
        this.f = objectArray;
        this.g = objectArray2;
        this.h = n4 = ir22.size();
    }

    public static void e(Object[] objectArray, int n3, Iterator iterator) {
        int n4;
        while (n3 < (n4 = 32) && (n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            n4 = n3 + 1;
            Object e2 = iterator.next();
            objectArray[n3] = e2;
            n3 = n4;
        }
    }

    public final void B(Object[] objectArray, Object[] objectArray2, Object[] objectArray3) {
        int n3 = this.h;
        int n4 = n3 >> 5;
        int n7 = 1;
        int n8 = this.d;
        int n10 = n7 << n8;
        if (n4 > n10) {
            int n14;
            objectArray = this.r(objectArray);
            n3 = this.d + 5;
            objectArray = this.C(objectArray, objectArray2, n3);
            this.f = objectArray;
            this.g = objectArray3;
            this.d = n14 = this.d + 5;
            this.h = n14 = this.h + n7;
        } else if (objectArray == null) {
            this.f = objectArray2;
            this.g = objectArray3;
            this.h = n3 += n7;
        } else {
            int n15;
            objectArray = this.C(objectArray, objectArray2, n8);
            this.f = objectArray;
            this.g = objectArray3;
            this.h = n15 = this.h + n7;
        }
    }

    public final Object[] C(Object[] objectArray, Object[] objectArray2, int n3) {
        int n4 = Oz3.a(this.a() + -1, n3);
        objectArray = this.m(objectArray);
        int n7 = 5;
        if (n3 == n7) {
            objectArray[n4] = objectArray2;
        } else {
            Object[] objectArray3 = (Object[])objectArray[n4];
            objectArray[n4] = objectArray2 = this.C(objectArray3, objectArray2, n3 -= n7);
        }
        return objectArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int D(Function1 function1, Object[] objectArray, int n3, int n4, q62 q622, ArrayList arrayList, ArrayList arrayList2) {
        boolean bl2 = this.j(objectArray);
        if (bl2) {
            arrayList.add(objectArray);
        }
        Object[] objectArray2 = q622.a;
        Intrinsics.checkNotNull(objectArray2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objectArray3 = objectArray2 = (Object[])objectArray2;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            Boolean bl3 = (Boolean)function1.invoke(object);
            int n7 = bl3.booleanValue();
            if (n7 != 0) continue;
            n7 = 32;
            if (n4 == n7) {
                Object[] objectArray4;
                n4 = arrayList.isEmpty() ^ 1;
                if (n4 != 0) {
                    n4 = arrayList.size() + -1;
                    objectArray4 = (Object[])arrayList.remove(n4);
                } else {
                    objectArray4 = this.q();
                }
                objectArray3 = objectArray4;
                n4 = 0;
                objectArray4 = null;
            }
            n7 = n4 + 1;
            objectArray3[n4] = object;
            n4 = n7;
        }
        q622.a = objectArray3;
        if (objectArray2 != objectArray3) {
            arrayList2.add(objectArray2);
        }
        return n4;
    }

    public final int E(Function1 function1, Object[] objectArray, int n3, q62 q622) {
        Object[] objectArray2 = objectArray;
        int n4 = n3;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            Boolean bl3 = (Boolean)function1.invoke(object);
            int n7 = bl3.booleanValue();
            if (n7 != 0) {
                if (bl2) continue;
                objectArray2 = this.m(objectArray);
                bl2 = true;
                n4 = i3;
                continue;
            }
            if (!bl2) continue;
            n7 = n4 + 1;
            objectArray2[n4] = object;
            n4 = n7;
        }
        q622.a = objectArray2;
        return n4;
    }

    public final int F(Function1 function1, int n3, q62 objectArray) {
        Object[] objectArray2 = this.g;
        int n4 = this.E(function1, objectArray2, n3, (q62)objectArray);
        if (n4 == n3) {
            return n3;
        }
        objectArray = objectArray.a;
        Intrinsics.checkNotNull(objectArray, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objectArray = objectArray;
        rp_1.n(n4, n3, null, objectArray);
        this.g = objectArray;
        int n7 = this.h;
        this.h = n7 -= (n3 -= n4);
        return n4;
    }

    public final boolean G(Function1 function1) {
        block16: {
            int n3;
            int n4;
            int n7;
            nr2 nr22;
            block13: {
                block14: {
                    Object object;
                    Object object2;
                    Object[] objectArray;
                    int n8;
                    Object object3;
                    int n10;
                    y0_0 y0_02;
                    int n14;
                    Object object4;
                    q62 q622;
                    Object[] objectArray2;
                    int n15;
                    block15: {
                        Function1 function12;
                        block12: {
                            nr22 = this;
                            function12 = function1;
                            n15 = this.N();
                            objectArray2 = null;
                            q622 = new q62(null);
                            object4 = this.f;
                            n14 = 1;
                            n7 = 0;
                            if (object4 != null) break block12;
                            n4 = this.F(function1, n15, q622);
                            if (n4 == n15) break block13;
                            break block14;
                        }
                        y0_02 = this.l(0);
                        n10 = 32;
                        n4 = 32;
                        while (n4 == n10 && (n3 = y0_02.hasNext()) != 0) {
                            object4 = (Object[])y0_02.next();
                            n4 = nr22.E(function12, (Object[])object4, n10, q622);
                        }
                        if (n4 != n10) break block15;
                        n4 = nr22.F(function12, n15, q622);
                        if (n4 == 0) {
                            Object[] objectArray3 = nr22.f;
                            int n16 = nr22.h;
                            int n17 = nr22.d;
                            nr22.v(objectArray3, n16, n17);
                        }
                        if (n4 == n15) break block13;
                        break block14;
                    }
                    n3 = y0_02.a - n14;
                    int n18 = n3 << 5;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int n19 = n4;
                    while ((n4 = (int)(y0_02.hasNext() ? 1 : 0)) != 0) {
                        object3 = object4 = y0_02.next();
                        object3 = object4;
                        n8 = 32;
                        object4 = this;
                        objectArray = function1;
                        object2 = q622;
                        n14 = n18;
                        n19 = this.D(function1, (Object[])object3, n8, n19, q622, arrayList2, arrayList);
                        n10 = 32;
                        n14 = 1;
                        n7 = 0;
                    }
                    n14 = n18;
                    n7 = 32;
                    object3 = nr22.g;
                    object4 = this;
                    objectArray = function1;
                    n8 = n15;
                    object2 = q622;
                    n4 = this.D(function1, (Object[])object3, n15, n19, q622, arrayList2, arrayList);
                    objectArray = q622.a;
                    object3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
                    Intrinsics.checkNotNull(objectArray, (String)object3);
                    objectArray = objectArray;
                    rp_1.n(n4, n7, null, objectArray);
                    n8 = (int)(arrayList.isEmpty() ? 1 : 0);
                    if (n8 != 0) {
                        object = nr22.f;
                        Intrinsics.checkNotNull(object);
                    } else {
                        object = nr22.f;
                        n19 = nr22.d;
                        object2 = arrayList.iterator();
                        object = nr22.x((Object[])object, n18, n19, (Iterator)object2);
                    }
                    n19 = arrayList.size() << 5;
                    n18 = n14 + n19;
                    n19 = n18 & 0x1F;
                    if (n19 != 0) break block16;
                    if (n18 == 0) {
                        n19 = 0;
                        nr22.d = 0;
                    } else {
                        int n20;
                        n19 = 0;
                        int n21 = n18 + -1;
                        while ((n20 = n21 >> (n10 = nr22.d)) == 0) {
                            nr22.d = n10 += -5;
                            object = object[0];
                            Intrinsics.checkNotNull(object, (String)object3);
                        }
                        objectArray2 = nr22.s((Object[])object, n21, n10);
                    }
                    nr22.f = objectArray2;
                    nr22.g = objectArray;
                    nr22.h = n18 += n4;
                }
                n7 = 1;
            }
            if (n7 != 0) {
                n4 = nr22.modCount;
                n3 = 1;
                nr22.modCount = n4 += n3;
            }
            return n7 != 0;
        }
        sn2.b("invalid size");
        throw null;
    }

    public final Object[] I(Object[] objectArray, int n3, int n4, q62 q622) {
        Object[] objectArray2;
        int n7 = Oz3.a(n4, n3);
        int n8 = 31;
        if (n3 == 0) {
            Object object = objectArray[n7];
            Object[] objectArray3 = this.m(objectArray);
            int n10 = n7 + 1;
            rp_1.i(objectArray, n7, objectArray3, n10, 32);
            objectArray3[n8] = objectArray = q622.a;
            q622.a = object;
            return objectArray3;
        }
        Object object = objectArray[n8];
        if (object == null) {
            n8 = Oz3.a(this.K() + -1, n3);
        }
        objectArray = this.m(objectArray);
        n3 += -5;
        int n14 = n7 + 1;
        String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        if (n14 <= n8) {
            while (true) {
                Object[] objectArray4 = objectArray[n8];
                Intrinsics.checkNotNull(objectArray4, string2);
                objectArray4 = objectArray4;
                objectArray[n8] = objectArray4 = this.I(objectArray4, n3, 0, q622);
                if (n8 == n14) break;
                n8 += -1;
            }
        }
        Object[] objectArray5 = objectArray[n7];
        Intrinsics.checkNotNull(objectArray5, string2);
        objectArray5 = objectArray5;
        objectArray[n7] = objectArray2 = this.I(objectArray5, n3, n4, q622);
        return objectArray;
    }

    public final Object J(Object[] objectArray, int n3, int n4, int n7) {
        Object object;
        int n8 = this.h - n3;
        int n10 = 1;
        if (n8 == n10) {
            object = this.g;
            n8 = 0;
            object = object[0];
            this.v(objectArray, n3, n4);
        } else {
            Object[] objectArray2 = this.g;
            Object object2 = objectArray2[n7];
            Object[] objectArray3 = this.m(objectArray2);
            int n14 = n7 + 1;
            rp_1.i(objectArray2, n7, objectArray3, n14, n8);
            n7 = n8 + -1;
            objectArray2 = null;
            objectArray3[n7] = null;
            this.f = objectArray;
            this.g = objectArray3;
            this.h = n3 = n3 + n8 - n10;
            this.d = n4;
            object = object2;
        }
        return object;
    }

    public final int K() {
        int n3 = this.h;
        int n4 = 32;
        if (n3 <= n4) {
            return 0;
        }
        return n3 + -1 & 0xFFFFFFE0;
    }

    public final Object[] L(Object[] objectArray, int n3, int n4, Object object, q62 q622) {
        int n7 = Oz3.a(n4, n3);
        Object[] objectArray2 = this.m(objectArray);
        if (n3 == 0) {
            if (objectArray2 != objectArray) {
                int n8;
                this.modCount = n8 = this.modCount + 1;
            }
            q622.a = objectArray = objectArray2[n7];
            objectArray2[n7] = object;
            return objectArray2;
        }
        objectArray = objectArray2[n7];
        Intrinsics.checkNotNull(objectArray, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objectArray3 = objectArray;
        objectArray3 = objectArray;
        int n10 = n3 + -5;
        objectArray2[n7] = objectArray = this.L(objectArray3, n10, n4, object, q622);
        return objectArray2;
    }

    public final void M(Collection object, int n3, Object[] objectArray, int n4, Object[][] objectArray2, int n7, Object[] objectArray3) {
        int n8 = 1;
        if (n7 >= n8) {
            int n10;
            objectArray = this.m(objectArray);
            objectArray2[0] = objectArray;
            int n14 = n3 & 0x1F;
            int n15 = n4 - n14 + (n3 = object.size() + n3 - n8 & 0x1F);
            if (n15 < (n10 = 32)) {
                rp_1.i(objectArray, n3 += n8, objectArray3, n14, n4);
            } else {
                Object[] objectArray4;
                n15 += -31;
                if (n7 == n8) {
                    objectArray4 = objectArray;
                } else {
                    objectArray4 = this.q();
                    objectArray2[n7 += -1] = objectArray4;
                }
                n15 = n4 - n15;
                rp_1.i(objectArray, 0, objectArray3, n15, n4);
                rp_1.i(objectArray, n3 += n8, objectArray4, n14, n15);
                objectArray3 = objectArray4;
            }
            object = object.iterator();
            nr2.e(objectArray, n14, (Iterator)object);
            while (n8 < n7) {
                Object[] objectArray5 = this.q();
                nr2.e(objectArray5, 0, (Iterator)object);
                objectArray2[n8] = objectArray5;
                ++n8;
            }
            nr2.e(objectArray3, 0, (Iterator)object);
            return;
        }
        sn2.b("requires at least one nullBuffer");
        throw null;
    }

    public final int N() {
        int n3 = this.h;
        int n4 = 32;
        if (n3 > n4) {
            n4 = n3 + -1 & 0xFFFFFFE0;
            n3 -= n4;
        }
        return n3;
    }

    public final int a() {
        return this.h;
    }

    public final void add(int n3, Object object) {
        int n4 = this.a();
        bv1_0.b(n3, n4);
        n4 = this.a();
        if (n3 == n4) {
            this.add(object);
            return;
        }
        this.modCount = n4 = this.modCount + 1;
        n4 = this.K();
        if (n3 >= n4) {
            Object[] objectArray = this.f;
            this.i(objectArray, n3 -= n4, object);
            return;
        }
        q62 q622 = new q62(null);
        Object[] objectArray = this.f;
        Intrinsics.checkNotNull(objectArray);
        int n7 = this.d;
        Object[] objectArray2 = this.h(objectArray, n7, n3, object, q622);
        object = q622.a;
        this.i(objectArray2, 0, object);
    }

    public final boolean add(Object objectArray) {
        int n3;
        int n4 = this.modCount;
        int n7 = 1;
        this.modCount = n4 += n7;
        n4 = this.N();
        if (n4 < (n3 = 32)) {
            int n8;
            Object[] objectArray2 = this.g;
            objectArray2 = this.m(objectArray2);
            objectArray2[n4] = objectArray;
            this.g = objectArray2;
            this.h = n8 = this.a() + n7;
        } else {
            objectArray = this.r(objectArray);
            Object[] objectArray3 = this.f;
            Object[] objectArray4 = this.g;
            this.B(objectArray3, objectArray4, objectArray);
        }
        return n7 != 0;
    }

    public final boolean addAll(int n3, Collection collection) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = this;
        int n4 = n3;
        int n7 = this.h;
        bv1_0.b(n3, n7);
        n7 = this.h;
        if (n3 == n7) {
            return this.addAll(collection);
        }
        n7 = (int)(collection.isEmpty() ? 1 : 0);
        int n8 = 0;
        Object object = null;
        if (n7 != 0) {
            return false;
        }
        n7 = this.modCount;
        int n10 = 1;
        this.modCount = n7 += n10;
        int n14 = n3 >> 5 << 5;
        n7 = this.h - n14;
        int n15 = collection.size() + n7 - n10;
        n7 = 32;
        int n16 = n15 / 32;
        if (n16 == 0) {
            n7 = n3 & 0x1F;
            n8 = collection.size() + n3 - n10 & 0x1F;
            Object[] objectArray4 = this.g;
            Object[] objectArray5 = this.m(objectArray4);
            int n17 = this.N();
            rp_1.i(objectArray4, n8 += n10, objectArray5, n7, n17);
            object = collection.iterator();
            nr2.e(objectArray5, n7, (Iterator)object);
            this.g = objectArray5;
            n7 = this.h;
            this.h = n8 = collection.size() + n7;
            return n10 != 0;
        }
        Object[][] objectArray6 = new Object[n16][];
        int n18 = this.N();
        n15 = this.h;
        int n19 = collection.size() + n15;
        if (n19 > n7) {
            n15 = n19 + -1 & 0xFFFFFFE0;
            n19 -= n15;
        }
        n15 = this.K();
        if (n4 >= n15) {
            objectArray2 = this.q();
            Object[] objectArray7 = objectArray3.g;
            objectArray = this;
            object = collection;
            n4 = n3;
            Object[] objectArray8 = objectArray2;
            this.M(collection, n3, objectArray7, n18, objectArray6, n16, objectArray2);
        } else if (n19 > n18) {
            n15 = n19 - n18;
            objectArray = objectArray3.g;
            objectArray2 = this.o(n15, objectArray);
            objectArray = this;
            object = collection;
            n4 = n3;
            n19 = n16;
            this.g(collection, n3, n15, objectArray6, n16, objectArray2);
        } else {
            Object[] objectArray9 = objectArray3.g;
            objectArray2 = this.q();
            n19 = n18 - n19;
            rp_1.i(objectArray9, 0, objectArray2, n19, n18);
            n15 = 32 - n19;
            objectArray = objectArray3.g;
            Object[] objectArray10 = this.o(n15, objectArray);
            n19 = n16 + -1;
            objectArray6[n19] = objectArray10;
            objectArray = this;
            object = collection;
            n4 = n3;
            this.g(collection, n3, n15, objectArray6, n19, objectArray10);
        }
        objectArray = objectArray3.f;
        objectArray = this.y(objectArray, n14, objectArray6);
        objectArray3.f = objectArray;
        objectArray3.g = objectArray2;
        n7 = objectArray3.h;
        objectArray3.h = n8 = collection.size() + n7;
        return n10 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = collection.isEmpty();
        Object[] objectArray = null;
        if (n3 != 0) {
            return false;
        }
        n3 = this.modCount;
        int n4 = 1;
        this.modCount = n3 += n4;
        n3 = this.N();
        Iterator iterator = collection.iterator();
        int n7 = 32 - n3;
        int n8 = collection.size();
        if (n7 >= n8) {
            int n10;
            objectArray = this.g;
            objectArray = this.m(objectArray);
            nr2.e(objectArray, n3, iterator);
            this.g = objectArray;
            n3 = this.h;
            this.h = n10 = collection.size() + n3;
        } else {
            int n14;
            n7 = (collection.size() + n3 - n4) / 32;
            Object[][] objectArray2 = new Object[n7][];
            Object[] objectArray3 = this.g;
            objectArray3 = this.m(objectArray3);
            nr2.e(objectArray3, n3, iterator);
            objectArray2[0] = objectArray3;
            for (n3 = 1; n3 < n7; ++n3) {
                objectArray3 = this.q();
                nr2.e(objectArray3, 0, iterator);
                objectArray2[n3] = objectArray3;
            }
            Object[] objectArray4 = this.f;
            n7 = this.K();
            objectArray4 = this.y(objectArray4, n7, objectArray2);
            this.f = objectArray4;
            objectArray4 = this.q();
            nr2.e(objectArray4, 0, iterator);
            this.g = objectArray4;
            n3 = this.h;
            this.h = n14 = collection.size() + n3;
        }
        return n4 != 0;
    }

    public final Object c(int n3) {
        int n4 = this.a();
        bv1_0.a(n3, n4);
        this.modCount = n4 = this.modCount + 1;
        n4 = this.K();
        if (n3 >= n4) {
            Object[] objectArray = this.f;
            int n7 = this.d;
            return this.J(objectArray, n4, n7, n3 -= n4);
        }
        Object[] objectArray = this.g[0];
        q62 q622 = new q62(objectArray);
        objectArray = this.f;
        Intrinsics.checkNotNull(objectArray);
        int n8 = this.d;
        Object[] objectArray2 = this.I(objectArray, n8, n3, q622);
        int n10 = this.d;
        this.J(objectArray2, n4, n10, 0);
        return q622.a;
    }

    public final ir2 d() {
        Object[] objectArray;
        Object object = this.f;
        Object[] objectArray2 = this.b;
        if (object == objectArray2 && (objectArray2 = this.g) == (objectArray = this.c)) {
            object = this.a;
        } else {
            this.e = objectArray2 = new Object();
            this.b = object;
            objectArray2 = this.g;
            this.c = objectArray2;
            if (object == null) {
                int n3 = objectArray2.length;
                if (n3 == 0) {
                    object = s73_0.c;
                } else {
                    objectArray2 = this.g;
                    int n4 = this.a();
                    objectArray2 = Arrays.copyOf(objectArray2, n4);
                    objectArray = "copyOf(this, newSize)";
                    Intrinsics.checkNotNullExpressionValue(objectArray2, (String)objectArray);
                    object = new s73_0(objectArray2);
                }
            } else {
                objectArray2 = this.f;
                Intrinsics.checkNotNull(objectArray2);
                objectArray = this.g;
                int n7 = this.a();
                int n8 = this.d;
                object = new mr2(objectArray2, n7, n8, objectArray);
            }
        }
        this.a = object;
        return object;
    }

    public final int f() {
        return this.modCount;
    }

    public final void g(Collection object, int n3, int n4, Object[][] objectArray, int n7, Object[] objectArray2) {
        Object[] objectArray3 = this.f;
        if (objectArray3 != null) {
            int n8;
            Object[] objectArray4;
            int n10;
            int n14 = n3 >> 5;
            int n15 = this.K() >> 5;
            KMappedMarker kMappedMarker = this.l(n15);
            int n16 = n7;
            Object object2 = objectArray2;
            while ((n10 = kMappedMarker.a + -1) != n14) {
                objectArray4 = (Object[])kMappedMarker.previous();
                int n17 = 32 - n4;
                n8 = 32;
                rp_1.i(objectArray4, 0, object2, n17, n8);
                object2 = this.o(n4, objectArray4);
                objectArray[n16 += -1] = object2;
            }
            Object e2 = kMappedMarker.previous();
            objectArray4 = e2;
            objectArray4 = (Object[])e2;
            n4 = (this.K() >> 5) + -1 - n14;
            n8 = n7 - n4;
            if (n8 < n7) {
                objectArray2 = objectArray[n8];
                Intrinsics.checkNotNull(objectArray2);
            }
            kMappedMarker = this;
            object2 = object;
            n16 = n3;
            this.M((Collection)object, n3, objectArray4, 32, objectArray, n8, objectArray2);
            return;
        }
        String string2 = "root is null".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Object get(int n3) {
        Object object;
        int n4 = this.a();
        bv1_0.a(n3, n4);
        n4 = this.K();
        if (n4 <= n3) {
            object = this.g;
        } else {
            object = this.f;
            Intrinsics.checkNotNull(object);
            for (int i3 = this.d; i3 > 0; i3 += -5) {
                int n7 = Oz3.a(n3, i3);
                object = object[n7];
                String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
                Intrinsics.checkNotNull(object, string2);
            }
        }
        return object[n3 &= 0x1F];
    }

    public final Object[] h(Object[] objectArray, int n3, int n4, Object object, q62 q622) {
        Object object2;
        int n7 = Oz3.a(n4, n3);
        if (n3 == 0) {
            n3 = 31;
            Object[] objectArray2 = objectArray[n3];
            q622.a = objectArray2;
            objectArray2 = this.m(objectArray);
            int n8 = n7 + 1;
            rp_1.i(objectArray, n8, objectArray2, n7, n3);
            objectArray2[n7] = object;
            return objectArray2;
        }
        objectArray = this.m(objectArray);
        n3 += -5;
        Object object3 = objectArray[n7];
        String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.checkNotNull(object3, string2);
        Object[] objectArray3 = object3;
        objectArray3 = object3;
        object3 = this;
        Object object4 = object;
        objectArray[n7] = object2 = this.h(objectArray3, n3, n4, object, q622);
        while (++n7 < (n4 = 32) && (object2 = objectArray[n7]) != null) {
            Intrinsics.checkNotNull(object2, string2);
            objectArray3 = object2;
            objectArray3 = object2;
            object4 = q622.a;
            object3 = this;
            objectArray[n7] = object2 = this.h(objectArray3, n3, 0, object4, q622);
        }
        return objectArray;
    }

    public final void i(Object[] objectArray, int n3, Object object) {
        int n4 = this.N();
        Object[] objectArray2 = this.g;
        objectArray2 = this.m(objectArray2);
        int n7 = 32;
        if (n4 < n7) {
            int n8;
            Object[] objectArray3 = this.g;
            int n10 = n3 + 1;
            rp_1.i(objectArray3, n10, objectArray2, n3, n4);
            objectArray2[n3] = object;
            this.f = objectArray;
            this.g = objectArray2;
            this.h = n8 = this.h + 1;
        } else {
            Object[] objectArray4 = this.g;
            n7 = 31;
            Object object2 = objectArray4[n7];
            int n14 = n3 + 1;
            rp_1.i(objectArray4, n14, objectArray2, n3, n7);
            objectArray2[n3] = object;
            Object[] objectArray5 = this.r(object2);
            this.B(objectArray, objectArray2, objectArray5);
        }
    }

    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final boolean j(Object[] object) {
        boolean bl2;
        be3_1 be3_12;
        int n3 = ((Object[])object).length;
        int n4 = 33;
        if (n3 == n4 && (object = object[n3 = 32]) == (be3_12 = this.e)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final y0_0 l(int n3) {
        Object[] objectArray = this.f;
        if (objectArray != null) {
            int n4 = this.K() >> 5;
            bv1_0.b(n3, n4);
            int n7 = this.d;
            if (n7 == 0) {
                K53 k53 = new K53(objectArray, n3);
                return k53;
            }
            gs3_0 gs3_02 = new gs3_0(objectArray, n3, n4, n7 /= 5);
            return gs3_02;
        }
        objectArray = "Invalid root".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)objectArray);
        throw illegalStateException;
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n3) {
        int n4 = this.a();
        bv1_0.b(n3, n4);
        pr2_0 pr2_02 = new pr2_0(this, n3);
        return pr2_02;
    }

    public final Object[] m(Object[] objectArray) {
        if (objectArray == null) {
            return this.q();
        }
        boolean bl2 = this.j(objectArray);
        if (bl2) {
            return objectArray;
        }
        Object[] objectArray2 = this.q();
        int n3 = objectArray.length;
        int n4 = 32;
        if (n3 > n4) {
            n3 = 32;
        }
        rp_1.k(objectArray, 0, objectArray2, n3, 6);
        return objectArray2;
    }

    public final Object[] o(int n3, Object[] objectArray) {
        int n4 = this.j(objectArray);
        if (n4 != 0) {
            n4 = 32 - n3;
            rp_1.i(objectArray, n3, objectArray, 0, n4);
            return objectArray;
        }
        Object[] objectArray2 = this.q();
        int n7 = 32 - n3;
        rp_1.i(objectArray, n3, objectArray2, 0, n7);
        return objectArray2;
    }

    public final Object[] q() {
        Object[] objectArray = new Object[33];
        be3_1 be3_12 = this.e;
        objectArray[32] = be3_12;
        return objectArray;
    }

    public final Object[] r(Object object) {
        Object[] objectArray = new Object[33];
        objectArray[0] = object;
        be3_1 be3_12 = this.e;
        objectArray[32] = be3_12;
        return objectArray;
    }

    public final boolean removeAll(Collection collection) {
        nr2$a nr2$a = new nr2$a(collection);
        return this.G(nr2$a);
    }

    public final Object[] s(Object[] objectArray, int n3, int n4) {
        int n7 = n4 >= 0 ? 1 : 0;
        Object[] objectArray2 = null;
        if (n7 != 0) {
            Object object;
            if (n4 == 0) {
                return objectArray;
            }
            n7 = Oz3.a(n3, n4);
            Object object2 = objectArray[n7];
            String string2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(object2, string2);
            object2 = object2;
            Object[] objectArray3 = this.s((Object[])object2, n3, n4 += -5);
            n4 = 31;
            if (n7 < n4 && (object2 = objectArray[n4 = n7 + 1]) != null) {
                int n8 = this.j(objectArray);
                if (n8 != 0) {
                    object2 = "<this>";
                    Intrinsics.checkNotNullParameter(objectArray, (String)object2);
                    n8 = 32;
                    Arrays.fill(objectArray, n4, n8, null);
                }
                objectArray2 = this.q();
                rp_1.i(objectArray, 0, objectArray2, 0, n4);
                objectArray = objectArray2;
            }
            if (objectArray3 != (object = objectArray[n7])) {
                objectArray = this.m(objectArray);
                objectArray[n7] = objectArray3;
            }
            return objectArray;
        }
        sn2.b("shift should be positive");
        throw null;
    }

    public final Object set(int n3, Object object) {
        int n4 = this.a();
        bv1_0.a(n3, n4);
        n4 = this.K();
        if (n4 <= n3) {
            Object object2;
            Object[] objectArray = this.g;
            if ((objectArray = this.m(objectArray)) != (object2 = this.g)) {
                int n7;
                this.modCount = n7 = this.modCount + 1;
            }
            object2 = objectArray[n3 &= 0x1F];
            objectArray[n3] = object;
            this.g = objectArray;
            return object2;
        }
        q62 q622 = new q62(null);
        Object[] objectArray = this.f;
        Intrinsics.checkNotNull(objectArray);
        int n8 = this.d;
        Object[] objectArray2 = this.L(objectArray, n8, n3, object, q622);
        this.f = objectArray2;
        return q622.a;
    }

    public final Object[] t(Object[] objectArray, int n3, int n4, q62 q622) {
        Object[] objectArray2;
        int n7 = Oz3.a(n4 + -1, n3);
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
            objectArray2 = this.t(objectArray3, n3 -= n8, n4, q622);
        }
        if (objectArray2 == null && n7 == 0) {
            return null;
        }
        objectArray = this.m(objectArray);
        objectArray[n7] = objectArray2;
        return objectArray;
    }

    public final void v(Object[] objectArray, int n3, int n4) {
        Object[] objectArray2 = null;
        if (n4 == 0) {
            this.f = null;
            if (objectArray == null) {
                objectArray = new Object[]{};
            }
            this.g = objectArray;
            this.h = n3;
            this.d = n4;
            return;
        }
        Object object = new q62(null);
        Intrinsics.checkNotNull(objectArray);
        objectArray = this.t(objectArray, n4, n3, (q62)object);
        Intrinsics.checkNotNull(objectArray);
        objectArray2 = ((q62)object).a;
        object = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.checkNotNull(objectArray2, (String)object);
        objectArray2 = objectArray2;
        this.g = objectArray2;
        this.h = n3;
        n3 = 1;
        Object object2 = objectArray[n3];
        if (object2 == null) {
            objectArray = (Object[])objectArray[0];
            this.f = objectArray;
            this.d = n4 += -5;
        } else {
            this.f = objectArray;
            this.d = n4;
        }
    }

    public final Object[] x(Object[] objectArray, int n3, int n4, Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        int n7 = 0;
        if (bl2) {
            Object[] objectArray2;
            boolean bl3;
            bl2 = false;
            int n8 = 1;
            if (n4 >= 0) {
                bl3 = true;
            } else {
                bl3 = false;
                objectArray2 = null;
            }
            if (bl3) {
                Object[] objectArray3;
                if (n4 == 0) {
                    return (Object[])iterator.next();
                }
                objectArray = this.m(objectArray);
                n7 = Oz3.a(n3, n4);
                objectArray2 = (Object[])objectArray[n7];
                objectArray[n7] = objectArray3 = this.x(objectArray2, n3, n4 += -5, iterator);
                while ((n7 += n8) < (n3 = 32) && (n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    objectArray3 = (Object[])objectArray[n7];
                    objectArray[n7] = objectArray3 = this.x(objectArray3, 0, n4, iterator);
                }
                return objectArray;
            }
            sn2.b("negative shift");
            throw null;
        }
        sn2.b("invalid buffersIterator");
        throw null;
    }

    public final Object[] y(Object[] objectArray, int n3, Object[][] object) {
        object = ArrayIteratorKt.iterator((Object[])object);
        int n4 = n3 >> 5;
        int n7 = 1;
        int n8 = this.d;
        int n10 = n7 << n8;
        objectArray = n4 < n10 ? this.x(objectArray, n3, n8, (Iterator)object) : this.m(objectArray);
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            this.d = n3 = this.d + 5;
            objectArray = this.r(objectArray);
            n3 = this.d;
            n4 = n7 << n3;
            this.x(objectArray, n4, n3, (Iterator)object);
        }
        return objectArray;
    }
}

