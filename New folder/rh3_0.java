/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/*
 * Renamed from rh3
 */
public final class rh3_0
implements H21 {
    public static final ArrayList b;
    public final Handler a;

    static {
        ArrayList arrayList;
        b = arrayList = new ArrayList(50);
    }

    public rh3_0(Handler handler) {
        this.a = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static rh3$a_0 m() {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                int n3;
                try {
                    n3 = arrayList.isEmpty();
                    if (n3 != 0) {
                        return new rh3$a_0();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                n3 = arrayList.size() + -1;
                return arrayList.remove(n3);
            }
            throw throwable2;
        }
    }

    public final boolean a() {
        return this.a.hasMessages(1);
    }

    public final rh3$a_0 b(int n3) {
        Message message;
        rh3$a_0 rh3$a_0 = rh3_0.m();
        rh3$a_0.a = message = this.a.obtainMessage(n3);
        return rh3$a_0;
    }

    public final void c() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final rh3$a_0 d(int n3, Object object) {
        Message message;
        rh3$a_0 rh3$a_0 = rh3_0.m();
        rh3$a_0.a = message = this.a.obtainMessage(n3, object);
        return rh3$a_0;
    }

    public final Looper e() {
        return this.a.getLooper();
    }

    public final rh3$a_0 f(int n3, int n4, int n7) {
        Message message;
        rh3$a_0 rh3$a_0 = rh3_0.m();
        rh3$a_0.a = message = this.a.obtainMessage(n3, n4, n7);
        return rh3$a_0;
    }

    public final boolean g(H21$a h21$a) {
        h21$a = (rh3$a_0)h21$a;
        Message message = ((rh3$a_0)h21$a).a;
        message.getClass();
        boolean bl2 = this.a.sendMessageAtFrontOfQueue(message);
        ((rh3$a_0)h21$a).a();
        return bl2;
    }

    public final rh3$a_0 h(int n3, Object object, int n4, int n7) {
        Message message;
        rh3$a_0 rh3$a_0 = rh3_0.m();
        rh3$a_0.a = message = this.a.obtainMessage(n3, n4, n7, object);
        return rh3$a_0;
    }

    public final boolean i(Runnable runnable2) {
        return this.a.post(runnable2);
    }

    public final boolean j(long l2) {
        return this.a.sendEmptyMessageAtTime(2, l2);
    }

    public final boolean k(int n3) {
        return this.a.sendEmptyMessage(n3);
    }

    public final void l(int n3) {
        boolean bl2 = n3 != 0;
        ct3.a(bl2);
        this.a.removeMessages(n3);
    }
}

