/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

class CustomTabsClient$2$1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ CustomTabsClient$2 c;

    public CustomTabsClient$2$1(CustomTabsClient$2 customTabsClient$2, int n3, Bundle bundle) {
        this.c = customTabsClient$2;
        this.a = n3;
        this.b = bundle;
    }

    public final void run() {
        Uf0 uf0 = this.c.b;
        int n3 = this.a;
        Bundle bundle = this.b;
        uf0.onNavigationEvent(n3, bundle);
    }
}

