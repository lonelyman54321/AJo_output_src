/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from N90
 */
public final class n90_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ Callable a;

    public n90_0(Callable callable, f80_0 f80_02) {
        this.a = callable;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Callable callable = this.a;
        object = new n90_0(callable, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (n90_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((n90_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return this.a.call();
    }
}

