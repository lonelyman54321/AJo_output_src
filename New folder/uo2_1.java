/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uo2
 */
public final class uo2_1
implements Function1 {
    public final /* synthetic */ op2_2 a;

    public /* synthetic */ uo2_1(op2_2 op2_22) {
        this.a = op2_22;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((op2_2)object3).l;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ((ApiErrorRepo)object3).handleApiException((Throwable)object2, "PAYMENT_PayNowByUPI", true, "single page checkout", "Forward");
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

