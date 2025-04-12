/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cY2
 */
public final class cy2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Sj3 c;

    public cy2_1(Sj3 sj3) {
        this.c = sj3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (aw2_0)object;
        long l2 = si0_2.g((aw2_0)object, false);
        this.c.d(l2);
        ((aw2_0)object).a();
        return Unit.a;
    }
}

