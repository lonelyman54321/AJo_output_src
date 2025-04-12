/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class a53 {
    public int[] a;
    public Object[] b;
    public int c;

    public a53() {
        this(0);
    }

    public a53(int n3) {
        int[] nArray = n3 == 0 ? A62.a : new int[n3];
        this.a = nArray;
        Object[] objectArray = n3 == 0 ? A62.c : new Object[n3 <<= 1];
        this.b = objectArray;
    }

    public a53(a53 a532) {
        this(0);
        if (a532 != null) {
            this.i(a532);
        }
    }

    public final int a(Object object) {
        int n3 = this.c * 2;
        Object[] objectArray = this.b;
        int n4 = 1;
        if (object == null) {
            for (int i3 = 1; i3 < n3; i3 += 2) {
                Object object2 = objectArray[i3];
                if (object2 != null) continue;
                return i3 >> n4;
            }
        } else {
            for (int i8 = 1; i8 < n3; i8 += 2) {
                Object object3 = objectArray[i8];
                boolean bl2 = Intrinsics.areEqual(object, object3);
                if (!bl2) continue;
                return i8 >> 1;
            }
        }
        return -1;
    }

    public final void c(int n3) {
        Object object;
        int n4 = this.c;
        Object[] objectArray = this.a;
        int n7 = objectArray.length;
        if (n7 < n3) {
            objectArray = Arrays.copyOf(objectArray, n3);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            this.a = objectArray;
            objectArray = this.b;
            object = Arrays.copyOf(objectArray, n3 *= 2);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            this.b = object;
        }
        if ((n3 = this.c) == n4) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public void clear() {
        Object object;
        int n3 = this.c;
        if (n3 > 0) {
            object = A62.a;
            this.a = object;
            object = A62.c;
            this.b = object;
            n3 = 0;
            object = null;
            this.c = 0;
        }
        if ((n3 = this.c) <= 0) {
            return;
        }
        object = new ConcurrentModificationException;
        object();
        throw object;
    }

    public boolean containsKey(Object object) {
        int n3 = this.f(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public boolean containsValue(Object object) {
        int n3 = this.a(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final int e(int n3, Object object) {
        Object object2;
        Object object3;
        int n4 = this.c;
        if (n4 == 0) {
            return -1;
        }
        int[] nArray = this.a;
        int n7 = A62.a(n4, n3, nArray);
        if (n7 < 0) {
            return n7;
        }
        Object object4 = this.b;
        int n8 = n7 << 1;
        int n10 = Intrinsics.areEqual(object, object4 = object4[n8]);
        if (n10 != 0) {
            return n7;
        }
        for (n10 = n7 + 1; n10 < n4 && (n8 = (object3 = this.a)[n10]) == n3; ++n10) {
            object3 = this.b;
            int n14 = n10 << 1;
            n8 = (int)(Intrinsics.areEqual(object, object3 = (Object)object3[n14]) ? 1 : 0);
            if (n8 == 0) continue;
            return n10;
        }
        n7 += -1;
        while (n7 >= 0 && (n4 = (object2 = this.a)[n7]) == n3) {
            object2 = this.b;
            n8 = n7 << 1;
            n4 = (int)(Intrinsics.areEqual(object, object2 = (Object)object2[n8]) ? 1 : 0);
            if (n4 != 0) {
                return n7;
            }
            n7 += -1;
        }
        return ~n10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        block15: {
            boolean bl2 = true;
            if (this == object) {
                return bl2;
            }
            int n3 = object instanceof a53;
            if (n3 != 0) {
                n3 = this.c;
                Object object2 = object;
                object2 = (a53)object;
                int n4 = ((a53)object2).c;
                if (n3 != n4) {
                    return false;
                }
                object = (a53)object;
                n4 = 0;
                object2 = null;
                while (true) {
                    boolean bl3;
                    if (n4 >= n3) {
                        return bl2;
                    }
                    Object object5 = this.h(n4);
                    Object object4 = this.l(n4);
                    Object object3 = ((a53)object).get(object5);
                    if (object4 == null ? object3 != null || !(bl3 = ((a53)object).containsKey(object5)) : !(bl3 = Intrinsics.areEqual(object4, object3))) {
                        return false;
                    }
                    ++n4;
                }
            }
            n3 = object instanceof Map;
            if (n3 == 0) break block15;
            try {
                n3 = this.c;
                Object object6 = object;
                object6 = (Map)object;
                int n7 = object6.size();
                if (n3 != n7) {
                    return false;
                }
                n3 = this.c;
                n7 = 0;
                object6 = null;
                while (true) {
                    block18: {
                        boolean bl4;
                        Object object7;
                        Object object8;
                        block16: {
                            block17: {
                                if (n7 >= n3) {
                                    return bl2;
                                }
                                Object object9 = this.h(n7);
                                object8 = this.l(n7);
                                object7 = object;
                                object7 = (Map)object;
                                object7 = object7.get(object9);
                                if (object8 != null) break block16;
                                if (object7 != null) break block17;
                                object8 = object;
                                object8 = (Map)object;
                                bl4 = object8.containsKey(object9);
                                if (bl4) break block18;
                            }
                            return false;
                        }
                        bl4 = Intrinsics.areEqual(object8, object7);
                        if (!bl4) {
                            return false;
                        }
                    }
                    ++n7;
                }
            }
            catch (ClassCastException | NullPointerException runtimeException) {}
        }
        return false;
    }

    public final int f(Object object) {
        int n3;
        if (object == null) {
            n3 = this.g();
        } else {
            int n4 = object.hashCode();
            n3 = this.e(n4, object);
        }
        return n3;
    }

    public final int g() {
        Object object;
        Object object2;
        int n3 = this.c;
        if (n3 == 0) {
            return -1;
        }
        int[] nArray = this.a;
        int n4 = 0;
        Object object3 = null;
        int n7 = A62.a(n3, 0, nArray);
        if (n7 < 0) {
            return n7;
        }
        object3 = this.b;
        int n8 = n7 << 1;
        if ((object3 = object3[n8]) == null) {
            return n7;
        }
        for (n4 = n7 + 1; n4 < n3 && (n8 = (object2 = this.a)[n4]) == 0; ++n4) {
            object2 = this.b;
            int n10 = n4 << 1;
            if ((object2 = (Object)object2[n10]) != null) continue;
            return n4;
        }
        n7 += -1;
        while (n7 >= 0 && (n3 = (object = this.a)[n7]) == 0) {
            object = this.b;
            n8 = n7 << 1;
            if ((object = (Object)object[n8]) == null) {
                return n7;
            }
            n7 += -1;
        }
        return ~n4;
    }

    public Object get(Object object) {
        int n3 = this.f(object);
        if (n3 >= 0) {
            Object[] objectArray = this.b;
            n3 = (n3 << 1) + 1;
            object = objectArray[n3];
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final Object getOrDefault(Object object, Object object2) {
        int n3 = this.f(object);
        if (n3 >= 0) {
            object2 = this.b;
            n3 = (n3 << 1) + 1;
            object2 = object2[n3];
        }
        return object2;
    }

    public final Object h(int n3) {
        int n4;
        boolean bl2 = false;
        Object[] objectArray = null;
        int n7 = 1;
        if (n3 >= 0 && n3 < (n4 = this.c)) {
            bl2 = true;
        }
        if (bl2) {
            objectArray = this.b;
            return objectArray[n3 <<= n7];
        }
        objectArray = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        objectArray.append(n3);
        iv2_2.c(objectArray.toString());
        throw null;
    }

    public int hashCode() {
        int[] nArray = this.a;
        Object[] objectArray = this.b;
        int n3 = this.c;
        int n4 = 1;
        int n7 = 0;
        int n8 = 0;
        while (n7 < n3) {
            int n10;
            Object object = objectArray[n4];
            int n14 = nArray[n7];
            if (object != null) {
                n10 = object.hashCode();
            } else {
                n10 = 0;
                object = null;
            }
            n8 += (n10 ^= n14);
            ++n7;
            n4 += 2;
        }
        return n8;
    }

    public void i(a53 objectArray) {
        String string2 = "map";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int n3 = objectArray.c;
        int n4 = this.c + n3;
        this.c(n4);
        n4 = this.c;
        if (n4 == 0) {
            if (n3 > 0) {
                Object[] objectArray2 = objectArray.a;
                int[] nArray = this.a;
                rp_1.f(0, 0, n3, objectArray2, nArray);
                objectArray = objectArray.b;
                objectArray2 = this.b;
                int n7 = n3 << 1;
                rp_1.i(objectArray, 0, objectArray2, 0, n7);
                this.c = n3;
            }
        } else {
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = objectArray.h(i3);
                Object object2 = objectArray.l(i3);
                this.put(object, object2);
            }
        }
    }

    public final boolean isEmpty() {
        int n3 = this.c;
        n3 = n3 <= 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object j(int n3) {
        Object[] objectArray;
        Object[] objectArray2;
        int n4;
        int n7 = 0;
        Object object = null;
        int n8 = 1;
        if (n3 >= 0 && n3 < (n4 = this.c)) {
            n4 = 1;
        } else {
            n4 = 0;
            objectArray2 = null;
        }
        int n10 = 0;
        Object var8_8 = null;
        if (n4 == 0) {
            object = new StringBuilder("Expected index to be within 0..size()-1, but was ");
            ((StringBuilder)object).append(n3);
            iv2_2.c(((StringBuilder)object).toString());
            throw null;
        }
        objectArray2 = this.b;
        int n14 = n3 << 1;
        int n15 = n14 + 1;
        Object object2 = objectArray2[n15];
        int n16 = this.c;
        if (n16 <= n8) {
            this.clear();
            return object2;
        }
        int n17 = n16 + -1;
        int[] nArray = this.a;
        int n18 = nArray.length;
        int n19 = 8;
        if (n18 > n19 && n16 < (n18 = nArray.length / 3)) {
            if (n16 > n19) {
                n10 = n16 >> 1;
                n19 = n16 + n10;
            }
            int[] nArray2 = Arrays.copyOf(nArray, n19);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(nArray2, string2);
            this.a = nArray2;
            Object[] objectArray4 = this.b;
            objectArray4 = Arrays.copyOf(objectArray4, n19 <<= n8);
            Intrinsics.checkNotNullExpressionValue(objectArray4, string2);
            this.b = objectArray4;
            n10 = this.c;
            if (n16 != n10) {
                ConcurrentModificationException concurrentModificationException = new ConcurrentModificationException();
                throw concurrentModificationException;
            }
            if (n3 > 0) {
                int[] nArray3 = this.a;
                rp_1.f(0, 0, n3, nArray, nArray3);
                Object[] objectArray5 = this.b;
                rp_1.i(objectArray2, 0, objectArray5, 0, n14);
            }
            if (n3 < n17) {
                object = this.a;
                n10 = n3 + 1;
                rp_1.f(n3, n10, n16, nArray, (int[])object);
                objectArray = this.b;
                n7 = n10 << 1;
                n8 = n16 << 1;
                rp_1.i(objectArray2, n14, objectArray, n7, n8);
            }
        } else {
            if (n3 < n17) {
                n7 = n3 + 1;
                rp_1.f(n3, n7, n16, nArray, nArray);
                objectArray = this.b;
                n4 = n16 << 1;
                rp_1.i(objectArray, n14, objectArray, n7 <<= n8, n4);
            }
            objectArray = this.b;
            n7 = n17 << 1;
            objectArray[n7] = null;
            objectArray[n7 += n8] = null;
        }
        if (n16 == (n3 = this.c)) {
            this.c = n17;
            return object2;
        }
        objectArray = new ConcurrentModificationException();
        throw objectArray;
    }

    public Object k(int n3, Object object) {
        int n4;
        boolean bl2 = false;
        Object[] objectArray = null;
        int n7 = 1;
        if (n3 >= 0 && n3 < (n4 = this.c)) {
            bl2 = true;
        }
        if (bl2) {
            n3 = (n3 << n7) + n7;
            objectArray = this.b;
            Object object2 = objectArray[n3];
            objectArray[n3] = object;
            return object2;
        }
        object = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        ((StringBuilder)object).append(n3);
        iv2_2.c(((StringBuilder)object).toString());
        throw null;
    }

    public final Object l(int n3) {
        int n4;
        boolean bl2 = false;
        Object[] objectArray = null;
        int n7 = 1;
        if (n3 >= 0 && n3 < (n4 = this.c)) {
            bl2 = true;
        }
        if (bl2) {
            objectArray = this.b;
            n3 = (n3 << n7) + n7;
            return objectArray[n3];
        }
        objectArray = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        objectArray.append(n3);
        iv2_2.c(objectArray.toString());
        throw null;
    }

    public Object put(Object object, Object object2) {
        Object[] objectArray;
        int n3;
        int n4;
        Object object3;
        int n7;
        int n8 = this.c;
        if (object != null) {
            n7 = object.hashCode();
        } else {
            n7 = 0;
            object3 = null;
        }
        int n10 = object != null ? this.e(n7, object) : this.g();
        if (n10 >= 0) {
            int n14 = (n10 << 1) + 1;
            Object[] objectArray2 = this.b;
            object3 = objectArray2[n14];
            objectArray2[n14] = object2;
            return object3;
        }
        n10 ^= 0xFFFFFFFF;
        Object[] objectArray3 = this.a;
        int n15 = objectArray3.length;
        if (n8 >= n15) {
            n15 = 8;
            if (n8 >= n15) {
                n15 = (n8 >> 1) + n8;
            } else {
                n4 = 4;
                if (n8 < n4) {
                    n15 = 4;
                }
            }
            objectArray3 = Arrays.copyOf(objectArray3, n15);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            this.a = objectArray3;
            objectArray3 = this.b;
            objectArray3 = Arrays.copyOf(objectArray3, n15 <<= 1);
            Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            this.b = objectArray3;
            n3 = this.c;
            if (n8 != n3) {
                object = new ConcurrentModificationException();
                throw object;
            }
        }
        if (n10 < n8) {
            objectArray3 = this.a;
            n15 = n10 + 1;
            rp_1.f(n15, n10, n8, objectArray3, objectArray3);
            objectArray3 = this.b;
            n4 = n10 << 1;
            int n16 = this.c << 1;
            rp_1.i(objectArray3, n15 <<= 1, objectArray3, n4, n16);
        }
        if (n8 == (n3 = this.c) && n10 < (n15 = (objectArray = this.a).length)) {
            objectArray[n10] = n7;
            objectArray = this.b;
            n7 = n10 << 1;
            objectArray[n7] = (int)object;
            objectArray[++n7] = (int)object2;
            this.c = ++n3;
            return null;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final Object putIfAbsent(Object object, Object object2) {
        Object object3 = this.get(object);
        if (object3 == null) {
            object3 = this.put(object, object2);
        }
        return object3;
    }

    public Object remove(Object object) {
        int n3 = this.f(object);
        if (n3 >= 0) {
            object = this.j(n3);
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final boolean remove(Object object, Object object2) {
        Object object3;
        boolean bl2;
        int n3 = this.f(object);
        if (n3 >= 0 && (bl2 = Intrinsics.areEqual(object2, object3 = this.l(n3)))) {
            this.j(n3);
            return true;
        }
        return false;
    }

    public final Object replace(Object object, Object object2) {
        int n3 = this.f(object);
        if (n3 >= 0) {
            object = this.k(n3, object2);
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final boolean replace(Object object, Object object2, Object object3) {
        Object object4;
        boolean bl2;
        int n3 = this.f(object);
        if (n3 >= 0 && (bl2 = Intrinsics.areEqual(object2, object4 = this.l(n3)))) {
            this.k(n3, object3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            return "{}";
        }
        n3 = this.c * 28;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('{');
        n3 = this.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            if (i3 > 0) {
                object = ", ";
                stringBuilder.append((String)object);
            }
            object = this.h(i3);
            String string2 = "(this Map)";
            if (object != stringBuilder) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append(string2);
            }
            char c2 = '=';
            stringBuilder.append(c2);
            object = this.l(i3);
            if (object != stringBuilder) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append(string2);
        }
        stringBuilder.append('}');
        String string3 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder(capacity).\u2026builderAction).toString()");
        return string3;
    }
}

