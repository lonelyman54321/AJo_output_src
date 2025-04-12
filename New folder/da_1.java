/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dA
 */
public final class da_1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ia_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ da_1(ia_1 ia_12, int n3, int n4) {
        this.a = ia_12;
        this.b = n3;
        this.c = n4;
    }

    public final void onGlobalLayout() {
        float f5;
        int n3;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((ia_1)object).f;
        Object object3 = null;
        String string2 = "binding";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2 = object2.rvpSeekBarLayoutView.seekBarll;
        n3 = object2.getWidth();
        int n4 = this.b;
        f5 = n3 * n4 / 100 + -40;
        float f6 = f5 - 0.0f;
        if ((n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) >= 0) {
            int n7;
            object2 = ((ia_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.rvpSeekBarLayoutView.rvpAjioAvgL;
            Object object4 = ((ia_1)object).f;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object4 = null;
            }
            object4 = object4.rvpSeekBarLayoutView.seekBarll;
            n7 = object4.getWidth() * n4 / 100 + -40;
            float f7 = n7;
            object2.setX(f7);
        } else {
            object2 = ((ia_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.rvpSeekBarLayoutView.rvpAjioAvgL;
            object2.setX(0.0f);
        }
        object2 = ((ia_1)object).f;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2 = object2.rvpSeekBarLayoutView.seekBarll;
        n3 = object2.getWidth();
        n4 = this.c;
        f5 = n3 * n4 / 100 + -35;
        float f8 = f5 - 0.0f;
        if ((n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) >= 0) {
            object2 = ((ia_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.rvpSeekBarLayoutView.rvpYourAvgL;
            object = ((ia_1)object).f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            object = object3.rvpSeekBarLayoutView.seekBarll;
            int n8 = object.getWidth() * n4 / 100 + -35;
            float f11 = n8;
            object2.setX(f11);
        } else {
            object2 = ((ia_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = object3.rvpSeekBarLayoutView.rvpYourAvgL;
            object2.setX(0.0f);
        }
    }
}

