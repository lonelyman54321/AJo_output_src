/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tp2
 */
public final class tp2_2
implements Function1 {
    public final /* synthetic */ op2_2 a;

    public /* synthetic */ tp2_2(op2_2 op2_22) {
        this.a = op2_22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = "this$0";
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        int n3 = ((DataCallback)object).getStatus();
        if (n3 == 0) {
            boolean bl2;
            object2 = JsonUtils.toJson((JsonObject)((DataCallback)object).getData());
            Class<PayNowResponse> clazz = PayNowResponse.class;
            if ((object2 = (PayNowResponse)JsonUtils.fromJson((String)object2, clazz)) != null) {
                clazz = ((PayNowResponse)object2).isHtml();
                Boolean bl3 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(clazz, bl3);
            } else {
                bl2 = false;
                clazz = null;
            }
            if (bl2) {
                object = ((op2_2)object3).y;
                object3 = DataCallback.Companion;
                object2 = ((PayNowResponse)object2).getHtml();
                object2 = ((DataCallback$Companion)object3).onSuccess(object2);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
        }
        object2 = ((op2_2)object3).l;
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

