/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from R70
 */
public final class r70_0
extends Lambda
implements Function0 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    public r70_0(Function0 function0, boolean bl2) {
        this.c = bl2;
        this.d = function0;
        super(0);
    }

    public final Object invoke() {
        boolean bl2 = this.c;
        if (bl2) {
            Function0 function0 = this.d;
            function0.invoke();
        }
        return Unit.a;
    }
}

