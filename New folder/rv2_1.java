/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Rv2
 */
public final class rv2_1
extends LP1$c
implements yr3_0,
gw2_0,
J30 {
    public final String n;
    public Uv2 o;
    public boolean p;
    public boolean q;

    public rv2_1(wi wi2, boolean bl2) {
        this.n = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.o = wi2;
        this.p = bl2;
    }

    public final void A0() {
        this.t1();
    }

    public final void F0() {
        this.A0();
    }

    public final void G(mv2_0 mv2_02, Nv2 nv2, long l2) {
        Nv2 nv22 = Nv2.Main;
        if (nv2 == nv22) {
            int n3 = mv2_02.d;
            int n4 = 4;
            if ((n3 = (int)(Pv2.a(n3, n4) ? 1 : 0)) != 0) {
                boolean bl2;
                this.q = bl2 = true;
                this.s1();
            } else {
                int n7 = mv2_02.d;
                n3 = 5;
                if ((n7 = (int)(Pv2.a(n7, n3) ? 1 : 0)) != 0) {
                    this.t1();
                }
            }
        }
    }

    public final /* synthetic */ void P() {
    }

    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final void a1() {
        this.A0();
    }

    public final void k1() {
        this.t1();
    }

    public final void r1() {
        Object object = new Ref$ObjectRef();
        Object object2 = new tv2_2((Ref$ObjectRef)object);
        Zr3.c(this, (Function1)object2);
        object = (rv2_1)((Ref$ObjectRef)object).element;
        if (object == null || (object = ((rv2_1)object).o) == null) {
            object = this.o;
        }
        object2 = O30.s;
        if ((object2 = (Wv2)K30.a(this, (H30)object2)) != null) {
            object2.a((Uv2)object);
        }
    }

    public final void s1() {
        boolean bl2;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        boolean bl3 = this.p;
        if (!bl3) {
            Rv2$a rv2$a = new Rv2$a(ref$BooleanRef);
            Zr3.d(this, rv2$a);
        }
        if (bl2 = ref$BooleanRef.element) {
            this.r1();
        }
    }

    public final void t1() {
        boolean bl2 = this.q;
        if (bl2) {
            Object object = null;
            this.q = false;
            bl2 = this.m;
            if (bl2) {
                object = new Ref$ObjectRef();
                qv2_1 qv2_12 = new qv2_1((Ref$ObjectRef)object);
                Zr3.c(this, qv2_12);
                object = (rv2_1)((Ref$ObjectRef)object).element;
                qv2_12 = null;
                if (object != null) {
                    ((rv2_1)object).r1();
                    object = Unit.a;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object == null) {
                    object = O30.s;
                    if ((object = (Wv2)K30.a(this, (H30)object)) != null) {
                        object.a(null);
                    }
                }
            }
        }
    }

    public final Object v() {
        return this.n;
    }
}

