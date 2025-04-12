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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rm3
 */
public class rm3_0
extends BottomSheetDialogFragment {
    public boolean a;

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
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
}

