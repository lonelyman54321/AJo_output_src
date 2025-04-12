/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Y7
 */
public final class y7_0
implements sh2_0 {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ AjioHomeActivity b;
    public final /* synthetic */ CartAddressListBottomSheet c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public y7_0(q9_0 q9_02, AjioHomeActivity ajioHomeActivity, CartAddressListBottomSheet cartAddressListBottomSheet, String string2, String string3) {
        this.a = q9_02;
        this.b = ajioHomeActivity;
        this.c = cartAddressListBottomSheet;
        this.d = string2;
        this.e = string3;
    }

    public final void a() {
        az0_2 az0_22;
        boolean bl2;
        Object object;
        Fragment fragment = (q9_0)this.a;
        fragment.getClass();
        boolean bl3 = hv3_0.U();
        if (bl3) {
            object = ((q9_0)fragment).X;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                bl3 = false;
                object = null;
            }
            object.getClass();
        }
        if ((object = this.b.S0) != null) {
            bl2 = false;
            az0_22 = null;
            ((gj2_1)object).a = false;
        }
        AJIOApplication.Companion.getClass();
        az0_22 = AJIOApplication$a.a();
        object = new jo_2((Context)az0_22);
        bl2 = true;
        ((jo_2)object).A(bl2);
        object = ((q9_0)fragment).w0;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((object = ((q9_0)fragment).v0) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
        if ((fragment = ((q9_0)fragment).x0) != null) {
            ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
        }
        if ((fragment = this.c) != null) {
            ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
        }
        object = kj0_1.g();
        az0_22 = this.b;
        String string2 = this.d;
        String string3 = this.e;
        ((kj0_1)object).u((Activity)az0_22, string2, string3, string2, null);
    }
}

