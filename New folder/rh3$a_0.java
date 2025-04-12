/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import java.util.ArrayList;

/*
 * Renamed from rh3$a
 */
public final class rh3$a_0
implements H21$a {
    public Message a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        this.a = null;
        ArrayList arrayList = rh3_0.b;
        synchronized (arrayList) {
            int n3 = arrayList.size();
            int n4 = 50;
            if (n3 < n4) {
                arrayList.add(this);
            }
            return;
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a();
    }
}

