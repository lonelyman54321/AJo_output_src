/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;
import org.json.JSONObject;

public final class t
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ int d;

    public /* synthetic */ t(AndroidInterface androidInterface, String string2, JSONObject jSONObject, int n3) {
        this.a = androidInterface;
        this.b = string2;
        this.c = jSONObject;
        this.d = n3;
    }

    public final void run() {
        JSONObject jSONObject = this.c;
        int n3 = this.d;
        AndroidInterface androidInterface = this.a;
        String string2 = this.b;
        AndroidInterface.l(androidInterface, string2, jSONObject, n3);
    }
}

