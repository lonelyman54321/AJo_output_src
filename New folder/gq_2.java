/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GQ
 */
public final class gq_2
implements o60_0,
SuccessContinuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gq_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Task then(Object object) {
        FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig)this.b;
        object = (Void)object;
        return FirebaseRemoteConfig.h(firebaseRemoteConfig, (Void)object);
    }
}

