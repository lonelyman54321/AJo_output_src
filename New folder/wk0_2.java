/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wK0
 */
public final class wk0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;

    public /* synthetic */ wk0_2(String string2, dr0_0 dr0_02, yT1 yT12) {
        this.a = string2;
        this.b = dr0_02;
        this.c = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        sq0_1.g(this.a, "logo");
        object2.getClass();
        dr0_0.G((String)object, yT12);
        return Unit.a;
    }
}

