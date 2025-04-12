/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ww3
 */
public final class ww3_0
implements F62 {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ ww3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    public final void onChanged(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        hw3_0 hw3_02 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(hw3_02, (String)object3);
        if (object != null) {
            int n4 = ((DataCallback)object).getStatus();
            String string2 = "format(...)";
            if (n4 == 0) {
                int n7;
                if ((object = (Status)((DataCallback)object).getData()) != null && (n7 = (int)(((Status)object).isSuccess() ? 1 : 0)) != 0) {
                    n7 = R$string.otp_sent_msg_email;
                    object = hv3_0.K(n7);
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    hw3_02.getClass();
                    hw3_0.Pa((String)object, (String)object2);
                } else {
                    n7 = R$string.error_generating_otp;
                    object = hv3_0.K(n7);
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    hw3_02.getClass();
                    hw3_0.Pa((String)object, (String)object2);
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    n8 = R$string.error_generating_otp;
                    object = hv3_0.K(n8);
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    hw3_02.getClass();
                    hw3_0.Pa((String)object, (String)object2);
                }
            }
        }
    }
}

