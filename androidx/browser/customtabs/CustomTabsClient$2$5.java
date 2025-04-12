/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

class CustomTabsClient$2$5
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ CustomTabsClient$2 e;

    public CustomTabsClient$2$5(CustomTabsClient$2 customTabsClient$2, int n3, Uri uri, boolean bl2, Bundle bundle) {
        this.e = customTabsClient$2;
        this.a = n3;
        this.b = uri;
        this.c = bl2;
        this.d = bundle;
    }

    public final void run() {
        Uf0 uf0 = this.e.b;
        boolean bl2 = this.c;
        Bundle bundle = this.d;
        int n3 = this.a;
        Uri uri = this.b;
        uf0.onRelationshipValidationResult(n3, uri, bl2, bundle);
    }
}

