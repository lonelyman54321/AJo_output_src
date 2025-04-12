/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.os.Bundle;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.utils.Utils;
import org.json.JSONObject;

class DuiInterface$2
implements JuspayResponseHandler {
    final /* synthetic */ DuiInterface this$0;
    final /* synthetic */ String val$cb;
    final /* synthetic */ SdkTracker val$sdkTracker;

    public DuiInterface$2(DuiInterface duiInterface, String string2, SdkTracker sdkTracker) {
        this.this$0 = duiInterface;
        this.val$cb = string2;
        this.val$sdkTracker = sdkTracker;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onError(String var1_1) {
        var2_3 = "payload";
        var3_4 /* !! */  = new JSONObject();
        var4_5 = "status";
        var5_6 = "onError";
        var3_4 /* !! */ .put(var4_5, (Object)var5_6);
        var4_5 = new JSONObject((String)var1_1);
        try {
            var3_4 /* !! */ .put((String)var2_3, (Object)var4_5);
            ** GOTO lbl19
        }
        catch (Exception v0) {
            var3_4 /* !! */ .put((String)var2_3, var1_1);
lbl19:
            // 2 sources

            var1_1 = this.this$0;
        }
        var2_3 = this.val$cb;
        var3_4 /* !! */  = var3_4 /* !! */ .toString();
        var1_1.invokeCallbackInDUIWebview((String)var2_3, (String)var3_4 /* !! */ );
        {
            catch (Exception var1_2) {
                var2_3 = this.val$sdkTracker;
                var6_7 = "run_in_juspay_browser";
                var7_8 = "Exception while manipulating JSON";
                var3_4 /* !! */  = "DuiInterface";
                var4_5 = "lifecycle";
                var5_6 = "hypersdk";
                var2_3.trackAndLogException((String)var3_4 /* !! */ , var4_5, var5_6, var6_7, var7_8, var1_2);
            }
        }
    }

    public void onResponse(Bundle object) {
        object = Utils.toJSON(object).toString();
        this.onResponse((String)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onResponse(String var1_1) {
        var2_3 = "payload";
        var3_4 /* !! */  = new JSONObject();
        var4_5 = "status";
        var5_6 = "onResponse";
        var3_4 /* !! */ .put(var4_5, (Object)var5_6);
        var4_5 = new JSONObject((String)var1_1);
        try {
            var3_4 /* !! */ .put((String)var2_3, (Object)var4_5);
            ** GOTO lbl19
        }
        catch (Exception v0) {
            var3_4 /* !! */ .put((String)var2_3, var1_1);
lbl19:
            // 2 sources

            var1_1 = this.this$0;
        }
        var2_3 = this.val$cb;
        var3_4 /* !! */  = var3_4 /* !! */ .toString();
        var1_1.invokeCallbackInDUIWebview((String)var2_3, (String)var3_4 /* !! */ );
        {
            catch (Exception var1_2) {
                var2_3 = this.val$sdkTracker;
                var5_6 = "run_in_juspay_browser";
                var6_7 = "Exception while manipulating JSON";
                var3_4 /* !! */  = "lifecycle";
                var4_5 = "hypersdk";
                var2_3.trackException((String)var3_4 /* !! */ , var4_5, var5_6, var6_7, var1_2);
            }
        }
    }

    public void run() {
    }
}

