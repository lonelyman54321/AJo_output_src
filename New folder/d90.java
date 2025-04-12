/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public final class d90
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Vt1 e;
    public final /* synthetic */ UY2 f;
    public final /* synthetic */ ql3_0 g;

    public d90(boolean bl2, boolean bl3, Vt1 vt1, UY2 uY2, ql3_0 ql3_02) {
        this.c = bl2;
        this.d = bl3;
        this.e = vt1;
        this.f = uY2;
        this.g = ql3_02;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        object = (Sl)object;
        boolean bl2 = this.c;
        if (!bl2 && (bl2 = this.d)) {
            Object object2;
            Object object3 = this.e;
            Il3 il3 = ((Vt1)object3).e;
            Vt1$b vt1$b = ((Vt1)object3).t;
            Unit unit = null;
            if (il3 != null) {
                tn0_1 tn0_12 = new Object();
                bz_0 bz_02 = new bz_0((Sl)object, n3);
                int n4 = 2;
                Object[] objectArray = new mx0[n4];
                objectArray[0] = tn0_12;
                objectArray[n3] = bz_02;
                object2 = xx_2.i(objectArray);
                object3 = ((Vt1)object3).d;
                object2 = ((Gx0)object3).a((List)object2);
                il3.a(null, (ql3_0)object2);
                vt1$b.invoke(object2);
                unit = Unit.a;
            }
            if (unit == null) {
                object2 = this.g;
                object3 = ((ql3_0)object2).a.a;
                int n7 = mm3.c;
                long l2 = ((ql3_0)object2).b;
                n3 = (int)(l2 >> 32);
                long l3 = 0xFFFFFFFFL;
                n7 = (int)(l2 & l3);
                object3 = ((Object)StringsKt.X((CharSequence)object3, n3, n7, (CharSequence)object)).toString();
                int n8 = ((Sl)object).a.length() + n3;
                l2 = nm3.a(n8, n8);
                n3 = 4;
                object = new ql3_0((String)object3, l2, n3);
                vt1$b.invoke(object);
            }
            object = Boolean.TRUE;
        } else {
            object = Boolean.FALSE;
        }
        return object;
    }
}

