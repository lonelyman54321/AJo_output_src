/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportContext$Builder;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class AlarmManagerSchedulerBroadcastReceiver
extends BroadcastReceiver {
    public static /* synthetic */ void a() {
        AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
    }

    private static /* synthetic */ void lambda$onReceive$0() {
    }

    public void onReceive(Context object, Intent intent) {
        Object object2 = intent.getData().getQueryParameter("backendName");
        Object object3 = intent.getData().getQueryParameter("extras");
        Integer n3 = Integer.valueOf(intent.getData().getQueryParameter("priority"));
        int n4 = n3;
        intent = intent.getExtras();
        String string2 = "attemptNumber";
        int n7 = intent.getInt(string2);
        TransportRuntime.initialize((Context)object);
        object = TransportContext.builder().setBackendName((String)object2);
        object2 = PriorityMapping.valueOf(n4);
        object = ((TransportContext$Builder)object).setPriority((Priority)((Object)object2));
        if (object3 != null) {
            object2 = Base64.decode((String)object3, (int)0);
            ((TransportContext$Builder)object).setExtras((byte[])object2);
        }
        object2 = TransportRuntime.getInstance().getUploader();
        object = ((TransportContext$Builder)object).build();
        object3 = new Object();
        ((Uploader)object2).upload((TransportContext)object, n7, (Runnable)object3);
    }
}

