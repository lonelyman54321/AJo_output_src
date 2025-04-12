/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XA0
 */
public final class xa0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa0_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                RolloutsStateSubscriber rolloutsStateSubscriber = (RolloutsStateSubscriber)this.b;
                RolloutsState rolloutsState = (RolloutsState)this.c;
                RolloutsStateSubscriptionsHandler.c(rolloutsStateSubscriber, rolloutsState);
                return;
            }
            case 0: 
        }
        String string2 = (String)this.c;
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        View view = (View)this.b;
        if (view != null) {
            view.setContentDescription((CharSequence)string2);
        }
        if (view != null) {
            ai0_2.a(view);
        }
    }
}

