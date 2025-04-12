/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Bl
 */
public final class bl_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public bl_0(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gr3)object;
        Sy2 sy2 = (Sy2)this.c.a.invoke();
        sy2.getClass();
        qy2_1 qy2_12 = new qy2_1((gr3)object, sy2);
        sy2.h(qy2_12, object);
        return Unit.a;
    }
}

