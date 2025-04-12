/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;

/*
 * Renamed from NY0
 */
public final class ny0_0
implements Provider {
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}

