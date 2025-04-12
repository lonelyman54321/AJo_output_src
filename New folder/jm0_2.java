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
 * Renamed from JM0
 */
public final class jm0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jD3 b;

    public /* synthetic */ jm0_2(jD3 jD32, int n3) {
        this.a = n3;
        this.b = jD32;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                Object object2 = "this$0";
                Object object3 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                n3 = ((DataCallback)object).getStatus();
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
            case 0: 
        }
        object = (dt1_0)object;
        Object object4 = (yh0_0)this.b;
        Intrinsics.checkNotNullParameter(object4, "$viewModel");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        p83_0 p83_02 = (p83_0)((yh0_0)object4).j.getValue();
        int n4 = p83_02.size();
        TM0$c tM0$c = new TM0$c(p83_02);
        TM0$d tM0$d = new TM0$d(p83_02, (yh0_0)object4);
        object4 = new u10(-1091073711, tM0$d, true);
        object.a(n4, null, tM0$c, (u10)object4);
        return Unit.a;
    }
}

