/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SQ2
 */
public final class sq2_2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ RQ2$b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ sq2_2(RQ2$b b2, int n3, int n4) {
        this.a = b2;
        this.b = n3;
        this.c = n4;
    }

    public final void onGlobalLayout() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = object.d;
        int n3 = object2.getWidth();
        int n4 = this.b;
        float f5 = n3 * n4 / 100 + -40;
        AjioImageView ajioImageView = object.d;
        ConstraintLayout constraintLayout = object.b;
        float f6 = f5 - 0.0f;
        n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
        if (n3 >= 0) {
            n3 = ajioImageView.getWidth() * n4 / 100 + -40;
            f5 = n3;
            constraintLayout.setX(f5);
        } else {
            constraintLayout.setX(0.0f);
        }
        object2 = h40_0.a;
        n3 = (int)(h40_0.k2() ? 1 : 0);
        if (n3 != 0) {
            object2 = "ajioAvgLayout";
            if (n4 <= 0) {
                Intrinsics.checkNotNullExpressionValue((Object)constraintLayout, (String)object2);
                ai0_2.i((View)constraintLayout);
            } else {
                Intrinsics.checkNotNullExpressionValue((Object)constraintLayout, (String)object2);
                ai0_2.B((View)constraintLayout);
            }
        }
        n3 = ajioImageView.getWidth();
        n4 = this.c;
        f5 = n3 * n4 / 100 + -35;
        object = object.c;
        float f7 = f5 - 0.0f;
        n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n3 >= 0) {
            n3 = ajioImageView.getWidth() * n4 / 100 + -35;
            f5 = n3;
            object.setX(f5);
        } else {
            object.setX(0.0f);
        }
    }
}

