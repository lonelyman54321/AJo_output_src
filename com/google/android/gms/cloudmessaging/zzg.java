/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zze;
import com.google.android.gms.cloudmessaging.zzf;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public final class zzg
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ CloudMessage zzb;
    public final /* synthetic */ CountDownLatch zzc;

    public /* synthetic */ zzg(Context context, CloudMessage cloudMessage, CountDownLatch countDownLatch) {
        this.zza = context;
        this.zzb = cloudMessage;
        this.zzc = countDownLatch;
    }

    public final void run() {
        Object object;
        Object object2;
        Object object3 = this.zzb;
        Object object4 = ((CloudMessage)object3).getMessageId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object4);
        if (bl2) {
            boolean bl3 = false;
            object3 = Tasks.forResult(null);
        } else {
            object4 = new Bundle();
            object2 = ((CloudMessage)object3).getMessageId();
            object = "google.message_id";
            object4.putString((String)object, (String)object2);
            object3 = ((CloudMessage)object3).zza();
            if (object3 != null) {
                object2 = "google.product_id";
                int n3 = (Integer)object3;
                object4.putInt((String)object2, n3);
            }
            object3 = this.zza;
            object2 = "supports_message_handled";
            boolean bl4 = true;
            object4.putBoolean((String)object2, bl4);
            object3 = zzv.zzb((Context)object3);
            int n4 = 2;
            object3 = ((zzv)object3).zzc(n4, (Bundle)object4);
        }
        object4 = this.zzc;
        object2 = zze.zza;
        object = new zzf((CountDownLatch)object4);
        ((Task)object3).addOnCompleteListener((Executor)object2, (OnCompleteListener)object);
    }
}

