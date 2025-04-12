/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D31
 */
public final class d31_0
implements w3 {
    public final /* synthetic */ HaptikWebView a;

    public /* synthetic */ d31_0(HaptikWebView haptikWebView) {
        this.a = haptikWebView;
    }

    public final void a(Object object) {
        object = (Uri)object;
        String string2 = "this$0";
        Uri[] uriArray = this.a;
        Intrinsics.checkNotNullParameter(uriArray, string2);
        if (object != null) {
            string2 = uriArray.k0;
            if (string2 != null) {
                int n3 = 1;
                uriArray = new Uri[n3];
                uriArray[0] = object;
                string2.onReceiveValue((Object)uriArray);
            }
        } else {
            object = uriArray.k0;
            if (object != null) {
                string2 = null;
                object.onReceiveValue(null);
            }
        }
    }
}

