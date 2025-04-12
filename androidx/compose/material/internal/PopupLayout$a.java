/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.material.internal;

import androidx.compose.material.internal.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class PopupLayout$a
extends Lambda
implements Function2 {
    public final /* synthetic */ PopupLayout c;
    public final /* synthetic */ int d;

    public PopupLayout$a(PopupLayout popupLayout, int n3) {
        this.c = popupLayout;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        this.c.a((b30_0)object, n3);
        return Unit.a;
    }
}

