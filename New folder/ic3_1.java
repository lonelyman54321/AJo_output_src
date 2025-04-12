/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IC3
 */
public final class ic3_1
extends Lambda
implements Function0 {
    public final /* synthetic */ AbstractComposeView c;
    public final /* synthetic */ JC3 d;
    public final /* synthetic */ ww2 e;

    public ic3_1(AbstractComposeView abstractComposeView, JC3 jC3, hc3_0 hc3_02) {
        this.c = abstractComposeView;
        this.d = jC3;
        this.e = hc3_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = this.d;
        object.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object2 = this.e;
        String string2 = "listener";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = vw2.b((View)object);
        Intrinsics.checkNotNullParameter(object2, string2);
        ((xw2)object).a.remove(object2);
        return Unit.a;
    }
}

