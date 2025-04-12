/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rp
 */
public class rp_1
extends qp_1 {
    public static List e(Object[] object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = Arrays.asList(object);
        Intrinsics.checkNotNullExpressionValue(object, "asList(...)");
        return object;
    }

    public static void f(int n3, int n4, int n7, int[] nArray, int[] nArray2) {
        Intrinsics.checkNotNullParameter(nArray, "<this>");
        Intrinsics.checkNotNullParameter(nArray2, "destination");
        System.arraycopy(nArray, n4, nArray2, n3, n7 -= n4);
    }

    public static void g(byte[] byArray, int n3, byte[] byArray2, int n4, int n7) {
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        Intrinsics.checkNotNullParameter(byArray2, "destination");
        System.arraycopy(byArray, n4, byArray2, n3, n7 -= n4);
    }

    public static void h(char[] cArray, char[] cArray2, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        Intrinsics.checkNotNullParameter(cArray2, "destination");
        System.arraycopy(cArray, n4, cArray2, n3, n7 -= n4);
    }

    public static void i(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        Intrinsics.checkNotNullParameter(objectArray2, "destination");
        System.arraycopy(objectArray, n4, objectArray2, n3, n7 -= n4);
    }

    public static /* synthetic */ void j(int n3, int n4, int n7, int[] nArray, int[] nArray2) {
        int n8 = n7 & 2;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n7 &= 8) != 0) {
            n4 = nArray.length;
        }
        rp_1.f(n3, 0, n4, nArray, nArray2);
    }

    public static /* synthetic */ void k(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        int n8 = n7 & 4;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n7 &= 8) != 0) {
            n4 = objectArray.length;
        }
        rp_1.i(objectArray, 0, objectArray2, n3, n4);
    }

    public static byte[] l(int n3, byte[] byArray, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        int n7 = byArray.length;
        pp_2.a(n4, n7);
        byte[] byArray2 = Arrays.copyOfRange(byArray, n3, n4);
        Intrinsics.checkNotNullExpressionValue(byArray2, "copyOfRange(...)");
        return byArray2;
    }

    public static Object[] m(Object[] objectArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        int n7 = objectArray.length;
        pp_2.a(n4, n7);
        objectArray = Arrays.copyOfRange(objectArray, n3, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray, "copyOfRange(...)");
        return objectArray;
    }

    public static void n(int n3, int n4, Object object, Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        Arrays.fill(objectArray, n3, n4, object);
    }

    public static /* synthetic */ void o(Object object, Object[] objectArray) {
        int n3 = objectArray.length;
        rp_1.n(0, n3, object, objectArray);
    }

    public static void p(int[] nArray, int n3) {
        int n4 = nArray.length;
        Intrinsics.checkNotNullParameter(nArray, "<this>");
        Arrays.fill(nArray, 0, n4, n3);
    }

    public static void q(long[] lArray) {
        int n3 = lArray.length;
        Intrinsics.checkNotNullParameter(lArray, "<this>");
        Arrays.fill(lArray, 0, n3, -9187201950435737472L);
    }

    public static int[] r(int[] nArray, int[] nArray2) {
        Intrinsics.checkNotNullParameter(nArray, "<this>");
        Intrinsics.checkNotNullParameter(nArray2, "elements");
        int n3 = nArray.length;
        int n4 = nArray2.length;
        int n7 = n3 + n4;
        nArray = Arrays.copyOf(nArray, n7);
        System.arraycopy(nArray2, 0, nArray, n3, n4);
        Intrinsics.checkNotNull(nArray);
        return nArray;
    }
}

