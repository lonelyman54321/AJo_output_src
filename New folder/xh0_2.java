/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XH0
 */
public final class xh0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xh0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                s13_0 s13_02 = (s13_0)this.b;
                Intrinsics.checkNotNullParameter(s13_02, "$shareFileListener");
                yn3_0.a.e((Throwable)object);
                s13_02.a();
                return Unit.a;
            }
            case 0: 
        }
        object = (zp1)object;
        Object object2 = (ib3_0)this.b;
        Intrinsics.checkNotNullParameter(object2, "$isVisible$delegate");
        Intrinsics.checkNotNullParameter(object, "layoutCoordinates");
        tr1_0 tr1_02 = (tr1_0)object2.getValue();
        object2 = object.S();
        if (object2 != null) {
            object2 = ap1_0.c((zp1)object2);
            object = ap1_0.c((zp1)object);
            bl2 = ((aG2)object2).g((aG2)object);
        } else {
            bl2 = false;
            object = null;
        }
        object = bl2;
        tr1_02.setValue(object);
        return Unit.a;
    }
}

