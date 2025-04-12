/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.google.gson.JsonObject;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from UP0
 */
public final class up0_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ up0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n4 = 1;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                int n8;
                object3 = (PeWebViewActivity)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object4 = object3.p0;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webProgressView");
                    n8 = 0;
                    object4 = null;
                }
                ((PEProgressView)((Object)object4)).dismiss();
                n8 = ((DataCallback)object).getStatus();
                if (n8 == 0) {
                    object4 = (PayNowResponse)JsonUtils.fromJson((String)(object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData())), PayNowResponse.class);
                    if (object4 != null) {
                        object2 = ((PayNowResponse)object4).getTransactionInformation();
                    }
                    if (object2 != null) {
                        object2 = new Intent();
                        object4 = "transactionresponse";
                        object = object2.putExtra((String)object4, (String)object);
                        n3 = -1;
                        object3.setResult(n3, (Intent)object);
                        object3.finish();
                    }
                } else {
                    int n10 = ((DataCallback)object).getStatus();
                    if (n10 == n4) {
                        object3.p2();
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = (fq0_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = cp_1.Companion;
        int n14 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n14 != 0) {
            n14 = ((DataCallback)object).getStatus();
            if (n14 == 0) {
                if ((object = (ProductsList)((DataCallback)object).getData()) != null) {
                    object3 = object3.q;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                        object3 = null;
                    }
                    object3 = object3.X;
                    if ((object = ((ProductsList)object).getProducts()) != null) {
                        object = (Iterable)object;
                        n14 = 8;
                        if ((object = CollectionsKt.f0((Iterable)object, n14)) != null) {
                            object = CollectionsKt.m0((Collection)object);
                            Intrinsics.checkNotNullParameter(object, "<this>");
                            object2 = new p83_0();
                            ((p83_0)object2).addAll((Collection)object);
                        }
                    }
                    object3.setValue(object2);
                }
            } else {
                int n15 = ((DataCallback)object).getStatus();
                if (n15 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n15 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n15);
                    object2 = hv3_0.K(R$string.something_wrong_msg);
                    object3 = new Object[n4];
                    n14 = 0;
                    object4 = null;
                    object3[0] = object2;
                    object = xh2_0.a(object3, n4, (String)object, "format(...)");
                    n3 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n3);
                    hv3_0.o0(n4, (String)object2, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

