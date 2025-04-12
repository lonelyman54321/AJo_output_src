/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Wq0
 */
public final class wq0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ rq0_2 c;

    public wq0_2(rq0_2 rq0_22) {
        this.c = rq0_22;
        super(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((IOException)object, "it");
        object = ez3.a;
        this.c.k = true;
        return Unit.a;
    }
}

