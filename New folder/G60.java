/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class G60
extends LP1$c
implements PD,
xp1_1,
J30 {
    public pg2_0 n;
    public final ku2_0 o;
    public boolean p;
    public UD q;
    public final LD r;
    public zp1 s;
    public aG2 t;
    public boolean u;
    public long v;
    public boolean w;

    public G60(pg2_0 object, ku2_0 ku2_02, boolean bl2, UD uD) {
        this.n = object;
        this.o = ku2_02;
        this.p = bl2;
        this.q = uD;
        this.r = object;
        this.v = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final float r1(G60 object, UD uD) {
        float f5;
        aG2 aG22;
        long l2 = ((G60)object).v;
        long l3 = 0L;
        boolean bl2 = bj1.b(l2, l3);
        float f6 = 0.0f;
        if (bl2) {
            return f6;
        }
        Object[] objectArray = ((G60)object).r.a;
        int n3 = objectArray.c;
        int n4 = 2;
        int n7 = 1;
        aG2 aG23 = null;
        if (n3 <= 0) {
            aG22 = null;
        } else {
            n3 -= n7;
            objectArray = objectArray.a;
            aG22 = null;
            do {
                int n8;
                aG2 aG24;
                if ((aG24 = (aG2)((G60$a)objectArray[n3]).a.invoke()) == null) continue;
                float f7 = aG24.d();
                float f8 = aG24.c();
                long l4 = bo1_1.a(f7, f8);
                long l7 = dj1.b(((G60)object).v);
                pg2_0 pg2_02 = ((G60)object).n;
                int[] nArray = G60$b.$EnumSwitchMapping$0;
                int n10 = pg2_02.ordinal();
                if ((n10 = nArray[n10]) != n7) {
                    if (n10 != n4) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    f7 = C63.d(l4);
                    f8 = C63.d(l7);
                    n8 = Float.compare(f7, f8);
                } else {
                    f7 = C63.b(l4);
                    f8 = C63.b(l7);
                    n8 = Float.compare(f7, f8);
                }
                if (n8 <= 0) {
                    aG22 = aG24;
                    continue;
                }
                if (aG22 != null) break;
                aG22 = aG24;
                break;
            } while ((n3 += -1) >= 0);
        }
        if (aG22 == null) {
            bl2 = ((G60)object).u;
            if (bl2) {
                aG23 = ((G60)object).s1();
            }
            if (aG23 == null) {
                return f6;
            }
            aG22 = aG23;
        }
        l2 = dj1.b(((G60)object).v);
        object = ((G60)object).n;
        int[] nArray = G60$b.$EnumSwitchMapping$0;
        int n14 = ((Enum)object).ordinal();
        if ((n14 = nArray[n14]) != n7) {
            if (n14 != n4) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            f5 = aG22.c;
            float f11 = aG22.a;
            f5 -= f11;
            float f12 = C63.d(l2);
            f5 = uD.a(f11, f5, f12);
            return f5;
        } else {
            f5 = aG22.d;
            float f14 = aG22.b;
            f5 -= f14;
            float f15 = C63.b(l2);
            f5 = uD.a(f14, f5, f15);
        }
        return f5;
    }

    public final Object G0(RD$a$a object, f80_0 f80_02) {
        long l2;
        boolean bl2;
        int n3 = 1;
        Object object2 = (aG2)((RD$a$a)object).invoke();
        if (object2 != null && !(bl2 = this.t1((aG2)object2, l2 = this.v))) {
            Object object3 = zj1_2.b(f80_02);
            object2 = new CancellableContinuationImpl(n3, (f80_0)object3);
            ((CancellableContinuationImpl)object2).r();
            object3 = new G60$a((RD$a$a)object, (CancellableContinuationImpl)object2);
            Object object4 = this.r;
            object4.getClass();
            object = (aG2)((RD$a$a)object).invoke();
            if (object == null) {
                object = tl2_2.b;
                object = Unit.a;
                ((CancellableContinuationImpl)object2).resumeWith(object);
            } else {
                block13: {
                    Object object5 = new KD((LD)object4, (G60$a)object3);
                    ((CancellableContinuationImpl)object2).x((Function1)object5);
                    object4 = ((LD)object4).a;
                    int n4 = ((WR1)object4).c - n3;
                    object5 = new c(0, n4, n3);
                    int n7 = ((c)object5).b;
                    if (n7 >= 0) {
                        while (true) {
                            Object object6;
                            if ((object6 = (aG2)((G60$a)((WR1)object4).a[n7]).a.invoke()) != null) {
                                Object object7 = ((aG2)object).e((aG2)object6);
                                boolean bl3 = Intrinsics.areEqual(object7, object);
                                if (bl3) {
                                    ((WR1)object4).a(n7 += n3, object3);
                                    break block13;
                                }
                                n4 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                                if (n4 == 0) {
                                    object7 = "bringIntoView call interrupted by a newer, non-overlapping call";
                                    object6 = new CancellationException((String)object7);
                                    int n8 = ((WR1)object4).c - n3;
                                    if (n8 <= n7) {
                                        while (true) {
                                            bl_2 bl_22 = ((G60$a)((WR1)object4).a[n7]).b;
                                            bl_22.e((Throwable)object6);
                                            if (n8 == n7) break;
                                            n8 += n3;
                                        }
                                    }
                                }
                            }
                            if (n7 == 0) break;
                            n7 += -1;
                        }
                    }
                    ((WR1)object4).a(0, object3);
                }
                boolean bl4 = this.w;
                if (!bl4) {
                    this.u1();
                }
            }
            object = ((CancellableContinuationImpl)object2).q();
            j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
            if (object == j90_02) {
                object2 = "frame";
                Intrinsics.checkNotNullParameter(f80_02, (String)object2);
            }
            if (object == j90_02) {
                return object;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public final boolean g1() {
        return false;
    }

    public final /* synthetic */ void o0(zp1 zp12) {
    }

    public final aG2 s1() {
        boolean bl2 = this.m;
        if (!bl2) {
            return null;
        }
        w32_0 w32_02 = go0.e(this);
        zp1 zp12 = this.s;
        if (zp12 != null) {
            boolean bl3 = zp12.e();
            if (!bl3) {
                zp12 = null;
            }
            if (zp12 != null) {
                return w32_02.G(zp12, false);
            }
        }
        return null;
    }

    public final boolean t1(aG2 aG22, long l2) {
        float f5;
        float f6;
        int n3;
        float f7;
        long l3 = this.v1(aG22, l2);
        float f8 = Math.abs(e72.d(l3));
        float f11 = f8 - (f7 = 0.5f);
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0 && (n3 = (f6 = (f5 = Math.abs(e72.e(l3))) - f7) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            aG22 = null;
        }
        return n3 != 0;
    }

    public final void u1() {
        Object object = this.q;
        if (object == null) {
            object = VD.a;
            object = (UD)K30.a(this, (H30)object);
        }
        boolean bl2 = this.w;
        int n3 = 1;
        if (bl2 ^= n3) {
            Object object2 = object.b();
            tw3 tw32 = new tw3((Gl)object2);
            object2 = this.f1();
            l90_0 l90_02 = l90_0.UNDISPATCHED;
            G60$c g60$c = new G60$c(this, tw32, (UD)object, null);
            Ae3.d((i90_0)object2, null, l90_02, g60$c, n3);
            return;
        }
        String string2 = "launchAnimation called when previous animation was running".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long v1(aG2 object, long l2) {
        l2 = dj1.b(l2);
        Object object2 = this.n;
        int[] nArray = G60$b.$EnumSwitchMapping$0;
        int n3 = ((Enum)object2).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != n4) {
            n4 = 2;
            f5 = 2.8E-45f;
            if (n3 == n4) {
                object2 = this.q;
                if (object2 == null) {
                    object2 = VD.a;
                    object2 = (UD)K30.a(this, (H30)object2);
                }
                f5 = ((aG2)object).c;
                float f6 = ((aG2)object).a;
                f5 -= f6;
                float f7 = C63.d(l2);
                f6 = object2.a(f6, f5, f7);
                return h72.a(f6, 0.0f);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object2 = this.q;
        if (object2 == null) {
            object2 = VD.a;
            object2 = (UD)K30.a(this, (H30)object2);
        }
        f5 = ((aG2)object).d;
        float f8 = ((aG2)object).b;
        f5 -= f8;
        float f11 = C63.b(l2);
        f8 = object2.a(f8, f5, f11);
        return h72.a(0.0f, f8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void x(long l2) {
        int n3;
        long l3 = this.v;
        this.v = l2;
        pg2_0 pg2_02 = this.n;
        int[] nArray = G60$b.$EnumSwitchMapping$0;
        int n4 = pg2_02.ordinal();
        int n7 = 1;
        if ((n4 = nArray[n4]) != n7) {
            int n8 = 2;
            if (n4 != n8) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            n4 = 32;
            long l4 = l2 >> n4;
            n3 = (int)l4;
            long l7 = l3 >> n4;
            n4 = (int)l7;
            n4 = Intrinsics.compare(n3, n4);
        } else {
            long l8 = 0xFFFFFFFFL;
            long l12 = l2 & l8;
            n4 = (int)l12;
            n3 = (int)(l8 &= l3);
            n4 = Intrinsics.compare(n4, n3);
        }
        if (n4 >= 0) {
            return;
        }
        aG2 aG22 = this.s1();
        if (aG22 != null) {
            boolean bl2;
            void var16_17;
            boolean bl3;
            aG2 aG23 = this.t;
            if (aG23 == null) {
                aG2 aG24 = aG22;
            }
            if ((n3 = (int)(this.w ? 1 : 0)) == 0 && (n3 = (int)(this.u ? 1 : 0)) == 0 && (bl3 = this.t1((aG2)var16_17, l3)) && !(bl2 = this.t1(aG22, l2))) {
                this.u = n7;
                this.u1();
            }
            this.t = aG22;
        }
    }

    public final aG2 y(aG2 object) {
        long l2 = this.v;
        long l3 = 0L;
        boolean bl2 = bj1.b(l2, l3) ^ true;
        if (bl2) {
            l2 = this.v;
            l2 = this.v1((aG2)object, l2) ^ 0x8000000080000000L;
            return ((aG2)object).i(l2);
        }
        String string2 = "Expected BringIntoViewRequester to not be used before parents are placed.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

