/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;

/*
 * Renamed from Bf0
 */
public final class bf0_0 {
    public static lb1_0 a;
    public static VF2 b;

    public static void a() {
        RuntimeException runtimeException = new RuntimeException("Stub!");
        throw runtimeException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static cd1_0 b(Context var0, CleverTapInstanceConfig var1_1, mp0_0 var2_2, ea3_1 var3_3) {
        var4_4 = gc3_0.h((Context)var0, var1_1, "cachedGUIDsKey", null);
        var5_5 = new StringBuilder("getCachedGUIDs:[");
        var5_5.append((String)var4_4);
        var5_5.append("]");
        var5_5 = var5_5.toString();
        var6_6 = "ON_USER_LOGIN";
        var1_1.e(var6_6, (String)var5_5);
        var5_5 = var1_1.b();
        var7_7 = var1_1.a;
        var4_4 = si_2.d((String)var4_4, (b)var5_5, var7_7);
        var8_8 = var4_4.length();
        if (var8_8 <= false) ** GOTO lbl-1000
        var4_4 = gc3_0.h((Context)var0, var1_1, "SP_KEY_PROFILE_IDENTITIES", "");
        var7_7 = "getCachedIdentityKeysForAccount:";
        var5_5 = new StringBuilder(var7_7);
        var5_5.append((String)var4_4);
        var5_5 = var5_5.toString();
        var1_1.e(var6_6, (String)var5_5);
        var8_8 = TextUtils.isEmpty((CharSequence)var4_4);
        if (var8_8) {
            var8_8 = true;
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = false;
            var4_4 = null;
        }
        var7_7 = "isLegacyProfileLoggedIn:";
        var5_5 = new StringBuilder(var7_7);
        var5_5.append(var8_8);
        var5_5 = var5_5.toString();
        var1_1.e(var6_6, (String)var5_5);
        var0 = var8_8 != false ? new ot1_2(var1_1) : (var4_4 = new o40_0((Context)var0, var1_1, (mp0_0)var2_2, var3_3));
        var2_2 = var0.getClass().getSimpleName();
        var2_2 = "Repo provider: ".concat((String)var2_2);
        var1_1.e(var6_6, (String)var2_2);
        return var0;
    }
}

