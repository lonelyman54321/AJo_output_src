/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xl
 */
public final class xl_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ul_1 c;

    public xl_1(ul_1 ul_12) {
        this.c = ul_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gr3)object;
        Object object2 = this.c;
        Sy2 sy2 = (Sy2)((ul_1)object2).a.invoke();
        sy2.getClass();
        Object object3 = ((gr3)object).a.a();
        boolean bl2 = object3 instanceof Boolean;
        if (bl2) {
            object2 = ((ul_1)object2).b;
            object3 = new oy2_1((gr3)object, (Function0)object2, sy2);
            sy2.h((Function1)object3, object);
        }
        return Unit.a;
    }
}

