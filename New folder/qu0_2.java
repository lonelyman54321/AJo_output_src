/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Qu0
 */
public final class qu0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    public qu0_2(String string2, Function0 function0) {
        this.c = string2;
        this.d = function0;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Object object2 = this.c;
        RY2.e((UY2)object, (String)object2);
        Object object3 = this.d;
        object2 = new pu0_1((Function0)object3);
        object3 = yY2.b;
        H1 h1 = new H1(null, (fx0_2)object2);
        object.a((TY2)object3, h1);
        return Unit.a;
    }
}

