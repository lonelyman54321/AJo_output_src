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

public final class iw2$b$c
extends Lambda
implements Function1 {
    public final /* synthetic */ iw2_1 c;

    public iw2$b$c(iw2_1 iw2_12) {
        this.c = iw2_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (MotionEvent)object;
        Function1 function1 = this.c.b;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
            function1 = null;
        }
        function1.invoke(object);
        return Unit.a;
    }
}

