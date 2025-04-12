/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hP2
 */
public final class hp2_2
extends x0_0
implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int e;

    public hp2_2(Object[] object, int n3) {
        String string2 = "buffer";
        Intrinsics.checkNotNullParameter(object, string2);
        this.b = object;
        if (n3 >= 0) {
            int n4 = ((Object[])object).length;
            if (n3 <= n4) {
                int n7;
                this.c = n7 = ((Object[])object).length;
                this.e = n3;
                return;
            }
            Serializable serializable = wk0_0.a(n3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            int n8 = ((Object)object).length;
            serializable.append(n8);
            object = serializable.toString();
            object = object.toString();
            super((String)object);
            throw serializable;
        }
        object = hj0_0.a(n3, "ring buffer filled size should not be negative but it is ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final int a() {
        return this.e;
    }

    public final void c(int n3) {
        if (n3 >= 0) {
            int n4 = this.e;
            if (n3 <= n4) {
                if (n3 > 0) {
                    n4 = this.d;
                    int n7 = n4 + n3;
                    int n8 = this.c;
                    Object[] objectArray = this.b;
                    if (n4 > (n7 %= n8)) {
                        rp_1.n(n4, n8, null, objectArray);
                        Intrinsics.checkNotNullParameter(objectArray, "<this>");
                        n4 = 0;
                        Object var6_6 = null;
                        Arrays.fill(objectArray, 0, n7, null);
                    } else {
                        rp_1.n(n4, n7, null, objectArray);
                    }
                    this.d = n7;
                    this.e = n4 = this.e - n3;
                }
                return;
            }
            CharSequence charSequence = wk0_0.a(n3, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            n4 = this.e;
            ((StringBuilder)charSequence).append(n4);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        String string2 = hj0_0.a(n3, "n shouldn't be negative but it is ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final Object get(int n3) {
        X0$a x0$a = x0_0.a;
        int n4 = this.e;
        x0$a.getClass();
        X0$a.b(n3, n4);
        int n7 = this.d + n3;
        n3 = this.c;
        return this.b[n7 %= n3];
    }

    public final Iterator iterator() {
        hP2$a hP2$a = new hP2$a(this);
        return hP2$a;
    }

    public final Object[] toArray() {
        Object[] objectArray = new Object[this.a()];
        return this.toArray(objectArray);
    }

    public final Object[] toArray(Object[] objectArray) {
        Object object;
        String string2 = "array";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int n3 = objectArray.length;
        int n4 = this.e;
        if (n3 < n4) {
            objectArray = Arrays.copyOf(objectArray, n4);
            String string3 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(objectArray, string3);
        }
        n3 = this.e;
        n4 = this.d;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            int n10;
            object = this.b;
            if (n8 >= n3 || n4 >= (n10 = this.c)) break;
            objectArray[n8] = object = object[n4];
            ++n8;
            ++n4;
        }
        while (n8 < n3) {
            Object object2;
            objectArray[n8] = object2 = object[n7];
            ++n8;
            ++n7;
        }
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

