/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xy3
 */
public final class xy3_0
implements Function1 {
    public final /* synthetic */ hy3_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xy3_0(hy3_0 hy3_02, String string2) {
        this.a = hy3_02;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        object = ((hy3_0)object3).v;
        object3 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, string2, false, null, null, 28, null);
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

