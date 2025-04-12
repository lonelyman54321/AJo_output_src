/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.GsonBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Ul1$a
extends Lambda
implements Function0 {
    public static final Ul1$a c;

    static {
        Ul1$a ul1$a;
        c = ul1$a = new Lambda(0);
    }

    public final Object invoke() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.disableHtmlEscaping().serializeNulls().setPrettyPrinting().create();
    }
}

