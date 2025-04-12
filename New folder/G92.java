/*
 * Decompiled with CFR 0.152.
 */
public final class G92 {
    public int a;
    public int b;
    public int c;
    public Object[] d;

    public final void a(Object object) {
        int n3;
        Object[] objectArray = this.d;
        int n4 = this.a;
        int n7 = object.hashCode();
        int n8 = -1640531527;
        n7 *= n8;
        int n10 = n7 >>> 16;
        Object object2 = objectArray[n7 = (n7 ^ n10) & n4];
        if (object2 != null) {
            n10 = (int)(object2.equals(object) ? 1 : 0);
            if (n10 != 0) {
                return;
            }
            while ((object2 = objectArray[n7 = n7 + 1 & n4]) != null) {
                n10 = (int)(object2.equals(object) ? 1 : 0);
                if (n10 == 0) continue;
                return;
            }
        }
        objectArray[n7] = object;
        this.b = n3 = this.b + 1;
        int n14 = this.c;
        if (n3 >= n14) {
            objectArray = this.d;
            n4 = objectArray.length;
            n7 = n4 << 1;
            n10 = n7 + -1;
            Object[] objectArray2 = new Object[n7];
            while (true) {
                int n15 = n3 + -1;
                if (n3 == 0) break;
                while ((object = objectArray[n4 += -1]) == null) {
                }
                n3 = object.hashCode() * n8;
                int n16 = n3 >>> 16;
                Object object3 = objectArray2[n3 = (n3 ^ n16) & n10];
                if (object3 != null) {
                    while ((object3 = objectArray2[n3 = n3 + 1 & n10]) != null) {
                    }
                }
                objectArray2[n3] = object3 = objectArray[n4];
                n3 = n15;
            }
            this.a = n10;
            float f5 = n7;
            n14 = 1061158912;
            float f6 = 0.75f;
            this.c = n3 = (int)(f5 *= f6);
            this.d = objectArray2;
        }
    }

    public final void b(Object[] objectArray, int n3, int n4) {
        int n7;
        this.b = n7 = this.b + -1;
        block0: while (true) {
            n7 = n3 + 1;
            while (true) {
                Object object;
                if ((object = objectArray[n7 &= n4]) == null) {
                    objectArray[n3] = null;
                    return;
                }
                int n8 = object.hashCode() * -1640531527;
                int n10 = n8 >>> 16;
                n8 = (n8 ^ n10) & n4;
                if (n3 <= n7 ? n3 >= n8 || n8 > n7 : n3 >= n8 && n8 > n7) {
                    objectArray[n3] = object;
                    n3 = n7;
                    continue block0;
                }
                ++n7;
            }
            break;
        }
    }
}

