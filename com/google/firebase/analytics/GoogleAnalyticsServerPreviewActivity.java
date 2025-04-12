/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;

public class GoogleAnalyticsServerPreviewActivity
extends Activity {
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = zzed.zza((Context)this);
        Intent intent = this.getIntent();
        ((zzed)object).zza(intent);
        this.finish();
    }
}

