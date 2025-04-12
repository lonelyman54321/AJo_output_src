/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.InAppNotificationActivity$c;
import com.clevertap.android.sdk.c;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class P7
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ P7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object = ((c)object).c;
                boolean bl3 = object instanceof InAppNotificationActivity;
                if (bl3) {
                    object = (InAppNotificationActivity)object;
                    InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)((InAppNotificationActivity)object).k0.get();
                    inAppNotificationActivity$c.b();
                    boolean bl4 = true;
                    Object var4_7 = null;
                    ((InAppNotificationActivity)object).s2(null, bl4);
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = AjioHomeActivity.Companion;
        object = (AjioHomeActivity)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Application application = object.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        object = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        HomeRepo homeRepo = new HomeRepo((Context)object);
        object2 = new h91(application, homeRepo);
        return object2;
    }
}

