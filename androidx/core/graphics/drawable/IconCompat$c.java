/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 */
package androidx.core.graphics.drawable;

import android.graphics.drawable.Icon;
import android.net.Uri;

public final class IconCompat$c {
    public static int a(Object object) {
        return ((Icon)object).getResId();
    }

    public static String b(Object object) {
        return ((Icon)object).getResPackage();
    }

    public static int c(Object object) {
        return ((Icon)object).getType();
    }

    public static Uri d(Object object) {
        return ((Icon)object).getUri();
    }
}

