/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Di
 */
public final class di_0
extends Lambda
implements Function1 {
    public final /* synthetic */ PopupLayout c;
    public final /* synthetic */ Lw2 d;

    public di_0(PopupLayout popupLayout, Lw2 lw2) {
        this.c = popupLayout;
        this.d = lw2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Lw2 lw2 = this.d;
        ((PopupLayout)((Object)object)).setPositionProvider(lw2);
        ((PopupLayout)((Object)object)).l();
        object = new Object();
        return object;
    }
}

