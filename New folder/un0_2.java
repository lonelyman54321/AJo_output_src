/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;

/*
 * Renamed from UN0
 */
public final class un0_2
implements SuccessContinuation {
    public final Task then(Object object) {
        return FirebaseRemoteConfig.g((ConfigFetchHandler$FetchResponse)object);
    }
}

