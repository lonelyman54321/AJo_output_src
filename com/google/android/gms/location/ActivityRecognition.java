/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.location.ActivityRecognitionApi;
import com.google.android.gms.location.ActivityRecognitionClient;

public class ActivityRecognition {
    public static final Api API = zzaj.zzb;
    public static final ActivityRecognitionApi ActivityRecognitionApi;

    static {
        zzaf zzaf2 = new zzaf();
        ActivityRecognitionApi = zzaf2;
    }

    private ActivityRecognition() {
    }

    public static ActivityRecognitionClient getClient(Activity activity) {
        zzaj zzaj2 = new zzaj(activity);
        return zzaj2;
    }

    public static ActivityRecognitionClient getClient(Context context) {
        zzaj zzaj2 = new zzaj(context);
        return zzaj2;
    }
}

