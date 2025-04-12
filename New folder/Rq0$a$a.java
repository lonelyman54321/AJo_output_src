/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Rq0$a$a
extends Lambda
implements Function1 {
    public final /* synthetic */ rq0_2 c;
    public final /* synthetic */ rq0$a_0 d;

    public Rq0$a$a(rq0_2 rq0_22, rq0$a_0 rq0$a_0) {
        this.c = rq0_22;
        this.d = rq0$a_0;
        super(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((IOException)object, "it");
        object = this.c;
        rq0$a_0 rq0$a_0 = this.d;
        synchronized (object) {
            rq0$a_0.c();
            return Unit.a;
        }
    }
}

