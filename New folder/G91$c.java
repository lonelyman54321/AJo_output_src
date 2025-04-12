/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;

public final class G91$c
implements R91$c,
Function0 {
    public final r91_0 a;
    public final /* synthetic */ g91_0 b;

    public G91$c(g91_0 g91_02, r91_0 r91_02) {
        Intrinsics.checkNotNullParameter(r91_02, "reader");
        this.b = g91_02;
        this.a = r91_02;
    }

    public final void a(int n3, ta0_2 object, ff_2 s91Array) {
        int n4 = 1;
        String string2 = "errorCode";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(s91Array, "debugData");
        s91Array.d();
        object = this.b;
        synchronized (object) {
            Object object2;
            s91Array = ((g91_0)object).c;
            s91Array = s91Array.values();
            string2 = null;
            try {
                object2 = new S91[]{};
                s91Array = s91Array.toArray((T[])object2);
                ((g91_0)object).g = n4;
                object2 = Unit.a;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
            }
            int n7 = s91Array.length;
            for (int i3 = 0; i3 < n7; i3 += n4) {
                object2 = s91Array[i3];
                int n8 = ((S91)object2).a;
                if (n8 <= n3 || (n8 = (int)(((S91)object2).h() ? 1 : 0)) == 0) continue;
                Object object3 = ta0_2.REFUSED_STREAM;
                ((S91)object2).k((ta0_2)((Object)object3));
                object3 = this.b;
                int n10 = ((S91)object2).a;
                ((g91_0)object3).h(n10);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int n3, long l2) {
        if (n3 == 0) {
            g91_0 g91_02 = this.b;
            synchronized (g91_02) {
                long l3;
                g91_02.w = l3 = g91_02.w + l2;
                Object object = "null cannot be cast to non-null type java.lang.Object";
                Intrinsics.checkNotNull(g91_02, (String)object);
                g91_02.notifyAll();
                object = Unit.a;
                return;
            }
        }
        g91_0 g91_03 = this.b;
        S91 s91 = g91_03.c(n3);
        if (s91 == null) return;
        synchronized (s91) {
            Object object;
            long l4;
            s91.f = l4 = s91.f + l2;
            l4 = 0L;
            long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (l7 > 0) {
                object = "null cannot be cast to non-null type java.lang.Object";
                Intrinsics.checkNotNull(s91, (String)object);
                s91.notifyAll();
            }
            object = Unit.a;
            return;
        }
    }

    public final void c(R03 r03) {
        Intrinsics.checkNotNullParameter(r03, "settings");
        Object object = this.b;
        b b2 = ((g91_0)object).i;
        Object object2 = new StringBuilder();
        object = ((g91_0)object).d;
        object = h30_0.a((StringBuilder)object2, (String)object, " applyAndAckSettings");
        object2 = new k91_0((String)object, this, r03);
        b2.c((ri3_1)object2, 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(int n3, List object) {
        Intrinsics.checkNotNullParameter(object, "requestHeaders");
        g91_0 g91_02 = this.b;
        g91_02.getClass();
        Object object2 = "requestHeaders";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        // MONITORENTER : g91_02
        object2 = g91_02.A;
        Object object3 = n3;
        boolean bl2 = object2.contains(object3);
        if (bl2) {
            object = ta0_2.PROTOCOL_ERROR;
            g91_02.u(n3, (ta0_2)((Object)object));
            // MONITOREXIT : g91_02
            return;
        }
        object2 = g91_02.A;
        object3 = n3;
        object2.add(object3);
        // MONITOREXIT : g91_02
        object2 = g91_02.j;
        object3 = new StringBuilder();
        Object object4 = g91_02.d;
        ((StringBuilder)object3).append((String)object4);
        char c2 = '[';
        ((StringBuilder)object3).append(c2);
        ((StringBuilder)object3).append(n3);
        ((StringBuilder)object3).append("] onRequest");
        object3 = ((StringBuilder)object3).toString();
        object4 = new n91_0((String)object3, g91_02, n3, (List)object);
        long l2 = 0L;
        ((b)object2).c((ri3_1)object4, l2);
    }

    public final void e(int n3, ta0_2 ta0_22) {
        int n4;
        CharSequence charSequence = "errorCode";
        Intrinsics.checkNotNullParameter((Object)ta0_22, (String)charSequence);
        g91_0 g91_02 = this.b;
        g91_02.getClass();
        if (n3 != 0 && (n4 = n3 & 1) == 0) {
            Intrinsics.checkNotNullParameter((Object)ta0_22, (String)charSequence);
            charSequence = new StringBuilder();
            Object object = g91_02.d;
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append('[');
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append("] onReset");
            charSequence = ((StringBuilder)charSequence).toString();
            object = new o91_0((String)charSequence, g91_02, n3, ta0_22);
            g91_02.j.c((ri3_1)object, 0L);
            return;
        }
        S91 s91 = g91_02.h(n3);
        if (s91 != null) {
            s91.k(ta0_22);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(boolean bl2, int n3, se_1 se_12, int n4) {
        Object object;
        S91 s91;
        block18: {
            Object object2;
            int n7;
            G91$c g91$c = this;
            int n8 = n3;
            Object object3 = se_12;
            int n10 = n4;
            boolean bl3 = true;
            Intrinsics.checkNotNullParameter(se_12, "source");
            Object object4 = this.b;
            object4.getClass();
            if (n3 != 0 && (n7 = n3 & 1) == 0) {
                n7 = 1;
            } else {
                n7 = 0;
                s91 = null;
            }
            long l2 = 0L;
            if (n7 != 0) {
                l91_0 l91_02;
                g91_0 g91_02 = g91$c.b;
                g91_02.getClass();
                Intrinsics.checkNotNullParameter(object3, "source");
                ce_2 ce_22 = new ce_2();
                long l3 = n10;
                object3.f(l3);
                object3.a0(ce_22, l3);
                object3 = new StringBuilder();
                String string2 = g91_02.d;
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append('[');
                ((StringBuilder)object3).append(n8);
                ((StringBuilder)object3).append("] onData");
                string2 = ((StringBuilder)object3).toString();
                object3 = l91_02;
                object4 = g91_02;
                n7 = n3;
                n10 = n4;
                boolean bl4 = bl2;
                l91_02 = new l91_0(string2, g91_02, n3, ce_22, n4, bl2);
                g91_02.j.c(l91_02, l2);
                return;
            }
            s91 = g91$c.b.c(n8);
            if (s91 == null) {
                g91_0 g91_03 = g91$c.b;
                object4 = ta0_2.PROTOCOL_ERROR;
                g91_03.u(n8, (ta0_2)((Object)object4));
                g91_0 g91_04 = g91$c.b;
                long l4 = n10;
                g91_04.n(l4);
                object3.skip(l4);
                return;
            }
            Intrinsics.checkNotNullParameter(object3, "source");
            object = ez3.a;
            object = s91.i;
            long l7 = n10;
            object.getClass();
            Object object5 = "source";
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            long l8 = l7;
            while ((object2 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) > 0) {
                block20: {
                    long l12;
                    Object object6;
                    block19: {
                        object5 = ((S91$b)object).f;
                        // MONITORENTER : object5
                        boolean bl5 = ((S91$b)object).b;
                        ce_2 ce_23 = ((S91$b)object).d;
                        long l14 = ce_23.b + l8;
                        long l15 = ((S91$b)object).a;
                        long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
                        if (l16 > 0) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            object6 = null;
                        }
                        object4 = Unit.a;
                        // MONITOREXIT : object5
                        if (bl3) {
                            object3.skip(l8);
                            object = ((S91$b)object).f;
                            object3 = ta0_2.FLOW_CONTROL_ERROR;
                            ((S91)object).e((ta0_2)((Object)object3));
                            break block18;
                        }
                        if (bl5) {
                            object3.skip(l8);
                            break block18;
                        }
                        object6 = ((S91$b)object).c;
                        l15 = object3.a0((ce_2)object6, l8);
                        long l17 = l15 - (l12 = (long)-1);
                        object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                        if (object2 == false) {
                            object = new EOFException();
                            throw object;
                        }
                        l8 -= l15;
                        object6 = ((S91$b)object).f;
                        // MONITORENTER : object6
                        boolean bl6 = ((S91$b)object).e;
                        if (!bl6) break block19;
                        object4 = ((S91$b)object).c;
                        ((ce_2)object4).b();
                        break block20;
                    }
                    object4 = ((S91$b)object).d;
                    l12 = ((ce_2)object4).b;
                    long l18 = l12 - l2;
                    object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                    if (object2 == false) {
                        object2 = 1;
                    } else {
                        object2 = 0;
                        object5 = null;
                    }
                    ce_2 ce_24 = ((S91$b)object).c;
                    ((ce_2)object4).s(ce_24);
                    if (object2 != false) {
                        object4 = "null cannot be cast to non-null type java.lang.Object";
                        Intrinsics.checkNotNull(object6, (String)object4);
                        object6.notifyAll();
                    }
                }
                // MONITOREXIT : object6
                bl3 = true;
            }
            object3 = ez3.a;
            object = ((S91$b)object).f.b;
            ((g91_0)object).n(l7);
        }
        if (!bl2) return;
        object = ez3.b;
        boolean bl7 = true;
        s91.j((m41_0)object, bl7);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(int var1_1, int var2_2, boolean var3_3) {
        if (var3_3 == 0) {
            var10_10 = this.b.i;
            var11_11 /* !! */  = new StringBuilder();
            var12_12 = this.b.d;
            var11_11 /* !! */  = h30_0.a(var11_11 /* !! */ , (String)var12_12, " ping");
            var12_12 = this.b;
            var13_13 = new j91_0((String)var11_11 /* !! */ , (g91_0)var12_12, var1_1, var2_2);
            var14_14 = 0L;
            var10_10.c(var13_13, var14_14);
            return;
        }
        var4_4 = this.b;
        synchronized (var4_4) {
            var3_3 = 1;
            var5_5 = 1L;
            if (var1_1 == var3_3) ** GOTO lbl30
            var3_3 = 2;
            if (var1_1 == var3_3) ** GOTO lbl28
            var3_3 = 3;
            if (var1_1 == var3_3) ** GOTO lbl-1000
            try {}
            catch (Throwable var7_7) {}
            ** GOTO lbl26
lbl-1000:
            // 1 sources

            {
                block4: {
                    var7_6 = "null cannot be cast to non-null type java.lang.Object";
                    Intrinsics.checkNotNull(var4_4, (String)var7_6);
                    var4_4.notifyAll();
lbl26:
                    // 2 sources

                    var7_6 = Unit.a;
                    break block4;
lbl28:
                    // 1 sources

                    var4_4.p = var8_8 = var4_4.p + var5_5;
                    break block4;
lbl30:
                    // 1 sources

                    var4_4.n = var8_9 = var4_4.n + var5_5;
                }
                return;
            }
            throw var7_7;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(int n3, List object, boolean bl2) {
        Object object2;
        block8: {
            int n4;
            char c2;
            long l2;
            g91_0 g91_02;
            block11: {
                int n7;
                block10: {
                    block9: {
                        int n8;
                        boolean bl3 = true;
                        Intrinsics.checkNotNullParameter(object, "headerBlock");
                        g91_0 g91_03 = this.b;
                        g91_03.getClass();
                        if (n3 == 0 || (n8 = n3 & 1) != 0) {
                            bl3 = false;
                            g91_02 = null;
                        }
                        l2 = 0L;
                        c2 = '[';
                        if (bl3) {
                            m91_0 m91_02;
                            g91_02 = this.b;
                            g91_02.getClass();
                            Intrinsics.checkNotNullParameter(object, "requestHeaders");
                            Object object3 = new StringBuilder();
                            String string2 = g91_02.d;
                            ((StringBuilder)object3).append(string2);
                            ((StringBuilder)object3).append(c2);
                            ((StringBuilder)object3).append(n3);
                            ((StringBuilder)object3).append("] onHeaders");
                            string2 = ((StringBuilder)object3).toString();
                            object3 = m91_02;
                            m91_02 = new m91_0(string2, g91_02, n3, (List)object, bl2);
                            g91_02.j.c(m91_02, l2);
                            return;
                        }
                        g91_02 = this.b;
                        // MONITORENTER : g91_02
                        object2 = g91_02.c(n3);
                        if (object2 != null) break block8;
                        n7 = g91_02.g;
                        if (n7 == 0) break block9;
                        return;
                    }
                    n7 = g91_02.e;
                    if (n3 > n7) break block10;
                    // MONITOREXIT : g91_02
                    return;
                }
                n7 = n3 % 2;
                n4 = g91_02.f;
                if (n7 != (n4 %= 2)) break block11;
                // MONITOREXIT : g91_02
                return;
            }
            m41_0 m41_02 = ez3.v((List)object);
            object2 = object;
            n4 = n3;
            object = new S91(n3, g91_02, false, bl2, m41_02);
            g91_02.e = n3;
            Object object4 = n3;
            object2 = g91_02.c;
            object2.put(object4, object);
            object4 = g91_02.h;
            object4 = ((c)object4).f();
            object2 = new StringBuilder();
            String string3 = g91_02.d;
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append(n3);
            String string4 = "] onStream";
            ((StringBuilder)object2).append(string4);
            string4 = ((StringBuilder)object2).toString();
            i91_0 i91_02 = new i91_0(string4, g91_02, (S91)object);
            ((b)object4).c(i91_02, l2);
            // MONITOREXIT : g91_02
            return;
        }
        Object object5 = Unit.a;
        // MONITOREXIT : g91_02
        object5 = ez3.v((List)object);
        ((S91)object2).j((m41_0)object5, bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        block11: {
            block12: {
                block10: {
                    var1_1 = this.b;
                    var2_2 = this.a;
                    var3_3 = ta0_2.INTERNAL_ERROR;
                    var4_4 = null;
                    var2_2.b(this);
                    do {
                        var5_7 = false;
                        var6_8 = null;
                    } while (var5_7 = var2_2.a(false, this));
                    var6_8 = ta0_2.NO_ERROR;
                    try {}
                    catch (IOException var4_5) {}
                    finally {
                        break block10;
                    }
lbl16:
                    // 2 sources

                    while (true) {
                        ez3.c(var2_2);
                        return Unit.a;
                    }
                    catch (Throwable var7_10) {
                        var6_8 = var3_3;
                        break block11;
                    }
                    catch (IOException var4_6) {
                        var6_8 = var3_3;
                        break block12;
                    }
                }
                var3_3 = ta0_2.CANCEL;
                var1_1.a(var6_8, var3_3, null);
                ** GOTO lbl16
            }
            var3_3 = ta0_2.PROTOCOL_ERROR;
            var1_1.a(var3_3, var3_3, var4_4);
            ** while (true)
        }
        var1_1.a(var6_8, var3_3, var4_4);
        ez3.c(var2_2);
        throw var7_11;
    }
}

