/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.auth-api-phone.zzac;
import com.google.android.gms.internal.auth-api-phone.zzx;
import com.google.android.gms.internal.auth-api-phone.zzy;
import com.google.android.gms.tasks.Task;

public final class zzab
extends SmsRetrieverClient {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    public final Task startSmsRetriever() {
        Object object = TaskApiCall.builder();
        Feature[] featureArray = new zzx(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)featureArray);
        Feature feature = zzac.zzc;
        featureArray = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).setMethodKey(1567).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task startSmsUserConsent(String object) {
        Feature[] featureArray = TaskApiCall.builder();
        Object object2 = new zzy(this, (String)object);
        object = featureArray.run((RemoteCall)object2);
        object2 = zzac.zzd;
        featureArray = new Feature[]{object2};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).setMethodKey(1568).build();
        return this.doWrite((TaskApiCall)object);
    }
}

