/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;
import org.json.JSONObject;

public final class d
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ d(AndroidInterface androidInterface, JSONObject jSONObject, String string2, String string3, String string4) {
        this.a = androidInterface;
        this.b = jSONObject;
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public final void run() {
        String string2 = this.d;
        String string3 = this.e;
        AndroidInterface androidInterface = this.a;
        JSONObject jSONObject = this.b;
        String string4 = this.c;
        AndroidInterface.u(androidInterface, jSONObject, string4, string2, string3);
    }
}

