/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.VerifyVpaResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from no2
 */
public final class no2_2
implements Function1 {
    public final /* synthetic */ oo2_1 a;

    public /* synthetic */ no2_2(oo2_1 oo2_12) {
        this.a = oo2_12;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "PAYMENT_Verify_vpa";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        Object object3 = (VerifyVpaResponse)((dl2_2)object2).b;
        cl2_2 cl2_22 = ((dl2_2)object2).a;
        boolean bl2 = cl2_22.d();
        if (bl2 && object3 != null) {
            int n3;
            object2 = ((VerifyVpaResponse)object3).getError();
            if (object2 != null) {
                object2 = ((Error)object2).getDescription();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object2 = ((VerifyVpaResponse)object3).getError();
                if (object2 == null || (object2 = ((Error)object2).getDescription()) == null) {
                    object2 = "";
                }
                object.getClass();
                int n4 = cl2_22.d;
                oo2_1.h(n4, string2, (String)object2);
            }
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            String string3 = "single page checkout";
            String string4 = "Forward";
            boolean bl3 = true;
            object = ((ApiErrorRepo)object3).handleApiError((dl2_2)object2, string2, bl3, string3, string4);
        }
        return object;
    }
}

