/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.b$g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b$g$a
extends Lambda
implements Function0 {
    public final /* synthetic */ b$g c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;

    public b$g$a(ViewGroup viewGroup, b$g b$g, Object object) {
        this.c = b$g;
        this.d = viewGroup;
        this.e = object;
        super(0);
    }

    public final Object invoke() {
        GW0 gW0 = this.c.f;
        ViewGroup viewGroup = this.d;
        Object object = this.e;
        gW0.e(viewGroup, object);
        return Unit.a;
    }
}

