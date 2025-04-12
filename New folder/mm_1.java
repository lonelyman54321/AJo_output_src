/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 */
import android.content.Intent;
import android.net.Uri;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mM
 */
public final class mm_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mm_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.i((NativeAdViewRenderer)this.b);
                return;
            }
            case 0: 
        }
        CartAddressListBottomSheet cartAddressListBottomSheet = (CartAddressListBottomSheet)this.b;
        Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
        cartAddressListBottomSheet.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        String string2 = cartAddressListBottomSheet.requireActivity().getPackageName();
        string2 = Uri.fromParts((String)"package", (String)string2, null);
        intent.setData((Uri)string2);
        cartAddressListBottomSheet.startActivity(intent);
    }
}

