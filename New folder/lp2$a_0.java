/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

/*
 * Renamed from Lp2$a
 */
public final class lp2$a_0
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ op2_2 b;

    public lp2$a_0(op2_2 op2_22, f80_0 f80_02) {
        this.b = op2_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        op2_2 op2_22 = this.b;
        object = new lp2$a_0(op2_22, (f80_0)object3);
        ((lp2$a_0)object).a = object2;
        object2 = Unit.a;
        return ((lp2$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = this.b.B;
        object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "FETCH_WALLETS", false, null, null, 28, null);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

