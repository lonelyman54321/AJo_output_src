/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class p90 {
    public static final String a(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            string2 = object.getPackageManager();
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            return "";
        }
        object = object.getPackageName();
        object = string2.getPackageInfo((String)object, 0);
        object = object.versionName;
        return String.valueOf(object);
    }
}

