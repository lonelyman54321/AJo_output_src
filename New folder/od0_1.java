/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartEntry;

/*
 * Renamed from oD0
 */
public final class od0_1
implements View.OnClickListener {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ pd0_1 b;

    public od0_1(pd0_1 pd0_12, CartEntry cartEntry) {
        this.b = pd0_12;
        this.a = cartEntry;
    }

    public final void onClick(View object) {
        object = this.b.a;
        CartEntry cartEntry = this.a;
        object.S4(cartEntry);
    }
}

