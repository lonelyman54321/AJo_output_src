/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class sx1$a {
    public static void a(Ax1 ax1, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)ax1, "behavior");
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "string");
        sx1$a.c(ax1, string2, string3);
    }

    public static void b(Ax1 ax1, String string2, String string3, Object ... objectArray) {
        Intrinsics.checkNotNullParameter((Object)ax1, "behavior");
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        FacebookSdk.i(ax1);
    }

    public static void c(Ax1 ax1, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)ax1, "behavior");
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "string");
        FacebookSdk.i(ax1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(String string2) {
        synchronized (this) {
            Object object = "accessToken";
            Intrinsics.checkNotNullParameter(string2, object);
            object = Ax1.INCLUDE_ACCESS_TOKENS;
            FacebookSdk.i((Ax1)((Object)object));
            this.e(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String string2) {
        String string3 = "ACCESS_TOKEN_REMOVED";
        synchronized (this) {
            Object object = "original";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object = "replace";
            Intrinsics.checkNotNullParameter(string3, (String)object);
            object = sx1.e;
            ((HashMap)object).put(string2, string3);
            return;
        }
    }
}

