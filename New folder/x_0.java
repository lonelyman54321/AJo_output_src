/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x
 */
public final class x_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ y_0 a;

    public x_0(y_0 y_02, f80_0 f80_02) {
        this.a = y_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        y_0 y_02 = this.a;
        object = new x_0(y_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (x_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((x_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = wb_0.a;
        int n3 = Kb.a();
        object = new Kl2(n3, 0, 62);
        object2 = new Object();
        Object object3 = "config";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string2 = "pagingSourceFactory";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        sk2_1 sk2_12 = new sk2_1((Function0)object2, null);
        object3 = new sk2(sk2_12, null, (Kl2)object);
        object2 = ((sk2)object3).f;
        object = new Tb((es0_2)object2);
        object2 = this.a;
        object3 = md3_0.c((jD3)object2);
        ((y_0)object2).a = object = BJ.a((es0_2)object, (aW)object3);
        return Unit.a;
    }
}

