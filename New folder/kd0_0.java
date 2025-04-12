/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KD0
 */
public final class kd0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kd0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3;
                Object object4;
                object2 = (NewProductDetailsFragment)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = h40_0.a;
                object = xv$a_0.PDP;
                n3 = (int)(h40_0.S0((xv$a_0)((Object)object)) ? 1 : 0);
                if (n3 != 0 && (object4 = ((NewProductDetailsFragment)object2).w1) == null && (n3 = (int)(Intrinsics.areEqual(object4 = ((NewProductDetailsFragment)object2).o5(), object3 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
                    object4 = (BannerAdViewModel)((NewProductDetailsFragment)object2).A.getValue();
                    object3 = (UserInformation)((NewProductDetailsFragment)object2).w.getValue();
                    boolean bl2 = ((UserInformation)object3).isUserOnline();
                    if ((object2 = ((NewProductDetailsFragment)object2).Wa().f()) == null) {
                        object2 = "New";
                    }
                    ((BannerAdViewModel)object4).getAdsBannerDataMiscPages((xv$a_0)((Object)object), bl2, (String)object2);
                }
                return;
            }
            case 0: 
        }
        Object object5 = ExchangeReturnTabActivity.Companion;
        object2 = (ExchangeReturnTabActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((ExchangeReturnTabActivity)object2).s0;
        if (object != null) {
            Object object6;
            object5 = new StringBuilder();
            Object object7 = ((ExchangeReturnTabActivity)object2).q0;
            if (object7 != null && (object7 = ((CartEntry)object7).getImageInfoList()) != null) {
                boolean bl3;
                object7 = object7.iterator();
                while (bl3 = object7.hasNext()) {
                    object6 = (ImageFileInfo)object7.next();
                    if (object6 == null || (object6 = ((ImageFileInfo)object6).getImageName()) == null) {
                        object6 = "empty";
                    }
                    String string2 = "| ";
                    object6 = ((String)object6).concat(string2);
                    ((StringBuilder)object5).append((String)object6);
                }
            }
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullExpressionValue(object5, "toString(...)");
            object7 = new Bundle();
            object2 = ((ExchangeReturnTabActivity)object2).q0;
            if (object2 == null || (object2 = ((CartEntry)object2).getOrderId()) == null) {
                object2 = "";
            }
            object7.putString("order_id", (String)object2);
            object2 = Unit.a;
            object2 = "return image upload";
            object6 = "image uuids";
            ((db2_1)object).d((String)object2, (String)object6, (Bundle)object7, (String)object5);
        }
    }
}

