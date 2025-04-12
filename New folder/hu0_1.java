/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hu0
 */
public final class hu0_1
extends Lambda
implements Function0 {
    public final /* synthetic */ yu0_0 c;
    public final /* synthetic */ i90_0 d;

    public hu0_1(yu0_0 yu0_02, c80 c802) {
        this.c = yu0_02;
        this.d = c802;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((yu0_0)object).a.d;
        zu0_0 zu0_02 = zu0_0.Closed;
        boolean bl2 = (Boolean)(object2 = (Boolean)object2.invoke((Object)zu0_02));
        if (bl2) {
            zu0_02 = null;
            object2 = new gu0_2((yu0_0)object, null);
            object = this.d;
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
        return Boolean.TRUE;
    }
}

