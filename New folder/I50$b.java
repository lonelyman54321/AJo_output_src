/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class I50$b
extends Lambda
implements Function1 {
    public final /* synthetic */ i50_0 c;

    public I50$b(i50_0 i50_02) {
        this.c = i50_02;
        super(1);
    }

    public final Object invoke(Object object) {
        Looper looper;
        object = (Function0)object;
        Object object2 = Looper.myLooper();
        boolean bl2 = Intrinsics.areEqual(object2, looper = Looper.getMainLooper());
        if (bl2) {
            object.invoke();
        } else {
            object2 = this.c;
            looper = object2.b;
            if (looper == null) {
                Looper looper2 = Looper.getMainLooper();
                looper = new Handler(looper2);
                object2.b = looper;
            }
            object2 = new J50((Function0)object);
            looper.post((Runnable)object2);
        }
        return Unit.a;
    }
}

