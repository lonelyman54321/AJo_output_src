/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sr
 */
public final class sr_1 {
    public final SharedPreferences a;

    public sr_1() {
        SharedPreferences sharedPreferences2 = FacebookSdk.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getApplicationContext()\n\u2026ME, Context.MODE_PRIVATE)");
        Intrinsics.checkNotNullParameter(sharedPreferences2, "sharedPreferences");
        this.a = sharedPreferences2;
    }
}

