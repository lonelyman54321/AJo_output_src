/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.UserSubRating;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ze2
 */
public final class ze2_1
implements Function2 {
    public final /* synthetic */ UserSubRating a;
    public final /* synthetic */ int b;

    public /* synthetic */ ze2_1(UserSubRating userSubRating, int n3) {
        this.a = userSubRating;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        UserSubRating userSubRating = this.a;
        Intrinsics.checkNotNullParameter(userSubRating, "$userSubRating");
        int n3 = Me3.b(this.b | 1);
        de2_0.Q(userSubRating, (b30_0)object, n3);
        return Unit.a;
    }
}

