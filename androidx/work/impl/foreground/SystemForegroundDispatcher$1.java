/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.foreground;

import androidx.work.impl.foreground.a;
import java.util.HashMap;
import kotlinx.coroutines.c;

class SystemForegroundDispatcher$1
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ a b;

    public SystemForegroundDispatcher$1(a a2, String string2) {
        this.b = a2;
        this.a = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.b.a.f;
        Object object2 = this.a;
        if ((object = ((kz2_0)object).c((String)object2)) == null) return;
        boolean bl2 = ((EI3)object).e();
        if (!bl2) return;
        object2 = this.b.c;
        synchronized (object2) {
            Object object3 = this.b;
            object3 = ((a)object3).f;
            Object object4 = JI3.a((EI3)object);
            ((HashMap)object3).put(object4, object);
            object3 = this.b;
            object4 = ((a)object3).h;
            object3 = ((a)object3).b;
            object3 = object3.b();
            a a2 = this.b;
            object3 = OH3.a((MH3)object4, (EI3)object, (c)object3, a2);
            object4 = this.b;
            object4 = ((a)object4).g;
            object = JI3.a((EI3)object);
            ((HashMap)object4).put(object, object3);
            return;
        }
    }
}

