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
 * Renamed from sD0
 */
public final class sd0_0
implements View.OnClickListener {
    public final /* synthetic */ td0_1 a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ CartEntry c;

    public /* synthetic */ sd0_0(td0_1 td0_12, CartEntry cartEntry, CartEntry cartEntry2) {
        this.a = td0_12;
        this.b = cartEntry;
        this.c = cartEntry2;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CartEntry cartEntry = this.b;
        Intrinsics.checkNotNullParameter(cartEntry, "$parentCartEntry");
        object = ((td0_1)object).b;
        int n3 = this.c.isExchangeItem();
        object.h1(cartEntry, n3);
    }
}

