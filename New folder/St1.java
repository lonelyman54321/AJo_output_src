/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.media3.ui.LegacyPlayerControlView;
import com.ril.ajio.databinding.FragmentStoreLandingPageBinding;
import kotlin.jvm.internal.Intrinsics;

public final class St1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ St1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (ed3_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((ed3_2)object2).s;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    object = null;
                }
                object = ((FragmentStoreLandingPageBinding)object).fslpNewHeader;
                Intrinsics.checkNotNullExpressionValue(object, "fslpNewHeader");
                ai0_2.a((View)object);
                return;
            }
            case 1: {
                object2 = (ks2_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((ks2_1)object2).d.setSpanText();
                return;
            }
            case 0: 
        }
        ((LegacyPlayerControlView)((Object)object2)).g();
    }
}

