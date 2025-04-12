/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

public final class o4
implements Runnable {
    public final /* synthetic */ AddAddressFragment a;
    public final /* synthetic */ String b;

    public /* synthetic */ o4(AddAddressFragment addAddressFragment, String string2) {
        this.a = addAddressFragment;
        this.b = string2;
    }

    public final void run() {
        AddAddressFragment addAddressFragment = this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, "this$0");
        TextView textView = addAddressFragment.j;
        if (textView != null) {
            String string2 = this.b;
            textView.setContentDescription((CharSequence)string2);
        }
        if ((addAddressFragment = addAddressFragment.j) != null) {
            ai0_2.a((View)addAddressFragment);
        }
    }
}

