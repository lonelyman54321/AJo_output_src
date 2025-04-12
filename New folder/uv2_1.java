/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from uV2
 */
public final class uv2_1
implements F62 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ uv2_1(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "productsListDataCallback");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 == 0) return;
        ((vv2_2)object2).hideProgress();
        n4 = ((DataCallback)object).getStatus();
        j3_0 j3_02 = null;
        if (n4 == 0) {
            Object object4;
            Object object5;
            boolean bl2;
            Object object6;
            Object object7 = (ProductsList)((DataCallback)object).getData();
            object3 = "searchViewModel";
            if (object7 != null && (object7 = ((ProductsList)object7).getShowAdsOnNextPage()) != null) {
                object7 = ((vv2_2)object2).t;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object7 = null;
                }
                object7.getClass();
            }
            if ((object7 = (ProductsList)((DataCallback)object).getData()) != null && (object6 = ((ProductsList)object7).getBrandDetails()) != null) {
                object6 = ((BrandDetails)object6).getBrandId();
            } else {
                bl2 = false;
                object6 = null;
            }
            Object object8 = object7 != null ? ((ProductsList)object7).getFreeTextSearch() : null;
            vv2_2.db((String)object6, (String)object8);
            if (object7 != null) {
                object6 = ((ProductsList)object7).getRedirect();
            } else {
                bl2 = false;
                object6 = null;
            }
            if (object6 != null) {
                object6 = z40_0.Companion;
                object8 = ((Fragment)object2).requireActivity().getApplication();
                object5 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object8, (String)object5);
                object6.getClass();
                object6 = z40$a.a((Context)object8).a;
                object8 = "search_redirect_key";
                bl2 = ((ao0_0)object6).a((String)object8);
                if (bl2) {
                    object = ((ProductsList)object7).getRedirect();
                    Intrinsics.checkNotNull(object);
                    object7 = ((ProductsList)object7).getStore();
                    ((vv2_2)object2).ab((String)object, (String)object7);
                    return;
                }
            }
            if (object7 != null) {
                object6 = ((ProductsList)object7).getRedirect();
            } else {
                bl2 = false;
                object6 = null;
            }
            object6 = object6 == null ? "default" : "non-redirect";
            Object object9 = object6;
            object6 = ((vv2_2)object2).t;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object6 = null;
            }
            if (object7 != null) {
                object7 = ((ProductsList)object7).getPageType();
            } else {
                n3 = 0;
                object7 = null;
            }
            object6.getClass();
            yw2_0.f((String)object7);
            object7 = ((vv2_2)object2).t;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object4 = null;
            } else {
                object4 = object7;
            }
            object5 = object = ((DataCallback)object).getData();
            object5 = (ProductsList)object;
            String string2 = ((vv2_2)object2).U;
            String string3 = ((vv2_2)object2).Y;
            String string4 = ((vv2_2)object2).X;
            object = ((vv2_2)object2).t0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                boolean bl3 = false;
                object = null;
            }
            int n7 = ((lv2_0)object).b.size();
            object4.getClass();
            object = md3_0.c((jD3)object4);
            object7 = C90$a.a;
            object2 = new a((CoroutineContext$a)object7);
            object8 = object7;
            object7 = new fw2_1((ProductsList)object5, string2, string3, string4, n7, (yw2_0)object4, (String)object9, null);
            n4 = 2;
            Ae3.d((i90_0)object, (CoroutineContext)object2, null, (Function2)object7, n4);
            return;
        }
        int n8 = ((DataCallback)object).getStatus();
        if (n8 != n3) return;
        object = StringCompanionObject.INSTANCE;
        n8 = R$string.acc_error_message;
        object = hv3_0.K(n8);
        n4 = R$string.something_wrong_msg;
        object3 = hv3_0.K(n4);
        Object[] objectArray = new Object[n3];
        Object var10_13 = null;
        objectArray[0] = object3;
        object3 = "format(...)";
        object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
        Object object10 = ((vv2_2)object2).n;
        if (object10 == null) {
            object10 = "activityFragmentListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object10);
        } else {
            j3_02 = object10;
        }
        n3 = R$string.something_wrong_msg;
        object10 = hv3_0.K(n3);
        j3_02.t0((String)object10, (String)object);
    }
}

