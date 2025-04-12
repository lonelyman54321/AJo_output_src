/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from U33
 */
public final class u33_0
extends a
implements c90_0 {
    public final /* synthetic */ e43_0 a;

    public u33_0(e43_0 e43_02) {
        C90$a c90$a = C90$a.a;
        this.a = e43_02;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable throwable) {
        object = throwable.getMessage();
        if (object == null) {
            object = "Throwable message is null";
        }
        e43_0.h(this.a, (String)object);
    }
}

