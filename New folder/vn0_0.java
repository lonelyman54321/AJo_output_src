/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

/*
 * Renamed from VN0
 */
public final class vn0_0
implements SuccessContinuation,
RC1$a {
    public Task then(Object object) {
        return FirebaseRemoteConfig.d((ConfigContainer)object);
    }
}

