/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 */
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.PageType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IJ0
 */
public final class ij0_2
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ CartDeliveryAddress b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ ij0_2(Activity activity, CartDeliveryAddress cartDeliveryAddress, dr0_0 dr0_02) {
        this.a = activity;
        this.b = cartDeliveryAddress;
        this.c = dr0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        object = (View)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$activity");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        GK0$h gK0$h = new GK0$h((dr0_0)object3, (Activity)object2);
        AddressWidgetView addressWidgetView = new AddressWidgetView((Context)object2, (View)object, gK0$h);
        object = this.b;
        gK0$h = null;
        object2 = object != null ? ((CartDeliveryAddress)object).getCompleteAddress() : null;
        object3 = object != null ? ((CartDeliveryAddress)object).getDistrict() : null;
        String string2 = ", ";
        String string3 = n1.a((String)object2, string2, (String)object3);
        if (object == null || (object2 = ((CartDeliveryAddress)object).getAddressType()) == null) {
            object2 = AddressType.None;
        }
        string2 = object2;
        object2 = ld3_2.STORE_AJIOGRAM;
        String string4 = ((ld3_2)((Object)object2)).getStoreId();
        Object object4 = object != null ? (object2 = ((CartDeliveryAddress)object).getFirstName()) : null;
        Object object5 = object != null ? (object = ((CartDeliveryAddress)object).getPostalCode()) : null;
        PageType pageType = PageType.HOME;
        addressWidgetView.setData((AddressType)((Object)string2), string3, string4, (String)object4, (String)object5, "feed screen", pageType);
        return Unit.a;
    }
}

