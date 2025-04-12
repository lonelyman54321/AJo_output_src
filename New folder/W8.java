/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class W8
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ W8(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        int n3;
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.a;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        object = q9_02.O1;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressLyt");
            n3 = 0;
            object = null;
        }
        ai0_2.B((View)object);
        object = q9_02.D1;
        if (object != null && (n3 = object.getVisibility()) == 0) {
            Object object2 = Looper.getMainLooper();
            object = new Handler(object2);
            object2 = new e9(q9_02);
            object.postDelayed((Runnable)object2, 900L);
            object2 = Looper.getMainLooper();
            object = new Handler(object2);
            object2 = new f9(q9_02);
            long l2 = 1000L;
            object.postDelayed((Runnable)object2, l2);
        }
    }
}

