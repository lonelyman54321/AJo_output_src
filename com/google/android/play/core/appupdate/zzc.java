/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.appupdate.internal.zzl;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallState;

public final class zzc
extends zzl {
    public zzc(Context context) {
        zzm zzm2 = new zzm("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        super(zzm2, intentFilter, context);
    }

    public final void zza(Context object, Intent object2) {
        boolean bl2;
        Object object3;
        Object object4;
        int n3 = 1;
        boolean bl3 = ((String)(object = object.getPackageName())).equals(object4 = object2.getStringExtra((String)(object3 = "package.name")));
        if (!bl3) {
            object = this.zza;
            object2 = object2.getStringExtra((String)object3);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            ((zzm)object).zza("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", objectArray);
            return;
        }
        object = this.zza;
        object3 = new Object[]{};
        object4 = "List of extras in received intent:";
        ((zzm)object).zza((String)object4, object3);
        object = object2.getExtras().keySet().iterator();
        while (bl2 = object.hasNext()) {
            object3 = (String)object.next();
            object4 = this.zza;
            Object object5 = object2.getExtras().get((String)object3);
            int n4 = 2;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            objectArray[n3] = object5;
            object3 = "Key: %s; value: %s";
            ((zzm)object4).zza((String)object3, objectArray);
        }
        object = this.zza;
        object = InstallState.zzb((Intent)object2, (zzm)object);
        object2 = this.zza;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        ((zzm)object2).zza("ListenerRegistryBroadcastReceiver.onReceive: %s", objectArray);
        this.zzd(object);
    }
}

