/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ic3
 */
public final class ic3_0
extends BroadcastReceiverConstraintTracker {
    public final Object a() {
        boolean bl2;
        block0: {
            Object object;
            block1: {
                Object object2;
                block2: {
                    String string2;
                    boolean bl3;
                    int n3;
                    object2 = this.e();
                    object = this.b;
                    String string3 = null;
                    object2 = object.registerReceiver(null, (IntentFilter)object2);
                    bl2 = true;
                    if (object2 == null || (string3 = object2.getAction()) == null) break block0;
                    object2 = object2.getAction();
                    string3 = null;
                    if (object2 == null) break block1;
                    int n4 = ((String)object2).hashCode();
                    if (n4 == (n3 = -1181163412)) break block2;
                    n3 = -730838620;
                    if (n4 == n3 && (bl3 = ((String)object2).equals(string2 = "android.intent.action.DEVICE_STORAGE_OK"))) break block0;
                    break block1;
                }
                object = "android.intent.action.DEVICE_STORAGE_LOW";
                boolean bl4 = ((String)object2).equals(object);
            }
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public final void f(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        Object object2 = object.getAction();
        if (object2 == null) {
            return;
        }
        object2 = qx1.a();
        int n3 = jc3_0.a;
        object.getAction();
        object2.getClass();
        object = object.getAction();
        if (object != null) {
            int n4 = ((String)object).hashCode();
            if (n4 != (n3 = -1181163412)) {
                boolean bl2;
                n3 = -730838620;
                if (n4 == n3 && (bl2 = ((String)object).equals(object2 = "android.intent.action.DEVICE_STORAGE_OK"))) {
                    object = Boolean.TRUE;
                    this.b(object);
                }
            } else {
                object2 = "android.intent.action.DEVICE_STORAGE_LOW";
                boolean bl3 = ((String)object).equals(object2);
                if (bl3) {
                    object = Boolean.FALSE;
                    this.b(object);
                }
            }
        }
    }
}

