/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.webkit.WebChromeClient
 */
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AF3$a
 */
public final class af3$a_0
extends WebChromeClient {
    public final Bitmap getDefaultVideoPoster() {
        int n3 = 50;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)config);
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
        return bitmap;
    }
}

