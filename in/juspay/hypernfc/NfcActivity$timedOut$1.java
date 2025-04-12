/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  org.json.JSONObject
 */
package in.juspay.hypernfc;

import android.content.Intent;
import in.juspay.hypernfc.NfcActivity;
import java.util.TimerTask;
import org.json.JSONObject;

public final class NfcActivity$timedOut$1
extends TimerTask {
    final /* synthetic */ JSONObject $data;
    final /* synthetic */ NfcActivity this$0;

    public NfcActivity$timedOut$1(JSONObject jSONObject, NfcActivity nfcActivity) {
        this.$data = jSONObject;
        this.this$0 = nfcActivity;
    }

    public void run() {
        Intent intent = new Intent();
        String string2 = this.$data.toString();
        intent.putExtra("result_data", string2);
        this.this$0.setResult(0, intent);
        this.this$0.finish();
    }
}

