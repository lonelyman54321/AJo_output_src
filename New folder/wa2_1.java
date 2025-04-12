/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wa2
 */
public final class wa2_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wa2_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (dl2_2)object;
                String string2 = "LP_OTP";
                Intrinsics.checkNotNullParameter(string2, "$requestID");
                Intrinsics.checkNotNullParameter(object2, "response");
                object = (JsonObject)((dl2_2)object2).b;
                Object object3 = ((dl2_2)object2).a;
                n3 = (int)(((cl2_2)object3).d() ? 1 : 0);
                if (n3 != 0 && object != null) {
                    object3 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object3).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string3 = "single page checkout";
                    String string4 = "Forward";
                    boolean bl2 = true;
                    object = apiErrorRepo.handleApiError((dl2_2)object2, string2, bl2, string3, string4);
                }
                return object;
            }
            case 0: 
        }
        object = (Throwable)object;
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

