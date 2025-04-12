/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 */
import android.content.Context;
import com.clevertap.android.sdk.events.EventQueueManager;
import org.json.JSONArray;

public final class NB0
implements Runnable {
    public final /* synthetic */ EventQueueManager a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ FB0 c;
    public final /* synthetic */ JSONArray d;

    public /* synthetic */ NB0(EventQueueManager eventQueueManager, Context context, FB0 fB0, JSONArray jSONArray) {
        this.a = eventQueueManager;
        this.b = context;
        this.c = fB0;
        this.d = jSONArray;
    }

    public final void run() {
        tu1_1 tu1_12 = this.a.m;
        Context context = this.b;
        FB0 fB0 = this.c;
        JSONArray jSONArray = this.d;
        tu1_12.n(context, fB0, jSONArray, null);
    }
}

