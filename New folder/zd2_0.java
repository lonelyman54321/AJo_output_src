/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZD2
 */
public final class zd2_0
implements Function1 {
    public final /* synthetic */ gE2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ zd2_0(gE2 gE22, int n3) {
        this.a = gE22;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((gE2)object3).h;
        Integer n3 = this.b;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, "deleteReviewImage", false, null, null, 28, null);
        Pair pair = new Pair(n3, object3);
        ((LiveData)object).k(pair);
        return Unit.a;
    }
}

