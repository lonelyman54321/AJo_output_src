/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.RequestOtpResponse;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from RA
 */
public final class ra_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object[] objectArray = null;
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object2 = (jb3_0)object2;
                Object[] objectArray2 = "this$0";
                Intrinsics.checkNotNullParameter(object2, (String)objectArray2);
                if (object != null) {
                    n4 = ((DataCallback)object).getStatus();
                    String string2 = "format(...)";
                    if (n4 == 0) {
                        int n7;
                        if ((object = (RequestOtpResponse)((DataCallback)object).getData()) != null && (n7 = (int)(Intrinsics.areEqual(object = ((RequestOtpResponse)object).getSuccess(), objectArray2 = Boolean.TRUE) ? 1 : 0)) != 0) {
                            n7 = (int)(((jb3_0)object2).p ? 1 : 0);
                            if (n7 != 0 && (n4 = (int)(((jb3_0)object2).q ? 1 : 0)) != 0) {
                                n7 = R$string.otp_sent_msg;
                                object = hv3_0.K(n7);
                                object2 = StringCompanionObject.INSTANCE;
                                int n8 = R$string.acc_alert_message;
                                object2 = hv3_0.K(n8);
                                objectArray2 = new Object[n3];
                                objectArray2[0] = object;
                                objectArray = Arrays.copyOf(objectArray2, n3);
                                object2 = String.format((String)object2, objectArray);
                                Intrinsics.checkNotNullExpressionValue(object2, string2);
                                jb3_0.Pa((String)object, (String)object2);
                            } else if (n7 != 0) {
                                n7 = R$string.otp_sent_msg_mobile;
                                object = hv3_0.K(n7);
                                object2 = StringCompanionObject.INSTANCE;
                                int n10 = R$string.acc_alert_message;
                                object2 = hv3_0.K(n10);
                                objectArray2 = new Object[n3];
                                objectArray2[0] = object;
                                objectArray = Arrays.copyOf(objectArray2, n3);
                                object2 = String.format((String)object2, objectArray);
                                Intrinsics.checkNotNullExpressionValue(object2, string2);
                                jb3_0.Pa((String)object, (String)object2);
                            } else {
                                n7 = (int)(((jb3_0)object2).q ? 1 : 0);
                                if (n7 != 0) {
                                    n7 = R$string.otp_sent_msg_email;
                                    object = hv3_0.K(n7);
                                    object2 = StringCompanionObject.INSTANCE;
                                    int n14 = R$string.acc_alert_message;
                                    object2 = hv3_0.K(n14);
                                    objectArray2 = new Object[n3];
                                    objectArray2[0] = object;
                                    objectArray = Arrays.copyOf(objectArray2, n3);
                                    object2 = String.format((String)object2, objectArray);
                                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                                    jb3_0.Pa((String)object, (String)object2);
                                }
                            }
                        } else {
                            n7 = R$string.error_generating_otp;
                            object = hv3_0.K(n7);
                            objectArray2 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_alert_message;
                            objectArray2 = hv3_0.K(n4);
                            Object[] objectArray3 = new Object[n3];
                            objectArray3[0] = object;
                            objectArray = Arrays.copyOf(objectArray3, n3);
                            objectArray = String.format((String)objectArray2, objectArray);
                            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                            object2.getClass();
                            jb3_0.Pa((String)object, (String)objectArray);
                        }
                    } else {
                        int n15 = ((DataCallback)object).getStatus();
                        if (n15 == n3) {
                            n15 = R$string.error_generating_otp;
                            object = hv3_0.K(n15);
                            objectArray2 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_alert_message;
                            objectArray2 = hv3_0.K(n4);
                            Object[] objectArray4 = new Object[n3];
                            objectArray4[0] = object;
                            objectArray = Arrays.copyOf(objectArray4, n3);
                            objectArray = String.format((String)objectArray2, objectArray);
                            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                            object2.getClass();
                            jb3_0.Pa((String)object, (String)objectArray);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Subcomponent)object;
        object2 = (Function1)object2;
        Intrinsics.checkNotNullParameter(object2, "$onBannerClick");
        Intrinsics.checkNotNullParameter(object, "it");
        object2.invoke(object);
        return Unit.a;
    }
}

