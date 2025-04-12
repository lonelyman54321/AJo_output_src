/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;

/*
 * Renamed from eL
 */
public final class el_2 {
    public static final void a(f80_0 f80_02, Throwable throwable) {
        boolean bl2 = throwable instanceof DispatchException;
        if (bl2) {
            throwable = ((DispatchException)throwable).a;
        }
        Object object = tl2_2.b;
        object = vl2_2.a(throwable);
        f80_02.resumeWith(object);
        throw throwable;
    }

    public static final void b(f80_0 f80_02, f80_0 f80_03) {
        try {
            f80_02 = zj1_2.b(f80_02);
        }
        catch (Throwable throwable) {
            el_2.a(f80_03, throwable);
            throw null;
        }
        Object object = tl2_2.b;
        object = Unit.a;
        dr0_2.a(f80_02, object);
    }

    public static final void c(Function2 object, Object object2, f80_0 f80_02) {
        try {
            object = zj1_2.a((Function2)object, object2, f80_02);
        }
        catch (Throwable throwable) {
            el_2.a(f80_02, throwable);
            throw null;
        }
        object = zj1_2.b((f80_0)object);
        object2 = tl2_2.b;
        object2 = Unit.a;
        dr0_2.a((f80_0)object, object2);
    }
}

