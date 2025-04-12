/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.cv;
import com.google.android.play.core.assetpacks.d;
import com.google.android.play.core.assetpacks.internal.o;

public final class SessionStateBroadcastReceiver
extends BroadcastReceiver {
    private static final o a;

    static {
        o o3;
        a = o3 = new o("SessionStateBroadcastReceiver");
    }

    public final void onReceive(Context object, Intent objectArray) {
        Bundle bundle = objectArray.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundle == null) {
            object = a;
            objectArray = new Object[]{};
            ((o)object).b("Empty flags bundle received from broadcast.", objectArray);
            return;
        }
        String string2 = "enableWorkManager";
        boolean bl2 = bundle.getBoolean(string2);
        if (!bl2) {
            return;
        }
        string2 = objectArray.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (string2 == null) {
            object = a;
            objectArray = new Object[]{};
            ((o)object).b("Empty bundle received from broadcast.", objectArray);
            return;
        }
        object = d.a((Context)object).b();
        objectArray = objectArray.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_NOTIFICATION_OPTIONS");
        ((cv)object).b((Bundle)string2, bundle, (Bundle)objectArray);
    }
}

