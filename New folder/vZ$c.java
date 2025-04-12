/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vZ$c
extends Lambda
implements Function1 {
    public final /* synthetic */ vZ c;

    public vZ$c(vZ vZ2) {
        this.c = vZ2;
        super(1);
    }

    public final Object invoke(Object object) {
        long cfr_ignored_0 = ((e72)object).a;
        object = this.c.I;
        if (object != null) {
            object.invoke();
        }
        return Unit.a;
    }
}

