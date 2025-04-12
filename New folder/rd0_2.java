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
 * Renamed from rD0
 */
public final class rd0_2
implements View.OnClickListener {
    public final /* synthetic */ td0_1 a;
    public final /* synthetic */ CartEntry b;

    public /* synthetic */ rd0_2(td0_1 td0_12, CartEntry cartEntry) {
        this.a = td0_12;
        this.b = cartEntry;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CartEntry cartEntry = this.b;
        Intrinsics.checkNotNullParameter(cartEntry, "$parentCartEntry");
        object.b.e5(cartEntry);
    }
}

