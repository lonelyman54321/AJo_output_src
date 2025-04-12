/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from TA
 */
public final class ta_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                object = (String)object;
                uq2_0 uq2_02 = (uq2_0)this.b;
                Intrinsics.checkNotNullParameter(uq2_02, "this$0");
                Intrinsics.checkNotNullParameter(object, "it");
                Object object2 = uq2_02.Qa().l;
                if (object2 != null) {
                    object2 = ((RtoFirebaseData)object2).getReasonNotListedText();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                boolean bl3 = true;
                bl2 = kotlin.text.b.i((String)object, (String)object2, bl3);
                if (bl2) {
                    object = uq2_02.Qa().e;
                    object2 = Boolean.TRUE;
                    ((LiveData)object).k(object2);
                    object = uq2_02.Qa();
                    ((lq2_0)object).b = object2 = "";
                } else {
                    object2 = uq2_02.Qa().e;
                    Boolean bl4 = Boolean.FALSE;
                    ((LiveData)object2).k(bl4);
                    uq2_02.Qa().b = object;
                    object2 = uq2_02.Qa();
                    ((lq2_0)object2).c = object;
                }
                object = uq2_02.k;
                if (object != null) {
                    ai0_2.k((View)object);
                }
                if ((object = uq2_02.getView()) == null) return Unit.a;
                ai0_2.j((View)object);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                Object object3 = "this$0";
                Object object4 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                n3 = ((DataCallback)object).getStatus();
                if (n3 == 0) {
                    boolean bl5;
                    object3 = JsonUtils.toJson((JsonObject)((DataCallback)object).getData());
                    Class<PayNowResponse> clazz = PayNowResponse.class;
                    if ((object3 = (PayNowResponse)JsonUtils.fromJson((String)object3, clazz)) != null) {
                        clazz = ((PayNowResponse)object3).isHtml();
                        Boolean bl6 = Boolean.TRUE;
                        bl5 = Intrinsics.areEqual(clazz, bl6);
                    } else {
                        bl5 = false;
                        clazz = null;
                    }
                    if (bl5) {
                        object = ((op2_2)object4).y;
                        object4 = DataCallback.Companion;
                        object3 = ((PayNowResponse)object3).getHtml();
                        object3 = ((DataCallback$Companion)object4).onSuccess(object3);
                        ((LiveData)object).k(object3);
                        return Unit.a;
                    }
                }
                object3 = ((op2_2)object4).l;
                ((LiveData)object3).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Subcomponent)object;
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        Intrinsics.checkNotNullParameter(object, "it");
        function1.invoke(object);
        return Unit.a;
    }
}

