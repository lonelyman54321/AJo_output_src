/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Os0
 */
public final class os0_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function1 c;

    public os0_0(gb1_0 gb1_02) {
        this.c = gb1_02;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (aw2_0)object;
        object2 = (aw2_0)object2;
        long cfr_ignored_0 = ((e72)object3).a;
        long l2 = ((aw2_0)object2).c;
        object3 = new e72(l2);
        this.c.invoke(object3);
        return Unit.a;
    }
}

