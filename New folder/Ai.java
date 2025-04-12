/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ai
extends Lambda
implements Function1 {
    public final /* synthetic */ PopupLayout c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Mw2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ bp1_0 g;

    public Ai(PopupLayout popupLayout, Function0 function0, Mw2 mw2, String string2, bp1_0 bp1_02) {
        this.c = popupLayout;
        this.d = function0;
        this.e = mw2;
        this.f = string2;
        this.g = bp1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((PopupLayout)((Object)object)).o;
        ((PopupLayout)((Object)object)).n.addView((View)object, (ViewGroup.LayoutParams)object2);
        object2 = this.d;
        Mw2 mw2 = this.e;
        String string2 = this.f;
        bp1_0 bp1_02 = this.g;
        ((PopupLayout)((Object)object)).i((Function0)object2, mw2, string2, bp1_02);
        object2 = new zi_0((PopupLayout)((Object)object));
        return object2;
    }
}

