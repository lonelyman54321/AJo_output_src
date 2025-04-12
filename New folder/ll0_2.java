/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from LL0
 */
public final class ll0_2
extends a
implements c90_0 {
    public final /* synthetic */ ml0_2 a;

    public ll0_2(ml0_2 ml0_22) {
        C90$a c90$a = C90$a.a;
        this.a = ml0_22;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable throwable) {
        object = this.a.b;
        if (object != null) {
            throwable.getStackTrace();
            object.a();
        }
    }
}

