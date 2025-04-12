/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dn3
 */
public final class dn3_0 {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public dn3_0(int n3, long[] lArray, Object[] objectArray) {
        this.a = n3;
        this.b = lArray;
        this.c = objectArray;
    }

    public final int a(long l2) {
        int n3 = this.a + -1;
        int n4 = -1;
        if (n3 != n4) {
            long[] lArray = this.b;
            int n7 = 0;
            if (n3 != 0) {
                while (n7 <= n3) {
                    n4 = n7 + n3 >>> 1;
                    long l3 = lArray[n4] - l2;
                    long l4 = 0L;
                    long l7 = l3 - l4;
                    Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object < 0) {
                        n7 = n4 + 1;
                        continue;
                    }
                    if (object > 0) {
                        n3 = n4 + -1;
                        continue;
                    }
                    return n4;
                }
                return -(n7 + 1);
            }
            long l8 = lArray[0];
            long l12 = l8 - l2;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 == 0) {
                n4 = 0;
            } else {
                n3 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1));
                if (n3 > 0) {
                    n4 = -2;
                }
            }
        }
        return n4;
    }

    public final dn3_0 b(long l2, Object object) {
        Object[] objectArray;
        dn3_0 dn3_02 = this;
        Object object2 = this.c;
        int n3 = ((Object[])object2).length;
        int n4 = 0;
        long[] lArray = null;
        int n7 = 0;
        Object object3 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            objectArray = object2[i3];
            if (objectArray == null) continue;
            ++n7;
        }
        n3 = n7 + 1;
        lArray = new long[n3];
        objectArray = new Object[n3];
        int n8 = 1;
        if (n3 > n8) {
            int n10;
            long[] lArray2;
            n8 = 0;
            while (true) {
                lArray2 = dn3_02.b;
                n10 = dn3_02.a;
                if (n4 >= n3 || n8 >= n10) break;
                long l3 = lArray2[n8];
                Object object4 = object2[n8];
                Object object5 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (object5 > 0) {
                    lArray[n4] = l2;
                    objectArray[n4] = object;
                    ++n4;
                    break;
                }
                if (object4 != null) {
                    lArray[n4] = l3;
                    objectArray[n4] = object4;
                    ++n4;
                }
                ++n8;
            }
            if (n8 == n10) {
                lArray[n7] = l2;
                objectArray[n7] = object;
            } else {
                while (n4 < n3) {
                    long l4 = lArray2[n8];
                    object3 = object2[n8];
                    if (object3 != null) {
                        lArray[n4] = l4;
                        objectArray[n4] = object3;
                        ++n4;
                    }
                    ++n8;
                }
            }
        } else {
            lArray[0] = l2;
            objectArray[0] = object;
        }
        object2 = new dn3_0(n3, lArray, objectArray);
        return object2;
    }
}

