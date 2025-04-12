/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ls3
 */
public final class ls3_0 {
    public static final Object[] a(Object object, Object object2, Object[] objectArray, int n3) {
        Object[] objectArray2 = new Object[objectArray.length + 2];
        rp_1.k(objectArray, 0, objectArray2, n3, 6);
        int n4 = n3 + 2;
        int n7 = objectArray.length;
        rp_1.i(objectArray, n4, objectArray2, n3, n7);
        objectArray2[n3] = object;
        objectArray2[++n3] = object2;
        return objectArray2;
    }

    public static final Object[] b(int n3, Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length + -2];
        rp_1.k(objectArray, 0, objectArray2, n3, 6);
        int n4 = n3 + 2;
        int n7 = objectArray.length;
        rp_1.i(objectArray, n3, objectArray2, n4, n7);
        return objectArray2;
    }

    public static final Object[] c(int n3, Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length + -1];
        rp_1.k(objectArray, 0, objectArray2, n3, 6);
        int n4 = n3 + 1;
        int n7 = objectArray.length;
        rp_1.i(objectArray, n3, objectArray2, n4, n7);
        return objectArray2;
    }

    public static final int d(int n3, int n4) {
        return n3 >> n4 & 0x1F;
    }
}

