/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zg1
 */
public final class zg1_0
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ag1_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ zg1_0(ag1_1 ag1_12, int n3, int n4) {
        this.a = ag1_12;
        this.b = n3;
        this.c = n4;
    }

    public final void onGlobalLayout() {
        float f5;
        int n3;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((ag1_1)object).f;
        Object object3 = null;
        String string2 = "binding";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2 = object2.includeItemDetails.seekBarll;
        n3 = object2.getWidth();
        int n4 = this.b;
        f5 = n3 * n4 / 100 + -40;
        float f6 = f5 - 0.0f;
        if ((n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) >= 0) {
            int n7;
            object2 = ((ag1_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.includeItemDetails.rvpAjioAvgL;
            Object object4 = ((ag1_1)object).f;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object4 = null;
            }
            object4 = object4.includeItemDetails.seekBarll;
            n7 = object4.getWidth() * n4 / 100 + -40;
            float f7 = n7;
            object2.setX(f7);
        } else {
            object2 = ((ag1_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.includeItemDetails.rvpAjioAvgL;
            object2.setX(0.0f);
        }
        object2 = ((ag1_1)object).f;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2 = object2.includeItemDetails.seekBarll;
        n3 = object2.getWidth();
        n4 = this.c;
        f5 = n3 * n4 / 100 + -35;
        float f8 = f5 - 0.0f;
        if ((n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) >= 0) {
            object2 = ((ag1_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2 = object2.includeItemDetails.rvpYourAvgL;
            object = ((ag1_1)object).f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            object = object3.includeItemDetails.seekBarll;
            int n8 = object.getWidth() * n4 / 100 + -35;
            float f11 = n8;
            object2.setX(f11);
        } else {
            object2 = ((ag1_1)object).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = object3.includeItemDetails.rvpYourAvgL;
            object2.setX(0.0f);
        }
    }
}

