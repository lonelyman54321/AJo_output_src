/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pM
 */
public final class pm_2
implements Function0 {
    public final /* synthetic */ CartAddressListBottomSheet a;

    public /* synthetic */ pm_2(CartAddressListBottomSheet cartAddressListBottomSheet) {
        this.a = cartAddressListBottomSheet;
    }

    public final Object invoke() {
        CartAddressListBottomSheet cartAddressListBottomSheet = this.a;
        Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
        Application application = cartAddressListBottomSheet.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        cartAddressListBottomSheet = cartAddressListBottomSheet.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(cartAddressListBottomSheet, string2);
        UserRepo userRepo = new UserRepo((Application)cartAddressListBottomSheet);
        hy3_0 hy3_02 = new hy3_0(application, userRepo);
        return hy3_02;
    }
}

