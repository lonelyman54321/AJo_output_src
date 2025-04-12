/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YV
 */
public final class yv_2 {
    public final Throwable a;

    public yv_2(Throwable throwable) {
        this.a = throwable;
    }

    public final Throwable a(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "wrap");
        Object object2 = this.a;
        if (object2 == null) {
            object = null;
        } else {
            boolean bl2 = object2 instanceof d80_0;
            if (bl2) {
                object2 = (d80_0)object2;
                object = object2.a();
            } else {
                bl2 = object2 instanceof CancellationException;
                if (bl2) {
                    object = object2;
                    object = xc0_2.a(((CancellationException)object2).getMessage(), (Throwable)object2);
                } else {
                    object = (Throwable)object.invoke(object2);
                }
            }
        }
        return object;
    }
}

