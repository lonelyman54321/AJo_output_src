/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class z40$a {
    public static z40_0 a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        z40_0 z40_02 = z40_0.b;
        if (z40_02 == null) {
            z40_0.b = z40_02 = new z40_0((Context)object);
        }
        object = z40_0.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.remoteconfig.app.ConfigManager");
        return object;
    }
}

