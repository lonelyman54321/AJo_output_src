/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

public final class cw$a {
    public static boolean a() {
        boolean bl2;
        String string2 = "isUCPLoginFlowEnable";
        Intrinsics.checkNotNullParameter(string2, "key");
        FirebaseRemoteConfig firebaseRemoteConfig = cw.c;
        if (firebaseRemoteConfig != null) {
            bl2 = firebaseRemoteConfig.getBoolean(string2);
        } else {
            bl2 = false;
            firebaseRemoteConfig = null;
        }
        return bl2;
    }
}

