/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class cV
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cV(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                UF1 uF1 = (UF1)this.b;
                Intrinsics.checkNotNullParameter(uF1, "this$0");
                uF1.f.A3();
                return;
            }
            case 0: 
        }
        object = (fv_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.a.S7();
    }
}

