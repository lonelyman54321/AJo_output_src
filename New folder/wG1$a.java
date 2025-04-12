/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c;

public final class wG1$a {
    public static final int a(int[] object) {
        int n3 = ((int[])object).length;
        if (n3 != 0) {
            n3 = object[0];
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            int n4 = ((int[])object).length;
            int n7 = 1;
            KMappedMarker kMappedMarker = new c(n7, n4 -= n7, n7);
            kMappedMarker = ((c)kMappedMarker).d();
            while ((n4 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
                n4 = ((ui1_2)kMappedMarker).nextInt();
                n4 = object[n4];
                n3 *= n4;
            }
            return n3;
        }
        object = new UnsupportedOperationException;
        object("Empty array can't be reduced.");
        throw object;
    }
}

