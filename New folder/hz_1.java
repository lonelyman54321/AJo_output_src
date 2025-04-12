/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hz
 */
public final class hz_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Cg2$a c;
    public final /* synthetic */ ZD d;

    public hz_1(Cg2$a cg2$a, ZD zD) {
        this.c = cg2$a;
        this.d = zD;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (E60)object;
        object2.e1();
        gn2 gn22 = this.c.a;
        ZD zD = this.d;
        Jt0.g((Kt0)object2, gn22, zD, 0.0f, null, 60);
        return Unit.a;
    }
}

