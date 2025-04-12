/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rQ
 */
public final class rq_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rq_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
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
                object3 = apiErrorRepo.handleApiException((Throwable)object2, "PAYMENT_PayNowByNetBanking", true, "single page checkout", "Forward");
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        CategoryNavigationRepo categoryNavigationRepo = (CategoryNavigationRepo)this.b;
        object = (dl2_2)object;
        return CategoryNavigationRepo.d(categoryNavigationRepo, (dl2_2)object);
    }
}

