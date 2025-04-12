/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nj$b
extends Lambda
implements Function1 {
    public final /* synthetic */ nj_2 c;
    public final /* synthetic */ Choreographer.FrameCallback d;

    public nj$b(nj_2 nj_22, nj$c nj$c) {
        this.c = nj_22;
        this.d = nj$c;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c.a;
        Choreographer.FrameCallback frameCallback = this.d;
        object.removeFrameCallback(frameCallback);
        return Unit.a;
    }
}

