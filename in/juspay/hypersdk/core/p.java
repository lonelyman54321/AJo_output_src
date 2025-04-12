/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;
import org.json.JSONObject;

public final class p
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ String d;

    public /* synthetic */ p(AndroidInterface androidInterface, String string2, JSONObject jSONObject, String string3) {
        this.a = androidInterface;
        this.b = string2;
        this.c = jSONObject;
        this.d = string3;
    }

    public final void run() {
        JSONObject jSONObject = this.c;
        String string2 = this.d;
        AndroidInterface androidInterface = this.a;
        String string3 = this.b;
        AndroidInterface.t(androidInterface, string3, jSONObject, string2);
    }
}

