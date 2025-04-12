/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fw2
 */
public final class fw2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ PopupLayout c;

    public fw2_0(PopupLayout popupLayout) {
        this.c = popupLayout;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        boolean bl3;
        Object object = this.c;
        zp1 zp12 = PopupLayout.h(object);
        if (zp12 == null || !(bl3 = zp12.e())) {
            zp12 = null;
        }
        if (zp12 != null && (object = object.getPopupContentSize-bOM6tXw()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

