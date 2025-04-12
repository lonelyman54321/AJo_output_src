/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class ca3
implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public ca3() {
        this(0);
    }

    public ca3(int n3) {
        int n4;
        n3 = 4;
        int n7 = 4;
        while (true) {
            int n8 = 32;
            n4 = 40;
            if (n7 >= n8) break;
            n8 = (1 << n7) + -12;
            if (n4 <= n8) {
                n4 = n8;
                break;
            }
            ++n7;
        }
        Object[] objectArray = new int[n4 /= n3];
        this.b = objectArray;
        objectArray = new Object[n4];
        this.c = objectArray;
    }

    public final void b(int n3, Object object) {
        int n4;
        int[] nArray;
        int n7;
        int n8 = this.d;
        if (n8 != 0 && n3 <= (n7 = (nArray = this.b)[n4 = n8 + -1])) {
            this.i(n3, object);
        } else {
            n7 = this.a;
            if (n7 != 0 && n8 >= (n7 = (nArray = this.b).length)) {
                da3_0.a(this);
            }
            n8 = this.d;
            nArray = this.b;
            n7 = nArray.length;
            n4 = 1;
            if (n8 >= n7) {
                int n10;
                n7 = n8 + 1;
                int n14 = 4;
                n7 *= 4;
                for (int i3 = 4; i3 < (n10 = 32); ++i3) {
                    n10 = (n4 << i3) + -12;
                    if (n7 > n10) continue;
                    n7 = n10;
                    break;
                }
                Object[] objectArray = Arrays.copyOf(this.b, n7 /= n14);
                String string2 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                this.b = objectArray;
                objectArray = this.c;
                nArray = Arrays.copyOf(objectArray, n7);
                Intrinsics.checkNotNullExpressionValue(nArray, string2);
                this.c = nArray;
            }
            nArray = this.b;
            nArray[n8] = n3;
            Object[] objectArray = this.c;
            objectArray[n8] = object;
            this.d = n8 += n4;
        }
    }

    public final ca3 d() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        object = (ca3)object;
        Object[] objectArray = (int[])this.b.clone();
        ((ca3)object).b = objectArray;
        objectArray = (Object[])this.c.clone();
        ((ca3)object).c = objectArray;
        return object;
    }

    public final boolean e(int n3) {
        int[] nArray;
        int n4;
        boolean bl2 = this.a;
        if (bl2) {
            da3_0.a(this);
        }
        n3 = (n3 = A62.a(n4 = this.d, n3, nArray = this.b)) >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object f(int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Object object2 = this.b;
        int n4 = this.d;
        n3 = A62.a(n4, n3, object2);
        if (n3 < 0 || (object = this.c[n3]) == (object2 = (Object)da3_0.a)) {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final int g(int n3) {
        boolean bl2 = this.a;
        if (bl2) {
            da3_0.a(this);
        }
        return this.b[n3];
    }

    public final void i(int n3, Object object) {
        int n4 = this.d;
        int[] nArray = this.b;
        int n7 = A62.a(n4, n3, nArray);
        if (n7 >= 0) {
            Object[] objectArray = this.c;
            objectArray[n7] = object;
        } else {
            Object object2;
            Object[] objectArray;
            Object object3;
            n4 = this.d;
            if ((n7 ^= 0xFFFFFFFF) < n4 && (object3 = (objectArray = this.c)[n7]) == (object2 = da3_0.a)) {
                int[] nArray2 = this.b;
                nArray2[n7] = n3;
                objectArray[n7] = object;
            } else {
                Object[] objectArray2;
                int n8;
                int n10 = this.a;
                if (n10 != 0 && n4 >= (n10 = (objectArray = (Object[])this.b).length)) {
                    da3_0.a(this);
                    nArray = this.b;
                    n4 = this.d;
                    n7 = ~A62.a(n4, n3, nArray);
                }
                n4 = this.d;
                objectArray = this.b;
                n10 = objectArray.length;
                int n14 = 1;
                if (n4 >= n10) {
                    int n15;
                    n4 += n14;
                    n10 = 4;
                    n4 *= 4;
                    for (n8 = 4; n8 < (n15 = 32); ++n8) {
                        n15 = (n14 << n8) + -12;
                        if (n4 > n15) continue;
                        n4 = n15;
                        break;
                    }
                    objectArray = Arrays.copyOf(this.b, n4 /= n10);
                    object2 = "copyOf(this, newSize)";
                    Intrinsics.checkNotNullExpressionValue(objectArray, (String)object2);
                    this.b = (int[])objectArray;
                    objectArray = this.c;
                    objectArray2 = Arrays.copyOf(objectArray, n4);
                    Intrinsics.checkNotNullExpressionValue(objectArray2, (String)object2);
                    this.c = objectArray2;
                }
                if ((n10 = (n4 = this.d) - n7) != 0) {
                    objectArray = this.b;
                    n8 = n7 + 1;
                    rp_1.f(n8, n7, n4, (int[])objectArray, (int[])objectArray);
                    objectArray2 = this.c;
                    n10 = this.d;
                    rp_1.i(objectArray2, n8, objectArray2, n7, n10);
                }
                objectArray2 = this.b;
                objectArray2[n7] = n3;
                Object[] objectArray3 = this.c;
                objectArray3[n7] = object;
                this.d = n3 = this.d + n14;
            }
        }
    }

    public final int j() {
        boolean bl2 = this.a;
        if (bl2) {
            da3_0.a(this);
        }
        return this.d;
    }

    public final Object k(int n3) {
        boolean bl2 = this.a;
        if (bl2) {
            da3_0.a(this);
        }
        return this.c[n3];
    }

    public final String toString() {
        CharSequence charSequence;
        int n3 = this.j();
        if (n3 <= 0) {
            charSequence = "{}";
        } else {
            int n4 = this.d * 28;
            charSequence = new StringBuilder(n4);
            ((StringBuilder)charSequence).append('{');
            n4 = this.d;
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object;
                if (i3 > 0) {
                    object = ", ";
                    ((StringBuilder)charSequence).append((String)object);
                }
                char c2 = this.g(i3);
                ((StringBuilder)charSequence).append((int)c2);
                c2 = '=';
                ((StringBuilder)charSequence).append(c2);
                object = this.k(i3);
                if (object != this) {
                    ((StringBuilder)charSequence).append(object);
                    continue;
                }
                object = "(this Map)";
                ((StringBuilder)charSequence).append((String)object);
            }
            n4 = 125;
            ((StringBuilder)charSequence).append((char)n4);
            charSequence = ((StringBuilder)charSequence).toString();
            String string2 = "buffer.toString()";
            Intrinsics.checkNotNullExpressionValue(charSequence, string2);
        }
        return charSequence;
    }
}

