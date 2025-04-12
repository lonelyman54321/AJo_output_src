/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from On2
 */
public final class on2_2
implements bx0_2,
o60_0 {
    public void accept(Object object) {
        int n3 = 1;
        object = (Throwable)object;
        object = dn2_2.Companion;
        object = hv3_0.K(R$string.something_wrong_msg);
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_alert_message);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        Object object3 = Arrays.copyOf(objectArray, n3);
        object3 = String.format((String)object2, object3);
        Intrinsics.checkNotNullExpressionValue(object3, "format(...)");
        mq0_2.b((String)object, (String)object3);
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "LP_STORED_CARD_BALANCE";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }
}

