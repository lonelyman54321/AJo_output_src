/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fz
 */
public final class fz_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ZD c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Qt0 f;

    public fz_1(ZD zD, long l2, long l3, Qt0 qt0) {
        this.c = zD;
        this.d = l2;
        this.e = l3;
        this.f = qt0;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (E60)object;
        object2.e1();
        Qt0 qt0 = this.f;
        ZD zD = this.c;
        long l2 = this.d;
        long l3 = this.e;
        Jt0.i((Kt0)object2, zD, l2, l3, 0.0f, qt0, 104);
        return Unit.a;
    }
}

