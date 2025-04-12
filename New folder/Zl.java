/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

public final class Zl {
    public static String a() {
        String string2 = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(string2, "getProcessName()");
        return string2;
    }
}

