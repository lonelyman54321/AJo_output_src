/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback$Stub;
import androidx.browser.customtabs.CustomTabsClient$2$1;
import androidx.browser.customtabs.CustomTabsClient$2$10;
import androidx.browser.customtabs.CustomTabsClient$2$2;
import androidx.browser.customtabs.CustomTabsClient$2$3;
import androidx.browser.customtabs.CustomTabsClient$2$4;
import androidx.browser.customtabs.CustomTabsClient$2$5;
import androidx.browser.customtabs.CustomTabsClient$2$6;
import androidx.browser.customtabs.CustomTabsClient$2$7;
import androidx.browser.customtabs.CustomTabsClient$2$8;
import androidx.browser.customtabs.CustomTabsClient$2$9;
import com.google.android.gms.internal.ads.zzbfn;

public final class CustomTabsClient$2
extends ICustomTabsCallback$Stub {
    public final Handler a;
    public final /* synthetic */ Uf0 b;

    public CustomTabsClient$2(zzbfn zzbfn2) {
        this.b = zzbfn2;
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.a = zzbfn2;
    }

    public final void extraCallback(String string2, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$2 customTabsClient$2$2 = new CustomTabsClient$2$2(this, string2, bundle);
        uf0.post(customTabsClient$2$2);
    }

    public final Bundle extraCallbackWithResult(String string2, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return null;
        }
        return uf0.extraCallbackWithResult(string2, bundle);
    }

    public final void onActivityLayout(int n3, int n4, int n7, int n8, int n10, Bundle bundle) {
        CustomTabsClient$2$8 customTabsClient$2$8;
        Object object = this.b;
        if (object == null) {
            return;
        }
        Handler handler = this.a;
        object = customTabsClient$2$8;
        customTabsClient$2$8 = new CustomTabsClient$2$8(this, n3, n4, n7, n8, n10, bundle);
        handler.post((Runnable)customTabsClient$2$8);
    }

    public final void onActivityResized(int n3, int n4, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$6 customTabsClient$2$6 = new CustomTabsClient$2$6(this, n3, n4, bundle);
        uf0.post(customTabsClient$2$6);
    }

    public final void onMessageChannelReady(Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$3 customTabsClient$2$3 = new CustomTabsClient$2$3(this, bundle);
        uf0.post(customTabsClient$2$3);
    }

    public final void onMinimized(Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$9 customTabsClient$2$9 = new CustomTabsClient$2$9(this, bundle);
        uf0.post(customTabsClient$2$9);
    }

    public final void onNavigationEvent(int n3, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$1 customTabsClient$2$1 = new CustomTabsClient$2$1(this, n3, bundle);
        uf0.post(customTabsClient$2$1);
    }

    public final void onPostMessage(String string2, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$4 customTabsClient$2$4 = new CustomTabsClient$2$4(this, string2, bundle);
        uf0.post(customTabsClient$2$4);
    }

    public final void onRelationshipValidationResult(int n3, Uri uri, boolean bl2, Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$5 customTabsClient$2$5 = new CustomTabsClient$2$5(this, n3, uri, bl2, bundle);
        uf0.post(customTabsClient$2$5);
    }

    public final void onUnminimized(Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$10 customTabsClient$2$10 = new CustomTabsClient$2$10(this, bundle);
        uf0.post(customTabsClient$2$10);
    }

    public final void onWarmupCompleted(Bundle bundle) {
        Uf0 uf0 = this.b;
        if (uf0 == null) {
            return;
        }
        uf0 = this.a;
        CustomTabsClient$2$7 customTabsClient$2$7 = new CustomTabsClient$2$7(this, bundle);
        uf0.post(customTabsClient$2$7);
    }
}

