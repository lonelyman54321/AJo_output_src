/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cw1
 */
public final class cw1_0
implements Callable {
    public final /* synthetic */ aj_0 a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ cw1_0(aj_0 aj_02, ti0_2 ti0_22) {
        this.a = aj_02;
        this.b = ti0_22;
    }

    public final Object call() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "$callable";
        Callable callable = this.b;
        Intrinsics.checkNotNullParameter(callable, (String)object2);
        try {
            ((aj_0)object).a = object2 = callable.call();
            return null;
        }
        finally {
            object = (CountDownLatch)((aj_0)object).b;
            if (object != null) {
                ((CountDownLatch)object).countDown();
            }
        }
    }
}

