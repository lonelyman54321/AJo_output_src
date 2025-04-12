/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartBulkDelete;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from JW1
 */
public final class jw1_0
implements Function1 {
    public final /* synthetic */ ex1_0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ jw1_0(ex1_0 ex1_02, boolean bl2) {
        this.a = ex1_02;
        this.b = bl2;
    }

    public final Object invoke(Object object) {
        hv3_0 hv3_02 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            int n4;
            object3 = ((ex1_0)object2).L0;
            if (object3 != null && (object3 = ((qi2_2)object3).h) != null) {
                ((AjioLoaderView)((Object)object3)).stopLoader();
            }
            object3 = "format(...)";
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (CartBulkDelete)((DataCallback)object).getData()) != null) {
                    Object object4 = ((CartBulkDelete)object).getSuccess();
                    if (object4 != null && (n4 = (object4 = (Collection)object4).isEmpty() ^ n3) == n3) {
                        object4 = ((ex1_0)object2).L0;
                        if (object4 != null) {
                            object4.dismissAllowingStateLoss();
                        }
                        if ((n4 = (int)(this.b ? 1 : 0)) != 0) {
                            n4 = R$string.cart_x_item_removed;
                            if ((object = ((CartBulkDelete)object).getSuccess()) != null) {
                                int n7 = object.size();
                                object = n7;
                            } else {
                                boolean bl3 = false;
                                object = null;
                            }
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object;
                            object = hv3_0.L(n4, objectArray);
                            object4 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_alert_message;
                            object4 = hv3_0.K(n4);
                            objectArray = new Object[n3];
                            objectArray[0] = object;
                            String string2 = xh2_0.a(objectArray, n3, (String)object4, (String)object3);
                            hv3_0.a.getClass();
                            object3 = "message";
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            mq0_2.c((String)object, string2);
                        }
                        ((ex1_0)object2).sb(false);
                    } else {
                        object = StringCompanionObject.INSTANCE;
                        int n8 = R$string.acc_error_message_page_load_fail;
                        object = hv3_0.K(n8);
                        int n10 = R$string.something_went_wrong_text;
                        object2 = hv3_0.K(n10);
                        object4 = new Object[n3];
                        object4[0] = object2;
                        object = xh2_0.a(object4, n3, (String)object, (String)object3);
                        hv3_02 = hv3_0.a;
                        n3 = R$string.something_went_wrong_text;
                        String string3 = hv3_0.K(n3);
                        hv3_02.getClass();
                        hv3_0.l0(string3, (String)object);
                    }
                }
            } else {
                int n14 = ((DataCallback)object).getStatus();
                if (n14 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n14 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n14);
                    int n15 = R$string.something_went_wrong_text;
                    object2 = hv3_0.K(n15);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object2;
                    object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                    hv3_02 = hv3_0.a;
                    n3 = R$string.something_went_wrong_text;
                    String string4 = hv3_0.K(n3);
                    hv3_02.getClass();
                    hv3_0.l0(string4, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

