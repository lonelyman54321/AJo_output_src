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

public final class NfcActivity$onNewIntent$1
extends TimerTask {
    final /* synthetic */ NfcActivity this$0;

    public NfcActivity$onNewIntent$1(NfcActivity nfcActivity) {
        this.this$0 = nfcActivity;
    }

    public void run() {
        Intent intent = new Intent();
        String string2 = NfcActivity.access$getData$p(this.this$0).toString();
        intent.putExtra("result_data", string2);
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }
}

