/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

public final class SearchView$m {
    public Method a;
    public Method b;
    public Method c;

    public static void a() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 < n4) {
            return;
        }
        UnsupportedClassVersionError unsupportedClassVersionError = new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        throw unsupportedClassVersionError;
    }
}

