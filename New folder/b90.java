/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b90
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;

    public b90(Vt1 vt1) {
        this.c = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (List)object;
        Object object2 = this.c;
        Ul3 ul3 = ((Vt1)object2).d();
        if (ul3 != null) {
            object2 = ((Vt1)object2).d();
            Intrinsics.checkNotNull(object2);
            object2 = ((Ul3)object2).a;
            object.add(object2);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

