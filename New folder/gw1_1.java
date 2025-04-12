/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from GW1
 */
public final class gw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ gw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            ((ex1_0)object2).Xa();
            Intrinsics.checkNotNull(object);
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                ((ex1_0)object2).tb();
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_alert_message;
                    object = hv3_0.K(n7);
                    n4 = R$string.error_apply_pd;
                    object3 = hv3_0.K(n4);
                    Object object4 = new Object[n3];
                    object4[0] = object3;
                    object3 = "format(...)";
                    object = xh2_0.a(object4, n3, (String)object, (String)object3);
                    object2 = ((ex1_0)object2).m;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        object2 = null;
                    }
                    AJIOApplication.Companion.getClass();
                    object3 = AJIOApplication$a.a();
                    int n8 = R$string.error_apply_pd;
                    object4 = hv3_0.K(n8);
                    object2.showToastNotification((Context)object3, (String)object4, n3, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

