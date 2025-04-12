/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContextWrapper
 */
import android.content.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

public final class Lw0$a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final lw0_1 a(ContextWrapper object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object2 = lw0_1.g;
                        if (object2 != null) break block3;
                        lw0_1.g = object2 = new lw0_1((ContextWrapper)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = lw0_1.g;
                object2 = "null cannot be cast to non-null type com.ril.ajio.dynamicfeatures.DynamicFeatureHandler";
                Intrinsics.checkNotNull(object, (String)object2);
                return object;
            }
            throw throwable2;
        }
    }
}

