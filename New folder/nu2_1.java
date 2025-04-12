/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nu2
 */
public final class nu2_1
implements Function1 {
    public final /* synthetic */ bv2_0 a;

    public /* synthetic */ nu2_1(bv2_0 bv2_02) {
        this.a = bv2_02;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((bv2_0)object3).i;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, "PLPSearchProducts", true, null, null, 24, null);
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

