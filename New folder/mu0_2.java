/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Mu0
 */
public final class mu0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;

    public mu0_2(long l2, Function0 function0) {
        this.c = l2;
        this.d = function0;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Kt0)object;
        float f5 = ((Number)this.d.invoke()).floatValue();
        long l2 = this.c;
        Jt0.j((Kt0)object2, l2, 0L, f5, null, 118);
        return Unit.a;
    }
}

