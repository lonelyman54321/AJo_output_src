/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.LocationEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nl1
 */
public final class nl1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;

    public nl1_1(double d2, double d5, f80_0 f80_02) {
        this.a = d2;
        this.b = d5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        double d2 = this.a;
        double d5 = this.b;
        object = new nl1_1(d2, d5, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nl1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nl1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        String string2;
        Object object2;
        block12: {
            double d2;
            double d5;
            double d7;
            block11: {
                block10: {
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(object);
                    object = el1_2.a;
                    el1_2.a();
                    object2 = null;
                    object2 = new CartProduct[]{};
                    object = new LocationEvent((CartProduct[])object2);
                    d7 = this.a;
                    string2 = "";
                    d5 = 0.0;
                    d2 = d7 == d5 ? 0 : (d7 < d5 ? -1 : 1);
                    if (d2 >= 0) break block10;
                    object2 = string2;
                    break block11;
                }
                object2 = String.valueOf(d7);
            }
            ((LocationEvent)object).setLongitude((String)object2);
            d7 = this.b;
            d2 = d7 == d5 ? 0 : (d7 < d5 ? -1 : 1);
            if (d2 < 0) break block12;
            string2 = String.valueOf(d7);
        }
        ((LocationEvent)object).setLatitude(string2);
        object2 = el1_2.f();
        try {
            ((JioAdsEventService)object2).trackEvent((LocationEvent)object);
        }
        catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "<this>");
            object2 = FirebaseCrashlytics.getInstance();
            String string3 = exception.getMessage();
            string2 = "JioAds Exception On App Launch Location Event ";
            string3 = kp1_0.c(string2, string3);
            Exception exception2 = new Exception(string3);
            ((FirebaseCrashlytics)object2).recordException(exception2);
        }
        return Unit.a;
    }
}

