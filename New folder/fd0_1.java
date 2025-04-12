/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FD0
 */
public final class fd0_1
implements Function0 {
    public final /* synthetic */ gd0_1 a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ int c;

    public /* synthetic */ fd0_1(gd0_1 gd0_12, CartEntry cartEntry, int n3) {
        this.a = gd0_12;
        this.b = cartEntry;
        this.c = n3;
    }

    public final Object invoke() {
        gd0_1 gd0_12 = this.a;
        Intrinsics.checkNotNullParameter(gd0_12, "this$0");
        CartEntry cartEntry = this.b;
        Intrinsics.checkNotNullParameter(cartEntry, "$cartEntryParent");
        AjioCircularImageView ajioCircularImageView = gd0_12.l;
        int n3 = this.c;
        gd0_12.w(cartEntry, (View)ajioCircularImageView, n3);
        return Unit.a;
    }
}

