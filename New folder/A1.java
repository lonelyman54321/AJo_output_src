/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.strictmode.Violation;
import com.facebook.b;
import com.jio.jioads.interstitial.x;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import kotlin.jvm.internal.Intrinsics;

public final class A1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public /* synthetic */ A1(String string2, Violation violation) {
        this.a = 1;
        this.b = violation;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                x x5 = (x)this.b;
                Intrinsics.checkNotNullParameter(x5, "this$0");
                x5.d = true;
                return;
            }
            case 2: {
                tj3_2 tj3_22 = (tj3_2)this.b;
                Intrinsics.checkNotNullParameter(tj3_22, "this$0");
                DynamicCirclePageIndicator dynamicCirclePageIndicator = tj3_22.e;
                if (dynamicCirclePageIndicator != null) {
                    tj3_22 = null;
                    dynamicCirclePageIndicator.setVisibility(0);
                }
                return;
            }
            case 1: {
                Violation violation = (Violation)this.b;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                throw violation;
            }
            case 0: 
        }
        b b2 = (b)this.b;
        Intrinsics.checkNotNullParameter(b2, "this$0");
        b2.a();
    }
}

