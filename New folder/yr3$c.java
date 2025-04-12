/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yr3$c
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;

    public yr3$c(gr3 gr32) {
        this.c = gr32;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        gr3 gr32 = this.c;
        object = new Ir3(gr32);
        return object;
    }
}

