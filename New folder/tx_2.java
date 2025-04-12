/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tx
 */
public final class tx_2
extends BroadcastReceiverConstraintTracker {
    public final Object a() {
        Object object = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        int n3 = 0;
        String string2 = null;
        Context context = this.b;
        if ((object = context.registerReceiver(null, (IntentFilter)object)) == null) {
            object = qx1.a();
            n3 = ux_0.a;
            object.getClass();
            object = Boolean.FALSE;
        } else {
            int n4;
            int n7;
            n3 = Build.VERSION.SDK_INT;
            int n8 = 23;
            boolean bl2 = true;
            if (!(n3 >= n8 ? (n7 = object.getIntExtra(string2 = "status", n8 = -1)) == (n3 = 2) || n7 == (n3 = 5) : (n4 = object.getIntExtra(string2 = "plugged", 0)) != 0)) {
                bl2 = false;
            }
            object = bl2;
        }
        return object;
    }

    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            intentFilter.addAction("android.os.action.CHARGING");
            String string2 = "android.os.action.DISCHARGING";
            intentFilter.addAction(string2);
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            String string3 = "android.intent.action.ACTION_POWER_DISCONNECTED";
            intentFilter.addAction(string3);
        }
        return intentFilter;
    }

    public final void f(Intent object) {
        Object object2 = "intent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getAction();
        if (object == null) {
            return;
        }
        object2 = qx1.a();
        object2.getClass();
        int n3 = ((String)object).hashCode();
        switch (n3) {
            default: {
                break;
            }
            case 1019184907: {
                object2 = "android.intent.action.ACTION_POWER_CONNECTED";
                boolean bl2 = ((String)object).equals(object2);
                if (!bl2) break;
                object = Boolean.TRUE;
                this.b(object);
                break;
            }
            case 948344062: {
                object2 = "android.os.action.CHARGING";
                boolean bl3 = ((String)object).equals(object2);
                if (!bl3) break;
                object = Boolean.TRUE;
                this.b(object);
                break;
            }
            case -54942926: {
                object2 = "android.os.action.DISCHARGING";
                boolean bl4 = ((String)object).equals(object2);
                if (!bl4) break;
                object = Boolean.FALSE;
                this.b(object);
                break;
            }
            case -1886648615: {
                object2 = "android.intent.action.ACTION_POWER_DISCONNECTED";
                boolean bl5 = ((String)object).equals(object2);
                if (!bl5) break;
                object = Boolean.FALSE;
                this.b(object);
            }
        }
    }
}

