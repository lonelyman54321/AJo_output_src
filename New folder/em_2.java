/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.NestedScrollView;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eM
 */
public final class em_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ em_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.d((NativeAdViewRenderer)this.b);
                return;
            }
            case 0: 
        }
        Object object = (lm_2)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((lm_2)object).i;
        Intrinsics.checkNotNull(object);
        int n4 = object.getScrollX();
        n4 = 0 - n4;
        int n7 = object.getScrollY();
        n7 = 0 - n7;
        ((NestedScrollView)object).p(n4, n7, false);
    }
}

