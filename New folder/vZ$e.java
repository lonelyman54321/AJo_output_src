/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vZ$e
extends Lambda
implements Function1 {
    public final /* synthetic */ vZ c;

    public vZ$e(vZ vZ2) {
        this.c = vZ2;
        super(1);
    }

    public final Object invoke(Object object) {
        long cfr_ignored_0 = ((e72)object).a;
        object = this.c;
        boolean bl2 = ((B0)object).t;
        if (bl2) {
            object = ((B0)object).u;
            object.invoke();
        }
        return Unit.a;
    }
}

