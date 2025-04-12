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
 * Renamed from yO
 */
public final class yo_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = "this$0";
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, (String)object);
                n3 = (int)(s7.W ? 1 : 0);
                if (n3 != 0) {
                    n3 = 0;
                    object = null;
                    s7.M(false);
                }
                return;
            }
            case 0: 
        }
        fo_1 fo_12 = (fo_1)this.b;
        Intrinsics.checkNotNullParameter(fo_12, "this$0");
        fo_12.dismissAllowingStateLoss();
    }
}

