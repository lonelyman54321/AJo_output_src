/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class zy2 {
    public static final zy2$a a;

    static {
        Object object = Build.FINGERPRINT;
        Object object2 = Locale.ROOT;
        object = ((String)object).toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        object2 = "robolectric";
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object = new Object();
        } else {
            bl2 = false;
            object = null;
        }
        a = object;
    }
}

