/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from oq0$b
 */
public final class oq0$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ oq0_0 c;

    public oq0$b_0(oq0_0 oq0_02) {
        this.c = oq0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (W72)object;
        object = this.c;
        jq0 jq02 = ((oq0_0)object).b;
        boolean bl2 = jq02.a;
        if (bl2) {
            object = ((oq0_0)object).a;
            object.invoke();
        }
        return Unit.a;
    }
}

