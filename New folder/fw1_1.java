/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartBulkMoveToWishList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from fW1
 */
public final class fw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ fw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (bl2) {
            int n4;
            object4 = ((ex1_0)object3).L0;
            if (object4 != null && (object4 = ((qi2_2)object4).h) != null) {
                ((AjioLoaderView)((Object)object4)).stopLoader();
            }
            object4 = "format(...)";
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (CartBulkMoveToWishList)((DataCallback)object).getData()) != null) {
                    Object object5 = ((CartBulkMoveToWishList)object).getSuccessOptionsCode();
                    if (object5 != null && (n4 = (object5 = (Collection)object5).isEmpty() ^ n3) == n3) {
                        int n7;
                        boolean bl3;
                        object5 = ((CartBulkMoveToWishList)object).getSuccessOptionsCode();
                        Intrinsics.checkNotNullParameter(object5, "successOptionsCode");
                        CharSequence charSequence = new StringBuilder();
                        object5 = object5.iterator();
                        while (bl3 = object5.hasNext()) {
                            String string2 = (String)object5.next();
                            int n8 = ((StringBuilder)charSequence).length();
                            if (n8 > 0) {
                                n8 = 44;
                                ((StringBuilder)charSequence).append((char)n8);
                            }
                            ((StringBuilder)charSequence).append(string2);
                        }
                        object5 = ((StringBuilder)charSequence).toString();
                        charSequence = "toString(...)";
                        Intrinsics.checkNotNullExpressionValue(object5, (String)charSequence);
                        ((ex1_0)object3).Qa((String)object5, false);
                        object3 = ((CartBulkMoveToWishList)object).getMessage();
                        if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_alert_message;
                            object3 = hv3_0.K(n7);
                            object5 = ((CartBulkMoveToWishList)object).getMessage();
                            charSequence = new Object[n3];
                            charSequence[0] = object5;
                            object2 = xh2_0.a((Object[])charSequence, n3, (String)object3, (String)object4);
                            hv3_0 hv3_02 = hv3_0.a;
                            object = ((CartBulkMoveToWishList)object).getMessage();
                            hv3_02.getClass();
                            hv3_0.l0((String)object, (String)object2);
                        } else {
                            n7 = R$string.cart_x_item_wishlist;
                            if ((object = ((CartBulkMoveToWishList)object).getSuccessOptionsCode()) != null) {
                                int n10 = object.size();
                                object = n10;
                            } else {
                                boolean bl4 = false;
                                object = null;
                            }
                            object5 = new Object[n3];
                            object5[0] = object;
                            object = hv3_0.L(n7, object5);
                            object3 = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_alert_message;
                            object3 = hv3_0.K(n7);
                            object5 = new Object[n3];
                            object5[0] = object;
                            object2 = xh2_0.a(object5, n3, (String)object3, (String)object4);
                            hv3_0.a.getClass();
                            String string3 = "message";
                            Intrinsics.checkNotNullParameter(object, string3);
                            mq0_2.c((String)object, (String)object2);
                        }
                    } else {
                        object = StringCompanionObject.INSTANCE;
                        int n14 = R$string.acc_error_message_page_load_fail;
                        object = hv3_0.K(n14);
                        int n15 = R$string.something_went_wrong_text;
                        object3 = hv3_0.K(n15);
                        object5 = new Object[n3];
                        object5[0] = object3;
                        object = xh2_0.a(object5, n3, (String)object, (String)object4);
                        object2 = hv3_0.a;
                        n3 = R$string.something_went_wrong_text;
                        String string4 = hv3_0.K(n3);
                        object2.getClass();
                        hv3_0.l0(string4, (String)object);
                    }
                }
            } else {
                int n16 = ((DataCallback)object).getStatus();
                if (n16 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n16);
                    int n17 = R$string.something_went_wrong_text;
                    object3 = hv3_0.K(n17);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n3, (String)object, (String)object4);
                    object2 = hv3_0.a;
                    n3 = R$string.something_went_wrong_text;
                    String string5 = hv3_0.K(n3);
                    object2.getClass();
                    hv3_0.l0(string5, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

