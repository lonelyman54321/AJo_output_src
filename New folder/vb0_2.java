/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VB0
 */
public final class vb0_2
implements F62 {
    public final /* synthetic */ ExReturnAddressActivity a;

    public /* synthetic */ vb0_2(ExReturnAddressActivity exReturnAddressActivity) {
        this.a = exReturnAddressActivity;
    }

    public final void onChanged(Object object) {
        object = (Boolean)object;
        ExReturnAddressActivity exReturnAddressActivity = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(exReturnAddressActivity, (String)object2);
        if (object != null) {
            boolean bl2 = (Boolean)object;
            object2 = null;
            String string2 = "toolbar";
            if (bl2) {
                object = exReturnAddressActivity.v0;
                if (object != null) {
                    object2 = object;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                ai0_2.i((View)object2);
            } else {
                object = exReturnAddressActivity.v0;
                if (object != null) {
                    object2 = object;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                ai0_2.B((View)object2);
            }
        }
    }
}

