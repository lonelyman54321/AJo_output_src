/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vb2
 */
public final class vb2_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                View view = (View)this.b;
                Intrinsics.checkNotNullParameter(view, "$view");
                n3 = R$id.review_add_image_root;
                return (RelativeLayout)view.findViewById(n3);
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

