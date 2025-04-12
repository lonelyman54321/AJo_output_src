/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P02
 */
public final class p02_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Hj b;

    public /* synthetic */ p02_0(Hj hj, int n3) {
        this.a = n3;
        this.b = hj;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((op2_2)object3).l;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = apiErrorRepo.handleApiException((Throwable)object2, "PAYMENT_PayNowByEMI", true, "single page checkout", "Forward");
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        e12_0 e12_02 = (e12_0)this.b;
        Intrinsics.checkNotNullParameter(e12_02, "this$0");
        e12_02.U0.k(object);
        return Unit.a;
    }
}

