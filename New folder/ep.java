/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.view.WindowInsets
 */
import android.content.pm.PackageInfo;
import android.view.WindowInsets;

public final class ep {
    public static /* bridge */ /* synthetic */ long a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static /* bridge */ /* synthetic */ WindowInsets b(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }
}

