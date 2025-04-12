/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnScrollChangeListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class sZ1
implements View.OnScrollChangeListener {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ sZ1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final void onScrollChange(View object, int n3, int n4, int n7, int n8) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((bz1_2)object).Ta(n4);
    }
}

