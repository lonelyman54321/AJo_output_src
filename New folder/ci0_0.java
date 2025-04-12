/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appsflyer.internal.AFj1mSDK;
import com.facebook.internal.b;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.multiad.A;
import com.jio.jioads.multiad.B;
import com.jio.jioads.multiad.C;
import com.jio.jioads.multiad.H;
import com.jio.jioads.multiad.e_0;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CI0
 */
public final class ci0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2 = this.a;
        switch (bl2) {
            default: {
                Object object;
                H h3 = (H)this.b;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                Activity activity = h3.a;
                Object object2 = new C(h3);
                Utility utility = null;
                Object object3 = null;
                try {
                    object = h3.k = (object = new WebView((Context)activity));
                    if (object != null) {
                        object.setWebViewClient((WebViewClient)object2);
                    }
                    object2 = h3.k;
                    object2 = object2 != null ? object2.getSettings() : null;
                    if (object2 != null) {
                        object2.setMixedContentMode(0);
                    }
                    object2 = h3.k;
                    object2 = object2 != null ? object2.getSettings() : null;
                    if (object2 != null) {
                        boolean bl3 = true;
                        object2.setJavaScriptEnabled(bl3);
                    }
                    object2 = h3.k;
                    if (object2 != null) {
                        object = new B(h3);
                        String string2 = "tvjsInterface";
                        object2.addJavascriptInterface(object, string2);
                    }
                    object2 = "jio_js";
                    object = new e_0(h3, activity);
                    l_0.g((String)object2, (Context)activity, (A)object);
                    return;
                }
                catch (Exception exception) {}
                h3.b(null, false);
                utility = Utility.INSTANCE;
                object = d.a;
                object2 = JioAdError$JioAdErrorType.ERROR_IN_JS_TARGETING;
                String string3 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorTitle();
                Object object4 = p.t;
                if (object4 != null) {
                    object3 = new a();
                }
                a a2 = object3;
                bl2 = h3.b;
                Boolean bl4 = bl2;
                String string4 = activity.getPackageName();
                String string5 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorCode();
                object3 = "";
                object4 = "Exception while performing JSOperation";
                String string6 = "CampaignQualifierHandler-performJSOperation";
                utility.logError((Context)activity, (String)object3, (d)((Object)object), string3, (String)object4, a2, string6, bl4, string4, string5, false);
                return;
            }
            case 1: {
                AFj1mSDK.b((AFj1mSDK)this.b);
                return;
            }
            case 0: 
        }
        com.facebook.internal.b.g((b)((Object)this.b));
    }
}

