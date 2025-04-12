/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import java.lang.reflect.Constructor;

/*
 * Renamed from Kl0
 */
public final class kl0_0
implements Ll0$a$a,
SuccessContinuation {
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(eI0.class).getConstructor(null);
    }

    public Task then(Object object) {
        return FirebaseRemoteConfig.f((ConfigFetchHandler$FetchResponse)object);
    }
}

