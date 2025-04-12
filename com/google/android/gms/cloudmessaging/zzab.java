/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzab
implements Continuation {
    public static final /* synthetic */ zzab zza;

    static {
        zzab zzab2;
        zza = zzab2 = new zzab();
    }

    private /* synthetic */ zzab() {
    }

    public final Object then(Task task2) {
        task2 = (Bundle)task2.getResult();
        Object object = "notification_data";
        if ((task2 = (Intent)task2.getParcelable((String)object)) != null) {
            object = new CloudMessage((Intent)task2);
            return object;
        }
        return null;
    }
}

