/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class TD
implements JD {
    public final /* synthetic */ fo0 a;

    public TD(fo0 fo02) {
        this.a = fo02;
    }

    public final Object Q(w32_0 object, Function0 function0, f80_0 f80_02) {
        int n3;
        f80_02 = ho0_0.a(this.a);
        long l2 = ((w32_0)object).a0(0L);
        object = (aG2)function0.invoke();
        if (object != null) {
            object = ((aG2)object).i(l2);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            float f5 = ((aG2)object).a;
            int n4 = (int)f5;
            float f6 = ((aG2)object).b;
            int n7 = (int)f6;
            float f7 = ((aG2)object).c;
            int n8 = (int)f7;
            n3 = (int)((aG2)object).d;
            function0 = new Rect(n4, n7, n8, n3);
            n3 = 0;
            object = null;
            f80_02.requestRectangleOnScreen((Rect)function0, false);
        }
        return Unit.a;
    }
}

