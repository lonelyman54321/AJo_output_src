/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ry2
 */
public final class ry2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Sy2 c;

    public ry2_1(Sy2 sy2, String string2) {
        this.c = sy2;
        super(1);
    }

    public final Object invoke(Object object) {
        this.c.b();
        return Unit.a;
    }
}

