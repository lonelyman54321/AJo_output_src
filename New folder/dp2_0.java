/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/*
 * Renamed from DP2
 */
public final class dp2_0
implements OnSuccessListener {
    public final /* synthetic */ RolloutsStateSubscriptionsHandler a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ RolloutsStateSubscriber c;

    public /* synthetic */ dp2_0(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task2, RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.a = rolloutsStateSubscriptionsHandler;
        this.b = task2;
        this.c = rolloutsStateSubscriber;
    }

    public final void onSuccess(Object object) {
        RolloutsStateSubscriber rolloutsStateSubscriber = this.c;
        object = (ConfigContainer)object;
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = this.a;
        Task task2 = this.b;
        RolloutsStateSubscriptionsHandler.a(rolloutsStateSubscriptionsHandler, task2, rolloutsStateSubscriber, (ConfigContainer)object);
    }
}

