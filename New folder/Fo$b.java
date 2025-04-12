/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Fo$b
extends Lambda
implements Function0 {
    public static final Fo$b c;

    static {
        Fo$b fo$b;
        c = fo$b = new Lambda(0);
    }

    public final Object invoke() {
        return FacebookSdk.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
    }
}

