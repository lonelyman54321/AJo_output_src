/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fp
 */
public final class fp_2
extends e1_0 {
    public static final Fp$a d;
    public static final Object[] e;
    public int a;
    public Object[] b;
    public int c;

    static {
        Fp$a fp$a;
        d = fp$a = new Fp$a(null);
        e = new Object[0];
    }

    public fp_2() {
        Object[] objectArray = e;
        this.b = objectArray;
    }

    public final int a() {
        return this.c;
    }

    public final void add(int n3, Object object) {
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.c(n3, n4);
        int n7 = this.c;
        if (n3 == n7) {
            this.addLast(object);
            return;
        }
        if (n3 == 0) {
            this.addFirst(object);
            return;
        }
        n4 = 1;
        this.e(n7 += n4);
        n7 = this.a + n3;
        n7 = this.h(n7);
        int n8 = this.c;
        int n10 = n8 + 1 >> n4;
        int n14 = 0;
        Object object2 = null;
        if (n3 < n10) {
            Object[] objectArray2;
            if (n7 == 0) {
                Object[] objectArray3 = this.b;
                n3 = tp_2.C(objectArray3);
            } else {
                n3 = n7 + -1;
            }
            n7 = this.a;
            if (n7 == 0) {
                objectArray = this.b;
                n7 = tp_2.C(objectArray);
            } else {
                n7 -= n4;
            }
            n8 = this.a;
            if (n3 >= n8) {
                Object[] objectArray4 = this.b;
                objectArray4[n7] = object2 = objectArray4[n8];
                n14 = n8 + 1;
                int n15 = n3 + 1;
                rp_1.i(objectArray4, n8, objectArray4, n14, n15);
            } else {
                Object object3;
                Object[] objectArray5 = this.b;
                int n16 = n8 + -1;
                int n17 = objectArray5.length;
                rp_1.i(objectArray5, n16, objectArray5, n8, n17);
                objectArray2 = this.b;
                n10 = objectArray2.length - n4;
                objectArray2[n10] = object3 = objectArray2[0];
                n10 = n3 + 1;
                rp_1.i(objectArray2, 0, objectArray2, n4, n10);
            }
            objectArray2 = this.b;
            objectArray2[n3] = object;
            this.a = n7;
        } else {
            Object[] objectArray6;
            n3 = this.a;
            if (n7 < (n3 = this.h(n8 += n3))) {
                Object[] objectArray7 = this.b;
                n10 = n7 + 1;
                rp_1.i(objectArray7, n10, objectArray7, n7, n3);
            } else {
                Object object4 = this.b;
                rp_1.i(object4, n4, object4, 0, n3);
                objectArray6 = this.b;
                n8 = objectArray6.length - n4;
                objectArray6[0] = object4 = objectArray6[n8];
                n8 = n7 + 1;
                n10 = objectArray6.length - n4;
                rp_1.i(objectArray6, n8, objectArray6, n7, n10);
            }
            objectArray6 = this.b;
            objectArray6[n7] = object;
        }
        this.c = n3 = this.c + n4;
    }

    public final boolean add(Object object) {
        this.addLast(object);
        return true;
    }

    public final boolean addAll(int n3, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.c(n3, n4);
        int n7 = collection.isEmpty();
        n4 = 0;
        Object[] objectArray2 = null;
        if (n7 != 0) {
            return false;
        }
        n7 = this.c;
        if (n3 == n7) {
            return this.addAll(collection);
        }
        int n8 = collection.size() + n7;
        this.e(n8);
        n7 = this.a;
        n8 = this.c + n7;
        n7 = this.h(n8);
        n8 = this.a + n3;
        n8 = this.h(n8);
        int n10 = collection.size();
        int n14 = this.c;
        int n15 = 1;
        n14 = n14 + n15 >> n15;
        if (n3 < n14) {
            Object[] objectArray3;
            n3 = this.a;
            n7 = n3 - n10;
            if (n8 >= n3) {
                if (n7 >= 0) {
                    objectArray2 = this.b;
                    rp_1.i(objectArray2, n7, objectArray2, n3, n8);
                } else {
                    Object[] objectArray4 = this.b;
                    int n16 = objectArray4.length;
                    int n17 = objectArray4.length - (n7 += n16);
                    if (n17 >= (n16 = n8 - n3)) {
                        rp_1.i(objectArray4, n7, objectArray4, n3, n8);
                    } else {
                        n16 = n3 + n17;
                        rp_1.i(objectArray4, n7, objectArray4, n3, n16);
                        objectArray3 = this.b;
                        n14 = this.a + n17;
                        rp_1.i(objectArray3, 0, objectArray3, n14, n8);
                    }
                }
            } else {
                Object[] objectArray5 = this.b;
                int n18 = objectArray5.length;
                rp_1.i(objectArray5, n7, objectArray5, n3, n18);
                if (n10 >= n8) {
                    objectArray3 = this.b;
                    n14 = objectArray3.length - n10;
                    rp_1.i(objectArray3, n14, objectArray3, 0, n8);
                } else {
                    objectArray3 = this.b;
                    n14 = objectArray3.length - n10;
                    rp_1.i(objectArray3, n14, objectArray3, 0, n10);
                    objectArray3 = this.b;
                    rp_1.i(objectArray3, 0, objectArray3, n10, n8);
                }
            }
            this.a = n7;
            if ((n8 -= n10) < 0) {
                objectArray3 = this.b;
                n3 = objectArray3.length;
                n8 += n3;
            }
            this.d(n8, collection);
        } else {
            n3 = n8 + n10;
            if (n8 < n7) {
                Object[] objectArray6 = this.b;
                int n19 = objectArray6.length;
                if ((n10 += n7) <= n19) {
                    rp_1.i(objectArray6, n3, objectArray6, n8, n7);
                } else {
                    n19 = objectArray6.length;
                    if (n3 >= n19) {
                        n4 = objectArray6.length;
                        rp_1.i(objectArray6, n3 -= n4, objectArray6, n8, n7);
                    } else {
                        n19 = objectArray6.length;
                        n10 -= n19;
                        n10 = n7 - n10;
                        rp_1.i(objectArray6, 0, objectArray6, n10, n7);
                        objectArray = this.b;
                        rp_1.i(objectArray, n3, objectArray, n8, n10);
                    }
                }
            } else {
                Object[] objectArray7 = this.b;
                rp_1.i(objectArray7, n10, objectArray7, 0, n7);
                objectArray = this.b;
                n14 = objectArray.length;
                if (n3 >= n14) {
                    n4 = objectArray.length;
                    n3 -= n4;
                    n4 = objectArray.length;
                    rp_1.i(objectArray, n3, objectArray, n8, n4);
                } else {
                    n14 = objectArray.length - n10;
                    int n20 = objectArray.length;
                    rp_1.i(objectArray, 0, objectArray, n14, n20);
                    objectArray = this.b;
                    n4 = objectArray.length - n10;
                    rp_1.i(objectArray, n3, objectArray, n8, n4);
                }
            }
            this.d(n8, collection);
        }
        return n15 != 0;
    }

    public final boolean addAll(Collection collection) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(collection, string2);
        int n3 = collection.isEmpty();
        if (n3 != 0) {
            return false;
        }
        n3 = this.a();
        int n4 = collection.size() + n3;
        this.e(n4);
        n3 = this.a;
        n4 = this.a() + n3;
        n3 = this.h(n4);
        this.d(n3, collection);
        return true;
    }

    public final void addFirst(Object object) {
        int n3;
        int n4 = this.c + 1;
        this.e(n4);
        n4 = this.a;
        if (n4 == 0) {
            Object[] objectArray = this.b;
            n4 = tp_2.C(objectArray);
        } else {
            n4 += -1;
        }
        this.a = n4;
        this.b[n4] = object;
        this.c = n3 = this.c + 1;
    }

    public final void addLast(Object object) {
        int n3;
        int n4 = this.a() + 1;
        this.e(n4);
        Object[] objectArray = this.b;
        int n7 = this.a;
        int n8 = this.a() + n7;
        n7 = this.h(n8);
        objectArray[n7] = object;
        this.c = n3 = this.a() + 1;
    }

    public final Object c(int n3) {
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.b(n3, n4);
        int n7 = xx_2.h(this);
        if (n3 == n7) {
            return this.removeLast();
        }
        if (n3 == 0) {
            return this.removeFirst();
        }
        n7 = this.a + n3;
        n7 = this.h(n7);
        Object[] objectArray2 = this.b;
        Object object = objectArray2[n7];
        int n8 = this.c;
        int n10 = 1;
        int n14 = 0;
        if (n3 < (n8 >>= n10)) {
            Object[] objectArray3;
            n3 = this.a;
            if (n7 >= n3) {
                n8 = n3 + 1;
                rp_1.i(objectArray2, n8, objectArray2, n3, n7);
            } else {
                rp_1.i(objectArray2, n10, objectArray2, 0, n7);
                objectArray3 = this.b;
                n7 = objectArray3.length - n10;
                objectArray = objectArray3[n7];
                objectArray3[0] = objectArray;
                n7 = this.a;
                n4 = n7 + 1;
                n8 = objectArray3.length - n10;
                rp_1.i(objectArray3, n4, objectArray3, n7, n8);
            }
            objectArray3 = this.b;
            n7 = this.a;
            objectArray3[n7] = null;
            this.a = n3 = this.f(n7);
        } else {
            n3 = this.a;
            n4 = xx_2.h(this) + n3;
            n3 = this.h(n4);
            if (n7 <= n3) {
                objectArray2 = this.b;
                n8 = n7 + 1;
                n14 = n3 + 1;
                rp_1.i(objectArray2, n7, objectArray2, n8, n14);
            } else {
                Object object2;
                objectArray2 = this.b;
                n8 = n7 + 1;
                int n15 = objectArray2.length;
                rp_1.i(objectArray2, n7, objectArray2, n8, n15);
                objectArray = this.b;
                n4 = objectArray.length - n10;
                objectArray[n4] = object2 = objectArray[0];
                n4 = n3 + 1;
                rp_1.i(objectArray, 0, objectArray, n10, n4);
            }
            objectArray = this.b;
            objectArray[n3] = null;
        }
        this.c = n3 = this.c - n10;
        return object;
    }

    public final void clear() {
        int n3 = this.a;
        int n4 = this.a() + n3;
        n4 = this.a;
        n3 = this.h(n4);
        if (n4 < n3) {
            Object[] objectArray = this.b;
            rp_1.n(n4, n3, null, objectArray);
        } else {
            n4 = this.isEmpty() ^ 1;
            if (n4 != 0) {
                Object[] objectArray = this.b;
                int n7 = this.a;
                int n8 = objectArray.length;
                rp_1.n(n7, n8, null, objectArray);
                objectArray = this.b;
                rp_1.n(0, n3, null, objectArray);
            }
        }
        this.a = 0;
        this.c = 0;
    }

    public final boolean contains(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final void d(int n3, Collection collection) {
        int n4;
        Object e2;
        Object[] objectArray;
        boolean bl2;
        Iterator iterator = collection.iterator();
        Object[] objectArray2 = this.b;
        int n7 = objectArray2.length;
        while (n3 < n7 && (bl2 = iterator.hasNext())) {
            objectArray = this.b;
            e2 = iterator.next();
            objectArray[n3] = e2;
            ++n3;
        }
        n3 = this.a;
        objectArray2 = null;
        for (n7 = 0; n7 < n3 && (bl2 = iterator.hasNext()); ++n7) {
            objectArray = this.b;
            e2 = iterator.next();
            objectArray[n7] = e2;
        }
        n3 = this.a();
        this.c = n4 = collection.size() + n3;
    }

    public final void e(int n3) {
        if (n3 >= 0) {
            Object[] objectArray = this.b;
            int n4 = objectArray.length;
            if (n3 <= n4) {
                return;
            }
            Object object = e;
            if (objectArray == object) {
                int n7 = 10;
                if (n3 < n7) {
                    n3 = 10;
                }
                Object[] objectArray2 = new Object[n3];
                this.b = objectArray2;
                return;
            }
            object = x0_0.a;
            int n8 = objectArray.length;
            object.getClass();
            Object[] objectArray3 = new Object[X0$a.e(n8, n3)];
            objectArray = this.b;
            n4 = this.a;
            int n10 = objectArray.length;
            rp_1.i(objectArray, 0, objectArray3, n4, n10);
            objectArray = this.b;
            n4 = objectArray.length;
            n10 = this.a;
            rp_1.i(objectArray, n4 -= n10, objectArray3, 0, n10);
            this.a = 0;
            this.b = objectArray3;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Deque is too big.");
        throw illegalStateException;
    }

    public final int f(int n3) {
        Object[] objectArray = this.b;
        int n4 = tp_2.C(objectArray);
        n3 = n3 == n4 ? 0 : ++n3;
        return n3;
    }

    public final Object first() {
        boolean bl2 = this.isEmpty();
        if (!bl2) {
            Object[] objectArray = this.b;
            int n3 = this.a;
            return objectArray[n3];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException("ArrayDeque is empty.");
        throw noSuchElementException;
    }

    public final Object g() {
        Object object;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            object = this.b;
            int n3 = this.a;
            int n4 = xx_2.h(this) + n3;
            n3 = this.h(n4);
            object = object[n3];
        }
        return object;
    }

    public final Object get(int n3) {
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.b(n3, n4);
        objectArray = this.b;
        n4 = this.a + n3;
        n3 = this.h(n4);
        return objectArray[n3];
    }

    public final int h(int n3) {
        Object[] objectArray = this.b;
        int n4 = objectArray.length;
        if (n3 >= n4) {
            int n7 = objectArray.length;
            n3 -= n7;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int indexOf(Object objectArray) {
        int n3;
        int n4 = this.a;
        int n7 = this.a() + n4;
        n7 = this.a;
        n4 = this.h(n7);
        if (n7 < n4) {
            while (n7 < n4) {
                Object object = this.b[n7];
                boolean bl2 = Intrinsics.areEqual(objectArray, object);
                if (bl2) {
                    n3 = this.a;
                    return n7 - n3;
                }
                ++n7;
            }
            return -1;
        }
        if (n7 < n4) return -1;
        Object[] objectArray2 = this.b;
        int n8 = objectArray2.length;
        while (n7 < n8) {
            Object object = this.b[n7];
            boolean bl3 = Intrinsics.areEqual(objectArray, object);
            if (bl3) {
                n3 = this.a;
                return n7 - n3;
            }
            ++n7;
        }
        for (n7 = 0; n7 < n4; ++n7) {
            Object object = this.b[n7];
            n8 = (int)(Intrinsics.areEqual(objectArray, object) ? 1 : 0);
            if (n8 == 0) continue;
            objectArray = this.b;
            n3 = objectArray.length;
            n7 += n3;
            n3 = this.a;
            return n7 - n3;
        }
        return -1;
    }

    public final boolean isEmpty() {
        int n3 = this.a();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object last() {
        boolean bl2 = this.isEmpty();
        if (!bl2) {
            Object[] objectArray = this.b;
            int n3 = this.a;
            int n4 = xx_2.h(this) + n3;
            n3 = this.h(n4);
            return objectArray[n3];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException("ArrayDeque is empty.");
        throw noSuchElementException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int lastIndexOf(Object objectArray) {
        int n3;
        int n4 = this.a;
        int n7 = this.a() + n4;
        n4 = this.h(n7);
        n7 = this.a;
        int n8 = -1;
        if (n7 < n4) {
            if (n7 > (n4 += -1)) return n8;
            while (true) {
                Object object;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(objectArray, object = this.b[n4])) {
                    n3 = this.a;
                    return n4 - n3;
                }
                if (n4 == n7) return n8;
                n4 += -1;
            }
        }
        if (n7 <= n4) return n8;
        n4 += -1;
        while (n8 < n4) {
            Object object = this.b[n4];
            n7 = (int)(Intrinsics.areEqual(objectArray, object) ? 1 : 0);
            if (n7 != 0) {
                objectArray = this.b;
                n3 = objectArray.length;
                n4 += n3;
                n3 = this.a;
                return n4 - n3;
            }
            n4 += -1;
        }
        n7 = this.a;
        Object[] objectArray2 = this.b;
        n4 = tp_2.C(objectArray2);
        if (n7 > n4) return n8;
        while (true) {
            Object object;
            boolean bl3;
            if (bl3 = Intrinsics.areEqual(objectArray, object = this.b[n4])) {
                n3 = this.a;
                return n4 - n3;
            }
            if (n4 == n7) return n8;
            n4 += -1;
        }
    }

    public final boolean remove(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 == (n3 = -1)) {
            return false;
        }
        this.c(n4);
        return true;
    }

    public final boolean removeAll(Collection objectArray) {
        Object[] objectArray2 = "elements";
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        int n3 = this.isEmpty();
        int n4 = 0;
        if (n3 == 0 && (n3 = (objectArray2 = this.b).length) != 0) {
            int n7;
            n3 = this.a;
            int n8 = this.c + n3;
            n3 = this.h(n8);
            int n10 = 1;
            if (n8 < n3) {
                n7 = n8;
                for (n8 = this.a; n8 < n3; ++n8) {
                    Object object = this.b[n8];
                    boolean bl2 = objectArray.contains(object) ^ n10;
                    if (bl2) {
                        Object[] objectArray3 = this.b;
                        int n14 = n7 + 1;
                        objectArray3[n7] = object;
                        n7 = n14;
                        continue;
                    }
                    n4 = 1;
                }
                objectArray = this.b;
                rp_1.n(n7, n3, null, objectArray);
            } else {
                Object[] objectArray4 = this.b;
                n7 = objectArray4.length;
                int n15 = n8;
                int n16 = 0;
                Object var10_13 = null;
                while (n8 < n7) {
                    Object[] objectArray5 = this.b;
                    Object object = objectArray5[n8];
                    objectArray5[n8] = null;
                    boolean bl3 = objectArray.contains(object) ^ n10;
                    if (bl3) {
                        objectArray5 = this.b;
                        int n17 = n15 + 1;
                        objectArray5[n15] = object;
                        n15 = n17;
                    } else {
                        n16 = 1;
                    }
                    ++n8;
                }
                n7 = n8 = this.h(n15);
                while (n4 < n3) {
                    Object[] objectArray6 = this.b;
                    Object object = objectArray6[n4];
                    objectArray6[n4] = null;
                    n8 = objectArray.contains(object) ^ n10;
                    if (n8 != 0) {
                        objectArray6 = this.b;
                        objectArray6[n7] = object;
                        n7 = this.f(n7);
                    } else {
                        n16 = 1;
                    }
                    ++n4;
                }
                n4 = n16;
            }
            if (n4 != 0) {
                int n18 = this.a;
                if ((n7 -= n18) < 0) {
                    objectArray = this.b;
                    n18 = objectArray.length;
                    n7 += n18;
                }
                this.c = n7;
            }
        }
        return n4 != 0;
    }

    public final Object removeFirst() {
        int n3 = this.isEmpty();
        if (n3 == 0) {
            Object[] objectArray = this.b;
            int n4 = this.a;
            Object object = objectArray[n4];
            objectArray[n4] = null;
            this.a = n3 = this.f(n4);
            this.c = n3 = this.a() + -1;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException("ArrayDeque is empty.");
        throw noSuchElementException;
    }

    public final Object removeLast() {
        int n3 = this.isEmpty();
        if (n3 == 0) {
            n3 = this.a;
            int n4 = xx_2.h(this) + n3;
            n3 = this.h(n4);
            Object[] objectArray = this.b;
            Object object = objectArray[n3];
            objectArray[n3] = null;
            this.c = n3 = this.a() + -1;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException("ArrayDeque is empty.");
        throw noSuchElementException;
    }

    public final boolean retainAll(Collection objectArray) {
        Object[] objectArray2 = "elements";
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        int n3 = this.isEmpty();
        int n4 = 0;
        if (n3 == 0 && (n3 = (objectArray2 = this.b).length) != 0) {
            int n7;
            n3 = this.a;
            int n8 = this.c + n3;
            n8 = this.a;
            n3 = this.h(n8);
            if (n8 < n3) {
                n7 = n8;
                while (n8 < n3) {
                    Object object = this.b[n8];
                    boolean bl2 = objectArray.contains(object);
                    if (bl2) {
                        Object[] objectArray3 = this.b;
                        int n10 = n7 + 1;
                        objectArray3[n7] = object;
                        n7 = n10;
                    } else {
                        n4 = 1;
                    }
                    ++n8;
                }
                objectArray = this.b;
                rp_1.n(n7, n3, null, objectArray);
            } else {
                Object[] objectArray4 = this.b;
                n7 = objectArray4.length;
                int n14 = n8;
                int n15 = 0;
                Object var9_12 = null;
                while (n8 < n7) {
                    Object[] objectArray5 = this.b;
                    Object object = objectArray5[n8];
                    objectArray5[n8] = null;
                    boolean bl3 = objectArray.contains(object);
                    if (bl3) {
                        objectArray5 = this.b;
                        int n16 = n14 + 1;
                        objectArray5[n14] = object;
                        n14 = n16;
                    } else {
                        n15 = 1;
                    }
                    ++n8;
                }
                n7 = n8 = this.h(n14);
                while (n4 < n3) {
                    Object[] objectArray6 = this.b;
                    Object object = objectArray6[n4];
                    objectArray6[n4] = null;
                    n8 = (int)(objectArray.contains(object) ? 1 : 0);
                    if (n8 != 0) {
                        objectArray6 = this.b;
                        objectArray6[n7] = object;
                        n7 = this.f(n7);
                    } else {
                        n15 = 1;
                    }
                    ++n4;
                }
                n4 = n15;
            }
            if (n4 != 0) {
                int n17 = this.a;
                if ((n7 -= n17) < 0) {
                    objectArray = this.b;
                    n17 = objectArray.length;
                    n7 += n17;
                }
                this.c = n7;
            }
        }
        return n4 != 0;
    }

    public final Object set(int n3, Object object) {
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.b(n3, n4);
        int n7 = this.a + n3;
        n3 = this.h(n7);
        objectArray = this.b;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        return object2;
    }

    public final Object[] toArray() {
        Object[] objectArray = new Object[this.a()];
        return this.toArray(objectArray);
    }

    public final Object[] toArray(Object[] objectArray) {
        String string2 = "array";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int n3 = objectArray.length;
        int n4 = this.c;
        if (n3 < n4) {
            Intrinsics.checkNotNullParameter(objectArray, "reference");
            objectArray = Array.newInstance(objectArray.getClass().getComponentType(), n4);
            String string3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>";
            Intrinsics.checkNotNull(objectArray, string3);
        }
        n3 = this.a;
        n4 = this.c + n3;
        n3 = this.h(n4);
        n4 = this.a;
        if (n4 < n3) {
            Object[] objectArray2 = this.b;
            int n7 = 2;
            rp_1.k(objectArray2, n4, objectArray, n3, n7);
        } else {
            n4 = this.isEmpty() ^ 1;
            if (n4 != 0) {
                Object[] objectArray3 = this.b;
                int n8 = this.a;
                int n10 = objectArray3.length;
                rp_1.i(objectArray3, 0, objectArray, n8, n10);
                objectArray3 = this.b;
                n8 = objectArray3.length;
                n10 = this.a;
                rp_1.i(objectArray3, n8 -= n10, objectArray, 0, n3);
            }
        }
        n3 = this.c;
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int n14 = objectArray.length;
        if (n3 < n14) {
            n14 = 0;
            string2 = null;
            objectArray[n3] = null;
        }
        return objectArray;
    }
}

