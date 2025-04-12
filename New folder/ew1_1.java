/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from EW1
 */
public final class ew1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ew1_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        block23: {
            block20: {
                int n3;
                Fragment fragment;
                Object object2;
                Object object3;
                int n4;
                Object object4;
                int n7;
                block21: {
                    block24: {
                        block22: {
                            n7 = 0;
                            object4 = null;
                            n4 = 0;
                            object3 = null;
                            object2 = "this$0";
                            fragment = this.b;
                            n3 = 1;
                            int n8 = this.a;
                            object = (DataCallback)object;
                            switch (n8) {
                                default: {
                                    object4 = nv2_2.Companion;
                                    fragment = (nv2_2)fragment;
                                    Intrinsics.checkNotNullParameter(fragment, (String)object2);
                                    object4 = cp_1.Companion;
                                    n7 = nn_2.b((cp$a)object4, (DataCallback)object);
                                    if (n7 != 0) {
                                        int n10;
                                        int n14;
                                        object4 = ((nv2_2)fragment).Pa().e;
                                        object2 = ((nv2_2)fragment).b;
                                        if (object2 != null) {
                                            n14 = object2.c;
                                            object2 = n14;
                                        } else {
                                            n14 = 0;
                                            object2 = null;
                                        }
                                        if (object2 != null) {
                                            object4 = ((BH3)object4).h;
                                            DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
                                            object2 = dataCallback$Companion.onSuccess(object2);
                                            ((LiveData)object4).k(object2);
                                        } else {
                                            object4.getClass();
                                        }
                                        kx3_0.a = n3;
                                        object4 = ((nv2_2)fragment).Oa().fppPbClosetLoading;
                                        n14 = 8;
                                        object4.setVisibility(n14);
                                        n7 = ((DataCallback)object).getStatus();
                                        if (n7 == 0) {
                                            n10 = 4;
                                            rw_1.a(n10, null);
                                        } else {
                                            n10 = ((DataCallback)object).getStatus();
                                            if (n10 == n3) {
                                                n10 = 5;
                                                rw_1.a(n10, null);
                                            }
                                        }
                                        n10 = (int)(fragment.isAdded() ? 1 : 0);
                                        if (n10 != 0 && (n10 = (int)(fragment.isRemoving() ? 1 : 0)) == 0 && (n10 = (int)(fragment.isDetached() ? 1 : 0)) == 0) {
                                            ((DialogFragment)fragment).dismissAllowingStateLoss();
                                        }
                                    }
                                    return Unit.a;
                                }
                                case 0: 
                            }
                            fragment = (ex1_0)fragment;
                            Intrinsics.checkNotNullParameter(fragment, (String)object2);
                            object2 = cp_1.Companion;
                            int n15 = nn_2.b((cp$a)object2, (DataCallback)object);
                            if (n15 == 0) break block20;
                            if (object == null || (n15 = ((DataCallback)object).getStatus()) != 0) break block21;
                            n15 = (int)(fragment.isAdded() ? 1 : 0);
                            if (n15 != 0) break block22;
                            object = Unit.a;
                            break block23;
                        }
                        object2 = (ProductsList)((DataCallback)object).getData();
                        ((ex1_0)fragment).Ra((ProductsList)object2);
                        if (object2 != null) break block24;
                        object = Unit.a;
                        break block23;
                    }
                    Object object5 = ((ex1_0)fragment).u;
                    if (object5 == null) {
                        object5 = "closetViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object3 = object5;
                    }
                    ((ky1_0)object3).p((ProductsList)object2, false);
                    object3 = ((ex1_0)fragment).x;
                    if (object3 != null) {
                        ((om_1)object3).a = object2;
                    }
                    if ((object3 = (ProductsList)((DataCallback)object).getData()) != null && (object3 = ((ProductsList)object3).getProducts()) != null) {
                        n7 = object3.size();
                    }
                    if (n7 > 0 && (object = (ProductsList)((DataCallback)object).getData()) != null && (object = ((ProductsList)object).getProducts()) != null) {
                        object4 = ((ex1_0)fragment).S;
                        if (object4 != null) {
                            ((bo_1)object4).i((List)object);
                        }
                        if ((object = ((ex1_0)fragment).S) != null) {
                            ((bo_1)object).h();
                        }
                    }
                    break block20;
                }
                int n16 = ((DataCallback)object).getStatus();
                if (n16 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message;
                    object = hv3_0.K(n16);
                    n4 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n4);
                    object2 = new Object[n3];
                    object2[0] = object3;
                    object = xh2_0.a(object2, n3, (String)object, "format(...)");
                    n7 = R$string.something_wrong_msg;
                    object4 = hv3_0.K(n7);
                    ((ex1_0)fragment).kb((String)object4, (String)object);
                }
            }
            object = Unit.a;
        }
        return object;
    }
}

