/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from So2
 */
public final class so2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (zp1)object;
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$size$delegate");
                Intrinsics.checkNotNullParameter(object, "it");
                long l2 = object.a();
                object = new bj1(l2);
                tr1_02.setValue(object);
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = (op2_2)this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((op2_2)object3).j;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ((ApiErrorRepo)object3).handleApiException((Throwable)object2, "LP_OTP", true, "single page checkout", "Forward");
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

