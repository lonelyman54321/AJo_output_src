/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w
 */
public final class w_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ y_0 a;
    public final /* synthetic */ ue3_1 b;

    public w_0(y_0 y_02, ue3_1 ue3_12, f80_0 f80_02) {
        this.a = y_02;
        this.b = ue3_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        y_0 y_02 = this.a;
        ue3_1 ue3_12 = this.b;
        object = new w_0(y_02, ue3_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (w_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((w_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = wb_0.a;
        int n3 = Kb.a();
        object = new Kl2(n3, 0, 62);
        Object object3 = this.b;
        object2 = new ob_0(object3, 0);
        Object object4 = "config";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object3 = "pagingSourceFactory";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        sk2_1 sk2_12 = new sk2_1((Function0)object2, null);
        object4 = new sk2(sk2_12, null, (Kl2)object);
        object4 = ((sk2)object4).f;
        object = new Sb((es0_2)object4);
        object4 = this.a;
        object2 = md3_0.c((jD3)object4);
        ((y_0)object4).b = object = BJ.a((es0_2)object, (aW)object2);
        return Unit.a;
    }
}

