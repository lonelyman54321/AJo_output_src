/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.net.Uri
 */
import android.content.pm.PackageInfo;
import android.net.Uri;

public final class BF3 {
    public static final /* synthetic */ int a;

    static {
        Uri.parse((String)"*");
        Uri.parse((String)"");
    }

    public static PackageInfo a() {
        return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}

