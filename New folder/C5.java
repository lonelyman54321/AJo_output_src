/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.Order.ImageUploadResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.SimilarProducts;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class C5
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        boolean bl2 = false;
        Object object2 = null;
        int n4 = 0;
        Object object3 = null;
        Object object4 = "this$0";
        Object object5 = this.b;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                object5 = (zm2_2)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                int n8 = ((zm2_2)object5).n;
                if (n8 != 0) {
                    n8 = ((DataCallback)object).getStatus();
                    ArrayList arrayList = ((zm2_2)object5).p;
                    if (n8 != 0) {
                        int n10;
                        if (n8 == n3 && (n10 = ((zm2_2)object5).l) < (n4 = arrayList.size())) {
                            ((zm2_2)object5).l = n10;
                            object3 = (fn2_1)arrayList.get(n10);
                            ((fn2_1)object3).d = n3;
                            ((fn2_1)object3).e = false;
                            ((fn2_1)object3).g = false;
                            ((fn2_1)object3).f = n3;
                            arrayList.remove(n10);
                            arrayList.add(n10, object3);
                            n10 = ((zm2_2)object5).l;
                            ((zm2_2)object5).Qa(n10);
                        }
                    } else {
                        Object object6;
                        n8 = ((zm2_2)object5).l;
                        object = (ImageUploadResponse)((DataCallback)object).getData();
                        int n14 = arrayList.size();
                        if (n8 < n14 && object != null && (n14 = ((ArrayList)(object6 = ((ImageUploadResponse)object).getImageUrls())).size()) > 0) {
                            int n15;
                            ((zm2_2)object5).l = n8;
                            object6 = (fn2_1)arrayList.get(n8);
                            String string2 = (String)((ImageUploadResponse)object).getImageUrls().get(0);
                            object6.getClass();
                            String string3 = "<set-?>";
                            Intrinsics.checkNotNullParameter(string2, string3);
                            ((fn2_1)object6).i = string2;
                            ((fn2_1)object6).e = n3;
                            ((fn2_1)object6).d = false;
                            ((fn2_1)object6).g = false;
                            ((fn2_1)object6).f = n3;
                            n3 = ((zm2_2)object5).l;
                            arrayList.remove(n3);
                            n3 = ((zm2_2)object5).l;
                            arrayList.add(n3, object6);
                            n3 = ((zm2_2)object5).l;
                            ((zm2_2)object5).Qa(n3);
                            aN2 aN22 = ((zm2_2)object5).a;
                            if (aN22 != null) {
                                object = ((ImageUploadResponse)object).getImageUrls().get(0);
                                object2 = "get(...)";
                                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                                object = (String)object;
                                aN22.T1(n8, (String)object);
                            }
                            if ((n15 = ((zm2_2)object5).Oa()) >= (n3 = 2)) {
                                object = ((zm2_2)object5).i;
                                if (object == null) {
                                    object = "tvErrorImage";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                } else {
                                    object3 = object;
                                }
                                n15 = 4;
                                object3.setVisibility(n15);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 2: {
                n3 = PaymentActivity.I0;
                object5 = (PaymentActivity)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Object object7 = cp_1.Companion;
                n3 = (int)(nn_2.b((cp$a)object7, (DataCallback)object) ? 1 : 0);
                if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0 && (object7 = ((DataCallback)object).getData()) != null) {
                    object = (CustomerType)((DataCallback)object).getData();
                    object7 = ((BaseSplitActivity)object5).getAppPreferences();
                    if (object != null) {
                        object3 = ((CustomerType)object).getCustomerType();
                    }
                    ((jo_2)object7).q((String)object3);
                }
                return Unit.a;
            }
            case 1: {
                object5 = (oy1_1)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
                object4 = cp_1.Companion;
                int n16 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (n16 != 0) {
                    n16 = ((DataCallback)object).getStatus();
                    if (n16 == 0) {
                        Object object8;
                        if ((object = (SimilarProducts)((DataCallback)object).getData()) != null) {
                            object8 = ((SimilarProducts)object).getSimilarProducts();
                        } else {
                            n3 = 0;
                            object8 = null;
                        }
                        object8 = (Collection)object8;
                        if (object8 != null && (n3 = object8.isEmpty()) == 0) {
                            boolean bl3;
                            object5.getClass();
                            ((oy1_1)object5).T = object8 = new n32_0();
                            object8 = ((oy1_1)object5).Sa();
                            object2 = h40_0.a;
                            bl2 = h40_0.c2();
                            ((K43)object8).f = object2 = Boolean.valueOf(bl2);
                            object8 = ((oy1_1)object5).Sa();
                            if (object != null) {
                                object = ((SimilarProducts)object).getSimilarProducts();
                            } else {
                                bl3 = false;
                                object = null;
                            }
                            ((K43)object8).a = object = (ArrayList)object;
                            object = ((oy1_1)object5).Sa();
                            object8 = ((oy1_1)object5).O;
                            if (object8 != null) {
                                object8 = ((Product)object8).getName();
                            } else {
                                n3 = 0;
                                object8 = null;
                            }
                            ((K43)object).d = object8 = String.valueOf(object8);
                            object = ((oy1_1)object5).O;
                            if (object != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                                object = ((ProductFnlColorVariantData)object).getBrandName();
                            } else {
                                bl3 = false;
                                object = null;
                            }
                            if (object != null) {
                                object = ((oy1_1)object5).Sa();
                                object8 = ((oy1_1)object5).O;
                                if (object8 != null && (object8 = ((Product)object8).getFnlColorVariantData()) != null) {
                                    object3 = ((ProductFnlColorVariantData)object8).getBrandName();
                                }
                                ((K43)object).c = object3;
                            } else {
                                object = ((oy1_1)object5).O;
                                if (object != null) {
                                    object = ((Product)object).getBrandName();
                                } else {
                                    bl3 = false;
                                    object = null;
                                }
                                if (object != null) {
                                    object = ((oy1_1)object5).Sa();
                                    object8 = ((oy1_1)object5).O;
                                    if (object8 != null) {
                                        object3 = ((Product)object8).getBrandName();
                                    }
                                    ((K43)object).c = object3;
                                }
                            }
                            object = ((oy1_1)object5).Sa();
                            ((K43)object).e = object8 = ((oy1_1)object5).O;
                            object = ((oy1_1)object5).T;
                            if (object != null) {
                                object8 = ((Fragment)object5).getChildFragmentManager();
                                object2 = "STL Fragment";
                                ((DialogFragment)object).show((FragmentManager)object8, (String)object2);
                            }
                        } else {
                            object = ((oy1_1)object5).O;
                            if (object != null) {
                                Intrinsics.checkNotNull(object);
                                object8 = new g43_0((Product)object, false);
                                object = ((Fragment)object5).requireActivity().getSupportFragmentManager();
                                object2 = ((Fragment)object8).getTag();
                                ((DialogFragment)object8).show((FragmentManager)object, (String)object2);
                            }
                        }
                    } else {
                        object = ((oy1_1)object5).O;
                        if (object != null) {
                            Intrinsics.checkNotNull(object);
                            object2 = new g43_0((Product)object, n3 != 0);
                            object = ((Fragment)object5).requireActivity().getSupportFragmentManager();
                            String string4 = ((Fragment)object2).getTag();
                            ((DialogFragment)object2).show((FragmentManager)object, string4);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object5 = (G5)object5;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        ((G5)object5).b.k(object);
        return Unit.a;
    }
}

