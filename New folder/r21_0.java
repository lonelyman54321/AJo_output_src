/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from r21
 */
public final class r21_0
implements Function1 {
    public final /* synthetic */ t21_0 a;

    public /* synthetic */ r21_0(t21_0 t21_02) {
        this.a = t21_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        block19: {
            int n3;
            String string2;
            t21_0 t21_02;
            block18: {
                Object object2;
                int n4;
                Object object3;
                int n7;
                Object[] objectArray;
                int n8;
                block20: {
                    n8 = 0;
                    objectArray = null;
                    n7 = 1;
                    object = (DataCallback)object;
                    t21_02 = this.a;
                    Intrinsics.checkNotNullParameter(t21_02, "this$0");
                    object3 = cp_1.Companion;
                    n4 = nn_2.b((cp$a)object3, (DataCallback)object);
                    if (n4 == 0) break block19;
                    kx3_0.a = n7;
                    object3 = t21_02.c;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n4 = 0;
                        object3 = null;
                    }
                    object3.stopLoader();
                    n4 = ((DataCallback)object).getStatus();
                    object2 = "format(...)";
                    string2 = "closetViewModel";
                    if (n4 != 0) break block20;
                    object = t21_02.getActivity();
                    if (object != null) {
                        object = StringCompanionObject.INSTANCE;
                        n3 = R$string.acc_alert_message;
                        object = hv3_0.K(n3);
                        n4 = R$string.removed_wishlist_refresh;
                        object3 = hv3_0.K(n4);
                        Object object4 = new Object[n7];
                        object4[0] = object3;
                        object = xh2_0.a((Object[])object4, n7, (String)object, (String)object2);
                        n7 = R$string.removed_wishlist_refresh;
                        Object object5 = hv3_0.K(n7);
                        t21_02.Ta((String)object5, (String)object);
                        object = t21_02.z;
                        if (object != null) {
                            object5 = t21_02.h;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n7 = 0;
                                object5 = null;
                            }
                            n7 = (object5 = ((ky1_0)object5).i.c) != null ? ((Product)object5).getViewHolderPos() : -1;
                            ((n32_0)object).Oa(n7);
                        }
                        object = t21_02.j;
                        object5 = "closetListAdaptor";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n3 = 0;
                            object = null;
                        }
                        object = ((np_2)object).b;
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.Product>");
                        object = (ArrayList)object;
                        object3 = t21_02.h;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object3 = null;
                        }
                        object3 = ((ky1_0)object3).i.c;
                        try {
                            object = ((ArrayList)object).iterator();
                            object2 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                            if (object3 != null) {
                                boolean bl2;
                                while (bl2 = object.hasNext()) {
                                    object2 = object.next();
                                    object4 = "next(...)";
                                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                                    object2 = (Product)object2;
                                    object4 = ((Product)object2).getCode();
                                    Object object6 = ((Product)object3).getFnlColorVariantData();
                                    object6 = object6 != null ? ((ProductFnlColorVariantData)object6).getColorGroup() : null;
                                    boolean bl3 = Intrinsics.areEqual(object4, object6);
                                    if (!bl3) {
                                        if ((object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                                            object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                                        } else {
                                            bl2 = false;
                                            object2 = null;
                                        }
                                        object4 = ((Product)object3).getFnlColorVariantData();
                                        if (object4 != null) {
                                            object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                                        } else {
                                            bl3 = false;
                                            object4 = null;
                                        }
                                        if (!(bl2 = Intrinsics.areEqual(object2, object4))) continue;
                                    }
                                    object.remove();
                                }
                                object = t21_02.j;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    n3 = 0;
                                    object = null;
                                }
                                ((RecyclerView$f)object).notifyDataSetChanged();
                            }
                            break block18;
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            object = yn3_0.a;
                            object5 = Unit.a;
                            object2 = "Concurrent Modification Exception ";
                            object3 = new StringBuilder((String)object2);
                            ((StringBuilder)object3).append(object5);
                            object5 = ((StringBuilder)object3).toString();
                            objectArray = new Object[]{};
                            ((yn3$a)object).a((String)object5, objectArray);
                        }
                    }
                    break block18;
                }
                n3 = ((DataCallback)object).getStatus();
                if (n3 == n7) {
                    object = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_error_message;
                    object = hv3_0.K(n3);
                    n4 = R$string.remove_wish_list_alert;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray2 = new Object[n7];
                    objectArray2[0] = object3;
                    object = xh2_0.a(objectArray2, n7, (String)object, (String)object2);
                    n8 = R$string.remove_wish_list_alert;
                    objectArray = hv3_0.K(n8);
                    t21_02.Ta((String)objectArray, (String)object);
                }
            }
            if ((object = t21_02.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object = ((ky1_0)object).i;
            ((BH3)object).c = null;
        }
        return Unit.a;
    }
}

