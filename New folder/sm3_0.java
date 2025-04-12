/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$color;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sm3
 */
public class sm3_0
extends Fragment {
    public boolean a;

    public final void Oa(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "storeId");
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        this.a = bl2 = Intrinsics.areEqual(string2, string3);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2 = this.a;
        String string2 = "onGetLayoutInflater(...)";
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, string2);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            d80 d802 = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)d802);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, string2);
        return bundle;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && (fragmentActivity = fragmentActivity.getWindow()) != null) {
            fragmentActivity.getStatusBarColor();
        }
        if ((fragmentActivity = this.getActivity()) != null) {
            int n3 = this.a;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(fragmentActivity, string2);
            n3 = n3 != 0 ? R$color.fleekColorPrimary : R$color.ajioColorPrimary;
            n3 = t70.getColor((Context)fragmentActivity, n3);
            string2 = fragmentActivity.getWindow();
            if (string2 != null) {
                string2.setStatusBarColor(n3);
            }
            n3 = (int)(tm3_0.c(n3) ? 1 : 0);
            tm3_0.f(fragmentActivity, n3 != 0);
        }
    }

    public void onStop() {
        super.onStop();
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            String string2;
            int n3 = this.a;
            Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
            Object object = h40_0.a;
            boolean bl2 = h40_0.c();
            if (bl2 && (bl2 = Intrinsics.areEqual(object = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
                n3 = 1;
            }
            n3 = n3 != 0 ? R$color.fleekColorPrimary : R$color.ajioColorPrimary;
            n3 = t70.getColor((Context)fragmentActivity, n3);
            object = fragmentActivity.getWindow();
            if (object != null) {
                object.setStatusBarColor(n3);
            }
            n3 = (int)(tm3_0.c(n3) ? 1 : 0);
            tm3_0.f(fragmentActivity, n3 != 0);
        }
    }
}

