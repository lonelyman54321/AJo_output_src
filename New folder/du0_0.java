/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Du0
 */
public final class du0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yu0_0 d;
    public final /* synthetic */ i90_0 e;

    public du0_0(boolean bl2, yu0_0 yu0_02, c80 c802) {
        this.c = bl2;
        this.d = yu0_02;
        this.e = c802;
        super(0);
    }

    public final Object invoke() {
        boolean bl2 = this.c;
        if (bl2) {
            Object object = this.d;
            Object object2 = ((yu0_0)object).a.d;
            zu0_0 zu0_02 = zu0_0.Closed;
            boolean bl3 = (Boolean)(object2 = (Boolean)object2.invoke((Object)zu0_02));
            if (bl3) {
                zu0_02 = null;
                object2 = new cu0_1((yu0_0)object, null);
                object = this.e;
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
            }
        }
        return Unit.a;
    }
}

