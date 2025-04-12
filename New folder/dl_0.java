/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Dl
 */
public final class dl_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public dl_0(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ni3_0)object;
        Sy2 sy2 = (Sy2)this.c.a.invoke();
        sy2.getClass();
        ry2_1 ry2_12 = new ry2_1(sy2, "TargetBasedAnimation");
        sy2.h(ry2_12, object);
        return Unit.a;
    }
}

