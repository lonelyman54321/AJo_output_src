/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

public final class Xv1$a
extends Handler {
    public final /* synthetic */ Xv1 a;

    public Xv1$a(Xv1 xv1, Looper looper) {
        this.a = xv1;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        int n3 = object.what;
        int n4 = 1;
        if (n3 != n4) {
            super.handleMessage(object);
            return;
        }
        object = this.a;
        block4: while (true) {
            int n7;
            Xv1$b[] xv1$bArray;
            HashMap hashMap = object.b;
            synchronized (hashMap) {
                try {
                    ArrayList arrayList = object.d;
                    n4 = arrayList.size();
                    if (n4 <= 0) {
                        return;
                    }
                    xv1$bArray = new Xv1$b[n4];
                    ArrayList arrayList2 = object.d;
                    arrayList2.toArray(xv1$bArray);
                    arrayList2 = object.d;
                    arrayList2.clear();
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 4] lbl22 : MonitorExitStatement: MONITOREXIT : var4_5
                    n3 = 0;
                    hashMap = null;
                    n7 = 0;
                    arrayList2 = null;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (true) {
                if (n7 >= n4) continue block4;
                Xv1$b xv1$b = xv1$bArray[n7];
                ArrayList arrayList = xv1$b.b;
                int n8 = arrayList.size();
                for (int i3 = 0; i3 < n8; ++i3) {
                    Xv1$c xv1$c = (Xv1$c)xv1$b.b.get(i3);
                    boolean bl2 = xv1$c.d;
                    if (bl2) continue;
                    xv1$c = xv1$c.b;
                    Context context = object.a;
                    Intent intent = xv1$b.a;
                    xv1$c.onReceive(context, intent);
                }
                ++n7;
            }
            break;
        }
    }
}

