/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.events.DeepLinkLaunchEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from il1
 */
public final class il1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Uri a;

    public il1_2(Uri uri, f80_0 f80_02) {
        this.a = uri;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Uri uri = this.a;
        object = new il1_2(uri, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (il1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((il1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = el1_2.a;
        el1_2.a();
        object2 = this.a;
        object = new DeepLinkLaunchEvent((Uri)object2);
        object2 = el1_2.f();
        try {
            ((JioAdsEventService)object2).trackEvent((DeepLinkLaunchEvent)object);
        }
        catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "<this>");
            object2 = FirebaseCrashlytics.getInstance();
            String string2 = exception.getMessage();
            String string3 = "JioAds Exception Deeplink Event ";
            string2 = kp1_0.c(string3, string2);
            Exception exception2 = new Exception(string2);
            ((FirebaseCrashlytics)object2).recordException(exception2);
        }
        return Unit.a;
    }
}

