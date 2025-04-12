/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ny2
 */
public final class ny2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ Sy2 d;

    public ny2_0(gr3 gr32, Sy2 sy2) {
        this.c = gr32;
        this.d = sy2;
        super(1);
    }

    public final void invoke(Object object) {
        object = this.c;
        qk_0 qk_02 = qk$a.a((gr3)object);
        Object object2 = this.d;
        if (qk_02 != null) {
            object = ((Sy2)object2).d();
            object2 = new sr3(qk_02);
            object.put(qk_02, object2);
            qk_02 = qk_02;
            return;
        }
        object.getClass();
        Sy2.a((Sy2)object2);
    }
}

