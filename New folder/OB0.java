/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.events.EventQueueManager$c;
import com.clevertap.android.sdk.task.a;
import org.json.JSONObject;

public final class OB0
implements Runnable {
    public final /* synthetic */ EventQueueManager$c a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ int d;

    public /* synthetic */ OB0(EventQueueManager$c c2, Context context, JSONObject jSONObject, int n3) {
        this.a = c2;
        this.b = context;
        this.c = jSONObject;
        this.d = n3;
    }

    public final void run() {
        EventQueueManager$c eventQueueManager$c = this.a;
        a a2 = jh_1.a(eventQueueManager$c.d.d).b();
        Context context = this.b;
        JSONObject jSONObject = this.c;
        int n3 = this.d;
        com.clevertap.android.sdk.events.a a3 = new com.clevertap.android.sdk.events.a(eventQueueManager$c, context, jSONObject, n3);
        a2.c("queueEventWithDelay", a3);
    }
}

