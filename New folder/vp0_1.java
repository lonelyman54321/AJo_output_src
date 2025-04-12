/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VP0
 */
public final class vp0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                object = (DataCallback)object;
                Object object4 = PeWebViewActivity.Companion;
                object2 = (PeWebViewActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = ((PeWebViewActivity)object2).p0;
                n4 = 0;
                object4 = null;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webProgressView");
                    n7 = 0;
                    object3 = null;
                }
                ((PEProgressView)((Object)object3)).dismiss();
                n7 = ((DataCallback)object).getStatus();
                if (n7 == 0) {
                    object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData());
                    Class<PayNowResponse> clazz = PayNowResponse.class;
                    if ((object = (PayNowResponse)JsonUtils.fromJson((String)object, clazz)) != null && (clazz = ((PayNowResponse)object).getError()) != null) {
                        clazz = ((Error)((Object)clazz)).getDescription();
                    } else {
                        n3 = 0;
                        clazz = null;
                    }
                    if (clazz != null) {
                        ((PeWebViewActivity)object2).p2();
                    }
                    if (object != null) {
                        object4 = ((PayNowResponse)object).getTransactionInformation();
                    }
                    if (object4 != null) {
                        clazz = new Intent();
                        object3 = "transactionresponse";
                        object = clazz.putExtra((String)object3, (Serializable)object);
                        n3 = -1;
                        object2.setResult(n3, (Intent)object);
                        object2.finish();
                    }
                } else {
                    int n8 = ((DataCallback)object).getStatus();
                    if (n8 == n3) {
                        ((PeWebViewActivity)object2).p2();
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (RtoResponseData)object;
        Object object5 = fq0_2.Companion;
        object2 = (fq0_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((ew_2)object2).a;
        int n10 = 0;
        int n14 = ((sw_0)object3).getPreference("RTO_DIALOG_VISIBILITY_COUNT", 0);
        ((fq0_2)object2).Pa().d = object;
        object5 = ((fq0_2)object2).Pa().l;
        if (object5 != null) {
            n4 = ((RtoFirebaseData)object5).getVisibilityThreshold();
        } else {
            n4 = 0;
            object5 = null;
        }
        jo_2 jo_22 = ((ew_2)object2).a;
        if (n14 >= n4) {
            object5 = ((fq0_2)object2).Pa();
            ((lq2_0)object5).e(n3 != 0);
            jo_22.C(0);
        }
        if ((n4 = (int)(EQ2.a ? 1 : 0)) == 0) {
            object5 = ((fq0_2)object2).Pa().l;
            if (object5 != null) {
                n10 = ((RtoFirebaseData)object5).getVisibilityThreshold();
            }
            if (n14 < n10) {
                jo_22.C(n14 += n3);
                N81.Companion.getClass();
                N81 n81 = new N81();
                object3 = new Bundle();
                object5 = "rto_data";
                object3.putParcelable((String)object5, (Parcelable)object);
                n81.setArguments((Bundle)object3);
                object = ((Fragment)object2).getChildFragmentManager();
                object2 = ((Fragment)object2).getTag();
                n81.show((FragmentManager)object, (String)object2);
            }
        }
        return Unit.a;
    }
}

