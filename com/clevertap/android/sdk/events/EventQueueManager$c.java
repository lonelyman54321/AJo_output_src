/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class EventQueueManager$c
implements Callable {
    public final /* synthetic */ JSONObject a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ EventQueueManager d;

    public EventQueueManager$c(EventQueueManager eventQueueManager, JSONObject jSONObject, int n3, Context context) {
        this.d = eventQueueManager;
        this.a = jSONObject;
        this.b = n3;
        this.c = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object call() {
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7;
        int n8;
        Object object3;
        Object object4;
        block15: {
            int n10;
            Object object5;
            object4 = this.d.h;
            object3 = this.a;
            int n14 = this.b;
            object4.getClass();
            n8 = 8;
            n7 = 7;
            if (n14 != n7 && n14 != n8) {
                object2 = ((KB0)object4).a;
                object5 = ((E80)object2).n;
                // MONITORENTER : object5
                n14 = (int)(((E80)object2).e ? 1 : 0);
                // MONITOREXIT : object5
                if (n14 != 0) {
                    object3 = object3 == null ? "null" : object3.toString();
                    object2 = ((KB0)object4).b.b();
                    object4 = ((KB0)object4).b.a;
                    String string2 = "Current user is opted out dropping event: ";
                    object4 = new StringBuilder(string2);
                    ((StringBuilder)object4).append((String)object3);
                    object4 = ((StringBuilder)object4).toString();
                    object2.getClass();
                    com.clevertap.android.sdk.b.f((String)object4);
                    return null;
                }
                long l2 = System.currentTimeMillis();
                long l3 = 1000L;
                n14 = (int)(l2 /= l3);
                object5 = ((KB0)object4).c;
                CleverTapInstanceConfig cleverTapInstanceConfig = ((KB0)object4).b;
                String string3 = "comms_mtd";
                n10 = gc3_0.c((Context)object5, cleverTapInstanceConfig, string3);
                if ((n14 -= n10) < (n10 = 86400)) {
                    object2 = ((KB0)object4).b.b();
                    object4 = ((KB0)object4).b.a;
                    String string4 = "CleverTap is muted, dropping event - ";
                    StringBuilder stringBuilder = new StringBuilder(string4);
                    object3 = object3.toString();
                    stringBuilder.append((String)object3);
                    object3 = stringBuilder.toString();
                    ((b)object2).b((String)object4, (String)object3);
                    return null;
                }
            }
            object4 = this.d.h;
            object3 = this.a;
            n14 = this.b;
            if (n14 == n8) {
                object4.getClass();
            } else {
                object = ((KB0)object4).b;
                n8 = (int)(((CleverTapInstanceConfig)object).k ? 1 : 0);
                if (n8 == 0) {
                    block14: {
                        object = "evtName";
                        n10 = object3.has((String)object);
                        if (n10 != 0) {
                            try {
                                object5 = q50_0.a;
                                object5 = Arrays.asList(object5);
                                object3 = object3.getString((String)object);
                                n4 = (int)(object5.contains(object3) ? 1 : 0);
                                if (n4 == 0) break block14;
                                break block15;
                            }
                            catch (JSONException jSONException) {}
                        }
                    }
                    if (n14 == (n4 = 4) && (n3 = (int)(((E80)(object4 = ((KB0)object4).a)).h() ? 1 : 0)) == 0) {
                        object4 = this.d.d.b();
                        object3 = this.d.d.a;
                        object3 = new StringBuilder("App Launched not yet processed, re-queuing event ");
                        object2 = this.a;
                        ((StringBuilder)object3).append(object2);
                        ((StringBuilder)object3).append("after 2s");
                        object3 = ((StringBuilder)object3).toString();
                        object4.getClass();
                        com.clevertap.android.sdk.b.f((String)object3);
                        object4 = this.d.l;
                        object3 = this.c;
                        object2 = this.a;
                        n8 = this.b;
                        OB0 oB0 = new OB0(this, (Context)object3, (JSONObject)object2, n8);
                        long l4 = 2000L;
                        object4.postDelayed((Runnable)oB0, l4);
                        return null;
                    }
                }
            }
        }
        n3 = this.b;
        if (n3 != n7 && n3 != (n4 = 6)) {
            object4 = this.d.n;
            object3 = this.c;
            ((x03)object4).a0((Context)object3);
            this.d.X();
            object4 = this.d;
            object3 = this.c;
            object2 = this.a;
            n8 = this.b;
            ((EventQueueManager)object4).Z((Context)object3, (JSONObject)object2, n8);
            return null;
        }
        object3 = this.d;
        object2 = this.c;
        object = this.a;
        ((EventQueueManager)object3).Z((Context)object2, (JSONObject)object, n3);
        return null;
    }
}

