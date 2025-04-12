/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from qY1
 */
public final class qy1_1
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Ref$IntRef b;

    public /* synthetic */ qy1_1(ArrayList arrayList, Ref$IntRef ref$IntRef) {
        this.a = arrayList;
        this.b = ref$IntRef;
    }

    public final Object invoke(Object object, Object object2) {
        double d2 = (Double)object;
        object2 = (String)object2;
        object = new StringBuilder();
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append("|");
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        int n3 = this.b.element;
        ((Product)this.a.get(n3)).setAggregateRating((String)object);
        return Unit.a;
    }
}

