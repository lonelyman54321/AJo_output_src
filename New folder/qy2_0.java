/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from QY2
 */
public final class qy2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function0 c;

    public qy2_0(cs1$a_0 cs1$a_0) {
        this.c = cs1$a_0;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (List)object;
        Float f5 = (Float)this.c.invoke();
        if (f5 == null) {
            bl2 = false;
            object = null;
        } else {
            object.add(f5);
            bl2 = true;
        }
        return bl2;
    }
}

