/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ce2
 */
public final class ce2_0
implements gx0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public ce2_0(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            object3 = this.b;
            string2 = this.c;
            de2_0.e((String)object, (String)object3, string2, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

