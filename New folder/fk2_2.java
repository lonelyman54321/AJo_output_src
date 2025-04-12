/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fk2
 */
public final class fk2_2
implements Function2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ fk2_2(la2_0 la2_02, String string2, fe2_1 fe2_12, long l2, int n3) {
        this.a = la2_02;
        this.b = string2;
        this.c = fe2_12;
        this.d = l2;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        la2_0 la2_02 = this.a;
        Intrinsics.checkNotNullParameter(la2_02, "$orderCommunicationPacketConfig");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$packetCode");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$onHowToFindCodeClicked");
        int n3 = Me3.b(this.e | 1);
        long l2 = this.d;
        Object object4 = object;
        object4 = (fe2_1)object;
        kk2_2.a(la2_02, string2, (fe2_1)object4, l2, (b30_0)object3, n3);
        return Unit.a;
    }
}

