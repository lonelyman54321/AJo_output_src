/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.services.data.Payment.EmiSdkInformation;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wc
 */
public final class wc_0
implements Function1 {
    public final /* synthetic */ zc_1 a;

    public /* synthetic */ wc_0(zc_1 zc_12) {
        this.a = zc_12;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        zc_1 zc_12 = this.a;
        Intrinsics.checkNotNullParameter(zc_12, "this$0");
        Intrinsics.checkNotNullParameter(object, "payNowCallback");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            object2 = zc_12.h;
            String string2 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBarListener");
                n3 = 0;
                object2 = null;
            }
            Object object3 = Boolean.FALSE;
            object2.invoke(object3);
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object = (EmiSdkInformation)((DataCallback)object).getData();
                Objects.toString(object);
                object2 = zc_12.Pa();
                object2 = ((kj2_1)object2).E;
                try {
                    string2 = JsonUtils.toJson(object2);
                }
                catch (Exception exception) {
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(exception);
                }
                if (string2 != null && (n3 = string2.length()) != 0) {
                    object3 = zc_12.getActivity();
                    Class<JuspayActivity> clazz = JuspayActivity.class;
                    object2 = new Intent((Context)object3, clazz);
                    object2.putExtra("data_emi_json", (Serializable)object);
                    boolean bl2 = true;
                    object2.putExtra("IS_EMI_FLOW", bl2);
                    float f5 = zc_12.Pa().o;
                    object3 = "NET_PAYABLE";
                    object2.putExtra((String)object3, f5);
                    object = "TENANT_RESPONSE";
                    object2.putExtra((String)object, string2);
                    int n4 = 1004;
                    f5 = 1.407E-42f;
                    zc_12.startActivityForResult((Intent)object2, n4);
                } else {
                    Bo2.a();
                }
            }
        }
        return Unit.a;
    }
}

