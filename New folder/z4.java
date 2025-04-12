/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
import android.widget.RadioGroup;
import com.ril.ajio.R$id;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

public final class z4
implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ z4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void onCheckedChanged(RadioGroup object, int n3) {
        int n4;
        String string2 = "this$0";
        AddAddressFragment addAddressFragment = this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, string2);
        addAddressFragment.G = n4 = object.getCheckedRadioButtonId();
        n3 = R$id.faaRbHome;
        int n7 = 8;
        if (n4 == n3) {
            object = addAddressFragment.E;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n7);
        } else {
            n3 = R$id.faaRbWork;
            if (n4 == n3) {
                object = addAddressFragment.E;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            } else {
                n3 = R$id.faaRbOthers;
                if (n4 == n3) {
                    object = addAddressFragment.E;
                    Intrinsics.checkNotNull(object);
                    n3 = 0;
                    string2 = null;
                    object.setVisibility(0);
                }
            }
        }
    }
}

