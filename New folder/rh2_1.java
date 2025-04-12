/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.ui.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rh2
 */
public final class rh2_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rh2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                mu2 mu22 = (mu2)this.b;
                mu22.g();
                int n4 = view.getId();
                int n7 = R$id.exo_overflow_show;
                if (n4 == n7) {
                    view = mu22.q;
                    view.start();
                } else {
                    int n8 = view.getId();
                    if (n8 == (n4 = R$id.exo_overflow_hide)) {
                        view = mu22.r;
                        view.start();
                    }
                }
                return;
            }
            case 0: 
        }
        sh2_2 sh2_22 = (sh2_2)this.b;
        Intrinsics.checkNotNullParameter(sh2_22, "this$0");
        sh2_22.c.a1();
    }
}

