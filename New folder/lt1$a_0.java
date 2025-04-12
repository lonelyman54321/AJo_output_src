/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from LT1$a
 */
public final class lt1$a_0
extends Lambda
implements Function2 {
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ gx2_0 d;
    public final /* synthetic */ d e;

    public lt1$a_0(i90_0 i90_02, gx2_0 gx2_02, d d2) {
        this.c = i90_02;
        this.d = gx2_02;
        this.e = d2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        ((Number)object2).floatValue();
        gx2_0 gx2_02 = this.d;
        d d2 = this.e;
        object2 = new kt1_1(f5, gx2_02, d2, null);
        Ae3.d(this.c, null, null, (Function2)object2, 3);
        return Unit.a;
    }
}

