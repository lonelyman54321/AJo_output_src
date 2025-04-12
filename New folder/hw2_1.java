/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hw2
 */
public final class hw2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ PopupLayout c;

    public hw2_1(PopupLayout popupLayout) {
        this.c = popupLayout;
        super(1);
    }

    public final Object invoke(Object object) {
        Looper looper;
        object = (Function0)object;
        PopupLayout popupLayout = this.c;
        Object object2 = popupLayout.getHandler();
        object2 = object2 != null ? object2.getLooper() : null;
        if (object2 == (looper = Looper.myLooper())) {
            object.invoke();
        } else if ((popupLayout = popupLayout.getHandler()) != null) {
            object2 = new Gw2((Function0)object);
            popupLayout.post((Runnable)object2);
        }
        return Unit.a;
    }
}

