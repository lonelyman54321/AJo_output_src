/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from bz1
 */
public final class bz1_1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ fz1_2 c;

    public /* synthetic */ bz1_1(ViewTreeObserver viewTreeObserver, Ref$ObjectRef ref$ObjectRef, fz1_2 fz1_22) {
        this.a = viewTreeObserver;
        this.b = ref$ObjectRef;
        this.c = fz1_22;
    }

    public final void onGlobalLayout() {
        int n3;
        boolean bl2;
        Object object = fz1_2.Companion;
        Ref$ObjectRef ref$ObjectRef = this.b;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$globalLayoutListener");
        fz1_2 fz1_22 = this.c;
        Intrinsics.checkNotNullParameter(fz1_22, "this$0");
        object = this.a;
        if (object != null && (bl2 = object.isAlive())) {
            ref$ObjectRef = (ViewTreeObserver.OnGlobalLayoutListener)ref$ObjectRef.element;
            object.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)ref$ObjectRef);
        }
        object = new Rect();
        ref$ObjectRef = fz1_22.getView();
        if (ref$ObjectRef != null) {
            ref$ObjectRef.getWindowVisibleDisplayFrame((Rect)object);
        }
        ref$ObjectRef = fz1_22.getView();
        bl2 = false;
        if (ref$ObjectRef != null && (ref$ObjectRef = ref$ObjectRef.getRootView()) != null) {
            n3 = ref$ObjectRef.getHeight();
        } else {
            n3 = 0;
            ref$ObjectRef = null;
        }
        int n4 = ((Rect)object).bottom;
        n4 = n3 - n4;
        double d2 = n4;
        double d5 = n3;
        double d7 = 0.15;
        double d9 = d2 - (d5 *= d7);
        double d12 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (d12 > 0) {
            object = fz1_22.Qa().loginTermsConditionsTv;
            n3 = 8;
            object.setVisibility(n3);
            fz1_22.Qa().loginFbIv.setVisibility(n3);
            fz1_22.Qa().loginGoogleIv.setVisibility(n3);
            fz1_22.Qa().loginOrView.setVisibility(n3);
            fz1_22.Qa().dividerStart.setVisibility(n3);
            object = fz1_22.Qa().dividerEnd;
            object.setVisibility(n3);
        } else {
            object = fz1_22.Qa().loginTermsConditionsTv;
            object.setVisibility(0);
            fz1_22.Ra();
        }
    }
}

