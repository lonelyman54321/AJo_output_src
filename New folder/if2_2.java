/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.query.QueryText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from if2
 */
public final class if2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ if2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        boolean bl2 = false;
        Object object3 = null;
        Object object4 = this.b;
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                int n8;
                int n10;
                object = (DataCallback)object;
                object4 = (vv2_2)object4;
                Object object5 = "this$0";
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                if (object != null && (n4 = (int)(nn_2.b((cp$a)(object5 = cp_1.Companion), (DataCallback)object) ? 1 : 0)) != 0) {
                    object5 = ((vv2_2)object4).l;
                    ((ArrayList)object5).clear();
                    object = (List)((DataCallback)object).getData();
                    if (object != null) {
                        object = CollectionsKt.m0((Collection)object);
                        object5 = ((vv2_2)object4).l;
                        ((ArrayList)object5).addAll(object);
                    }
                }
                object = ((vv2_2)object4).U;
                n4 = ((String)object).length() - n3;
                int n14 = 0;
                QueryText queryText = null;
                boolean bl3 = false;
                String string2 = null;
                while (true) {
                    n10 = 32;
                    if (n14 > n4) break;
                    n8 = !bl3 ? n14 : n4;
                    n8 = Intrinsics.compare(((String)object).charAt(n8), n10);
                    n8 = n8 <= 0 ? 1 : 0;
                    if (!bl3) {
                        if (n8 == 0) {
                            bl3 = true;
                            continue;
                        }
                        n14 += n3;
                        continue;
                    }
                    if (n8 == 0) break;
                    n4 += -1;
                }
                if ((n7 = TextUtils.isEmpty((CharSequence)(object = ((Object)((String)object).subSequence(n14, n4 += n3)).toString()))) == 0) {
                    object = ((vv2_2)object4).U;
                    n4 = ((String)object).length() - n3;
                    n14 = 0;
                    queryText = null;
                    bl3 = false;
                    string2 = null;
                    while (n14 <= n4) {
                        n8 = !bl3 ? n14 : n4;
                        n8 = Intrinsics.compare(((String)object).charAt(n8), n10);
                        n8 = n8 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n8 == 0) {
                                bl3 = true;
                                continue;
                            }
                            n14 += n3;
                            continue;
                        }
                        if (n8 == 0) break;
                        n4 += -1;
                    }
                    ((vv2_2)object4).U = object = com.jio.jioads.adinterfaces.a.a(n4, n3, n14, (String)object);
                    object = ((r61)object4).getContext();
                    if (object != null) {
                        z40_0.Companion.getClass();
                        object = z40$a.a((Context)object).a;
                        object3 = "AutosuggestionAPI_Exp";
                        string2 = ((ao0_0)object).b((String)object3);
                        object = ((vv2_2)object4).t;
                        if (object == null) {
                            object = "searchViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n4 = 0;
                            object5 = null;
                        } else {
                            object5 = object;
                        }
                        String string3 = ((vv2_2)object4).U;
                        og1_1.c();
                        object5.getClass();
                        object = "queryString";
                        Intrinsics.checkNotNullParameter(string3, (String)object);
                        if (string3 != null && (n7 = ((String)(object = ((Object)StringsKt.m0(string3)).toString())).length()) != 0) {
                            int n15;
                            queryText = new QueryText();
                            object = mz3_0.Q(string3);
                            queryText.setQueryText((String)object);
                            object = ((yw2_0)object5).s;
                            object3 = od3_2.a();
                            if (object == null || (n15 = ((String)object).length()) == 0) {
                                object = object3;
                            }
                            if (bl2 = Intrinsics.areEqual(object, object3 = ld3_2.STORE_AJIO.getStoreId())) {
                                object = "rilfnl";
                            }
                            queryText.setStoreId((String)object);
                            object = ((yw2_0)object5).t;
                            queryText.setBrandCode((String)object);
                            object = md3_0.c((jD3)object5);
                            n8 = 0;
                            object3 = new zw2_1((yw2_0)object5, queryText, string2, string3, null);
                            n15 = 3;
                            Ae3.d((i90_0)object, null, null, (Function2)object3, n15);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        object4 = (qz1_2)object4;
        Intrinsics.checkNotNullParameter(object4, "$viewModel");
        Object[] objectArray = "$this$semantics";
        Intrinsics.checkNotNullParameter(object, (String)objectArray);
        object4 = qz1_2.l((SelectedOrderItem)CollectionsKt.firstOrNull((List)((qz1_2)object4).m.getValue()));
        if (object4 != null) {
            object4 = ((CartEntry)object4).getProduct();
        } else {
            boolean bl4 = false;
            object4 = null;
        }
        if (object4 != null) {
            objectArray = ((Product)object4).getBrandName();
        } else {
            n4 = 0;
            objectArray = null;
        }
        if (object4 != null) {
            object2 = ((Product)object4).getName();
        }
        object2 = n1.a((String)objectArray, ",", (String)object2);
        object4 = StringCompanionObject.INSTANCE;
        object4 = hv3_0.K(R$string.acc_page_header_order_details);
        objectArray = new Object[n3];
        objectArray[0] = object2;
        object2 = Arrays.copyOf(objectArray, n3);
        object2 = String.format((String)object4, object2);
        Intrinsics.checkNotNullExpressionValue(object2, "format(...)");
        RY2.e((UY2)object, (String)object2);
        return Unit.a;
    }
}

