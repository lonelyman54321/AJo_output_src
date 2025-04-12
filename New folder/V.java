/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Window
 *  android.view.Window$Callback
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import com.ril.ajio.AJIOApplication;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class V
implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ Handler b;
    public final /* synthetic */ AJIOApplication c;

    public V(Ref$BooleanRef ref$BooleanRef, Handler handler, AJIOApplication aJIOApplication) {
        this.a = ref$BooleanRef;
        this.b = handler;
        this.c = aJIOApplication;
    }

    public final void onActivityCreated(Activity object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "activity");
        object2 = this.a;
        int n3 = object2.element;
        if (n3 != 0) {
            return;
        }
        object = object.getWindow();
        Object object3 = bg3_2.Companion;
        Intrinsics.checkNotNull(object);
        Handler handler = this.b;
        AJIOApplication aJIOApplication = this.c;
        Object object4 = new S((Window)object, (Ref$BooleanRef)object2, handler, aJIOApplication);
        object3.getClass();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object4, "callback");
        object2 = object.peekDecorView();
        if (object2 == null) {
            n3 = 2;
            object2 = new we1_1(object4, n3);
            object3 = object.getCallback();
            boolean bl2 = object3 instanceof bg3_2;
            if (bl2) {
                object3 = (bg3_2)object3;
            } else {
                Intrinsics.checkNotNull(object3);
                object4 = new bg3_2((Window.Callback)object3);
                object.setCallback((Window.Callback)object4);
                object3 = object4;
            }
            object = ((bg3_2)object3).b;
            ((ArrayList)object).add(object2);
        } else {
            ((S)object4).invoke();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "p0");
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "p0");
    }

    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "p0");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "p0");
        Intrinsics.checkNotNullParameter(bundle, "p1");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "p0");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "p0");
    }
}

