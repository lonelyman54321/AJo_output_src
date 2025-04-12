/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ri
 */
public final class ri_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ut2 c;
    public final /* synthetic */ ti d;

    public ri_0(xt1_0 xt1_02, ti ti2) {
        this.c = xt1_02;
        this.d = ti2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (i90_0)object;
        Object object2 = this.d;
        qi_0 qi_02 = new qi_0((ti)object2);
        object2 = (xt1_0)this.c;
        object = new Uh1((xt1_0)object2, qi_02);
        return object;
    }
}

