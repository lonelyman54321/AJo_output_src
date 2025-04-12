/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class Y43 {
    public final i90_0 a;
    public final Function2 b;
    public final le_2 c;
    public final AtomicInteger d;

    public Y43(i90_0 object, Y53 y53, Function2 function2, a63_0 object2) {
        Intrinsics.checkNotNullParameter(object, "scope");
        Intrinsics.checkNotNullParameter(y53, "onComplete");
        Intrinsics.checkNotNullParameter(function2, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(object2, "consumeMessage");
        this.a = object;
        this.b = object2;
        int n3 = 6;
        this.c = object2 = sr_2.a(-1 >>> 1, n3, null);
        this.d = object2 = new AtomicInteger(0);
        object = object.getCoroutineContext();
        object2 = i$a.a;
        object = (i)object.get((CoroutineContext$a)object2);
        if (object != null) {
            object2 = new W43(y53, this, function2);
            object.G((Function1)object2);
        }
    }

    public final void a(X53$a object) {
        Object object2 = this.c;
        object = object2.j(object);
        int n3 = object instanceof VR$a;
        Throwable throwable = null;
        if (n3 != 0) {
            n3 = object instanceof VR$a;
            if (n3 != 0) {
                object = (VR$a)object;
            } else {
                boolean bl2 = false;
                object = null;
            }
            if (object != null) {
                throwable = ((VR$a)object).a;
            }
            if (throwable == null) {
                object = "Channel was closed normally";
                throwable = new IllegalStateException((String)object);
            }
            throw throwable;
        }
        int n4 = object instanceof VR$b ^ 1;
        if (n4 != 0) {
            object = this.d;
            n4 = ((AtomicInteger)object).getAndIncrement();
            if (n4 == 0) {
                object = new x43_0(this, null);
                n3 = 3;
                i90_0 i90_02 = this.a;
                Ae3.d(i90_02, null, null, (Function2)object, n3);
            }
            return;
        }
        object2 = "Check failed.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

