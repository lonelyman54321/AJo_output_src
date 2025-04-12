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
 * Renamed from hc
 */
public final class hc_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Hj b;

    public /* synthetic */ hc_2(Hj hj, int n3) {
        this.a = n3;
        this.b = hj;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                h91 h912 = (h91)this.b;
                Intrinsics.checkNotNullParameter(h912, "this$0");
                h912.j.k(object);
                return Unit.a;
            }
            case 1: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (fd0_2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((fd0_2)object3).e;
                object3 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, "OFFER_BANK_LIST", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        Object object4 = (wc_1)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        object = ((wc_1)object4).b;
        object4 = ((wc_1)object4).h;
        return ((jH2)object).b((zr1_1)object4, "ajioWallet");
    }
}

