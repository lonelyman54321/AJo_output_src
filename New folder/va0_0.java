/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VA0
 */
public final class va0_0
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;

    public /* synthetic */ va0_0(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void run() {
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        View view = this.a;
        if (view != null) {
            view.setContentDescription((CharSequence)string2);
        }
        if (view != null) {
            ai0_2.a(view);
        }
    }
}

