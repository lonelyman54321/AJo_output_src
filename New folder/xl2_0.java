/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Xl2
 */
public final class xl2_0
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public xl2_0(f80_0 f80_02, Object object) {
        this.b = object;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object3 = (f80_0)object3;
        Object object4 = this.b;
        object2 = new xl2_0((f80_0)object3, object4);
        ((xl2_0)object2).a = object;
        object = Unit.a;
        return ((xl2_0)object2).invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a;
        object = object == null ? this.b : null;
        return object;
    }
}

