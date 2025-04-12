/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aD0
 */
public final class ad0_1
implements View.OnClickListener {
    public final /* synthetic */ gD0$a a;

    public /* synthetic */ ad0_1(gD0$a gD0$a) {
        this.a = gD0$a;
    }

    public final void onClick(View view) {
        gD0$a gD0$a = this.a;
        Intrinsics.checkNotNullParameter(gD0$a, "$this_apply");
        view = gD0$a.d;
        if (view != null) {
            view.performClick();
        }
    }
}

