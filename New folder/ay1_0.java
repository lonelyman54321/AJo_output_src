/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aY1
 */
public final class ay1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ay1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.g((NativeAdViewRenderer)this.b, view);
                return;
            }
            case 1: {
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog)this.b;
                Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
                bottomSheetDialog.dismiss();
                return;
            }
            case 0: 
        }
        oy1_1 oy1_12 = (oy1_1)this.b;
        Intrinsics.checkNotNullParameter(oy1_12, "this$0");
        oy1_12.onNavigationClick();
    }
}

