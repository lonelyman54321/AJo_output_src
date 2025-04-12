/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.launch.config.ConfigWorker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ia3
 */
public final class ia3_1
extends qg3_2
implements Function2 {
    public int a;

    public ia3_1() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ia3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ia3_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Object object3 = "context";
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, object3);
        Object object4 = new FirebaseRemoteConfigSettings$Builder();
        long l2 = 60;
        object4 = ((FirebaseRemoteConfigSettings$Builder)object4).setMinimumFetchIntervalInSeconds(l2);
        l2 = 30;
        object4 = ((FirebaseRemoteConfigSettings$Builder)object4).setFetchTimeoutInSeconds(l2);
        object4 = ((FirebaseRemoteConfigSettings$Builder)object4).build();
        Object object5 = "build(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
        FirebaseApp.initializeApp((Context)object);
        object = FirebaseRemoteConfig.getInstance();
        object5 = "getInstance(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object5);
        object5 = ((FirebaseRemoteConfig)object).getInfo();
        object5.getLastFetchStatus();
        ((FirebaseRemoteConfig)object).setConfigSettingsAsync((FirebaseRemoteConfigSettings)object4);
        object4 = K40.o();
        object = ((FirebaseRemoteConfig)object).setDefaultsAsync((Map)object4);
        object4 = "setDefaultsAsync(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        this.a = n4;
        try {
            object = wi3_2.b((Task)object, this);
            if (object == object2) {
                return object2;
            }
        }
        catch (Exception exception) {
            object = yn3_0.a;
            object2 = new Object[]{};
            object4 = "Exception while fetching keys";
            ((yn3$a)object).a((String)object4, (Object[])object2);
        }
        object2 = ConfigWorker.class;
        Intrinsics.checkNotNullParameter(object2, "workerClass");
        object = new CI3$a((Class)object2);
        object = (y92)((CI3$a)object).a();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object2, object3);
        object2 = ni3_1.i((Context)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "getInstance(context)");
        object3 = DE0.KEEP;
        return ((li3_1)object2).d("configFetcher", (DE0)((Object)object3), (y92)object);
    }
}

