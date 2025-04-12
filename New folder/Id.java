/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class Id
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Id(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ex1_0 ex1_02 = (ex1_0)this.b;
                Intrinsics.checkNotNullParameter(ex1_02, "this$0");
                ex1_02.onNavigationClick();
                return;
            }
            case 0: 
        }
        Kd$a kd$a = (Kd$a)this.b;
        Intrinsics.checkNotNullParameter(kd$a, "this$0");
        kd$a.a.X7();
    }
}

