/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$c;
import androidx.compose.foundation.gestures.b;

public final class d
extends h80_0 {
    public b a;
    public a$c b;
    public us0_0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b e;
    public int f;

    public d(b b2, f80_0 f80_02) {
        this.e = b2;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.d = object;
        this.f = n3 = this.f | -1 << -1;
        return androidx.compose.foundation.gestures.b.v1(this.e, null, this);
    }
}

