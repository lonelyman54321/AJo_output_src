/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.events.EventQueueManager$c;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ EventQueueManager$c d;

    public a(EventQueueManager$c eventQueueManager$c, Context context, JSONObject jSONObject, int n3) {
        this.d = eventQueueManager$c;
        this.a = context;
        this.b = jSONObject;
        this.c = n3;
    }

    public final Object call() {
        Object object = this.d;
        x03 x032 = ((EventQueueManager$c)object).d.n;
        Context context = this.a;
        x032.a0(context);
        object = ((EventQueueManager$c)object).d;
        ((EventQueueManager)object).X();
        x032 = this.b;
        int n3 = this.c;
        ((EventQueueManager)object).Z(context, (JSONObject)x032, n3);
        return null;
    }
}

