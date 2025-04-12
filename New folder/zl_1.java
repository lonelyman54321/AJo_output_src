/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from zl
 */
public final class zl_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public zl_1(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ul$h)object;
        Sy2 sy2 = (Sy2)this.c.a.invoke();
        sy2.getClass();
        vg1_0 vg1_02 = ((ul$h)object).a;
        py2_0 py2_02 = new py2_0((ul$h)object, sy2);
        sy2.h(py2_02, vg1_02);
        return Unit.a;
    }
}

