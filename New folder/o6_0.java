/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from o6
 */
public final class o6_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ p6 a;

    public o6_0(p6 p62, f80_0 f80_02) {
        this.a = p62;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        p6 p62 = this.a;
        object = new o6_0(p62, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o6_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o6_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = wb_0.a;
        object = new Kl2(5, 0, 62);
        object2 = new nb_0(0);
        Object object3 = "config";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string2 = "pagingSourceFactory";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        sk2_1 sk2_12 = new sk2_1((Function0)object2, null);
        object3 = new sk2(sk2_12, null, (Kl2)object);
        object3 = ((sk2)object3).f;
        object = new Vb((es0_2)object3);
        object3 = this.a;
        object2 = md3_0.c((jD3)object3);
        ((p6)object3).a = object = BJ.a((es0_2)object, (aW)object2);
        return Unit.a;
    }
}

