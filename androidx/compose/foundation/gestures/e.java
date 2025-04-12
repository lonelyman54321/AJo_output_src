/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$d;
import androidx.compose.foundation.gestures.b;

public final class e
extends h80_0 {
    public b a;
    public a$d b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b d;
    public int e;

    public e(b b2, f80_0 f80_02) {
        this.d = b2;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.c = object;
        this.e = n3 = this.e | -1 << -1;
        return androidx.compose.foundation.gestures.b.w1(this.d, null, this);
    }
}

