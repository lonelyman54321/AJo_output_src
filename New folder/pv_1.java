/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PV
 */
public final class pv_1
implements Closeable {
    public final xq_2 a;
    public final Object b;
    public final Function1 c;
    public Function0 d;

    public pv_1(xq_2 object, Object object2, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "config");
        Intrinsics.checkNotNullParameter(function1, "body");
        this.a = object;
        this.b = object2;
        this.c = function1;
        this.d = object = new Object();
    }

    public final void close() {
        this.d.invoke();
    }
}

