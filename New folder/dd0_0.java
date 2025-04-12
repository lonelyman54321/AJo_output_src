/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DD0
 */
public final class dd0_0
implements View.OnClickListener {
    public final /* synthetic */ gd0_1 a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ int c;

    public /* synthetic */ dd0_0(gd0_1 gd0_12, CartEntry cartEntry, int n3) {
        this.a = gd0_12;
        this.b = cartEntry;
        this.c = n3;
    }

    public final void onClick(View object) {
        gd0_1 gd0_12 = this.a;
        Intrinsics.checkNotNullParameter(gd0_12, "this$0");
        CartEntry cartEntry = this.b;
        Intrinsics.checkNotNullParameter(cartEntry, "$cartEntryParent");
        object = gd0_12.l;
        int n3 = this.c;
        gd0_12.w(cartEntry, (View)object, n3);
    }
}

