/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from YL0
 */
public final class yl0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yl0_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (UY2)object;
                nl1_0 nl1_02 = (nl1_0)this.d;
                uo3_0.a((UY2)object, nl1_02);
                return Unit.a;
            }
            case 0: 
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = (wl0_1)this.d;
        fm0_0 fm0_02 = ((wl0_1)object2).d;
        fm0_02.getClass();
        String string2 = "url";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = fm0_02.a.c((String)object);
        object2 = ((wl0_1)object2).c;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = ((yf1_2)object2).a.c((String)object);
        return Math.max(l2, l3);
    }
}

