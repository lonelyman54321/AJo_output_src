/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Payment.LpStoredCardBalanceList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mn2
 */
public final class mn2_2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        String string2 = "LP_STORED_CARD_BALANCE";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        object = (LpStoredCardBalanceList)((dl2_2)object2).b;
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object != null) {
            object3 = DataCallback.Companion;
            object = ((DataCallback$Companion)object3).onSuccess(object);
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

