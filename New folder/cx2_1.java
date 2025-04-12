/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.datastorage.SecuredPreferences;
import com.ril.ajio.services.helper.SecurityHelper;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cX2
 */
public final class cx2_1 {
    public static void a(String string2, String string3, SecuredPreferences securedPreferences, String string4) {
        string2 = SecurityHelper.encrypt(string2);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        securedPreferences.putPreference(string4, string2);
    }
}

