/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Wg3$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Wg3$a c;

    public Wg3$c(Wg3$a wg3$a) {
        this.c = wg3$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        Wg3$a wg3$a = this.c;
        bl_2 bl_22 = wg3$a.c;
        if (bl_22 != null) {
            bl_22.e((Throwable)object);
        }
        wg3$a.c = null;
        return Unit.a;
    }
}

