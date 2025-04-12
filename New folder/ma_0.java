/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from MA
 */
public final class ma_0
extends Lambda
implements Function2 {
    public final /* synthetic */ al1_1 c;
    public final /* synthetic */ gx0_2 d;

    public ma_0(al1_1 al1_12, u10 u102) {
        this.c = al1_12;
        this.d = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xf3_1)object;
        long l2 = ((c60)object2).a;
        object2 = new e(l2, (Vo0)object);
        Unit unit = Unit.a;
        u10 u102 = (u10)this.d;
        la_0 la_02 = new la_0(u102, (e)object2);
        object2 = new u10(-1945019079, la_02, true);
        object2 = object.w(unit, (Function2)object2);
        return this.c.c((dl1_1)object, (List)object2, l2);
    }
}

