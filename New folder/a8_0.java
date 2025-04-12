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
 * Renamed from A8
 */
public final class a8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((op2_2)object2).r;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = apiErrorRepo.handleApiException((Throwable)object4, "PAYMENT_StoredPaymentInstrument", true, "single page checkout", "Forward");
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0 && (n4 = ((DataCallback)object).getStatus()) == 0) {
            n4 = (int)(og1_1.c() ? 1 : 0);
            n3 = 0;
            if (n4 != 0) {
                object3 = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object3);
                ((r71_0)object3).getClass();
                object3 = ((q9_0)object2).bb();
                if (object3 != null && (n4 = ((Integer)object3).intValue()) == 0) {
                    object3 = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object3);
                    object3 = (r71_0)object3;
                    object3.getClass();
                    object = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object);
                    object = (r71_0)object;
                    object.getClass();
                    ((q9_0)object2).Bb(0);
                }
            } else {
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object = (r71_0)object;
                object.getClass();
                ((q9_0)object2).Bb(0);
            }
        }
        return Unit.a;
    }
}

