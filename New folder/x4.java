/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class x4
implements Function0 {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ x4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final Object invoke() {
        AddAddressFragment addAddressFragment = this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, "this$0");
        return UserInformation.getInstance(addAddressFragment.requireContext().getApplicationContext());
    }
}

