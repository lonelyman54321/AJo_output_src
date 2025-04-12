/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from iB1
 */
public final class ib1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ Sj3 c;

    public ib1_1(Sj3 sj3) {
        this.c = sj3;
        super(0);
    }

    public final Object invoke() {
        this.c.onCancel();
        return Unit.a;
    }
}

