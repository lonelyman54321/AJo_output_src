/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FU1
 */
public final class fu1_1
implements Function1 {
    public final /* synthetic */ gu1_2 a;

    public /* synthetic */ fu1_1(gu1_2 gu1_22) {
        this.a = gu1_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        gu1_2 gu1_22 = this.a;
        Intrinsics.checkNotNullParameter(gu1_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "payNowCallback");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b(object2, (DataCallback)object);
        if (n3 != 0) {
            object2 = gu1_22.d;
            if (object2 != null) {
                ((PEProgressView)((Object)object2)).dismiss();
            }
            if ((n3 = ((DataCallback)object).getStatus()) == 0) {
                int n4;
                Object object3;
                object = (String)((DataCallback)object).getData();
                object2 = gu1_22.Pa();
                object2 = ((kj2_1)object2).E;
                try {
                    object2 = JsonUtils.toJson(object2);
                }
                catch (Exception exception) {
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(exception);
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                    object3 = qn1_2.Companion;
                    object3.getClass();
                    n4 = (int)(qn1$a.a() ? 1 : 0);
                    int n7 = 1004;
                    String string2 = "TENANT_RESPONSE";
                    String string3 = "NET_PAYABLE";
                    String string4 = "html";
                    if (n4 != 0) {
                        FragmentActivity fragmentActivity = gu1_22.getActivity();
                        Class<JuspayActivity> clazz = JuspayActivity.class;
                        object3 = new Intent((Context)fragmentActivity, clazz);
                        object3.putExtra(string4, (String)object);
                        object = gu1_22.Pa();
                        float f5 = ((kj2_1)object).o;
                        object3.putExtra(string3, f5);
                        object3.putExtra(string2, (String)object2);
                        gu1_22.startActivityForResult((Intent)object3, n7);
                    } else {
                        FragmentActivity fragmentActivity = gu1_22.getActivity();
                        Class<PeWebViewActivity> clazz = PeWebViewActivity.class;
                        object3 = new Intent((Context)fragmentActivity, clazz);
                        object3.putExtra(string4, (String)object);
                        object = gu1_22.Pa();
                        float f6 = ((kj2_1)object).o;
                        object3.putExtra(string3, f6);
                        object3.putExtra(string2, (String)object2);
                        gu1_22.startActivityForResult((Intent)object3, n7);
                    }
                } else {
                    Bo2.a();
                }
            }
        }
        return Unit.a;
    }
}

