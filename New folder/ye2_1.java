/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ye2
 */
public final class ye2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ int d;

    public /* synthetic */ ye2_1(String string2, Activity activity, CartEntry cartEntry, int n3) {
        this.a = string2;
        this.b = activity;
        this.c = cartEntry;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$message");
        CartEntry cartEntry = this.c;
        Intrinsics.checkNotNullParameter(cartEntry, "$cartEntry");
        int n3 = Me3.b(this.d | 1);
        Activity activity = this.b;
        de2_0.N(string2, activity, cartEntry, (b30_0)object, n3);
        return Unit.a;
    }
}

