/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from KE2
 */
public final class ke2_2
extends Lambda
implements Function0 {
    public final /* synthetic */ mr_2 c;
    public final /* synthetic */ k21_0 d;
    public final /* synthetic */ h4_0 e;

    public ke2_2(mr_2 mr_22, k21_0 k21_02, h4_0 h4_02) {
        this.c = mr_22;
        this.d = k21_02;
        this.e = h4_02;
        super(0);
    }

    public final Object invoke() {
        i0_0 i0_02 = this.c.b;
        Intrinsics.checkNotNull(i0_02);
        List list = this.d.a();
        String string2 = this.e.i.d;
        return i0_02.E(string2, list);
    }
}

