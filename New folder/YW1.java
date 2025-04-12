/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel$Gift;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class YW1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ YW1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            int n4 = 1;
            int n7 = 0;
            if (n3 == 0) {
                object2 = (CartAssuredGiftModel)((DataCallback)object).getData();
                if (object2 != null && (object2 = ((CartAssuredGiftModel)object2).getGifts()) != null) {
                    object2 = ex1_02.v;
                    List list = null;
                    if (object2 != null) {
                        boolean bl2 = ex1_02.Nb();
                        object2 = ((ko_2)object2).a(bl2);
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    ex1_02.Bb((ArrayList)object2);
                    object2 = (CartAssuredGiftModel)((DataCallback)object).getData();
                    if (object2 != null) {
                        n3 = (int)(((CartAssuredGiftModel)object2).getHasGift() ? 1 : 0);
                        object2 = n3 != 0;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    pa_1.a = n3 = ((Boolean)object2).booleanValue();
                    ex1_02.O = n4;
                    if (n3 != 0) {
                        Object object3;
                        if ((object = (CartAssuredGiftModel)((DataCallback)object).getData()) != null) {
                            list = ((CartAssuredGiftModel)object).getGifts();
                        }
                        object = "";
                        if (list != null) {
                            n3 = list.size();
                            while (n7 < n3) {
                                object3 = (CartAssuredGiftModel$Gift)list.get(n7);
                                n4 = (int)(((CartAssuredGiftModel$Gift)object3).getHasGift() ? 1 : 0);
                                if (n4 != 0) {
                                    object = ((CartAssuredGiftModel$Gift)list.get(n7)).getGiftValueText();
                                    break;
                                }
                                ++n7;
                            }
                        }
                        object2 = "You\u2019re Getting Free Gifts ";
                        object3 = "!";
                        object = cP.a((String)object2, (String)object, (String)object3);
                    } else {
                        object = "Get Free Gifts with this order";
                    }
                    object2 = ex1_02.M;
                    if (object2 != null) {
                        object2.setText((CharSequence)object);
                    }
                    if ((object = ex1_02.L) != null) {
                        ai0_2.B((View)object);
                    }
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n4) {
                    ex1_02.O = false;
                }
            }
        }
        return Unit.a;
    }
}

