/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eq1
 */
public final class eq1_2
extends Lambda
implements Function0 {
    public final /* synthetic */ bq1 c;
    public final /* synthetic */ sg2_0 d;
    public final /* synthetic */ long e;

    public eq1_2(bq1 bq12, sg2_0 sg2_02, long l2) {
        this.c = bq12;
        this.d = sg2_02;
        this.e = l2;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((bq1)object).a;
        boolean bl2 = iq1_1.b((xp1_0)object2);
        Ns2$a ns2$a = null;
        if (bl2) {
            object2 = ((bq1)object).a().q;
            if (object2 != null) {
                ns2$a = ((tb1_0)object2).i;
            }
        } else {
            object2 = ((bq1)object).a().q;
            if (object2 != null && (object2 = ((w32_0)object2).h1()) != null) {
                ns2$a = ((tb1_0)object2).i;
            }
        }
        if (ns2$a == null) {
            object2 = this.d;
            ns2$a = object2.getPlacementScope();
        }
        object = ((bq1)object).a().h1();
        Intrinsics.checkNotNull(object);
        long l2 = this.e;
        Ns2$a.e(ns2$a, (Ns2)object, l2);
        return Unit.a;
    }
}

