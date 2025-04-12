/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Au0
 */
public final class au0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public au0_0(float f5) {
        this.c = f5;
        this.d = 0.0f;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ys0)object;
        zu0_0 zu0_02 = zu0_0.Closed;
        Float f5 = Float.valueOf(this.c);
        ((Ys0)object).a.put(zu0_02, f5);
        zu0_02 = zu0_0.Open;
        f5 = Float.valueOf(this.d);
        ((Ys0)object).a.put(zu0_02, f5);
        return Unit.a;
    }
}

