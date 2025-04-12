/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

/*
 * Renamed from Mp2$a
 */
public final class mp2$a_0
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ op2_2 b;
    public final /* synthetic */ String c;

    public mp2$a_0(op2_2 op2_22, String string2, f80_0 f80_02) {
        this.b = op2_22;
        this.c = string2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        op2_2 op2_22 = this.b;
        String string2 = this.c;
        object = new mp2$a_0(op2_22, string2, (f80_0)object3);
        ((mp2$a_0)object).a = object2;
        object2 = Unit.a;
        return ((mp2$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Object object3 = this.a;
        object = ApiErrorRepo.logApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object3, "FETCH_WALLETS", false, null, null, 24, null);
        object2 = this.b.D;
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        object3 = this.c;
        object = dataCallback$Companion.onFailed((DataError)object, object3);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

