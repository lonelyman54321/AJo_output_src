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
 * Renamed from xQ
 */
public final class xq_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xq_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (e12_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((e12_0)object3).U0;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "PDPBankOffer", false, null, null, 24, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        CategoryNavigationRepo categoryNavigationRepo = (CategoryNavigationRepo)this.b;
        object = (dl2_2)object;
        return CategoryNavigationRepo.j(categoryNavigationRepo, (dl2_2)object);
    }
}

