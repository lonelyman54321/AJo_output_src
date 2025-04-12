/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.FrameMetrics
 *  android.view.Window
 *  android.view.Window$OnFrameMetricsAvailableListener
 */
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

public final class RW0$a$a
implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ RW0$a a;

    public RW0$a$a(RW0$a a2) {
        this.a = a2;
    }

    public final void onFrameMetricsAvailable(Window object, FrameMetrics frameMetrics, int n3) {
        long l2;
        long l3;
        object = this.a;
        n3 = object.a;
        int n4 = 1;
        int n7 = 8;
        if ((n3 &= n4) != 0) {
            object = object.b[0];
            long l4 = frameMetrics.getMetric(n7);
            RW0$a.e((SparseIntArray)object, l4);
        }
        object = this.a;
        n3 = object.a;
        int n8 = 2;
        if ((n3 &= n8) != 0) {
            object = object.b[n4];
            l3 = frameMetrics.getMetric(n4);
            RW0$a.e((SparseIntArray)object, l3);
        }
        object = this.a;
        n3 = object.a;
        n4 = 4;
        int n10 = 3;
        if ((n3 &= n4) != 0) {
            object = object.b[n8];
            l2 = frameMetrics.getMetric(n10);
            RW0$a.e((SparseIntArray)object, l2);
        }
        object = this.a;
        n3 = object.a & n7;
        if (n3 != 0) {
            object = object.b[n10];
            l3 = frameMetrics.getMetric(n4);
            RW0$a.e((SparseIntArray)object, l3);
        }
        object = this.a;
        n3 = object.a & 0x10;
        n10 = 5;
        if (n3 != 0) {
            object = object.b[n4];
            l2 = frameMetrics.getMetric(n10);
            RW0$a.e((SparseIntArray)object, l2);
        }
        object = this.a;
        n3 = object.a & 0x40;
        n4 = 7;
        int n14 = 6;
        if (n3 != 0) {
            object = object.b[n14];
            long l7 = frameMetrics.getMetric(n4);
            RW0$a.e((SparseIntArray)object, l7);
        }
        object = this.a;
        n3 = object.a & 0x20;
        if (n3 != 0) {
            object = object.b[n10];
            l3 = frameMetrics.getMetric(n14);
            RW0$a.e((SparseIntArray)object, l3);
        }
        object = this.a;
        n3 = object.a & 0x80;
        if (n3 != 0) {
            object = object.b[n4];
            long l8 = frameMetrics.getMetric(0);
            RW0$a.e((SparseIntArray)object, l8);
        }
        object = this.a;
        n3 = object.a & 0x100;
        if (n3 != 0) {
            object = object.b[n7];
            long l12 = frameMetrics.getMetric(n8);
            RW0$a.e((SparseIntArray)object, l12);
        }
    }
}

