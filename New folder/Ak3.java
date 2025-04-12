/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class Ak3
extends Lambda
implements Function1 {
    public final /* synthetic */ Un1 c;
    public final /* synthetic */ Bk3 d;
    public final /* synthetic */ Ref$BooleanRef e;

    public Ak3(Un1 un1, Bk3 bk3, Ref$BooleanRef ref$BooleanRef) {
        this.c = un1;
        this.d = bk3;
        this.e = ref$BooleanRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (hk3_0)object;
        Object object2 = Ak3$a.$EnumSwitchMapping$0;
        int n3 = this.c.ordinal();
        int n4 = object2[n3];
        n3 = 0;
        Object object3 = null;
        int n7 = 0;
        Pv3$a pv3$a = null;
        int n8 = -1;
        int n10 = 1;
        String string2 = "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection";
        Bk3 bk3 = this.d;
        switch (n4) {
            default: {
                break;
            }
            case 47: {
                object = bk3.h;
                if (object == null) break;
                object2 = ((Pv3)object).c;
                if (object2 != null) {
                    Pv3$a pv3$a2;
                    ((Pv3)object).c = object3 = ((Pv3$a)object2).a;
                    object3 = ((Pv3$a)object2).b;
                    pv3$a = ((Pv3)object).b;
                    ((Pv3)object).b = pv3$a2 = new Pv3$a(pv3$a, (ql3_0)object3);
                    n7 = ((Pv3)object).d;
                    ((Pv3)object).d = n3 = ((ql3_0)object3).a.a.length() + n7;
                    object3 = ((Pv3$a)object2).b;
                }
                if (object3 == null) break;
                object = bk3.k;
                object.invoke(object3);
                break;
            }
            case 46: {
                object2 = bk3.h;
                if (object2 != null) {
                    long l2 = ((Iw)object).f;
                    Sl sl = ((Iw)object).g;
                    int n14 = 4;
                    object = ql3_0.a(((hk3_0)object).h, sl, l2, n14);
                    ((Pv3)object2).a((ql3_0)object);
                }
                if ((object = bk3.h) == null) break;
                object2 = ((Pv3)object).b;
                if (object2 != null && (pv3$a = ((Pv3$a)object2).a) != null) {
                    Pv3$a pv3$a3;
                    ((Pv3)object).b = pv3$a;
                    n3 = ((Pv3)object).d;
                    n8 = ((Pv3$a)object2).b.a.a.length();
                    ((Pv3)object).d = n3 -= n8;
                    object2 = ((Pv3$a)object2).b;
                    object3 = ((Pv3)object).c;
                    ((Pv3)object).c = pv3$a3 = new Pv3$a((Pv3$a)object3, (ql3_0)object2);
                    object3 = pv3$a.b;
                }
                if (object3 == null) break;
                object = bk3.k;
                object.invoke(object3);
                break;
            }
            case 45: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0) {
                    long l3 = ((Iw)object).f;
                    n7 = mm3.c;
                    long l4 = 0xFFFFFFFFL;
                    n3 = (int)(l3 &= l4);
                    ((Iw)object).w(n3, n3);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 44: {
                ((Iw)object).q();
                ((Iw)object).v();
                break;
            }
            case 43: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0) {
                    ((Iw)object).w(0, 0);
                }
                Intrinsics.checkNotNull(object, string2);
                ((Iw)object).v();
                break;
            }
            case 42: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((hk3_0)object).i) != null) {
                    n4 = ((hk3_0)object).z((Ul3)object2, n10);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                ((Iw)object).v();
                break;
            }
            case 41: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((hk3_0)object).i) != null) {
                    n4 = ((hk3_0)object).z((Ul3)object2, n8);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                ((Iw)object).v();
                break;
            }
            case 40: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((Iw)object).c) != null) {
                    n4 = ((Iw)object).f((Tl3)object2, n10);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                ((Iw)object).v();
                break;
            }
            case 39: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((Iw)object).c) != null) {
                    n4 = ((Iw)object).f((Tl3)object2, n8);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                ((Iw)object).v();
                break;
            }
            case 38: {
                ((Iw)object).t();
                ((Iw)object).v();
                break;
            }
            case 37: {
                ((Iw)object).s();
                ((Iw)object).v();
                break;
            }
            case 36: {
                ((Iw)object).r();
                ((Iw)object).v();
                break;
            }
            case 35: {
                ((Iw)object).u();
                ((Iw)object).v();
                break;
            }
            case 34: {
                ((Iw)object).j();
                ((Iw)object).v();
                break;
            }
            case 33: {
                ((Iw)object).m();
                ((Iw)object).v();
                break;
            }
            case 32: {
                ((Iw)object).p();
                ((Iw)object).v();
                break;
            }
            case 31: {
                ((Iw)object).h();
                ((Iw)object).v();
                break;
            }
            case 30: {
                ((Iw)object).o();
                ((Iw)object).v();
                break;
            }
            case 29: {
                ((Iw)object).g();
                ((Iw)object).v();
                break;
            }
            case 28: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g;
                object3 = ((Sl)object2).a;
                n3 = ((String)object3).length();
                if (n3 > 0) {
                    object2 = ((Sl)object2).a;
                    n4 = ((String)object2).length();
                    ((Iw)object).w(0, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 27: {
                boolean bl2 = bk3.e;
                if (!bl2) {
                    object2 = "\t";
                    object = new bz_0((String)object2, n10);
                    object = a.b(object);
                    bk3.a((List)object);
                    break;
                }
                object = this.e;
                ((Ref$BooleanRef)object).element = false;
                break;
            }
            case 26: {
                boolean bl3 = bk3.e;
                if (!bl3) {
                    object2 = "\n";
                    object = new bz_0((String)object2, n10);
                    object = a.b(object);
                    bk3.a((List)object);
                    break;
                }
                object = bk3.a.u;
                n3 = bk3.l;
                object2 = new Qe1(n3);
                ((Vt1$a)object).invoke(object2);
                break;
            }
            case 25: {
                object2 = zk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 24: {
                object2 = yk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 23: {
                object2 = xk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 22: {
                object2 = wk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 21: {
                object2 = vk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 20: {
                object2 = uk3_0.c;
                object = ((hk3_0)object).y((Function1)object2);
                if (object == null) break;
                bk3.a((List)object);
                break;
            }
            case 19: {
                ((Iw)object).q();
                break;
            }
            case 18: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0) {
                    ((Iw)object).w(0, 0);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 17: {
                ((Iw)object).t();
                break;
            }
            case 16: {
                ((Iw)object).s();
                break;
            }
            case 15: {
                ((Iw)object).r();
                break;
            }
            case 14: {
                ((Iw)object).u();
                break;
            }
            case 13: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((hk3_0)object).i) != null) {
                    n4 = ((hk3_0)object).z((Ul3)object2, n10);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 12: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((hk3_0)object).i) != null) {
                    n4 = ((hk3_0)object).z((Ul3)object2, n8);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 11: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((Iw)object).c) != null) {
                    n4 = ((Iw)object).f((Tl3)object2, n10);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 10: {
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0 && (object2 = ((Iw)object).c) != null) {
                    n4 = ((Iw)object).f((Tl3)object2, n8);
                    ((Iw)object).w(n4, n4);
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 9: {
                ((Iw)object).j();
                break;
            }
            case 8: {
                ((Iw)object).m();
                break;
            }
            case 7: {
                ((Iw)object).p();
                break;
            }
            case 6: {
                ((Iw)object).h();
                break;
            }
            case 5: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0) {
                    long l7 = ((Iw)object).f;
                    n4 = (int)(mm3.b(l7) ? 1 : 0);
                    if (n4 != 0) {
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                        object2 = tk3_0.c;
                        ((tk3_0)object2).invoke(object);
                    } else {
                        n4 = (int)(((Iw)object).e() ? 1 : 0);
                        if (n4 != 0) {
                            l7 = ((Iw)object).f;
                            n4 = mm3.d(l7);
                            ((Iw)object).w(n4, n4);
                        } else {
                            l7 = ((Iw)object).f;
                            n4 = mm3.e(l7);
                            ((Iw)object).w(n4, n4);
                        }
                    }
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 4: {
                ((Iw)object).e.a = null;
                object2 = ((Iw)object).g.a;
                n4 = ((String)object2).length();
                if (n4 > 0) {
                    long l8 = ((Iw)object).f;
                    n4 = (int)(mm3.b(l8) ? 1 : 0);
                    if (n4 != 0) {
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                        object2 = sk3_0.c;
                        ((sk3_0)object2).invoke(object);
                    } else {
                        n4 = (int)(((Iw)object).e() ? 1 : 0);
                        if (n4 != 0) {
                            l8 = ((Iw)object).f;
                            n4 = mm3.e(l8);
                            ((Iw)object).w(n4, n4);
                        } else {
                            l8 = ((Iw)object).f;
                            n4 = mm3.d(l8);
                            ((Iw)object).w(n4, n4);
                        }
                    }
                }
                Intrinsics.checkNotNull(object, string2);
                break;
            }
            case 3: {
                object = bk3.b;
                ((Sk3)object).f();
                break;
            }
            case 2: {
                object = bk3.b;
                ((Sk3)object).n();
                break;
            }
            case 1: {
                object = bk3.b;
                ((Sk3)object).d(false);
            }
        }
        return Unit.a;
    }
}

