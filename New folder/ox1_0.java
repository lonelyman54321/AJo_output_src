/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oX1
 */
public final class ox1_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (CartEntry)object;
        object2 = (CartEntry)object2;
        object = ((CartEntry)object).getEntryNumber();
        Intrinsics.checkNotNull(object);
        int n3 = (Integer)object;
        object2 = ((CartEntry)object2).getEntryNumber();
        Intrinsics.checkNotNull(object2);
        int n4 = (Integer)object2;
        return Intrinsics.compare(n3, n4);
    }
}

