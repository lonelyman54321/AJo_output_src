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
import com.ril.ajio.services.entity.BannerAdData;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YF1
 */
public final class yf1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q22_0 b;

    public /* synthetic */ yf1_0(q22_0 q22_02, int n3) {
        this.a = n3;
        this.b = q22_02;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
                ((q22_0)object3).Ua().stopLoader();
                object2 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n4 != 0) {
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 == 0) {
                        Object object4;
                        object = (SimilarProducts)((DataCallback)object).getData();
                        n4 = 0;
                        object2 = null;
                        if (object != null) {
                            object4 = ((SimilarProducts)object).getSimilarProducts();
                        } else {
                            n3 = 0;
                            object4 = null;
                        }
                        object4 = (Collection)object4;
                        if (object4 != null && (n3 = (int)(object4.isEmpty() ? 1 : 0)) == 0) {
                            ((q22_0)object3).L0 = object4 = new n32_0();
                            object4 = ((q22_0)object3).db();
                            Object object5 = h40_0.a;
                            boolean bl2 = h40_0.T1();
                            ((K43)object4).f = object5 = Boolean.valueOf(bl2);
                            object4 = ((q22_0)object3).db();
                            object = object != null ? ((SimilarProducts)object).getSimilarProducts() : null;
                            ((K43)object4).a = object = (ArrayList)object;
                            object = ((q22_0)object3).db();
                            object4 = ((q22_0)object3).M0;
                            if (object4 != null) {
                                object4 = ((Product)object4).getName();
                            } else {
                                n3 = 0;
                                object4 = null;
                            }
                            ((K43)object).d = object4 = String.valueOf(object4);
                            object = ((q22_0)object3).M0;
                            object = object != null && (object = ((Product)object).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object).getBrandName() : null;
                            if (object != null) {
                                object = ((q22_0)object3).db();
                                object4 = ((q22_0)object3).M0;
                                if (object4 != null && (object4 = ((Product)object4).getFnlColorVariantData()) != null) {
                                    object2 = ((ProductFnlColorVariantData)object4).getBrandName();
                                }
                                ((K43)object).c = object2;
                            } else {
                                object = ((q22_0)object3).M0;
                                object = object != null ? ((Product)object).getBrandName() : null;
                                if (object != null) {
                                    object = ((q22_0)object3).db();
                                    object4 = ((q22_0)object3).M0;
                                    if (object4 != null) {
                                        object2 = ((Product)object4).getBrandName();
                                    }
                                    ((K43)object).c = object2;
                                }
                            }
                            object = ((q22_0)object3).db();
                            ((K43)object).e = object2 = ((q22_0)object3).M0;
                            object = ((q22_0)object3).db();
                            ((K43)object).g = object2 = "plp screen";
                            object = ((q22_0)object3).L0;
                            if (object != null) {
                                object2 = ((Fragment)object3).getChildFragmentManager();
                                object3 = "STL Fragment";
                                ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                            }
                        } else {
                            q22_0.Gb();
                        }
                    } else {
                        q22_0.Gb();
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (BannerAdData)object;
        object3 = (bG1)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object3.getClass();
        return Unit.a;
    }
}

