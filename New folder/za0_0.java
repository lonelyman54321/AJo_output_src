/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZA0
 */
public final class za0_0
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;

    public /* synthetic */ za0_0(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void run() {
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$snackbarView");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        view.setContentDescription((CharSequence)string2);
        ai0_2.a(view);
    }
}

