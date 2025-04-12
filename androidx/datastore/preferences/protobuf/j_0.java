/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.L$a;
import androidx.datastore.preferences.protobuf.g_0;
import androidx.datastore.preferences.protobuf.n;
import java.util.Arrays;

/*
 * Renamed from androidx.datastore.preferences.protobuf.J
 */
public final class j_0
extends H {
    public final void a(Object object, int n3, int n4) {
        object = (I)object;
        n3 = n3 << 3 | 5;
        Integer n7 = n4;
        ((I)object).b(n3, n7);
    }

    public final void b(Object object, int n3, long l2) {
        object = (I)object;
        n3 = n3 << 3 | 1;
        Long l3 = l2;
        ((I)object).b(n3, l3);
    }

    public final void c(Object object, int n3, Object object2) {
        object = (I)object;
        object2 = (I)object2;
        n3 = n3 << 3 | 3;
        ((I)object).b(n3, object2);
    }

    public final void d(Object object, int n3, DF dF) {
        object = (I)object;
        n3 = n3 << 3 | 2;
        ((I)object).b(n3, dF);
    }

    public final void e(Object object, int n3, long l2) {
        object = (I)object;
        Long l3 = l2;
        ((I)object).b(n3 <<= 3, l3);
    }

    public final I f(Object object) {
        object = (n)object;
        I i3 = ((n)object).unknownFields;
        I i8 = I.f;
        if (i3 == i8) {
            ((n)object).unknownFields = i3 = new I();
        }
        return i3;
    }

    public final I g(Object object) {
        return ((n)object).unknownFields;
    }

    public final int h(Object object) {
        return ((I)object).a();
    }

    public final int i(Object object) {
        object = (I)object;
        int n3 = ((I)object).d;
        int n4 = -1;
        if (n3 == n4) {
            int n7;
            n4 = 0;
            for (n3 = 0; n3 < (n7 = ((I)object).a); ++n3) {
                int[] nArray = ((I)object).b;
                n7 = nArray[n3];
                int n8 = 3;
                n7 >>>= n8;
                DF dF = (DF)((I)object).c[n3];
                int n10 = CodedOutputStream.x(1);
                int n14 = 2;
                n7 = CodedOutputStream.y(n14, n7) + (n10 *= 2);
                n8 = CodedOutputStream.f(n8, dF) + n7;
                n4 += n8;
            }
            ((I)object).d = n4;
            n3 = n4;
        }
        return n3;
    }

    public final void j(Object object) {
        ((n)object).unknownFields.e = false;
    }

    public final I k(Object object, Object object2) {
        object = (I)object;
        I i3 = I.f;
        boolean n3 = ((I)(object2 = (I)object2)).equals(i3);
        if (!n3) {
            int n4 = ((I)object).a;
            int n7 = ((I)object2).a;
            int n8 = n4 + n7;
            int[] nArray = Arrays.copyOf(((I)object).b, n8);
            Object[] objectArray = ((I)object2).b;
            int n10 = ((I)object).a;
            int n14 = ((I)object2).a;
            System.arraycopy(objectArray, 0, nArray, n10, n14);
            objectArray = Arrays.copyOf(((I)object).c, n8);
            Object[] objectArray2 = ((I)object2).c;
            int n15 = ((I)object).a;
            int n16 = ((I)object2).a;
            System.arraycopy(objectArray2, 0, objectArray, n15, n16);
            boolean bl2 = true;
            object = new I(n8, nArray, objectArray, bl2);
        }
        return object;
    }

    public final I m() {
        I i3 = new I();
        return i3;
    }

    public final void n(Object object, Object object2) {
        ((n)object).unknownFields = object2 = (I)object2;
    }

    public final void o(Object object, Object object2) {
        ((n)object).unknownFields = object2 = (I)object2;
    }

    public final I p(Object object) {
        object = (I)object;
        ((I)object).e = false;
        return object;
    }

    public final void q(Object object, L l2) {
        object = (I)object;
        object.getClass();
        l2 = (g_0)l2;
        l2.getClass();
        L$a l$a = L$a.ASCENDING;
        Object object2 = L$a.DESCENDING;
        if (l$a == object2) {
            for (int i3 = ((I)object).a + -1; i3 >= 0; i3 += -1) {
                object2 = ((I)object).b;
                reference var6_7 = object2[i3] >>> 3;
                Object object3 = ((I)object).c[i3];
                ((g_0)l2).m((int)var6_7, object3);
            }
        } else {
            Object object4;
            l$a = null;
            for (int i8 = 0; i8 < (object4 = ((I)object).a); ++i8) {
                object2 = ((I)object).b;
                object4 = object2[i8] >>> 3;
                Object object5 = ((I)object).c[i8];
                ((g_0)l2).m((int)object4, object5);
            }
        }
    }

    public final void r(Object object, L l2) {
        ((I)object).c(l2);
    }
}

