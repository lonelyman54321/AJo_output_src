/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class V73
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ boolean e;

    public V73(Function2 function2, u10 u102, boolean bl2) {
        this.c = function2;
        this.d = u102;
        this.e = bl2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            object2 = null;
            Function2 function2 = this.d;
            Function2 function22 = this.c;
            if (function22 == null) {
                int n7 = 1850967489;
                object.K(n7);
                function2 = (u10)function2;
                g83.e((u10)function2, (b30_0)object, 0);
                object.E();
            } else {
                int n8 = this.e;
                if (n8 != 0) {
                    n8 = 1850969582;
                    object.K(n8);
                    function2 = (u10)function2;
                    g83.c((u10)function2, function22, (b30_0)object, 0);
                    object.E();
                } else {
                    n8 = 1850971719;
                    object.K(n8);
                    function2 = (u10)function2;
                    g83.d((u10)function2, function22, (b30_0)object, 0);
                    object.E();
                }
            }
        }
        return Unit.a;
    }
}

