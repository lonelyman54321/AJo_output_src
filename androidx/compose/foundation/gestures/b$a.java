/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b$a
extends Lambda
implements Function1 {
    public final /* synthetic */ b c;

    public b$a(b b2) {
        this.c = b2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (aw2_0)object;
        return (Boolean)this.c.q.invoke(object);
    }
}

