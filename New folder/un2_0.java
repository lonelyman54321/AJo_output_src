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
 * Renamed from UN2
 */
public final class un2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ un2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                g43_0 g43_02 = (g43_0)this.b;
                Intrinsics.checkNotNullParameter(g43_02, "this$0");
                g43_02.dismiss();
                return;
            }
            case 0: 
        }
        vn2_1 vn2_12 = (vn2_1)this.b;
        Intrinsics.checkNotNullParameter(vn2_12, "this$0");
        object = vn2_12.a;
        if (object != null) {
            object.z3();
        }
    }
}

