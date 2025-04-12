/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Iterator;
import java.util.List;

public final class M50
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ M50(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                RolloutsStateSubscriber rolloutsStateSubscriber = (RolloutsStateSubscriber)this.b;
                RolloutsState rolloutsState = (RolloutsState)this.c;
                RolloutsStateSubscriptionsHandler.b(rolloutsStateSubscriber, rolloutsState);
                return;
            }
            case 0: 
        }
        Iterator iterator = ((Iterable)((List)this.b)).iterator();
        while (bl2 = iterator.hasNext()) {
            F50 f50 = (F50)iterator.next();
            Object object = ((N50)this.c).e;
            f50.a(object);
        }
    }
}

