/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import java.util.AbstractCollection;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from sW1
 */
public final class sw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ sw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        String string2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        Object object2 = cp_1.Companion;
        boolean n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4) {
            int n7;
            Object object3;
            kx3_0.a = n3;
            ex1_02.u0 = n3;
            ex1_02.Xa();
            object = (wq1_1)((DataCallback)object).getData();
            boolean bl2 = false;
            object2 = null;
            if (object != null) {
                object3 = ((wq1_1)object).a;
            } else {
                n7 = 0;
                object3 = null;
            }
            if (object != null) {
                object2 = ((wq1_1)object).b;
            }
            Object object4 = "";
            object = new StringBuilder((String)object4);
            if (object2 != null && object3 != null) {
                boolean bl3;
                Stack stack;
                int n8;
                object4 = ex1_02.Y;
                boolean bl4 = object4.isEmpty();
                if (!bl4) {
                    object4.pop();
                }
                if ((n8 = ((AbstractCollection)(stack = ex1_02.X)).isEmpty()) == 0) {
                    stack.pop();
                }
                if ((n8 = ((DataCallback)object3).getStatus()) == 0 && (n8 = ((DataCallback)object2).getStatus()) == 0) {
                    ex1_02.vb((StringBuilder)object);
                    object2 = ((DataCallback)object3).getData();
                    if (object2 != null) {
                        object2 = ((DataCallback)object3).getData();
                        Intrinsics.checkNotNull(object2);
                        object2 = (SaveForLaterResponse)object2;
                        ex1_02.ub((SaveForLaterResponse)object2, (StringBuilder)object);
                    }
                    ex1_02.sb(false);
                } else {
                    n8 = ((DataCallback)object3).getStatus();
                    if (n8 == 0 && (n8 = ((DataCallback)object2).getStatus()) == n3) {
                        Object object5 = ((DataCallback)object3).getData();
                        if (object5 != null) {
                            object3 = ((DataCallback)object3).getData();
                            Intrinsics.checkNotNull(object3);
                            object3 = (SaveForLaterResponse)object3;
                            ex1_02.ub((SaveForLaterResponse)object3, (StringBuilder)object);
                        }
                        n7 = ((StringBuilder)object).length();
                        n8 = R$string.cart_delete_error;
                        object5 = hv3_0.K(n8);
                        ((StringBuilder)object).replace(0, n7, (String)object5);
                        ((AbstractCollection)stack).clear();
                        object4.clear();
                        object2 = ((DataCallback)object2).getError();
                        boolean bl5 = ex1_0.Ta((DataError)object2);
                        if (bl5) {
                            ex1_02.eb();
                        } else {
                            ex1_02.sb(false);
                        }
                    } else {
                        n8 = ((DataCallback)object3).getStatus();
                        if (n8 == n3 && (n8 = ((DataCallback)object2).getStatus()) == 0) {
                            ex1_02.vb((StringBuilder)object);
                            int n10 = ((StringBuilder)object).length();
                            n7 = R$string.cart_add_to_closet_error;
                            object3 = hv3_0.K(n7);
                            ((StringBuilder)object).replace(0, n10, (String)object3);
                            ex1_02.sb(false);
                        } else {
                            n7 = ((DataCallback)object3).getStatus();
                            if (n7 == n3 && (n7 = ((DataCallback)object2).getStatus()) == n3) {
                                n7 = ((StringBuilder)object).length();
                                n8 = R$string.cart_delete_error;
                                String string3 = hv3_0.K(n8);
                                ((StringBuilder)object).replace(0, n7, string3);
                                ((AbstractCollection)stack).clear();
                                object4.clear();
                                object2 = ((DataCallback)object2).getError();
                                boolean bl6 = ex1_0.Ta((DataError)object2);
                                if (bl6) {
                                    ex1_02.eb();
                                } else {
                                    ex1_02.sb(false);
                                }
                            }
                        }
                    }
                }
                boolean bl7 = ((AbstractCollection)stack).isEmpty();
                if (bl7 || (bl3 = object4.isEmpty())) {
                    object2 = StringCompanionObject.INSTANCE;
                    int n14 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n14);
                    object3 = ((StringBuilder)object).toString();
                    object4 = new Object[n3];
                    object4[0] = object3;
                    string2 = xh2_0.a(object4, n3, (String)object2, "format(...)");
                    object = ((StringBuilder)object).toString();
                    ex1_02.kb((String)object, string2);
                }
            }
        }
        return Unit.a;
    }
}

