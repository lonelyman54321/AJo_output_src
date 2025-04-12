/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class iw2$b$b
extends Lambda
implements Function1 {
    public final /* synthetic */ iw2$b c;
    public final /* synthetic */ iw2_1 d;

    public iw2$b$b(iw2$b iw2$b, iw2_1 iw2_12) {
        this.c = iw2$b;
        this.d = iw2_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (MotionEvent)object;
        int n3 = object.getActionMasked();
        Function1 function1 = null;
        String string2 = "onTouchEvent";
        iw2_1 iw2_12 = this.d;
        if (n3 == 0) {
            Object object2 = iw2_12.b;
            if (object2 != null) {
                function1 = object2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            }
            object = (Boolean)function1.invoke(object);
            boolean bl2 = (Boolean)object;
            object = bl2 ? iw2$a.Dispatching : iw2$a.NotDispatching;
            object2 = this.c;
            ((iw2$b)object2).c = object;
        } else {
            Function1 function12 = iw2_12.b;
            if (function12 != null) {
                function1 = function12;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            }
            function1.invoke(object);
        }
        return Unit.a;
    }
}

