/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vl
 */
public final class vl_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public vl_1(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ul$c)object;
        Sy2 sy2 = (Sy2)this.c.a.invoke();
        sy2.getClass();
        Lj lj = ((ul$c)object).a;
        my2_1 my2_12 = new my2_1((ul$c)object, sy2);
        sy2.h(my2_12, lj);
        return Unit.a;
    }
}

