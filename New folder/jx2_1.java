/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jX2
 */
public final class jx2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ gx2_0 c;

    public jx2_1(gx2_0 gx2_02) {
        this.c = gx2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        this.c.l = l2 = ((Number)object).longValue();
        return Unit.a;
    }
}

