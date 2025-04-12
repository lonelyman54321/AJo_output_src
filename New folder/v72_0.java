/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from v72
 */
public final class v72_0
implements jj_2 {
    public final ak2_2 a;
    public final Object b;
    public final Object[] c;
    public final IJ$a d;
    public final x80_0 e;
    public volatile boolean f;
    public ij_2 g;
    public Throwable h;
    public boolean i;

    public v72_0(ak2_2 ak2_22, Object object, Object[] objectArray, IJ$a iJ$a, x80_0 x80_02) {
        this.a = ak2_22;
        this.b = object;
        this.c = objectArray;
        this.d = iJ$a;
        this.e = x80_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        boolean bl2 = this.f;
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    ij_2 ij_22 = this.g;
                    if (ij_22 == null) return false;
                    bl2 = ij_22.a();
                    if (!bl2) return false;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return bl3;
            }
            throw throwable2;
        }
    }

    public final ij_2 b() {
        Object object;
        int n3;
        Object object2;
        Object object3;
        block14: {
            Object object4;
            Object object5;
            block17: {
                int n4;
                ArrayList<Object> arrayList;
                Object object6;
                Object object7;
                block16: {
                    block15: {
                        object3 = this.a;
                        object3.getClass();
                        object2 = this.c;
                        n3 = ((Object[])object2).length;
                        object = ((ak2_2)object3).k;
                        int n7 = ((fm2_2[])object).length;
                        if (n3 != n7) break block14;
                        boolean bl2 = ((ak2_2)object3).i;
                        boolean bl3 = ((ak2_2)object3).j;
                        object7 = ((ak2_2)object3).d;
                        object6 = ((ak2_2)object3).c;
                        Object object8 = ((ak2_2)object3).e;
                        Object object9 = ((ak2_2)object3).f;
                        jn1_0 jn1_02 = ((ak2_2)object3).g;
                        boolean bl4 = ((ak2_2)object3).h;
                        arrayList = object5;
                        object5 = new sj2_1((String)object7, (ob1_1)object6, (String)object8, (m41_0)object9, jn1_02, bl4, bl2, bl3);
                        boolean bl5 = ((ak2_2)object3).l;
                        if (bl5) {
                            n3 += -1;
                        }
                        arrayList = new ArrayList<Object>(n3);
                        object7 = null;
                        object6 = null;
                        for (n4 = 0; n4 < n3; ++n4) {
                            object8 = object2[n4];
                            arrayList.add(object8);
                            object8 = object[n4];
                            object9 = object2[n4];
                            ((fm2_2)object8).a((sj2_1)object5, object9);
                        }
                        object2 = ((sj2_1)object5).d;
                        n3 = 0;
                        object4 = null;
                        if (object2 == null) break block15;
                        object2 = ((Ob1$a)object2).b();
                        break block16;
                    }
                    object2 = ((sj2_1)object5).c;
                    object = ((sj2_1)object5).b;
                    object.getClass();
                    object6 = "link";
                    Intrinsics.checkNotNullParameter(object2, (String)object6);
                    object2 = object.g((String)object2);
                    object2 = object2 != null ? ((Ob1$a)object2).b() : null;
                    if (object2 == null) break block17;
                }
                object = ((sj2_1)object5).k;
                if (object == null) {
                    object6 = ((sj2_1)object5).j;
                    if (object6 != null) {
                        object4 = ((DV0$a)object6).b;
                        object7 = ((DV0$a)object6).c;
                        object = new dv0_2((List)object4, (List)object7);
                    } else {
                        object6 = ((sj2_1)object5).i;
                        if (object6 != null) {
                            object = ((cr1$a_0)object6).a();
                        } else {
                            n4 = (int)(((sj2_1)object5).h ? 1 : 0);
                            if (n4 != 0) {
                                object = new byte[0];
                                object = pj2_2.create(null, (byte[])object);
                            }
                        }
                    }
                }
                object4 = ((sj2_1)object5).g;
                object7 = ((sj2_1)object5).f;
                if (object4 != null) {
                    if (object != null) {
                        object6 = new SJ2$a((pj2_2)object, (jn1_0)object4);
                        object = object6;
                    } else {
                        object6 = "Content-Type";
                        object4 = ((jn1_0)object4).a;
                        ((m41$a_0)object7).a((String)object6, (String)object4);
                    }
                }
                object4 = ((sj2_1)object5).e;
                object4.getClass();
                Intrinsics.checkNotNullParameter(object2, "url");
                ((KJ2$a)object4).a = object2;
                object2 = ((m41$a_0)object7).e();
                Intrinsics.checkNotNullParameter(object2, "headers");
                ((KJ2$a)object4).c = object2 = ((m41_0)object2).e();
                object2 = ((sj2_1)object5).a;
                ((KJ2$a)object4).e((String)object2, (pj2_2)object);
                object = ((ak2_2)object3).b;
                object5 = this.b;
                object3 = ((ak2_2)object3).a;
                object2 = new mk1_0((Class)object3, object5, (Method)object, arrayList);
                ((KJ2$a)object4).g(mk1_0.class, object2);
                object3 = ((KJ2$a)object4).b();
                return this.d.b((kj2_2)object3);
            }
            object2 = new StringBuilder("Malformed URL. Base: ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(", Relative: ");
            object4 = ((sj2_1)object5).c;
            ((StringBuilder)object2).append((String)object4);
            object2 = ((StringBuilder)object2).toString();
            object3 = new IllegalArgumentException((String)object2);
            throw object3;
        }
        object2 = wk0_0.a(n3, "Argument count (", ") doesn't match expected count (");
        object2 = g30.a(((fm2_2[])object).length, ")", (StringBuilder)object2);
        object3 = new IllegalArgumentException((String)object2);
        throw object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void cancel() {
        boolean bl2;
        this.f = bl2 = true;
        // MONITORENTER : this
        ij_2 ij_22 = this.g;
        // MONITOREXIT : this
        if (ij_22 == null) return;
        ij_22.cancel();
    }

    public final jj_2 clone() {
        Object object = this.b;
        Object[] objectArray = this.c;
        ak2_2 ak2_22 = this.a;
        IJ$a iJ$a = this.d;
        x80_0 x80_02 = this.e;
        v72_0 v72_02 = new v72_0(ak2_22, object, objectArray, iJ$a, x80_02);
        return v72_02;
    }

    public final Object clone() {
        Object object = this.b;
        Object[] objectArray = this.c;
        ak2_2 ak2_22 = this.a;
        IJ$a iJ$a = this.d;
        x80_0 x80_02 = this.e;
        v72_0 v72_02 = new v72_0(ak2_22, object, objectArray, iJ$a, x80_02);
        return v72_02;
    }

    /*
     * WARNING - void declaration
     */
    public final ij_2 d() {
        void var1_5;
        Object object = this.g;
        if (object != null) {
            return object;
        }
        object = this.h;
        if (object != null) {
            boolean bl2 = object instanceof IOException;
            if (!bl2) {
                bl2 = object instanceof RuntimeException;
                if (bl2) {
                    throw (RuntimeException)object;
                }
                throw (Error)object;
            }
            throw (IOException)object;
        }
        object = this.b();
        try {
            this.g = object;
            return object;
        }
        catch (IOException iOException) {
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        cz3_0.n((Throwable)var1_5);
        this.h = var1_5;
        throw var1_5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dl2_2 e(cl2_2 object) {
        Throwable throwable2;
        Object object2;
        block10: {
            object2 = ((cl2_2)object).g;
            object = ((cl2_2)object).h();
            Object object3 = ((il2_2)object2).d();
            long l2 = ((il2_2)object2).c();
            Object object4 = new v72$c((jn1_0)object3, l2);
            ((cl2$a_0)object).g = object4;
            object = ((cl2$a_0)object).a();
            object4 = null;
            int n3 = ((cl2_2)object).d;
            int n4 = 200;
            if (n3 >= n4 && n3 < (n4 = 300)) {
                n4 = 204;
                String string2 = "rawResponse must be successful response";
                if (n3 != n4 && n3 != (n4 = 205)) {
                    object3 = new v72$b((il2_2)object2);
                    try {
                        object2 = this.e;
                        object2 = object2.convert(object3);
                        n3 = (int)(((cl2_2)object).d() ? 1 : 0);
                        if (n3 != 0) {
                            return new dl2_2((cl2_2)object, object2, null);
                        }
                        object = new IllegalArgumentException(string2);
                        throw object;
                    }
                    catch (RuntimeException runtimeException) {
                        object2 = ((v72$b)object3).d;
                        if (object2 != null) throw object2;
                        throw runtimeException;
                    }
                }
                ((il2_2)object2).close();
                boolean bl2 = ((cl2_2)object).d();
                if (bl2) {
                    return new dl2_2((cl2_2)object, null, null);
                }
                object = new IllegalArgumentException(string2);
                throw object;
            }
            try {
                object3 = new ce_2();
                Object object5 = ((il2_2)object2).h();
                object5.j0((y63_0)object3);
                object5 = ((il2_2)object2).d();
                long l3 = ((il2_2)object2).c();
                Object object6 = "content";
                Intrinsics.checkNotNullParameter(object3, (String)object6);
                object6 = "<this>";
                Intrinsics.checkNotNullParameter(object3, (String)object6);
                object6 = new jl2_2((jn1_0)object5, l3, (se_1)object3);
                n4 = (int)(((cl2_2)object).d() ? 1 : 0);
                if (n4 == 0) {
                    object3 = new dl2_2((cl2_2)object, null, (jl2_2)object6);
                    ((il2_2)object2).close();
                    return object3;
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            {
                object4 = "rawResponse should not be successful response";
                object = new IllegalArgumentException((String)object4);
                throw object;
            }
        }
        ((il2_2)object2).close();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dl2_2 execute() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl2 = this.i;
                    if (!bl2) {
                        this.i = bl2 = true;
                        Object object = this.d();
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl7 : MonitorExitStatement: MONITOREXIT : this
                        boolean bl3 = this.f;
                        if (bl3) {
                            object.cancel();
                        }
                        object = object.execute();
                        return this.e((cl2_2)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    String string2 = "Already executed.";
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(vj_2 var1_1) {
        synchronized (this) {
            var2_3 = this.i;
            if (var2_3) ** GOTO lbl29
            this.i = var2_3 = true;
            var3_4 = this.g;
            var4_6 = this.h;
            if (var3_4 != null || var4_6 != null) ** GOTO lbl18
            {
                catch (Throwable var1_2) {}
            }
            try {
                this.g = var5_8 = this.b();
                var3_4 = var5_8;
                ** GOTO lbl18
            }
            catch (Throwable var4_7) {
                cz3_0.n(var4_7);
                this.h = var4_7;
lbl18:
                // 3 sources

                // MONITOREXIT @DISABLED, blocks:[2, 4, 5] lbl17 : MonitorExitStatement: MONITOREXIT : this
                if (var4_6 != null) {
                    var1_1.b(this, (Throwable)var4_6);
                    return;
                }
                var6_9 = this.f;
                if (var6_9) {
                    var3_4.cancel();
                }
                var4_6 = new v72$a(this, (vj_2)var1_1);
                var3_4.c((wj_2)var4_6);
                return;
lbl29:
                // 2 sources

                var3_5 = "Already executed.";
                var1_1 = new IllegalStateException(var3_5);
                throw var1_1;
            }
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kj2_2 request() {
        synchronized (this) {
            Throwable throwable22222;
            ij_2 ij_22 = this.d();
            return ij_22.request();
            {
                catch (Throwable throwable22222) {
                }
                catch (IOException iOException) {}
                {
                    String string2 = "Unable to create request.";
                    RuntimeException runtimeException = new RuntimeException(string2, iOException);
                    throw runtimeException;
                }
            }
            throw throwable22222;
        }
    }
}

