/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PowerManager
 */
package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

public final class AppCompatDelegateImpl$e {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}

