/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class Oy1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Oy1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.k((NativeAdViewRenderer)this.b, object);
                return;
            }
            case 0: 
        }
        object = (AjioTextView)this.b;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        uy1_0.e("click here");
        cp$a cp$a = cp_1.Companion;
        object = object.getContext();
        cp$a.getClass();
        cp$a.C((Context)object, "common_login_signup_screen");
    }
}

