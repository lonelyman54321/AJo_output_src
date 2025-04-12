/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zj2
 */
public final class zj2_1
implements Runnable {
    public final /* synthetic */ dj2_2 a;

    public /* synthetic */ zj2_1(dj2_2 dj2_22) {
        this.a = dj2_22;
    }

    public final void run() {
        long l2;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((dj2_2)object).u = l2 = ((dj2_2)object).u + 1L;
        Handler handler = ((dj2_2)object).x;
        object = ((dj2_2)object).y;
        handler.postDelayed((Runnable)object, 1000L);
    }
}

