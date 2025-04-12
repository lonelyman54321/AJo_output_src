/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class BO0 {
    public static EO0$a a(Xm2 object) {
        ((Xm2)object).J(1);
        int n3 = ((Xm2)object).z();
        int n4 = ((Xm2)object).b;
        long l2 = n4;
        long l3 = n3;
        l2 += l3;
        long[] lArray = new long[n3 /= 18];
        long[] lArray2 = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l4;
            long l7 = ((Xm2)object).q();
            long l8 = l7 - (l4 = (long)-1);
            long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l12 == false) {
                lArray = Arrays.copyOf(lArray, i3);
                lArray2 = Arrays.copyOf(lArray2, i3);
                break;
            }
            lArray[i3] = l7;
            lArray2[i3] = l7 = ((Xm2)object).q();
            int n7 = 2;
            ((Xm2)object).J(n7);
        }
        long l14 = ((Xm2)object).b;
        n3 = (int)(l2 - l14);
        ((Xm2)object).J(n3);
        object = new EO0$a(lArray, lArray2);
        return object;
    }
}

