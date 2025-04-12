/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class t43
implements E2 {
    public final /* synthetic */ SideSheetBehavior a;
    public final /* synthetic */ int b;

    public /* synthetic */ t43(SideSheetBehavior sideSheetBehavior, int n3) {
        this.a = sideSheetBehavior;
        this.b = n3;
    }

    public final boolean perform(View view, E2$a e2$a) {
        SideSheetBehavior sideSheetBehavior = this.a;
        int n3 = this.b;
        return SideSheetBehavior.a(sideSheetBehavior, n3, view, e2$a);
    }
}

