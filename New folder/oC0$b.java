/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class oC0$b
extends i {
    public final /* synthetic */ oc0_2 j;

    public oC0$b(oc0_2 oc0_22, FragmentManager fragmentManager) {
        this.j = oc0_22;
        Intrinsics.checkNotNull(fragmentManager);
        super(fragmentManager, 0);
    }

    public final int c() {
        return 2;
    }

    public final CharSequence e(int n3) {
        String string2;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                string2 = "";
            } else {
                n3 = R$string.store_return;
                string2 = hv3_0.K(n3);
            }
        } else {
            n3 = R$string.home_pickup;
            string2 = hv3_0.K(n3);
        }
        return string2;
    }

    public final Fragment n(int n3) {
        Fragment fragment;
        Object object = this.j;
        object.getClass();
        if (n3 == 0) {
            fragment = ((oc0_2)object).f;
            if (fragment == null) {
                String string2;
                ((oc0_2)object).f = fragment = new dc0_1();
                fragment = ((Fragment)object).getArguments();
                if (fragment != null) {
                    string2 = "ui_changes_for_tab_address";
                    boolean bl2 = true;
                    fragment.putBoolean(string2, bl2);
                }
                fragment = ((oc0_2)object).f;
                Intrinsics.checkNotNull(fragment);
                string2 = ((Fragment)object).getArguments();
                fragment.setArguments((Bundle)string2);
            }
            fragment = ((oc0_2)object).f;
            object = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.fragment.ExReturnAddressFragmentRevamp";
            Intrinsics.checkNotNull(fragment, (String)object);
            fragment = (dc0_1)fragment;
        } else {
            fragment = ((oc0_2)object).g;
            if (fragment == null) {
                fragment = new jc0_1((jC0$b)object);
                ((oc0_2)object).g = fragment;
            }
            fragment = ((oc0_2)object).g;
            object = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.fragment.ExReturnStoreAddressFragment";
            Intrinsics.checkNotNull(fragment, (String)object);
        }
        return fragment;
    }
}

