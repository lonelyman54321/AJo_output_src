/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bw0
 */
public class bw0_2 {
    public static final double a(double d2, aw0_1 enum_, aw0_1 enum_2) {
        Intrinsics.checkNotNullParameter(enum_, "sourceUnit");
        Intrinsics.checkNotNullParameter(enum_2, "targetUnit");
        TimeUnit timeUnit = ((aw0_1)enum_2).getTimeUnit$kotlin_stdlib();
        TimeUnit timeUnit2 = ((aw0_1)enum_).getTimeUnit$kotlin_stdlib();
        long l2 = 1L;
        long l3 = timeUnit.convert(l2, timeUnit2);
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            double d5 = l3;
            return d2 * d5;
        }
        enum_ = ((aw0_1)enum_).getTimeUnit$kotlin_stdlib();
        enum_2 = ((aw0_1)enum_2).getTimeUnit$kotlin_stdlib();
        double d7 = ((TimeUnit)enum_).convert(l2, (TimeUnit)enum_2);
        return d2 / d7;
    }

    public static final long b(long l2, aw0_1 enum_, aw0_1 enum_2) {
        Intrinsics.checkNotNullParameter(enum_, "sourceUnit");
        Intrinsics.checkNotNullParameter(enum_2, "targetUnit");
        enum_2 = ((aw0_1)enum_2).getTimeUnit$kotlin_stdlib();
        enum_ = ((aw0_1)enum_).getTimeUnit$kotlin_stdlib();
        return ((TimeUnit)enum_2).convert(l2, (TimeUnit)enum_);
    }
}

