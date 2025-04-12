/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fi
 */
public final class fi_0
extends Lambda
implements Function1 {
    public final /* synthetic */ PopupLayout c;

    public fi_0(PopupLayout popupLayout) {
        this.c = popupLayout;
        super(1);
    }

    public final Object invoke(Object object) {
        object = ((zp1)object).S();
        Intrinsics.checkNotNull(object);
        this.c.k((zp1)object);
        return Unit.a;
    }
}

