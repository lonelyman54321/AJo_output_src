/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oM
 */
public final class om_2
implements OnFailureListener,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ om_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onFailure(Exception exception) {
        CartAddressListBottomSheet cartAddressListBottomSheet = (CartAddressListBottomSheet)this.a;
        Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
        Intrinsics.checkNotNullParameter(exception, "it");
        Toast.makeText((Context)cartAddressListBottomSheet.requireContext(), (CharSequence)"Failed to get location", (int)0).show();
    }
}

