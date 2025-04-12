/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;
import org.json.JSONObject;

public final class n
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ n(AndroidInterface androidInterface, String string2, JSONObject jSONObject, int n3, boolean bl2, String string3, String string4) {
        this.a = androidInterface;
        this.b = string2;
        this.c = jSONObject;
        this.d = n3;
        this.e = bl2;
        this.f = string3;
        this.g = string4;
    }

    public final void run() {
        String string2 = this.f;
        String string3 = this.g;
        AndroidInterface androidInterface = this.a;
        String string4 = this.b;
        JSONObject jSONObject = this.c;
        int n3 = this.d;
        boolean bl2 = this.e;
        AndroidInterface.r(androidInterface, string4, jSONObject, n3, bl2, string2, string3);
    }
}

