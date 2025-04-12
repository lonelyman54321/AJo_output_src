/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Bi
extends Lambda
implements Function0 {
    public final /* synthetic */ PopupLayout c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Mw2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ bp1_0 g;

    public Bi(PopupLayout popupLayout, Function0 function0, Mw2 mw2, String string2, bp1_0 bp1_02) {
        this.c = popupLayout;
        this.d = function0;
        this.e = mw2;
        this.f = string2;
        this.g = bp1_02;
        super(0);
    }

    public final Object invoke() {
        Function0 function0 = this.d;
        Mw2 mw2 = this.e;
        PopupLayout popupLayout = this.c;
        String string2 = this.f;
        bp1_0 bp1_02 = this.g;
        popupLayout.i(function0, mw2, string2, bp1_02);
        return Unit.a;
    }
}

