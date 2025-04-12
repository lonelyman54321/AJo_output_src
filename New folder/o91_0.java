/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O91
 */
public final class o91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ta0_2 g;

    public o91_0(String string2, g91_0 g91_02, int n3, ta0_2 ta0_22) {
        this.e = g91_02;
        this.f = n3;
        this.g = ta0_22;
        super(string2, true);
    }

    public final long a() {
        Object object = this.e.l;
        Object object2 = this.g;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "errorCode");
        object = this.e;
        synchronized (object) {
            object2 = this.e;
            object2 = ((g91_0)object2).A;
            int n3 = this.f;
            Integer n4 = n3;
            object2.remove(n4);
            object2 = Unit.a;
            return -1;
        }
    }
}

