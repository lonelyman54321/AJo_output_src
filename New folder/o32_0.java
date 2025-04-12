/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from o32
 */
public final class o32_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ ArrayList a;

    public o32_0(ArrayList arrayList, f80_0 f80_02) {
        this.a = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = this.a;
        object = new o32_0(arrayList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o32_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o32_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        vl2_2.b(object);
        object = this.a;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = (Product)((ArrayList)object).get(i3);
            ((Product)object2).setPosition(i3);
        }
        object2 = GAEcommerceEvents.INSTANCE;
        ArrayList arrayList = this.a;
        GAEcommerceEvents.pushProductListImpressionData$default((GAEcommerceEvents)object2, arrayList, "similar to half card", false, null, 8, null);
        return Unit.a;
    }
}

