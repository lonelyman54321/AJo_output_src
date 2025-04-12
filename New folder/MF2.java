/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class MF2
extends Lambda
implements Function1 {
    public final /* synthetic */ k80 c;
    public final /* synthetic */ pr1_1 d;

    public MF2(k80 k802, pr1_1 pr1_12) {
        this.c = k802;
        this.d = pr1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        this.c.t(object);
        pr1_1 pr1_12 = this.d;
        if (pr1_12 != null) {
            pr1_12.d(object);
        }
        return Unit.a;
    }
}

