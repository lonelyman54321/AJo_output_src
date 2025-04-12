/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from LA
 */
public final class la_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ e d;

    public la_0(u10 u102, e e2) {
        this.c = u102;
        this.d = e2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            object2 = 0;
            gx0_2 gx0_22 = this.c;
            e e2 = this.d;
            gx0_22.invoke(e2, object, object2);
        }
        return Unit.a;
    }
}

