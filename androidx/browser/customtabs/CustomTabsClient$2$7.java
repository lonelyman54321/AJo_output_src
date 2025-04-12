/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

class CustomTabsClient$2$7
implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ CustomTabsClient$2 b;

    public CustomTabsClient$2$7(CustomTabsClient$2 customTabsClient$2, Bundle bundle) {
        this.b = customTabsClient$2;
        this.a = bundle;
    }

    public final void run() {
        Uf0 uf0 = this.b.b;
        Bundle bundle = this.a;
        uf0.onWarmupCompleted(bundle);
    }
}

