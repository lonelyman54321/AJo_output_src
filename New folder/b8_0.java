/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from B8
 */
public final class b8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8_0(Object object, int n3) {
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
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (e12_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((e12_0)object2).k1;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "PLPCategoryProducts", true, null, null, 24, null);
                ((LiveData)object).k(dataCallback);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (hq_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((hq_2)object2).c.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object[] objectArray = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            int n8;
            object3 = ((q9_0)object2).N;
            if (object3 != null) {
                ((AjioProgressView)((Object)object3)).dismiss();
            }
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                Object object5 = (ProductsList)((DataCallback)object).getData();
                if (object5 != null && (object5 = ((ProductsList)object5).getShowAdsOnNextPage()) != null) {
                    object5 = (yw2_0)((q9_0)object2).K0.getValue();
                    object5.getClass();
                }
                object = (ProductsList)((DataCallback)object).getData();
            } else if (object == null || (n8 = ((DataCallback)object).getStatus()) == n3) {
                object = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_error_message;
                object = hv3_0.K(n8);
                n7 = R$string.something_wrong_msg;
                object3 = hv3_0.K(n7);
                objectArray = new Object[n3];
                Object var7_8 = null;
                objectArray[0] = object3;
                object3 = "format(...)";
                object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                j3_0 j3_02 = ((q9_0)object2).h;
                if (j3_02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n3 = 0;
                    j3_02 = null;
                }
                int n10 = R$string.something_wrong_msg;
                object2 = hv3_0.K(n10);
                j3_02.t0((String)object2, (String)object);
            }
        }
        return Unit.a;
    }
}

