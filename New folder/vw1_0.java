/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.SimilarProductOOS;
import com.ril.ajio.services.data.Product.SimilarProductOOSInfo;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vW1
 */
public final class vw1_0
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ vw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        boolean bl2;
        Object object2;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
        Object object4 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n3 == 0) return Unit.a;
        ((ex1_0)object3).Xa();
        n3 = ((DataCallback)object).getStatus();
        if (n3 != 0) {
            object = ((ex1_0)object3).w0;
            if (object == null) return Unit.a;
            Intrinsics.checkNotNull(object);
            boolean bl3 = true;
            object4 = new g43_0((Product)object, bl3);
            object = ((Fragment)object3).requireActivity().getSupportFragmentManager();
            object3 = ((Fragment)object4).getTag();
            ((DialogFragment)object4).show((FragmentManager)object, (String)object3);
            return Unit.a;
        }
        object = (SimilarProductOOSInfo)((DataCallback)object).getData();
        n3 = 0;
        object4 = null;
        if (object != null) {
            object2 = ((SimilarProductOOSInfo)object).getSimilarProducts();
        } else {
            bl2 = false;
            object2 = null;
        }
        object2 = (Collection)object2;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            if (object != null && (object2 = ((SimilarProductOOSInfo)object).getSimilarProducts()) != null && (object2 = (SimilarProductOOS)object2.get(0)) != null) {
                object2 = ((SimilarProductOOS)object2).getProducts();
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null && !(bl2 = object2.isEmpty())) {
                object = object != null && (object = ((SimilarProductOOSInfo)object).getSimilarProducts()) != null && (object = (SimilarProductOOS)object.get(0)) != null ? ((SimilarProductOOS)object).getProducts() : null;
                ((ex1_0)object3).I0 = object2 = new n32_0();
                object2 = ((ex1_0)object3).ib();
                ((K43)object2).a = object = (ArrayList)object;
                object = ((ex1_0)object3).ib();
                object2 = ((ex1_0)object3).w0;
                if (object2 != null) {
                    object2 = ((Product)object2).getName();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                ((K43)object).d = object2 = String.valueOf(object2);
                object = ((ex1_0)object3).ib();
                ((K43)object).e = object2 = ((ex1_0)object3).w0;
                object = object2 != null && (object = ((Product)object2).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getBrandName() : null;
                if (object != null) {
                    object = ((ex1_0)object3).ib();
                    object2 = ((ex1_0)object3).w0;
                    if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                        object4 = ((ProductFnlColorVariantData)object2).getBrandName();
                    }
                    ((K43)object).c = object4;
                } else {
                    object = ((ex1_0)object3).w0;
                    object = object != null ? ((Product)object).getBrandName() : null;
                    if (object != null) {
                        object = ((ex1_0)object3).ib();
                        object2 = ((ex1_0)object3).w0;
                        if (object2 != null) {
                            object4 = ((Product)object2).getBrandName();
                        }
                        ((K43)object).c = object4;
                    }
                }
                object = ((ex1_0)object3).I0;
                if (object == null) return Unit.a;
                object3 = ((Fragment)object3).getChildFragmentManager();
                object4 = "STL Fragment";
                ((DialogFragment)object).show((FragmentManager)object3, (String)object4);
                return Unit.a;
            }
        }
        if ((object = ((ex1_0)object3).w0) == null) return Unit.a;
        Intrinsics.checkNotNull(object);
        object4 = new g43_0((Product)object, false);
        object = ((Fragment)object3).requireActivity().getSupportFragmentManager();
        object3 = ((Fragment)object4).getTag();
        ((DialogFragment)object4).show((FragmentManager)object, (String)object3);
        return Unit.a;
    }
}

