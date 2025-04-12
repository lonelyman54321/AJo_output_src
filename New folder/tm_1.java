/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tM
 */
public final class tm_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.d((NativeAdViewRenderer)this.b, (View)object);
                return;
            }
            case 1: {
                oy1_1 oy1_12 = (oy1_1)this.b;
                Intrinsics.checkNotNullParameter(oy1_12, "this$0");
                object = oy1_12.getActivity();
                if (object != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
                return;
            }
            case 0: 
        }
        CartAddressListBottomSheet cartAddressListBottomSheet = (CartAddressListBottomSheet)this.b;
        Intrinsics.checkNotNullParameter(cartAddressListBottomSheet, "this$0");
        cartAddressListBottomSheet.dismissAllowingStateLoss();
    }
}

