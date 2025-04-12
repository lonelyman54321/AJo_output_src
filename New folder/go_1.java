/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GO
 */
public final class go_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ go_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, "this$0");
                s7.e();
                return;
            }
            case 0: 
        }
        ho_2 ho_22 = (ho_2)this.b;
        Intrinsics.checkNotNullParameter(ho_22, "this$0");
        ho_22.a.s2(11);
    }
}

