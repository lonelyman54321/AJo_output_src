/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AY1
 */
public final class ay1_1
implements Function1 {
    public final /* synthetic */ ky1_0 a;

    public /* synthetic */ ay1_1(ky1_0 ky1_02) {
        this.a = ky1_02;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((ky1_0)object3).H;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, "wishlistSizeChart", false, null, null, 28, null);
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

