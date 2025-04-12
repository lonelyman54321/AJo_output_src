/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ra3
 */
public final class ra3_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ sa3_2 a;

    public ra3_2(sa3_2 sa3_22, f80_0 f80_02) {
        this.a = sa3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        sa3_2 sa3_22 = this.a;
        object = new ra3_2(sa3_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ra3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ra3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        ((sa3_2)object).a.getClass();
        int n3 = Kb.a();
        object2 = new Kl2(n3, 0, 62);
        mb_0 mb_02 = new Object();
        Object object3 = "config";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "pagingSourceFactory";
        Intrinsics.checkNotNullParameter(mb_02, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(mb_02, string2);
        sk2_1 sk2_12 = new sk2_1(mb_02, null);
        object3 = new sk2(sk2_12, null, (Kl2)object2);
        object2 = md3_0.c((jD3)object);
        object2 = BJ.a(((sk2)object3).f, (aW)object2);
        ((sa3_2)object).b = object2;
        return Unit.a;
    }
}

