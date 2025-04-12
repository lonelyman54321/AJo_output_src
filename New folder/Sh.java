/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Sh
extends Lambda
implements Function1 {
    public final /* synthetic */ ql3_0 c;
    public final /* synthetic */ Uh d;
    public final /* synthetic */ Se1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public Sh(ql3_0 ql3_02, Uh uh, Se1 se1, dk3_0 dk3_02, Vt1$a vt1$a) {
        this.c = ql3_02;
        this.d = uh;
        this.e = se1;
        this.f = dk3_02;
        this.g = vt1$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (xt1_0)object;
        Qt1$a qt1$a = this.d.a;
        Object object2 = this.c;
        ((xt1_0)object).h = object2;
        ((xt1_0)object).i = object2 = this.e;
        ((xt1_0)object).c = object2 = this.f;
        ((xt1_0)object).d = object2 = this.g;
        object2 = null;
        Object object3 = qt1$a != null ? qt1$a.b1() : null;
        ((xt1_0)object).e = object3;
        object3 = qt1$a != null ? qt1$a.y0() : null;
        ((xt1_0)object).f = object3;
        if (qt1$a != null) {
            object2 = qt1$a.getViewConfiguration();
        }
        ((xt1_0)object).g = object2;
        return Unit.a;
    }
}

