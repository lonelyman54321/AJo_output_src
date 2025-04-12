/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.SimilarProducts;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p21
 */
public final class p21_0
implements Function1 {
    public final /* synthetic */ t21_0 a;

    public /* synthetic */ p21_0(t21_0 t21_02) {
        this.a = t21_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                boolean bl2;
                Object object4;
                object = (SimilarProducts)((DataCallback)object).getData();
                n3 = 0;
                object3 = null;
                if (object != null) {
                    object4 = ((SimilarProducts)object).getSimilarProducts();
                } else {
                    bl2 = false;
                    object4 = null;
                }
                object4 = (Collection)object4;
                if (object4 != null && !(bl2 = object4.isEmpty())) {
                    object2.getClass();
                    ((t21_0)object2).z = object4 = new n32_0();
                    object4 = ((t21_0)object2).Qa();
                    object = object != null ? ((SimilarProducts)object).getSimilarProducts() : null;
                    ((K43)object4).a = object = (ArrayList)object;
                    object = ((t21_0)object2).Qa();
                    object4 = ((t21_0)object2).y;
                    if (object4 != null) {
                        object4 = ((Product)object4).getName();
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    ((K43)object).d = object4 = String.valueOf(object4);
                    object = ((t21_0)object2).Qa();
                    ((K43)object).e = object4 = ((t21_0)object2).y;
                    object = object4 != null && (object = ((Product)object4).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getBrandName() : null;
                    if (object != null) {
                        object = ((t21_0)object2).Qa();
                        object4 = ((t21_0)object2).y;
                        if (object4 != null && (object4 = ((Product)object4).getFnlColorVariantData()) != null) {
                            object3 = ((ProductFnlColorVariantData)object4).getBrandName();
                        }
                        ((K43)object).c = object3;
                    } else {
                        object = ((t21_0)object2).y;
                        object = object != null ? ((Product)object).getBrandName() : null;
                        if (object != null) {
                            object = ((t21_0)object2).Qa();
                            object4 = ((t21_0)object2).y;
                            if (object4 != null) {
                                object3 = ((Product)object4).getBrandName();
                            }
                            ((K43)object).c = object3;
                        }
                    }
                    object = ((t21_0)object2).z;
                    if (object != null) {
                        object2 = ((Fragment)object2).getChildFragmentManager();
                        object3 = "STL Fragment";
                        ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                    }
                } else {
                    object = ((t21_0)object2).y;
                    if (object != null) {
                        Intrinsics.checkNotNull(object);
                        bl2 = false;
                        object4 = null;
                        object3 = new g43_0((Product)object, false);
                        object = ((Fragment)object2).requireActivity().getSupportFragmentManager();
                        object2 = ((Fragment)object3).getTag();
                        ((DialogFragment)object3).show((FragmentManager)object, (String)object2);
                    }
                }
            } else {
                object = ((t21_0)object2).y;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    boolean bl3 = true;
                    object3 = new g43_0((Product)object, bl3);
                    object = ((Fragment)object2).requireActivity().getSupportFragmentManager();
                    object2 = ((Fragment)object3).getTag();
                    ((DialogFragment)object3).show((FragmentManager)object, (String)object2);
                }
            }
        }
        return Unit.a;
    }
}

