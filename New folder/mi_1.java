/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MI
 */
public final class mi_1 {
    public final Context a;
    public final String b;
    public final b c;

    public mi_1(Context object, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        this.a = object;
        object = cleverTapInstanceConfig.a;
        Intrinsics.checkNotNullExpressionValue(object, "config.accountId");
        this.b = object;
        object = cleverTapInstanceConfig.b();
        Intrinsics.checkNotNullExpressionValue(object, "config.logger");
        this.c = object;
    }
}

