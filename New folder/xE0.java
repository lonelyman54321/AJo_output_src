/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class xE0 {
    public static long[] a(Serializable object) {
        int n3 = object instanceof int[];
        if (n3 != 0) {
            Object object2;
            object = (int[])object;
            n3 = ((Object)object).length;
            long[] lArray = new long[n3];
            for (int i3 = 0; i3 < (object2 = ((Object)object).length); ++i3) {
                long l2;
                object2 = object[i3];
                lArray[i3] = l2 = (long)object2;
            }
            return lArray;
        }
        n3 = object instanceof long[];
        if (n3 != 0) {
            return (long[])object;
        }
        return null;
    }
}

