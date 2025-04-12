/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class Xv1$c {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public Xv1$c(BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        this.a = intentFilter;
        this.b = broadcastReceiver2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(" filter=");
        object = this.a;
        stringBuilder.append(object);
        boolean bl2 = this.d;
        if (bl2) {
            object = " DEAD";
            stringBuilder.append((String)object);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

