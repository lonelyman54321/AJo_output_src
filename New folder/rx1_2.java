/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CouponRepo;
import com.ril.ajio.services.query.QuerySingleData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from RX1
 */
public final class rx1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ QuerySingleData c;

    public rx1_2(wx1_1 wx1_12, QuerySingleData querySingleData, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = querySingleData;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.b;
        QuerySingleData querySingleData = this.c;
        object = new rx1_2(wx1_12, querySingleData, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rx1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rx1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((wx1_1)object).e;
            Object object3 = this.c;
            object2 = ((CouponRepo)object2).removeCoupon((QuerySingleData)object3, "bag screen");
            object3 = new RX1$a((wx1_1)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new RX1$b((wx1_1)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

