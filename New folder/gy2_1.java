/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Gy2
 */
public final class gy2_1
extends Lambda
implements Function0 {
    public final /* synthetic */ vr1_1 c;
    public final /* synthetic */ Object[] d;

    public gy2_1(vr1_1 vr1_12, Object[] objectArray) {
        this.c = vr1_12;
        this.d = objectArray;
        super(0);
    }

    public final Object invoke() {
        vr1_1 vr1_12 = this.c;
        int n3 = vr1_12.o() + 1;
        int n4 = this.d.length;
        vr1_12.e(n3 %= n4);
        return Unit.a;
    }
}

