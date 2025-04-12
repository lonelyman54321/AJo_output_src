/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ki
 */
public final class ki_0
extends Lambda
implements Function1 {
    public final /* synthetic */ PopupLayout c;

    public ki_0(PopupLayout popupLayout) {
        this.c = popupLayout;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bj1)object).a;
        object = new bj1(l2);
        PopupLayout popupLayout = this.c;
        popupLayout.setPopupContentSize-fhxjrPA((bj1)object);
        popupLayout.l();
        return Unit.a;
    }
}

