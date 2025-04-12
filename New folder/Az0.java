/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;
import java.util.Arrays;

public final class Az0 {
    static {
        new SecureRandom();
    }

    public static byte[] a(vi3_1 object) {
        int n3 = ((vi3_1)object).b;
        byte[] byArray = new byte[n3];
        object = ((vi3_1)object).a;
        Object object2 = zz0_1.i;
        if (object == object2) {
            int n4 = 4;
            object2 = new byte[n4];
            byte by2 = Em3.j((byte)object2[0], 5);
            object2[0] = by2;
            int n7 = 3;
            by2 = Em3.j(by2, n7);
            object2[0] = by2;
            object = Arrays.copyOf((byte[])object2, n4);
        } else {
            boolean bl2 = false;
            object = null;
        }
        Em3.a((byte[])object);
        if (object != null) {
            int n8 = ((Object)object).length;
            n3 = Math.min(n8, n3);
            System.arraycopy(object, 0, byArray, 0, n3);
        }
        return byArray;
    }
}

