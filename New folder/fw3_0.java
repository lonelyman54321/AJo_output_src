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
 * Renamed from Fw3
 */
public final class fw3_0
implements F62 {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ fw3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    public final void onChanged(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object3 = this.a;
        Object[] objectArray = "this$0";
        Intrinsics.checkNotNullParameter(object3, (String)objectArray);
        ((hw3_0)object3).Oa();
        if (object != null) {
            int n4 = ((DataCallback)object).getStatus();
            String string2 = "format(...)";
            if (n4 == 0) {
                int n7;
                if ((object = (Status)((DataCallback)object).getData()) != null && (n7 = (int)(((Status)object).isSuccess() ? 1 : 0)) != 0) {
                    n7 = (int)(((hw3_0)object3).r ? 1 : 0);
                    if (n7 != 0 && (n4 = (int)(((hw3_0)object3).s ? 1 : 0)) != 0) {
                        object = ((hw3_0)object3).k;
                        if (object != null && (n7 = ((String)object).length()) != 0) {
                            n7 = R$string.otp_sent_msg;
                            object = hv3_0.K(n7);
                            object3 = StringCompanionObject.INSTANCE;
                            int n8 = R$string.acc_alert_message;
                            object3 = hv3_0.K(n8);
                            objectArray = new Object[n3];
                            objectArray[0] = object;
                            object2 = Arrays.copyOf(objectArray, n3);
                            object2 = String.format((String)object3, object2);
                            Intrinsics.checkNotNullExpressionValue(object2, string2);
                            hw3_0.Pa((String)object, (String)object2);
                        } else {
                            n7 = (int)(((hw3_0)object3).r ? 1 : 0);
                            if (n7 != 0) {
                                n7 = R$string.otp_sent_msg_mobile;
                                object = hv3_0.K(n7);
                                object3 = StringCompanionObject.INSTANCE;
                                int n10 = R$string.acc_alert_message;
                                object3 = hv3_0.K(n10);
                                objectArray = new Object[n3];
                                objectArray[0] = object;
                                object2 = Arrays.copyOf(objectArray, n3);
                                object2 = String.format((String)object3, object2);
                                Intrinsics.checkNotNullExpressionValue(object2, string2);
                                hw3_0.Pa((String)object, (String)object2);
                            }
                        }
                    } else if (n7 != 0) {
                        n7 = R$string.otp_sent_msg_mobile;
                        object = hv3_0.K(n7);
                        object3 = StringCompanionObject.INSTANCE;
                        int n14 = R$string.acc_alert_message;
                        object3 = hv3_0.K(n14);
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        object2 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object3, object2);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        hw3_0.Pa((String)object, (String)object2);
                    } else {
                        n7 = (int)(((hw3_0)object3).s ? 1 : 0);
                        if (n7 != 0 && (object = ((hw3_0)object3).k) != null && (n7 = ((String)object).length()) != 0) {
                            n7 = R$string.otp_sent_msg_email;
                            object = hv3_0.K(n7);
                            object3 = StringCompanionObject.INSTANCE;
                            int n15 = R$string.acc_alert_message;
                            object3 = hv3_0.K(n15);
                            objectArray = new Object[n3];
                            objectArray[0] = object;
                            object2 = Arrays.copyOf(objectArray, n3);
                            object2 = String.format((String)object3, object2);
                            Intrinsics.checkNotNullExpressionValue(object2, string2);
                            hw3_0.Pa((String)object, (String)object2);
                        }
                    }
                } else {
                    n7 = R$string.error_generating_otp;
                    object = hv3_0.K(n7);
                    object3 = StringCompanionObject.INSTANCE;
                    int n16 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n16);
                    objectArray = new Object[n3];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    hw3_0.Pa((String)object, (String)object2);
                }
            } else {
                int n17 = ((DataCallback)object).getStatus();
                if (n17 == n3) {
                    n17 = R$string.error_generating_otp;
                    object = hv3_0.K(n17);
                    object3 = StringCompanionObject.INSTANCE;
                    int n18 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n18);
                    objectArray = new Object[n3];
                    objectArray[0] = object;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    hw3_0.Pa((String)object, (String)object2);
                }
            }
        }
    }
}

