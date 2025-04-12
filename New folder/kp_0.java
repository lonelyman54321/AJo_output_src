/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KP
 */
public final class kp_0
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Vo0 c;

    public /* synthetic */ kp_0(p83_0 p83_02, int n3, Vo0 vo0) {
        this.a = p83_02;
        this.b = n3;
        this.c = vo0;
    }

    public final Object invoke(Object object) {
        object = (Tl3)object;
        p83_0 p83_02 = this.a;
        Intrinsics.checkNotNullParameter(p83_02, "$tabWidths");
        Vo0 vo0 = this.c;
        Intrinsics.checkNotNullParameter(vo0, "$density");
        Intrinsics.checkNotNullParameter(object, "textLayoutResult");
        int n3 = (int)(((Tl3)object).c >> 32);
        float f5 = vo0.D0(n3);
        xs0_0 xs0_02 = new xs0_0(f5);
        n3 = this.b;
        p83_02.set(n3, xs0_02);
        return Unit.a;
    }
}

