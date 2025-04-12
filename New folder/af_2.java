/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AF
 */
public final class af_2 {
    public static final /* synthetic */ int a;

    static {
        new ee_2();
    }

    public static final ee_2 a(b93_0 b93_02) {
        Intrinsics.checkNotNullParameter(b93_02, "<this>");
        b93_02 = b93_02.e();
        b93_02.getClass();
        ee_2 ee_22 = new ee_2();
        long l2 = ((ee_2)b93_02).c;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            ux2_2 ux2_22;
            ux2_2 ux2_23 = ((ee_2)b93_02).a;
            Intrinsics.checkNotNull(ux2_23);
            ee_22.a = ux2_22 = ux2_23.f();
            ee_22.b = ux2_22;
            ux2_23 = ux2_23.f;
            while (ux2_23 != null) {
                ux2_22 = ee_22.b;
                Intrinsics.checkNotNull(ux2_22);
                ux2_2 ux2_24 = ux2_23.f();
                ux2_22.e(ux2_24);
                ee_22.b = ux2_24;
                ux2_23 = ux2_23.f;
            }
            ee_22.c = l2 = ((ee_2)b93_02).c;
        }
        return ee_22;
    }

    public static final long b(b93_0 b93_02, long l2) {
        Intrinsics.checkNotNullParameter(b93_02, "<this>");
        b93_02.request(l2);
        long l3 = af_2.c(b93_02);
        l2 = Math.min(l2, l3);
        b93_02.e().skip(l2);
        return l2;
    }

    public static final long c(b93_0 b93_02) {
        Intrinsics.checkNotNullParameter(b93_02, "<this>");
        return b93_02.e().c;
    }
}

