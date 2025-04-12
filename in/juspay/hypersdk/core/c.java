/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;
import org.json.JSONArray;

public final class c
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ JSONArray d;

    public /* synthetic */ c(AndroidInterface androidInterface, String string2, int n3, JSONArray jSONArray) {
        this.a = androidInterface;
        this.b = string2;
        this.c = n3;
        this.d = jSONArray;
    }

    public final void run() {
        int n3 = this.c;
        JSONArray jSONArray = this.d;
        AndroidInterface androidInterface = this.a;
        String string2 = this.b;
        AndroidInterface.g(androidInterface, string2, n3, jSONArray);
    }
}

