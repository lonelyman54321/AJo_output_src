/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Cart.CartCount;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N02
 */
public final class n02_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n02_0(Object object, int n3) {
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
                ((Integer)object).getClass();
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a().getSystemService("clipboard");
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
                object = (ClipboardManager)object;
                n3 = R$string.tracking_id_copied;
                String string2 = hv3_0.K(n3);
                String string3 = (String)this.b;
                string2 = ClipData.newPlainText((CharSequence)string2, (CharSequence)string3);
                if (string2 == null) return Unit.a;
                object.setPrimaryClip((ClipData)string2);
                int n4 = R$string.tracking_id_copied;
                object = hv3_0.K(n4);
                n3 = 0;
                string2 = null;
                boolean bl2 = false;
                string3 = null;
                hv3_0.o0(0, (String)object, null);
                return Unit.a;
            }
            case 2: {
                object = (Pair)object;
                Object[] objectArray = (Object[])this.b;
                Intrinsics.checkNotNullParameter(objectArray, "this$0");
                Object object2 = (Number)((Pair)object).a;
                int n7 = ((Number)object2).intValue();
                object = (DataCallback)((Pair)object).b;
                cp$a cp$a = cp_1.Companion;
                int n8 = nn_2.b(cp$a, (DataCallback)object);
                if (n8 == 0) return Unit.a;
                if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                    objectArray.Ua(n7);
                    return Unit.a;
                } else {
                    if (object == null) return Unit.a;
                    int n10 = ((DataCallback)object).getStatus();
                    if (n10 != (n3 = 1)) return Unit.a;
                    object = yn3_0.a;
                    n3 = 0;
                    objectArray = new Object[]{};
                    object2 = "Error while deleting";
                    ((yn3$a)object).a((String)object2, objectArray);
                }
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                Object object3 = "this$0";
                Object object4 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                n3 = ((DataCallback)object).getStatus();
                if (n3 == 0) {
                    object3 = JsonUtils.toJson((JsonObject)((DataCallback)object).getData());
                    Class<PayNowResponse> clazz = PayNowResponse.class;
                    if ((object3 = (PayNowResponse)JsonUtils.fromJson((String)object3, clazz)) != null) {
                        clazz = ((PayNowResponse)object3).getEmiSdkInformation();
                    } else {
                        boolean bl3 = false;
                        clazz = null;
                    }
                    if (clazz != null) {
                        object = ((op2_2)object4).z;
                        object4 = DataCallback.Companion;
                        object3 = ((PayNowResponse)object3).getEmiSdkInformation();
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
        object = (DataCallback)object;
        e12_0 e12_02 = (e12_0)this.b;
        Intrinsics.checkNotNullParameter(e12_02, "this$0");
        Object object5 = e12_02.S0;
        ((LiveData)object5).k(object);
        object = (CartCount)((DataCallback)object).getData();
        if (object == null) return Unit.a;
        float f5 = ((CartCount)object).getCartAmount();
        object5 = e12_02.d();
        ((jo_2)object5).o(f5);
        return Unit.a;
    }
}

