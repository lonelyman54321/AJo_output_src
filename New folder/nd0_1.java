/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;

/*
 * Renamed from nD0
 */
public final class nd0_1
implements View.OnClickListener {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ pd0_1 c;

    public nd0_1(pd0_1 pd0_12, CartEntry cartEntry, CartEntry cartEntry2, int n3) {
        this.c = pd0_12;
        this.a = cartEntry;
        this.b = cartEntry2;
    }

    public final void onClick(View object) {
        this.a.setReturnClicked(true);
        object = this.c;
        r72_0 r72_02 = object.a;
        CartEntry cartEntry = this.b;
        r72_02.h1(cartEntry, 0);
        NewCustomEventsRevamp newCustomEventsRevamp = object.i;
        String string2 = object.k;
        String string3 = object.j;
        newCustomEventsRevamp.newPushCustomEvent("buttonTap", "return or exchange mode selection interaction", "return", "buttonTap", "return or exchange mode selection screen", string2, string3, null, string2);
    }
}

