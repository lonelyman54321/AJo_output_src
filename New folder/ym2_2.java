/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.HashSet;

/*
 * Renamed from yM2
 */
public final class ym2_2
implements s3_0 {
    public final HashSet a;

    public ym2_2() {
        HashSet hashSet;
        this.a = hashSet = new HashSet();
    }

    public final void a() {
        Object object;
        Object object2 = ah1_2.a;
        if (object2 == null) {
            object2 = Looper.getMainLooper().getThread();
            ah1_2.a = object2;
        }
        if ((object2 = Thread.currentThread()) == (object = ah1_2.a)) {
            boolean bl2;
            object2 = this.a.iterator();
            while (bl2 = object2.hasNext()) {
                object = (xm2_2)object2.next();
                object.a();
            }
            return;
        }
        object2 = new Object("Must be called on the Main thread.");
        throw object2;
    }
}

