/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.ChangeLocationListener;
import kotlin.jvm.internal.Intrinsics;

public final class GK0$h
implements ChangeLocationListener {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Activity b;

    public GK0$h(dr0_0 dr0_02, Activity activity) {
        this.a = dr0_02;
        this.b = activity;
    }

    public final void loadCartBasedOnSelectedAddress(String string2, String string3) {
        this.a.getClass();
        Activity activity = this.b;
        Intrinsics.checkNotNullParameter(activity, "activity");
        dr0_0.w(activity).loadCartBasedOnSelectedAddress(string2, string3);
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.a.getClass();
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "activity");
        object = dr0_0.w((Activity)object);
        object.getClass();
        ((fq0_2)object).G = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        String string2 = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(object, string2);
        cartAddressListBottomSheet.u = object;
        cartAddressListBottomSheet = ((fq0_2)object).G;
        if (cartAddressListBottomSheet != null) {
            object = ((Fragment)object).requireActivity().getSupportFragmentManager();
            string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }
}

