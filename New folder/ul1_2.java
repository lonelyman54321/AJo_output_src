/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.events.PageViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ul1
 */
public final class ul1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public ul1_2(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new ul1_2(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ul1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ul1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = el1_2.a;
        el1_2.a();
        object = new PageViewEvent();
        object2 = this.a;
        ((PageViewEvent)object).setStartTime((String)object2);
        object2 = "WishlistPage";
        ((PageViewEvent)object).setPageName((String)object2);
        object2 = this.b;
        ((PageViewEvent)object).setEndTime((String)object2);
        object2 = el1_2.f();
        try {
            ((JioAdsEventService)object2).trackEvent((PageViewEvent)object);
        }
        catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "<this>");
            object2 = FirebaseCrashlytics.getInstance();
            String string2 = exception.getMessage();
            String string3 = "JioAds Exception Wishlist View Event ";
            string2 = kp1_0.c(string3, string2);
            Exception exception2 = new Exception(string2);
            ((FirebaseCrashlytics)object2).recordException(exception2);
        }
        return Unit.a;
    }
}

