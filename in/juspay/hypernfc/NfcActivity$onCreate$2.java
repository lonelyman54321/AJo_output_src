/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  org.json.JSONObject
 */
package in.juspay.hypernfc;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import in.juspay.hypernfc.NfcActivity;
import in.juspay.hypernfc.R$drawable;
import in.juspay.hypernfc.R$id;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class NfcActivity$onCreate$2
extends TimerTask {
    final /* synthetic */ NfcActivity this$0;

    public NfcActivity$onCreate$2(NfcActivity nfcActivity) {
        this.this$0 = nfcActivity;
    }

    public static /* synthetic */ void a(NfcActivity nfcActivity) {
        NfcActivity$onCreate$2.run$lambda$0(nfcActivity);
    }

    private static final void run$lambda$0(NfcActivity nfcActivity) {
        Intrinsics.checkNotNullParameter(nfcActivity, "this$0");
        int n3 = R$id.backgroundImage;
        View view = nfcActivity.findViewById(n3);
        nfcActivity = nfcActivity.getApplicationContext();
        int n4 = R$drawable.image_border;
        nfcActivity = t70.getDrawable((Context)nfcActivity, n4);
        view.setBackground((Drawable)nfcActivity);
    }

    public void run() {
        NfcActivity nfcActivity = this.this$0;
        nfcActivity = NfcActivity.access$getData$p(nfcActivity);
        Object object = "error";
        String string2 = "Request timed out!";
        nfcActivity.put((String)object, string2);
        nfcActivity = this.this$0;
        nfcActivity = NfcActivity.access$getData$p(nfcActivity);
        object = "data";
        int n3 = 0;
        string2 = null;
        nfcActivity.put((String)object, null);
        nfcActivity = this.this$0;
        n3 = 1;
        object = new tw_0(nfcActivity, n3);
        nfcActivity.runOnUiThread((Runnable)object);
        nfcActivity = this.this$0;
        object = NfcActivity.access$getData$p(nfcActivity);
        try {
            NfcActivity.access$timedOut(nfcActivity, (JSONObject)object);
        }
        catch (Exception exception) {
            nfcActivity = new Intent();
            nfcActivity.putExtra("result_data", "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
            object = this.this$0;
            n3 = 0;
            string2 = null;
            object.setResult(0, (Intent)nfcActivity);
            nfcActivity = this.this$0;
            nfcActivity.finish();
        }
    }
}

