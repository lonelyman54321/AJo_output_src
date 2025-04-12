/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tQ0
 */
public final class tq0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Product e;
    public final /* synthetic */ boolean f;

    public tq0_1(String string2, String string3, String string4, String string5, Product product, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = product;
        this.f = true;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        String string4 = this.a;
        String string5 = this.b;
        Product product = this.e;
        object = new tq0_1(string4, string5, string2, string3, product, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tq0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tq0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object);
        Product product = this.e;
        boolean bl2 = this.f;
        String string3 = this.a;
        String string4 = this.b;
        String string5 = this.c;
        String string6 = this.d;
        newEEcommerceEventsRevamp.pushSelectContentProductImpressionForFleek(string3, string2, string4, string5, string6, product, bl2);
        return Unit.a;
    }
}

