/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Io1
 */
public final class io1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ jj_2 c;

    public io1_2(jj_2 jj_22) {
        this.c = jj_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.c.cancel();
        return Unit.a;
    }
}

