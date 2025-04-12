/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.MyAccountCancelRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vZ1
 */
public final class vz1_0
implements Function1 {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ vz1_0(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final Object invoke(Object object) {
        String string2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        bz1_2 bz1_22 = this.a;
        Intrinsics.checkNotNullParameter(bz1_22, "this$0");
        Object object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0) {
            bz1_22.Wa();
            object2 = (MyAccountCancelRequest)((DataCallback)object).getData();
            Intrinsics.checkNotNull(object);
            int n7 = ((DataCallback)object).getStatus();
            String string3 = "message";
            String string4 = "format(...)";
            if (n7 == 0) {
                if (object2 != null && (object = ((MyAccountCancelRequest)object2).getMessage()) != null) {
                    object2 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    string2 = xh2_0.a(objectArray, n3, (String)object2, string4);
                    hv3_0 hv3_02 = hv3_0.a;
                    hv3_02.getClass();
                    Intrinsics.checkNotNullParameter(object, string3);
                    mq0_2.c((String)object, string2);
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    Object[] objectArray;
                    n8 = 0;
                    object = null;
                    if (object2 != null) {
                        objectArray = ((MyAccountCancelRequest)object2).getMessage();
                    } else {
                        n7 = 0;
                        objectArray = null;
                    }
                    if (objectArray != null && (n7 = objectArray.length()) != 0) {
                        if (object2 != null) {
                            object = ((MyAccountCancelRequest)object2).getMessage();
                        }
                        object = String.valueOf(object);
                    } else {
                        object = "Profile update is failed!!";
                    }
                    object2 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_error_message;
                    object2 = hv3_0.K(n4);
                    objectArray = new Object[n3];
                    objectArray[0] = object;
                    string2 = xh2_0.a(objectArray, n3, (String)object2, string4);
                    hv3_0 hv3_03 = hv3_0.a;
                    hv3_03.getClass();
                    Intrinsics.checkNotNullParameter(object, string3);
                    mq0_2.c((String)object, string2);
                }
            }
            bz1_22.Xa();
        } else {
            bz1_22.Wa();
        }
        return Unit.a;
    }
}

