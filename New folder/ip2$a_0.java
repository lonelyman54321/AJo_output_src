/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

/*
 * Renamed from Ip2$a
 */
public final class ip2$a_0
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ hj_1 c;

    public ip2$a_0(op2_2 op2_22, hj_1 hj_12, f80_0 f80_02) {
        this.b = op2_22;
        this.c = hj_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        op2_2 op2_22 = this.b;
        hj_1 hj_12 = this.c;
        object = new ip2$a_0(op2_22, hj_12, (f80_0)object3);
        ((ip2$a_0)object).a = object2;
        object2 = Unit.a;
        return ((ip2$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Object object3 = this.a;
        object = this.b.u;
        object2 = ApiErrorRepo.INSTANCE.handleApiException((Throwable)object3, "PAYMENT_PriceCalculation", true, "single page checkout", "Forward");
        object3 = this.c;
        rz2_0 rz2_02 = new rz2_0((hj_1)((Object)object3), (DataCallback)object2);
        ((LiveData)object).k(rz2_02);
        return Unit.a;
    }
}

