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
 * Renamed from fB2
 */
public final class fb2_0 {
    public final SharedPreferences a;

    public fb2_0() {
        SharedPreferences sharedPreferences2 = FacebookSdk.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getApplicationContext()\n\u2026ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences2;
    }
}

