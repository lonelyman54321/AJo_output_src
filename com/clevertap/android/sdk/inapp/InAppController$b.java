/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.InAppController$NotificationPrepareRunnable;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class InAppController$b
implements Callable {
    public final /* synthetic */ JSONObject a;
    public final /* synthetic */ InAppController b;

    public InAppController$b(InAppController inAppController, JSONObject jSONObject) {
        this.b = inAppController;
        this.a = jSONObject;
    }

    public final Object call() {
        InAppController inAppController = this.b;
        JSONObject jSONObject = this.a;
        InAppController$NotificationPrepareRunnable inAppController$NotificationPrepareRunnable = new InAppController$NotificationPrepareRunnable(inAppController, inAppController, jSONObject);
        inAppController$NotificationPrepareRunnable.run();
        return null;
    }
}

