/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class Kp2$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ op2_2 b;

    public Kp2$a(op2_2 op2_22, f80_0 f80_02) {
        this.b = op2_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        op2_2 op2_22 = this.b;
        object = new Kp2$a(op2_22, (f80_0)object3);
        ((Kp2$a)object).a = object2;
        object2 = Unit.a;
        return ((Kp2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = ApiErrorRepo.logApiException$default(ApiErrorRepo.INSTANCE, throwable, "FetchEmiPlansApi", false, null, null, 24, null);
        object2 = this.b.C;
        object = DataCallback.Companion.onFailed((DataError)object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

