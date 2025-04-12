/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.gson.JsonObject;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from l21
 */
public final class l21_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l21_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        String string2;
        int n3;
        Object object2;
        int n4;
        Object object3;
        Object object4;
        int n7;
        int n8;
        Object object5;
        Object object6;
        Object object7;
        int n10;
        Object object8;
        int n14;
        block35: {
            block34: {
                n14 = 0;
                object8 = null;
                n10 = 1;
                int n15 = 0;
                object7 = null;
                object6 = "this$0";
                object5 = this.b;
                n8 = this.a;
                switch (n8) {
                    default: {
                        Iterator iterator = object;
                        iterator = (dl2_2)object;
                        object5 = (oo2_1)object5;
                        Intrinsics.checkNotNullParameter(object5, (String)object6);
                        String string3 = "PAYMENT_PayNowByNetBanking";
                        Intrinsics.checkNotNullParameter(string3, "$requestID");
                        Intrinsics.checkNotNullParameter(iterator, "response");
                        object = (JsonObject)((dl2_2)((Object)iterator)).b;
                        object8 = ((dl2_2)((Object)iterator)).a;
                        n10 = ((cl2_2)object8).d();
                        if (n10 && object != null) {
                            Object object9 = JsonUtils.toJson(object);
                            object6 = PayNowResponse.class;
                            if ((object9 = (PayNowResponse)JsonUtils.fromJson((String)object9, object6)) != null && (object6 = ((PayNowResponse)object9).getError()) != null) {
                                object6 = ((Error)object6).getCode();
                            } else {
                                boolean bl2 = false;
                                object6 = null;
                            }
                            if (object6 != null) {
                                object6 = ((PayNowResponse)object9).getError();
                                if (object6 != null) {
                                    object7 = ((Error)object6).getDescription();
                                }
                                if (object7 != null) {
                                    if ((object9 = ((PayNowResponse)object9).getError()) == null || (object9 = ((Error)object9).getDescription()) == null) {
                                        object9 = "";
                                    }
                                    object5.getClass();
                                    n14 = ((cl2_2)object8).d;
                                    oo2_1.h(n14, string3, (String)object9);
                                }
                            }
                            object8 = DataCallback.Companion;
                            return ((DataCallback$Companion)object8).onSuccess(object);
                        }
                        ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                        String string4 = "single page checkout";
                        String string5 = "Forward";
                        boolean bl3 = true;
                        return apiErrorRepo.handleApiError((dl2_2)((Object)iterator), string3, bl3, string4, string5);
                    }
                    case 0: 
                }
                object = (DataCallback)object;
                object5 = (t21_0)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object6);
                object6 = cp_1.Companion;
                n7 = nn_2.b((cp$a)object6, (DataCallback)object);
                if (n7 == 0) return Unit.a;
                ((t21_0)object5).Pa();
                n7 = ((DataCallback)object).getStatus();
                if (n7 != 0) {
                    int n16 = ((DataCallback)object).getStatus();
                    if (n16 != n10) return Unit.a;
                    object = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message;
                    object = hv3_0.K(n16);
                    n15 = R$string.something_wrong_msg;
                    object7 = hv3_0.K(n15);
                    object6 = new Object[n10];
                    object6[0] = object7;
                    object = xh2_0.a((Object[])object6, n10, (String)object, "format(...)");
                    n14 = R$string.something_wrong_msg;
                    object8 = hv3_0.K(n14);
                    ((t21_0)object5).Ra((String)object8, (String)object);
                    return Unit.a;
                }
                if ((object = (Product)((DataCallback)object).getData()) == null) return Unit.a;
                object6 = ((t21_0)object5).u;
                if (object6 != null && (n7 = (int)(((ArrayList)object6).isEmpty() ? 1 : 0)) == 0) {
                    object6 = ((t21_0)object5).u.iterator();
                    while ((n8 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                        object4 = (Product)object6.next();
                        object3 = ((Product)object4).getCode();
                        if (object3 == null || (n4 = ((String)object3).equalsIgnoreCase((String)(object2 = ((Product)object).getBaseProduct()))) != n10) continue;
                        object6 = ((Product)object).getProductOptionVariants();
                        ((Product)object4).setProductOptionVariants((List)object6);
                        object6 = ((Product)object).getProductOptionVariants();
                        n7 = object6.size();
                        if (n7 != n10) break block34;
                        object6 = (ProductOptionVariant)((Product)object).getProductOptionVariants().get(0);
                        n7 = (int)(((ProductOptionVariant)object6).isStockAvailable() ? 1 : 0);
                        break block35;
                    }
                }
                n8 = 0;
                object4 = null;
            }
            n7 = 0;
            object6 = null;
        }
        object3 = ((Product)object).getProductOptionItems();
        if (object3 != null && !(n4 = object3.isEmpty())) {
            object3 = ((Product)object).getProductOptionItems();
            Intrinsics.checkNotNull(object3);
            object3 = (ProductOptionItem)object3.get(0);
            if (object3 != null) {
                object2 = ((ProductOptionItem)object3).getVariantOptionQualifiers();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object3 = ((ProductOptionItem)object3).getVariantOptionQualifiers();
                Intrinsics.checkNotNull(object3);
                object3 = object3.iterator();
                while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object2 = (ProductOptionVariant)object3.next();
                    String string6 = ((ProductOptionVariant)object2).getQualifier();
                    int n17 = "selection1".equalsIgnoreCase(string6);
                    String string7 = "null";
                    if (n17 != 0 && (string6 = ((ProductOptionVariant)object2).getValue()) != null && (n17 = string6.length()) != 0 && (n17 = (int)(kotlin.text.b.i(string6 = ((ProductOptionVariant)object2).getValue(), string7, n10 != 0) ? 1 : 0)) == 0) {
                        ((t21_0)object5).F = object2 = ((ProductOptionVariant)object2).getValue();
                        continue;
                    }
                    String string8 = "selection2";
                    string6 = ((ProductOptionVariant)object2).getQualifier();
                    n17 = (int)(string8.equalsIgnoreCase(string6) ? 1 : 0);
                    if (n17 == 0 || (string6 = ((ProductOptionVariant)object2).getValue()) == null || (n17 = string6.length()) == 0 || (n17 = (int)(kotlin.text.b.i(string6 = ((ProductOptionVariant)object2).getValue(), string7, n10 != 0) ? 1 : 0)) != 0) continue;
                    ((t21_0)object5).G = object2 = ((ProductOptionVariant)object2).getValue();
                }
            }
        }
        if (object4 != null) {
            object3 = ((Product)object4).getVariantOptions();
        } else {
            n4 = 0;
            object3 = null;
        }
        if (object4 != null && object3 != null && (n3 = object3.size()) == n10 && ((string2 = ((t21_0)object5).G) != null && !(n10 = (int)(kotlin.text.b.k(string2) ? 1 : 0)) || (string2 = ((t21_0)object5).F) != null && !(n10 = (int)(kotlin.text.b.k(string2) ? 1 : 0)))) {
            string2 = ((t21_0)object5).G;
            if (string2 != null && !(n10 = (int)(kotlin.text.b.k(string2) ? 1 : 0))) {
                object8 = ((t21_0)object5).F;
                if (object8 != null) {
                    n14 = (int)(kotlin.text.b.k((CharSequence)object8) ? 1 : 0);
                }
            } else {
                if (n7 != 0) {
                    object = (ProductOptionItem)object3.get(0);
                    ((t21_0)object5).t4((Product)object4, (ProductOptionItem)object);
                    return Unit.a;
                }
                int n18 = R$string.selected_product_out_of_stock;
                object = hv3_0.K(n18);
                hv3_0.o0(0, (String)object, null);
                return Unit.a;
            }
        }
        object = ((Product)object).getBaseOptions();
        object8 = "closetListAdaptor";
        string2 = "closetViewModel";
        if (object != null) {
            object = object.iterator();
            while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object6 = (ProductOption)object.next();
                object4 = ((ProductOption)object6).getVariantType();
                if (object4 == null || (n8 = (int)(Intrinsics.areEqual(object4 = ((ProductOption)object6).getVariantType(), object2 = "FnlSizeVariant") ? 1 : 0)) == 0 || (object6 = ((ProductOption)object6).getOptions()) == null) continue;
                object = ((t21_0)object5).h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl4 = false;
                    object = null;
                }
                ((ky1_0)object).r.setVariantOptions((List)object6);
                object = ((t21_0)object5).j;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                } else {
                    object7 = object;
                }
                ((RecyclerView$f)object7).notifyDataSetChanged();
                return Unit.a;
            }
        }
        if (object3 == null) return Unit.a;
        object = ((t21_0)object5).h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            boolean bl5 = false;
            object = null;
        }
        ((ky1_0)object).r.setVariantOptions((List)object3);
        object = ((t21_0)object5).j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
        } else {
            object7 = object;
        }
        ((RecyclerView$f)object7).notifyDataSetChanged();
        return Unit.a;
    }
}

