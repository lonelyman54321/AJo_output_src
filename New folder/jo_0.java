/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JO
 */
public final class jo_0
implements View.OnClickListener {
    public final /* synthetic */ lo_0 a;
    public final /* synthetic */ CartEntry b;

    public /* synthetic */ jo_0(lo_0 lo_02, CartEntry cartEntry) {
        this.a = lo_02;
        this.b = cartEntry;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$cartEntry");
        object = ((lo_0)object2).a;
        object2 = ((CartEntry)object3).getAllPromotionsList();
        object3 = ((CartEntry)object3).getVoucherMessages();
        object.y2((String)object3, (ArrayList)object2);
    }
}

