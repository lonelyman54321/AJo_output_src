/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Op
 */
public final class op_0
implements qA3 {
    public static final op_0 a;

    static {
        op_0 op_02;
        a = op_02 = new Object();
    }

    public static final void b(Np np, int n3) {
        Intrinsics.checkNotNullParameter(np, "<this>");
        int[] nArray = new int[n3];
        np.getClass();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(nArray, string2);
        np.a = nArray;
        Object[] objectArray = new Object[n3];
        Intrinsics.checkNotNullParameter(objectArray, string2);
        np.b = objectArray;
    }

    public static final int c(Np object, Object object2, int n3) {
        Object object3;
        Object object4;
        int n4;
        int n7;
        int n8;
        int n10;
        block9: {
            Object object5 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object5);
            n10 = ((Np)object).c;
            if (n10 == 0) {
                return -1;
            }
            Intrinsics.checkNotNullParameter(object, (String)object5);
            object5 = ((Np)object).a;
            n8 = ((Np)object).c;
            try {
                n7 = A62.a(n8, n3, (int[])object5);
                if (n7 >= 0) break block9;
                return n7;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                object = new ConcurrentModificationException();
                throw object;
            }
        }
        Object object6 = ((Np)object).b[n7];
        n8 = (int)(Intrinsics.areEqual(object2, object6) ? 1 : 0);
        if (n8 != 0) {
            return n7;
        }
        for (n8 = n7 + 1; n8 < n10 && (n4 = (object4 = ((Np)object).a)[n8]) == n3; ++n8) {
            object4 = ((Np)object).b[n8];
            n4 = (int)(Intrinsics.areEqual(object2, object4) ? 1 : 0);
            if (n4 == 0) continue;
            return n8;
        }
        n7 += -1;
        while (n7 >= 0 && (n10 = (object3 = ((Np)object).a)[n7]) == n3) {
            object3 = ((Np)object).b[n7];
            n10 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n10 != 0) {
                return n7;
            }
            n7 += -1;
        }
        return ~n8;
    }

    public Object a(gm1_0 gm1_02, float f5) {
        return Float.valueOf(Xm1.d(gm1_02) * f5);
    }
}

