/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Is1$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Object c;

    public Is1$b(Object object) {
        this.c = object;
        super(1);
    }

    public final Object invoke(Object object) {
        ((Number)object).intValue();
        return this.c;
    }
}

