/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qp1
 */
public final class qp1_1 {
    public static final boolean a;

    static {
        String string2 = Build.FINGERPRINT;
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        a = Intrinsics.areEqual(string2, "robolectric");
    }
}

