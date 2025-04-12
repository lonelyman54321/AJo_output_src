/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

class CustomTabsClient$2$8
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ CustomTabsClient$2 g;

    public CustomTabsClient$2$8(CustomTabsClient$2 customTabsClient$2, int n3, int n4, int n7, int n8, int n10, Bundle bundle) {
        this.g = customTabsClient$2;
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
        this.e = n10;
        this.f = bundle;
    }

    public final void run() {
        Uf0 uf0 = this.g.b;
        int n3 = this.e;
        Bundle bundle = this.f;
        int n4 = this.a;
        int n7 = this.b;
        int n8 = this.c;
        int n10 = this.d;
        uf0.onActivityLayout(n4, n7, n8, n10, n3, bundle);
    }
}

