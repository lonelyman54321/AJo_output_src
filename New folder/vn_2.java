/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vN
 */
public final class vn_2
implements Function2 {
    public final /* synthetic */ CartEntry a;

    public /* synthetic */ vn_2(CartEntry cartEntry) {
        this.a = cartEntry;
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Float)object).floatValue();
        object2 = (String)object2;
        Intrinsics.checkNotNullParameter(object2, "userCount");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f5);
        stringBuilder.append("|");
        stringBuilder.append((String)object2);
        object = stringBuilder.toString();
        this.a.setAggregateRating((String)object);
        return Unit.a;
    }
}

