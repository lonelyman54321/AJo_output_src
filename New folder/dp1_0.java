/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dP1
 */
public final class dp1_0
extends XO1 {
    public static final dp1_0 a;

    static {
        dp1_0 dp1_02;
        a = dp1_02 = new XO1(3, 4);
    }

    public final void migrate(xg3_1 xg3_12) {
        String string2 = "db";
        Intrinsics.checkNotNullParameter(xg3_12, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            string2 = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ";
            xg3_12.o(string2);
        }
    }
}

