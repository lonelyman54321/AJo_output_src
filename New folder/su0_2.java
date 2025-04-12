/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Su0
 */
public final class su0_2
extends Lambda
implements Function0 {
    public final /* synthetic */ zu0_0 c;
    public final /* synthetic */ Function1 d;

    public su0_2(zu0_0 zu0_02, Function1 function1) {
        this.c = zu0_02;
        this.d = function1;
        super(0);
    }

    public final Object invoke() {
        zu0_0 zu0_02 = this.c;
        Function1 function1 = this.d;
        yu0_0 yu0_02 = new yu0_0(zu0_02, function1);
        return yu0_02;
    }
}

