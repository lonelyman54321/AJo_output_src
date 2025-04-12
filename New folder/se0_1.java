/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from se0
 */
public final class se0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ib3_0 c;

    public se0_1(gr3$d gr3$d) {
        this.c = gr3$d;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (a11_0)object;
        float f5 = ((Number)this.c.getValue()).floatValue();
        object.b(f5);
        return Unit.a;
    }
}

