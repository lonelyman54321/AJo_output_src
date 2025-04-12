/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pB1
 */
public final class pb1_0
implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public pb1_0() {
        this(null);
    }

    public pb1_0(int n3) {
        if (n3 == 0) {
            Object[] objectArray = A62.b;
            this.b = objectArray;
            objectArray = A62.c;
            this.c = objectArray;
        } else {
            int n4;
            n3 *= 8;
            for (int i3 = 4; i3 < (n4 = 32); ++i3) {
                n4 = (1 << i3) + -12;
                if (n3 > n4) continue;
                n3 = n4;
                break;
            }
            long[] lArray = new long[n3 /= 8];
            this.b = lArray;
            Object[] objectArray = new Object[n3];
            this.c = objectArray;
        }
    }

    public /* synthetic */ pb1_0(Object object) {
        this(10);
    }

    public final void b(long l2, Long l3) {
        int n3;
        long[] lArray;
        long l4;
        long l7;
        int n4;
        int n7 = this.d;
        if (n7 != 0 && (n4 = (int)((l7 = l2 - (l4 = (lArray = this.b)[n3 = n7 + -1])) == 0L ? 0 : (l7 < 0L ? -1 : 1))) <= 0) {
            this.l(l2, l3);
        } else {
            int n8;
            String string2;
            Object[] objectArray;
            int n10;
            n4 = this.a;
            if (n4 != 0 && n7 >= (n3 = (lArray = this.b).length)) {
                Object[] objectArray2 = this.c;
                n10 = 0;
                objectArray = null;
                string2 = null;
                int n14 = 0;
                for (n8 = 0; n8 < n7; ++n8) {
                    Object object = objectArray2[n8];
                    Object object2 = rb1_0.a;
                    if (object == object2) continue;
                    if (n8 != n14) {
                        long l8;
                        lArray[n14] = l8 = lArray[n8];
                        objectArray2[n14] = object;
                        object = null;
                        objectArray2[n8] = null;
                    }
                    ++n14;
                }
                this.a = false;
                this.d = n14;
            }
            n7 = this.d;
            lArray = this.b;
            n4 = lArray.length;
            n3 = 1;
            if (n7 >= n4) {
                n4 = (n7 + 1) * 8;
                for (n10 = 4; n10 < (n8 = 32); ++n10) {
                    n8 = (n3 << n10) + -12;
                    if (n4 > n8) continue;
                    n4 = n8;
                    break;
                }
                objectArray = Arrays.copyOf(this.b, n4 /= 8);
                string2 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                this.b = objectArray;
                objectArray = this.c;
                lArray = Arrays.copyOf(objectArray, n4);
                Intrinsics.checkNotNullExpressionValue(lArray, string2);
                this.c = lArray;
            }
            lArray = this.b;
            lArray[n7] = l2;
            Object[] objectArray3 = this.c;
            objectArray3[n7] = l3;
            this.d = n7 += n3;
        }
    }

    public final void d() {
        int n3 = this.d;
        Object[] objectArray = this.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            objectArray[i3] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final pb1_0 e() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        object = (pb1_0)object;
        Object[] objectArray = (long[])this.b.clone();
        ((pb1_0)object).b = objectArray;
        objectArray = (Object[])this.c.clone();
        ((pb1_0)object).c = objectArray;
        return object;
    }

    public final Object f(long l2) {
        Object object;
        Object object2;
        long[] lArray = this.b;
        int n3 = this.d;
        int n4 = A62.b(lArray, n3, l2);
        if (n4 < 0 || (object2 = this.c[n4]) == (object = rb1_0.a)) {
            n4 = 0;
            object2 = null;
        }
        return object2;
    }

    public final Object g(long l2) {
        Object object;
        Object object2;
        long l3 = -1;
        Object object3 = l3;
        long[] lArray = this.b;
        int n3 = this.d;
        int n4 = A62.b(lArray, n3, l2);
        if (n4 >= 0 && (object2 = this.c[n4]) != (object = rb1_0.a)) {
            object3 = object2;
        }
        return object3;
    }

    public final int i(long l2) {
        int n3 = this.a;
        if (n3 != 0) {
            n3 = this.d;
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            int n4 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = objectArray[i3];
                Object object2 = rb1_0.a;
                if (object == object2) continue;
                if (i3 != n4) {
                    long l3;
                    lArray[n4] = l3 = lArray[i3];
                    objectArray[n4] = object;
                    object = null;
                    objectArray[i3] = null;
                }
                ++n4;
            }
            this.a = false;
            this.d = n4;
        }
        long[] lArray = this.b;
        int n7 = this.d;
        return A62.b(lArray, n7, l2);
    }

    public final boolean j() {
        int n3 = this.n();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final long k(int n3) {
        int n4;
        StringBuilder stringBuilder = null;
        n4 = n3 >= 0 && n3 < (n4 = this.d) ? 1 : 0;
        if (n4 != 0) {
            n4 = (int)(this.a ? 1 : 0);
            if (n4 != 0) {
                n4 = this.d;
                long[] lArray = this.b;
                Object[] objectArray = this.c;
                int n7 = 0;
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object = objectArray[i3];
                    Object object2 = rb1_0.a;
                    if (object == object2) continue;
                    if (i3 != n7) {
                        long l2;
                        lArray[n7] = l2 = lArray[i3];
                        objectArray[n7] = object;
                        objectArray[i3] = null;
                    }
                    ++n7;
                }
                this.a = false;
                this.d = n7;
            }
            return this.b[n3];
        }
        stringBuilder = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n3);
        iv2_2.c(stringBuilder.toString());
        throw null;
    }

    public final void l(long l2, Object object) {
        Object[] objectArray = this.b;
        int n3 = this.d;
        int n4 = A62.b(objectArray, n3, l2);
        if (n4 >= 0) {
            Object[] objectArray2 = this.c;
            objectArray2[n4] = object;
        } else {
            Object[] objectArray3;
            Object object2;
            n3 = this.d;
            Object[] objectArray4 = rb1_0.a;
            if ((n4 ^= 0xFFFFFFFF) < n3 && (object2 = (objectArray3 = this.c)[n4]) == objectArray4) {
                long[] lArray = this.b;
                lArray[n4] = l2;
                objectArray3[n4] = object;
            } else {
                int n7;
                Object[] objectArray5;
                String string2;
                int n8;
                int n10 = (int)(this.a ? 1 : 0);
                if (n10 != 0 && n3 >= (n8 = (objectArray3 = (Object[])this.b).length)) {
                    objectArray = this.c;
                    n8 = 0;
                    object2 = null;
                    string2 = null;
                    int n14 = 0;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        long l3 = objectArray[i3];
                        if (l3 == objectArray4) continue;
                        if (i3 != n14) {
                            Object object3;
                            objectArray3[n14] = object3 = objectArray3[i3];
                            objectArray[n14] = l3;
                            l3 = (long)null;
                            objectArray[i3] = (long)null;
                        }
                        ++n14;
                    }
                    this.a = false;
                    this.d = n14;
                    objectArray = this.b;
                    n4 = ~A62.b(objectArray, n14, l2);
                }
                n3 = this.d;
                objectArray4 = this.b;
                int n15 = objectArray4.length;
                n10 = 1;
                if (n3 >= n15) {
                    n3 = (n3 + n10) * 8;
                    for (n15 = 4; n15 < (n8 = 32); ++n15) {
                        n8 = (n10 << n15) + -12;
                        if (n3 > n8) continue;
                        n3 = n8;
                        break;
                    }
                    objectArray4 = Arrays.copyOf(this.b, n3 /= 8);
                    object2 = "copyOf(this, newSize)";
                    Intrinsics.checkNotNullExpressionValue(objectArray4, (String)object2);
                    this.b = (long[])objectArray4;
                    objectArray4 = this.c;
                    objectArray5 = Arrays.copyOf(objectArray4, n3);
                    Intrinsics.checkNotNullExpressionValue(objectArray5, (String)object2);
                    this.c = objectArray5;
                }
                if ((n3 = this.d - n4) != 0) {
                    objectArray4 = this.b;
                    n8 = n4 + 1;
                    Intrinsics.checkNotNullParameter(objectArray4, "<this>");
                    string2 = "destination";
                    Intrinsics.checkNotNullParameter(objectArray4, string2);
                    System.arraycopy(objectArray4, n4, objectArray4, n8, n3);
                    objectArray5 = this.c;
                    n15 = this.d;
                    rp_1.i(objectArray5, n8, objectArray5, n4, n15);
                }
                objectArray5 = this.b;
                objectArray5[n4] = l2;
                Object[] objectArray6 = this.c;
                objectArray6[n4] = object;
                this.d = n7 = this.d + n10;
            }
        }
    }

    public final void m(long l2) {
        Object object;
        Object[] objectArray;
        Object object2 = this.b;
        int n3 = this.d;
        int n4 = A62.b(object2, n3, l2);
        if (n4 >= 0 && (object2 = (Object)(objectArray = this.c)[n4]) != (object = rb1_0.a)) {
            objectArray[n4] = object;
            n4 = 1;
            this.a = n4;
        }
    }

    public final int n() {
        int n3 = this.a;
        if (n3 != 0) {
            n3 = this.d;
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            int n4 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = objectArray[i3];
                Object object2 = rb1_0.a;
                if (object == object2) continue;
                if (i3 != n4) {
                    long l2;
                    lArray[n4] = l2 = lArray[i3];
                    objectArray[n4] = object;
                    object = null;
                    objectArray[i3] = null;
                }
                ++n4;
            }
            this.a = false;
            this.d = n4;
        }
        return this.d;
    }

    public final Object o(int n3) {
        int n4;
        StringBuilder stringBuilder = null;
        n4 = n3 >= 0 && n3 < (n4 = this.d) ? 1 : 0;
        if (n4 != 0) {
            n4 = (int)(this.a ? 1 : 0);
            if (n4 != 0) {
                n4 = this.d;
                long[] lArray = this.b;
                Object[] objectArray = this.c;
                int n7 = 0;
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object = objectArray[i3];
                    Object object2 = rb1_0.a;
                    if (object == object2) continue;
                    if (i3 != n7) {
                        long l2;
                        lArray[n7] = l2 = lArray[i3];
                        objectArray[n7] = object;
                        objectArray[i3] = null;
                    }
                    ++n7;
                }
                this.a = false;
                this.d = n7;
            }
            return this.c[n3];
        }
        stringBuilder = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n3);
        iv2_2.c(stringBuilder.toString());
        throw null;
    }

    public final String toString() {
        String string2;
        int n3 = this.n();
        if (n3 <= 0) {
            string2 = "{}";
        } else {
            n3 = this.d * 28;
            CharSequence charSequence = new StringBuilder(n3);
            ((StringBuilder)charSequence).append('{');
            n3 = this.d;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                if (i3 > 0) {
                    object = ", ";
                    ((StringBuilder)charSequence).append((String)object);
                }
                long l2 = this.k(i3);
                ((StringBuilder)charSequence).append(l2);
                char c2 = '=';
                ((StringBuilder)charSequence).append(c2);
                object = this.o(i3);
                if (object != charSequence) {
                    ((StringBuilder)charSequence).append(object);
                    continue;
                }
                object = "(this Map)";
                ((StringBuilder)charSequence).append((String)object);
            }
            n3 = 125;
            ((StringBuilder)charSequence).append((char)n3);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "StringBuilder(capacity).\u2026builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(string2, (String)charSequence);
        }
        return string2;
    }
}

