/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lq3
 */
public final class lq3_0
implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ mq3 b;

    public /* synthetic */ lq3_0(Runnable runnable2, mq3 mq32) {
        this.a = runnable2;
        this.b = mq32;
    }

    public final void run() {
        Runnable runnable2 = this.a;
        Intrinsics.checkNotNullParameter(runnable2, "$command");
        String string2 = "this$0";
        mq3 mq32 = this.b;
        Intrinsics.checkNotNullParameter(mq32, string2);
        try {
            runnable2.run();
            return;
        }
        finally {
            mq32.a();
        }
    }
}

