/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Iu0
 */
public final class iu0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ yu0_0 d;
    public final /* synthetic */ i90_0 e;

    public iu0_1(String string2, yu0_0 yu0_02, c80 c802) {
        this.c = string2;
        this.d = yu0_02;
        this.e = c802;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Object object2 = RY2.a;
        object2 = MY2.e;
        Object object3 = RY2.a;
        int n3 = 2;
        object3 = object3[n3];
        object2.getClass();
        object3 = this.c;
        object.a((TY2)object2, object3);
        object2 = this.d;
        object3 = (zu0_0)((Object)((yu0_0)object2).a.g.getValue());
        Object object4 = zu0_0.Open;
        if (object3 == object4) {
            object4 = (c80)this.e;
            object3 = new hu0_1((yu0_0)object2, (c80)object4);
            object2 = yY2.t;
            object4 = new H1(null, (fx0_2)object3);
            object.a((TY2)object2, object4);
        }
        return Unit.a;
    }
}

