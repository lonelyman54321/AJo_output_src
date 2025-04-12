/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kh0
 */
public final class kh0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        String string2 = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.c((NativeAdViewRenderer)object2, object);
                return;
            }
            case 2: {
                object = pm2_2.Companion;
                object2 = (pm2_2)object2;
                Intrinsics.checkNotNullParameter(object2, string2);
                ((BottomSheetDialogFragment)object2).dismiss();
                pm2_2.Pa("Okay");
                return;
            }
            case 1: {
                object2 = (oy1_1)object2;
                Intrinsics.checkNotNullParameter(object2, string2);
                ((oy1_1)object2).hb();
                return;
            }
            case 0: 
        }
        object2 = (lh0_2)object2;
        Intrinsics.checkNotNullParameter(object2, string2);
        ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
    }
}

