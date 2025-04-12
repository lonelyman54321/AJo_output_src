/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wl
 */
public final class wl_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public wl_1(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gr3)object;
        Sy2 sy2 = (Sy2)this.c.a.invoke();
        sy2.getClass();
        ny2_0 ny2_02 = new ny2_0((gr3)object, sy2);
        sy2.h(ny2_02, object);
        return Unit.a;
    }
}

