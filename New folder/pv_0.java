/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pv
 */
public final class pv_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.b((NativeAdViewRenderer)this.b, view);
                return;
            }
            case 0: 
        }
        qv_1 qv_12 = (qv_1)this.b;
        Intrinsics.checkNotNullParameter(qv_12, "this$0");
        qv_12.dismiss();
    }
}

