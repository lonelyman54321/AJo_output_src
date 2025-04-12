/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import com.ril.ajio.AJIOApplication;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class U
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ U(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                ((AtomicBoolean)object).set(true);
                return;
            }
            case 0: 
        }
        object = (AJIOApplication)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        boolean bl2 = bo1_1.b;
        if (bl2) {
            bo1_1.e();
        } else {
            long l2;
            bo1_1.d = l2 = SystemClock.uptimeMillis();
            bo1_1.f();
        }
    }
}

