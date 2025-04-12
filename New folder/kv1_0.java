/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kV1
 */
public final class kv1_0
extends BroadcastReceiverConstraintTracker {
    public final ConnectivityManager g;

    public kv1_0(Context object, Si3 si3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(si3, "taskExecutor");
        super((Context)object, si3);
        object = this.b.getSystemService("connectivity");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
        object = (ConnectivityManager)object;
        this.g = object;
    }

    public final Object a() {
        return jV1.a(this.g);
    }

    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    public final void f(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        object = object.getAction();
        String string2 = "android.net.conn.CONNECTIVITY_CHANGE";
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = qx1.a();
            object.getClass();
            object = jV1.a(this.g);
            this.b(object);
        }
    }
}

