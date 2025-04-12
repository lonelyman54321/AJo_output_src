/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
import android.view.View;
import android.view.WindowInsets;
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from pn1
 */
public final class pn1_2
implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ JuspayServices a;

    public /* synthetic */ pn1_2(JuspayServices juspayServices) {
        this.a = juspayServices;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return JuspayServices.m(this.a, view, windowInsets);
    }
}

