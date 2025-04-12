/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from no3
 */
public final class no3_0
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public no3_0(boolean bl2, ob0_1 ob0_12, String string2, String string3, String string4) {
        this.a = bl2;
        this.b = ob0_12;
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = (int)(this.a ? 1 : 0);
            if (n4 == 0) {
                n4 = -1878673806;
                object.K(n4);
                object2 = this.d;
                n3 = 8;
                ob0_1 ob0_12 = this.b;
                String string2 = this.c;
                ro3_0.f(ob0_12, string2, (String)object2, (b30_0)object, n3);
                object.E();
            } else {
                n4 = -1878566515;
                object.K(n4);
                object2 = this.e;
                n3 = 0;
                ro3_0.d((String)object2, (b30_0)object, 0);
                object.E();
            }
        }
        return Unit.a;
    }
}

