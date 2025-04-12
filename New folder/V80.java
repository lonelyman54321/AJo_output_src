/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class V80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Al3 f;
    public final /* synthetic */ ql3_0 g;
    public final /* synthetic */ Se1 h;
    public final /* synthetic */ i72 i;
    public final /* synthetic */ Sk3 j;
    public final /* synthetic */ i90_0 k;
    public final /* synthetic */ MD l;

    public V80(Vt1 vt1, boolean bl2, boolean bl3, Al3 al3, ql3_0 ql3_02, Se1 se1, i72 i722, Sk3 sk3, i90_0 i90_02, MD mD) {
        this.c = vt1;
        this.d = bl2;
        this.e = bl3;
        this.f = al3;
        this.g = ql3_02;
        this.h = se1;
        this.i = i722;
        this.j = sk3;
        this.k = i90_02;
        this.l = mD;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (tu0_0)object;
        Object object2 = this.c;
        boolean bl3 = ((Vt1)object2).b();
        if (bl3 != (bl2 = object.isFocused())) {
            boolean bl4;
            Ul3 ul3;
            Object object3;
            Object object4;
            Object object5 = object.isFocused();
            Object object6 = ((Vt1)object2).f;
            ((h83_0)object6).setValue(object5);
            bl3 = ((Vt1)object2).b();
            if (bl3 && (bl3 = this.d) && !(bl3 = this.e)) {
                object5 = this.h;
                object6 = this.i;
                object4 = this.f;
                object3 = this.g;
                o90.f((Al3)object4, (Vt1)object2, (ql3_0)object3, (Se1)object5, (i72)object6);
            } else {
                o90.e((Vt1)object2);
            }
            bl3 = object.isFocused();
            bl2 = false;
            object6 = null;
            if (bl3 && (ul3 = ((Vt1)object2).d()) != null) {
                ql3_0 ql3_02 = this.g;
                object3 = this.l;
                Vt1 vt1 = this.c;
                i72 i722 = this.i;
                object4 = object2;
                object2 = new U80((MD)object3, ql3_02, vt1, ul3, i722, null);
                object5 = this.k;
                int n3 = 3;
                Ae3.d((i90_0)object5, null, null, (Function2)object2, n3);
            }
            if (!(bl4 = object.isFocused())) {
                object = this.j;
                ((Sk3)object).g(null);
            }
        }
        return Unit.a;
    }
}

