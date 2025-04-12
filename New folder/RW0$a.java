/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.util.SparseIntArray
 *  android.view.Window$OnFrameMetricsAvailableListener
 */
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class RW0$a
extends RW0$b {
    public static HandlerThread e;
    public static Handler f;
    public final int a;
    public SparseIntArray[] b;
    public final ArrayList c;
    public final RW0$a$a d;

    public RW0$a() {
        Object object = new SparseIntArray[9];
        this.b = object;
        this.c = object;
        super(this);
        this.d = object;
        this.a = 1;
    }

    public static void e(SparseIntArray sparseIntArray, long l2) {
        if (sparseIntArray != null) {
            long l3 = (500000L + l2) / 1000000L;
            int n3 = (int)l3;
            long l4 = 0L;
            long l7 = l2 - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) {
                int n4 = sparseIntArray.get(n3) + 1;
                sparseIntArray.put(n3, n4);
            }
        }
    }

    public final void a(Activity activity) {
        Looper looper;
        int n3;
        Object object;
        Object object2 = e;
        if (object2 == null) {
            object2 = new HandlerThread("FrameMetricsAggregator");
            e = object2;
            ((Thread)object2).start();
            object = e.getLooper();
            object2 = new Handler(object);
            f = object2;
        }
        object2 = null;
        for (int i3 = 0; i3 <= (n3 = 8); ++i3) {
            object = this.b;
            looper = object[i3];
            if (looper != null) continue;
            int n4 = this.a;
            int n7 = 1 << i3;
            if ((n4 &= n7) == 0) continue;
            object[i3] = looper = new SparseIntArray();
        }
        object2 = activity.getWindow();
        object = this.d;
        looper = f;
        object2.addOnFrameMetricsAvailableListener((Window.OnFrameMetricsAvailableListener)object, (Handler)looper);
        object2 = this.c;
        object = new WeakReference(activity);
        ((ArrayList)object2).add(object);
    }

    public final SparseIntArray[] b() {
        return this.b;
    }

    public final SparseIntArray[] c(Activity activity) {
        boolean bl2;
        Object object = this.c;
        Iterator iterator = ((ArrayList)object).iterator();
        while (bl2 = iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            Object t3 = weakReference.get();
            if (t3 != activity) continue;
            ((ArrayList)object).remove(weakReference);
            break;
        }
        activity = activity.getWindow();
        object = this.d;
        activity.removeOnFrameMetricsAvailableListener((Window.OnFrameMetricsAvailableListener)object);
        return this.b;
    }

    public final SparseIntArray[] d() {
        SparseIntArray[] sparseIntArrayArray = this.b;
        SparseIntArray[] sparseIntArrayArray2 = new SparseIntArray[9];
        this.b = sparseIntArrayArray2;
        return sparseIntArrayArray;
    }
}

