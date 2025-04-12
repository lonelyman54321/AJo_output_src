/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from sQ0$b
 */
public final class sq0$b_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    public sq0$b_0(String string2, String string3, String string4, String string5, String string6, boolean bl2, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        boolean bl2 = this.f;
        String string3 = this.a;
        String string4 = this.b;
        String string5 = this.c;
        String string6 = this.d;
        object = new sq0$b_0(string3, string4, string5, string6, string2, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sq0$b_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sq0$b_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object);
        String string3 = this.e;
        boolean bl2 = this.f;
        String string4 = this.a;
        String string5 = this.b;
        String string6 = this.c;
        String string7 = this.d;
        newEEcommerceEventsRevamp.pushSelectContentEventForFleekIngress(string4, string2, string5, string6, string7, string3, bl2);
        return Unit.a;
    }
}

