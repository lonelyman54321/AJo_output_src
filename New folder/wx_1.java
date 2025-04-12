/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wx
 */
public final class wx_1
extends BroadcastReceiverConstraintTracker {
    public final Object a() {
        Object object = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        int n3 = 0;
        float f5 = 0.0f;
        String string2 = null;
        Context context = this.b;
        if ((object = context.registerReceiver(null, (IntentFilter)object)) == null) {
            object = qx1.a();
            n3 = xx_0.a;
            object.getClass();
            object = Boolean.FALSE;
        } else {
            float f6;
            string2 = "status";
            int n4 = -1;
            n3 = object.getIntExtra(string2, n4);
            String string3 = "level";
            int n7 = object.getIntExtra(string3, n4);
            String string4 = "scale";
            int n8 = object.getIntExtra(string4, n4);
            float f7 = n7;
            float f8 = n8;
            f7 /= f8;
            n8 = 1;
            f8 = Float.MIN_VALUE;
            if (n3 != n8 && (n3 = (int)((f6 = f7 - (f5 = 0.15f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) <= 0) {
                n8 = 0;
                f8 = 0.0f;
                object = null;
            }
            object = n8 != 0;
        }
        return object;
    }

    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public final void f(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        Object object2 = object.getAction();
        if (object2 == null) {
            return;
        }
        object2 = qx1.a();
        int n3 = xx_0.a;
        object.getAction();
        object2.getClass();
        object = object.getAction();
        if (object != null) {
            int n4 = ((String)object).hashCode();
            if (n4 != (n3 = -1980154005)) {
                boolean bl2;
                n3 = 490310653;
                if (n4 == n3 && (bl2 = ((String)object).equals(object2 = "android.intent.action.BATTERY_LOW"))) {
                    object = Boolean.FALSE;
                    this.b(object);
                }
            } else {
                object2 = "android.intent.action.BATTERY_OKAY";
                boolean bl3 = ((String)object).equals(object2);
                if (bl3) {
                    object = Boolean.TRUE;
                    this.b(object);
                }
            }
        }
    }
}

