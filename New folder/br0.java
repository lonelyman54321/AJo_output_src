/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

public final class br0
implements Runnable {
    public final /* synthetic */ cr0_0 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ br0(cr0_0 cr0_02, Runnable runnable2) {
        this.a = cr0_02;
        this.b = runnable2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$runnable");
        ArrayDeque arrayDeque = ((cr0_0)object).d;
        boolean bl2 = arrayDeque.offer(object2);
        if (bl2) {
            ((cr0_0)object).a();
            return;
        }
        object2 = "cannot enqueue any more runnables".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

