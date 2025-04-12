/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package in.juspay.hypernfc;

import android.content.Intent;
import in.juspay.hypernfc.NfcActivity;
import java.util.TimerTask;

public final class NfcActivity$onNewIntent$3
extends TimerTask {
    final /* synthetic */ NfcActivity this$0;

    public NfcActivity$onNewIntent$3(NfcActivity nfcActivity) {
        this.this$0 = nfcActivity;
    }

    public void run() {
        Intent intent = new Intent();
        intent.putExtra("result_data", "{\"error\":\"Couldn't read your card ! Try again or type your card number\"}");
        this.this$0.setResult(0, intent);
        this.this$0.finish();
    }
}

