/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qM
 */
public final class qm_2
implements Function0 {
    public final /* synthetic */ CartAddressListBottomSheet a;

    public /* synthetic */ qm_2(CartAddressListBottomSheet cartAddressListBottomSheet) {
        this.a = cartAddressListBottomSheet;
    }

    public final Object invoke() {
        CartAddressListBottomSheet cartAddressListBottomSheet = this.a;
        Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
        return UserInformation.getInstance((Context)cartAddressListBottomSheet.requireActivity().getApplication());
    }
}

