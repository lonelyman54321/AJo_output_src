/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fT2$b
 */
public final class ft2$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ft2_0 c;

    public ft2$b_0(ft2_0 ft2_02) {
        this.c = ft2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        ft2_0 ft2_02 = this.c;
        object = object == ft2_02 ? "(this)" : String.valueOf(object);
        return object;
    }
}

