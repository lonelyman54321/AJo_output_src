/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class yn2
extends c {
    public final cr0_0 b;

    public yn2() {
        cr0_0 cr0_02;
        this.b = cr0_02 = new cr0_0();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void J0(CoroutineContext object, Runnable object2) {
        br0 br02;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "block");
        cr0_0 cr0_02 = this.b;
        cr0_02.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "runnable");
        object3 = ir0_2.a;
        object3 = bg1_1.a.N0();
        boolean bl2 = ((c)object3).L0((CoroutineContext)object);
        if (!bl2) {
            bl2 = cr0_02.b;
            if (!bl2 && (bl2 = cr0_02.a)) {
                bl2 = false;
                br02 = null;
            } else {
                bl2 = true;
            }
            if (!bl2) {
                object = cr0_02.d;
                boolean bl3 = ((ArrayDeque)object).offer(object2);
                if (bl3) {
                    cr0_02.a();
                    return;
                }
                object2 = "cannot enqueue any more runnables".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        br02 = new br0(cr0_02, (Runnable)object2);
        ((c)object3).J0((CoroutineContext)object, br02);
    }

    public final boolean L0(CoroutineContext object) {
        Intrinsics.checkNotNullParameter(object, "context");
        c c2 = ir0_2.a;
        c2 = bg1_1.a.N0();
        boolean bl2 = c2.L0((CoroutineContext)object);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        object = this.b;
        boolean bl4 = ((cr0_0)object).b;
        if (!bl4 && (bl2 = ((cr0_0)object).a)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2 ^ bl3;
    }
}

