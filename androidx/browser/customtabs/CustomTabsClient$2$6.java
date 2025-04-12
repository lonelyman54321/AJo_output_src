/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

class CustomTabsClient$2$6
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ CustomTabsClient$2 d;

    public CustomTabsClient$2$6(CustomTabsClient$2 customTabsClient$2, int n3, int n4, Bundle bundle) {
        this.d = customTabsClient$2;
        this.a = n3;
        this.b = n4;
        this.c = bundle;
    }

    public final void run() {
        Uf0 uf0 = this.d.b;
        int n3 = this.b;
        Bundle bundle = this.c;
        int n4 = this.a;
        uf0.onActivityResized(n4, n3, bundle);
    }
}

