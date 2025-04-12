/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;

/*
 * Renamed from Kj1
 */
public final class kj1_2
implements Xf0$b {
    public final void a(Context context, Uri object, int n3) {
        if (context != null && object != null) {
            CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
            object = object.toString();
            CustomWebViewActivity$a.b(customWebViewActivity$a, context, (String)object, n3);
        }
    }
}

