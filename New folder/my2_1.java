/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from My2
 */
public final class my2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ul$c c;
    public final /* synthetic */ Sy2 d;

    public my2_1(ul$c ul$c, Sy2 sy2) {
        this.c = ul$c;
        this.d = sy2;
        super(1);
    }

    public final void invoke(Object object) {
        object = this.c;
        pk_0 pk_02 = pk$a.a((ul$c)object);
        Object object2 = this.d;
        if (pk_02 != null) {
            object = ((Sy2)object2).c();
            object2 = new ok_0(pk_02);
            object.put(pk_02, object2);
            pk_02 = pk_02;
            return;
        }
        ((ul$c)object).a().getClass();
        Sy2.a((Sy2)object2);
    }
}

