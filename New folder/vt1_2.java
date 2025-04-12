/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vt1
 */
public final class vt1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ rt1_0 c;
    public final /* synthetic */ Object d;

    public vt1_2(rt1_0 rt1_02, Object object) {
        this.c = rt1_02;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((rt1_0)object).c;
        Object object3 = this.d;
        object2.remove(object3);
        object2 = new ut1_1((rt1_0)object, object3);
        return object2;
    }
}

