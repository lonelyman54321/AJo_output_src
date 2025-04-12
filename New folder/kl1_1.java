/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.TrackerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kl1
 */
public final class kl1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public kl1_1(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = "";
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.a;
        object = new kl1_1(string3, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kl1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kl1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = el1_2.a;
        el1_2.a();
        object2 = el1_2.f();
        Object object3 = this.a;
        Object object4 = TrackerType.CLICK;
        String string2 = this.b;
        String string3 = this.c;
        try {
            ((JioAdsEventService)object2).fireTracker((String)object3, (TrackerType)((Object)object4), string2, string3, null);
        }
        catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "<this>");
            object2 = FirebaseCrashlytics.getInstance();
            String string4 = exception.getMessage();
            object4 = "JioAds Exception Click Tracker ";
            string4 = kp1_0.c((String)object4, string4);
            object3 = new Exception(string4);
            ((FirebaseCrashlytics)object2).recordException((Throwable)object3);
        }
        return Unit.a;
    }
}

