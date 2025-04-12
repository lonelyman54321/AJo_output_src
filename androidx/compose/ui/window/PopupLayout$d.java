/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.window;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;

public final class PopupLayout$d
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$LongRef c;
    public final /* synthetic */ PopupLayout d;
    public final /* synthetic */ Vi1 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public PopupLayout$d(Ref$LongRef ref$LongRef, PopupLayout popupLayout, Vi1 vi1, long l2, long l3) {
        this.c = ref$LongRef;
        this.d = popupLayout;
        this.e = vi1;
        this.f = l2;
        this.g = l3;
        super(0);
    }

    public final Object invoke() {
        long l2;
        PopupLayout popupLayout = this.d;
        Lw2 lw2 = popupLayout.getPositionProvider();
        bp1_0 bp1_02 = popupLayout.getParentLayoutDirection();
        long l3 = this.f;
        long l4 = this.g;
        Vi1 vi1 = this.e;
        this.c.element = l2 = lw2.a(vi1, l3, bp1_02, l4);
        return Unit.a;
    }
}

