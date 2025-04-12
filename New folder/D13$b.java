/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class D13$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ File a;
    public final /* synthetic */ a93_0 b;

    public D13$b(File file, a93_0 a93_02, f80_0 f80_02) {
        this.a = file;
        this.b = a93_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        File file = this.a;
        a93_0 a93_02 = this.b;
        object = new D13$b(file, a93_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (D13$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((D13$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = p72_0.a;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object = o72_0.a(o72_0.e((File)object2));
        object2 = this.b;
        try {
            l2 = ((he2_2)object).s((a93_0)object2);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object, throwable);
                throw throwable2;
            }
        }
        Long l3 = new Long(l2);
        xj3_1.b((Closeable)object, null);
        return l3;
    }
}

