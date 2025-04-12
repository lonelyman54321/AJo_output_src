/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.CustomtabActivity;

public class CustomtabResult
extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabResult";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent(CUSTOMTAB_RESULT);
        String string2 = "response";
        Object object = this.getIntent();
        object = object.getDataString();
        try {
            bundle.putExtra(string2, (String)object);
        }
        catch (Exception exception) {
            object = LOG_TAG;
            String string3 = "Couldn't find data from url";
            JuspayLogger.e((String)object, string3, exception);
        }
        bundle.putExtra("status", "SUCCESS");
        Xv1.a((Context)this).c((Intent)bundle);
        bundle = new Intent((Context)this, CustomtabActivity.class);
        this.startActivity((Intent)bundle);
        this.finish();
    }
}

