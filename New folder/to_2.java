/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TO
 */
public final class to_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                View view = (View)this.b;
                Intrinsics.checkNotNullParameter(view, "$view");
                n3 = R$id.delete_img;
                return (ImageView)view.findViewById(n3);
            }
            case 1: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onCloseSheetButtonClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        wo_0 wo_02 = (wo_0)this.b;
        Intrinsics.checkNotNullParameter(wo_02, "this$0");
        wo_02.b.k4("know why");
        return Unit.a;
    }
}

