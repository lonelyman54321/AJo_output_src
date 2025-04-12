/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.services;

import in.juspay.services.HyperServices;
import org.json.JSONObject;

class HyperServices$1
extends W72 {
    final /* synthetic */ HyperServices this$0;

    public HyperServices$1(HyperServices hyperServices, boolean bl2) {
        this.this$0 = hyperServices;
        super(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleOnBackPressed() {
        JSONObject jSONObject = new JSONObject();
        String string2 = "triggered_on";
        String string3 = "onBackPressedCallback.handleOnBackPressed()";
        try {
            jSONObject.put(string2, (Object)string3);
        }
        catch (Exception exception) {}
        HyperServices.access$000(this.this$0).getSdkTracker().trackLifecycle("android", "info", "on_back_pressed", jSONObject);
        HyperServices.access$000(this.this$0).onBackPressed();
    }
}

