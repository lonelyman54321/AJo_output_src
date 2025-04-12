/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

public final class RealCall$a
extends WeakReference {
    public final Object a;

    public RealCall$a(RealCall realCall, Object object) {
        Intrinsics.checkNotNullParameter(realCall, "referent");
        super(realCall);
        this.a = object;
    }
}

