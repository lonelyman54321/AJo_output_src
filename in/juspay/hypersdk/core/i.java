/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package in.juspay.hypersdk.core;

import android.view.View;
import in.juspay.hypersdk.core.AndroidInterface;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ String c;

    public /* synthetic */ i(AndroidInterface androidInterface, String[] stringArray, String string2) {
        this.a = androidInterface;
        this.b = stringArray;
        this.c = string2;
    }

    public final void onClick(View view) {
        String[] stringArray = this.b;
        String string2 = this.c;
        AndroidInterface.n(this.a, stringArray, string2, view);
    }
}

