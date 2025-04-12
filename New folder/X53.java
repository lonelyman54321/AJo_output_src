/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.core.CorruptionException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class X53
implements ui0 {
    public static final LinkedHashSet k;
    public static final Object l;
    public final Function0 a;
    public final f03 b;
    public final T90 c;
    public final i90_0 d;
    public final br2_2 e;
    public final String f;
    public final hh3_2 g;
    public final kb3_2 h;
    public List i;
    public final Y43 j;

    static {
        Object object = new LinkedHashSet();
        k = object;
        l = object = new Object();
    }

    public X53(ey2_2 object, List object2, T90 object3, i90_0 i90_02) {
        Object object4 = sy2_1.a;
        Intrinsics.checkNotNullParameter(object, "produceFile");
        Intrinsics.checkNotNullParameter(object4, "serializer");
        Intrinsics.checkNotNullParameter(object2, "initTasksList");
        Intrinsics.checkNotNullParameter(object3, "corruptionHandler");
        Intrinsics.checkNotNullParameter(i90_02, "scope");
        this.a = object;
        this.b = object4;
        this.c = object3;
        this.d = i90_02;
        super(this, null);
        this.e = object4 = new br2_2((Function2)object);
        this.f = ".tmp";
        super(this);
        object = yr1_2.b((Function0)object);
        this.g = object;
        this.h = object = lb3_2.a(Iv3.a);
        this.i = object = CollectionsKt.k0((Iterable)object2);
        object2 = new Y53(this);
        object4 = new a63_0(this, null);
        object3 = Z53.c;
        this.j = object = new Y43(i90_02, (Y53)object2, (Function2)object3, (a63_0)object4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(X53 var0, X53$a$b var1_1, f80_0 var2_4) {
        block23: {
            block24: {
                block25: {
                    block30: {
                        block26: {
                            block29: {
                                block27: {
                                    block28: {
                                        var0.getClass();
                                        var3_5 = var2_4 instanceof e63_0;
                                        if (!var3_5) ** GOTO lbl-1000
                                        var4_6 = var2_4;
                                        var4_6 = (e63_0)var2_4;
                                        var5_7 = var4_6.f;
                                        var6_8 = -1 << -1;
                                        var7_9 = var5_7 & var6_8;
                                        if (var7_9 != 0) {
                                            var4_6.f = var5_7 -= var6_8;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var4_6 = new e63_0((X53)var0, (f80_0)var2_4);
                                        }
                                        var2_4 = var4_6.d;
                                        var8_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                        var6_8 = var4_6.f;
                                        var7_9 = 3;
                                        var9_11 = 2;
                                        var10_12 = 1;
                                        if (var6_8 == 0) ** GOTO lbl46
                                        if (var6_8 == var10_12) break block27;
                                        if (var6_8 == var9_11) break block28;
                                        if (var6_8 != var7_9) {
                                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var0;
                                        }
                                        var0 = (w00_0)var4_6.a;
                                        break block29;
                                    }
                                    var0 = var4_6.c;
                                    var1_1 = var4_6.b;
                                    var11_13 = (X53$a$b)var4_6.a;
                                    try {
                                        vl2_2.b(var2_4);
                                        var2_4 = var0;
                                        var0 = var1_1;
                                        var1_1 = var11_13;
                                        ** GOTO lbl79
                                    }
                                    catch (Throwable var1_2) {}
                                }
                                var0 = (w00_0)var4_6.a;
                            }
                            break block30;
                            ** finally { 
lbl45:
                            // 1 sources

                            break block23;
lbl46:
                            // 1 sources

                            vl2_2.b(var2_4);
                            var2_4 = var1_1.b;
                            var11_13 = tl2_2.b;
                            var11_13 = var0.h;
                            var11_13 = var11_13.getValue();
                            var11_13 = (gb3_0)var11_13;
                            var12_14 = var11_13 instanceof Yh0;
                            if (var12_14) {
                                var11_13 = var1_1.a;
                                var1_1 = var1_1.d;
                                var4_6.a = var2_4;
                                var4_6.f = var10_12;
                                var0 = var0.i((f80_0)var4_6, (CoroutineContext)var1_1, (Function2)var11_13);
                                if (var0 == var8_10 /* !! */ ) {
                                    return var8_10 /* !! */ ;
                                }
                            }
                            var12_14 = var11_13 instanceof AE2;
                            if (!var12_14) {
                                var10_12 = var11_13 instanceof Iv3;
                            }
                            if (var10_12 == 0) break block24;
                            var14_16 = var1_1.c;
                            if (var11_13 != var14_16) break block25;
                            var4_6.a = var1_1;
                            var4_6.b = var0;
                            var4_6.c = var2_4;
                            var4_6.f = var9_11;
                            var11_13 = var0.e((f80_0)var4_6);
                            if (var11_13 != var8_10 /* !! */ ) break block26;
                            return var8_10 /* !! */ ;
                        }
                        var11_13 = var1_1.a;
                        var1_1 = var1_1.d;
                        var4_6.a = var2_4;
                        var9_11 = 0;
                        var4_6.b = null;
                        var4_6.c = null;
                        var4_6.f = var7_9;
                        if ((var0 = var0.i((f80_0)var4_6, (CoroutineContext)var1_1, (Function2)var11_13)) == var8_10 /* !! */ ) {
                            return var8_10 /* !! */ ;
                        }
                    }
                    vl2_2.b(var2_4);
                    var1_1 = tl2_2.b;
                    return var1_1;
                }
                try {
                    var11_13 = (AE2)var11_13;
                    var0 = var11_13.a;
                    throw var0;
                }
                catch (Throwable var1_3) {}
            }
            var15_17 = var11_13 instanceof ln0_0;
            if (!var15_17) ** GOTO lbl108
            var11_13 = (ln0_0)var11_13;
            var0 = var11_13.a;
            throw var0;
lbl108:
            // 1 sources

            var0 = new NoWhenBranchMatchedException();
            throw var0;
            {
                finally {
                    var13_15 = var2_4;
                }
            }
        }
        var2_4 = tl2_2.b;
        var2_4 = vl2_2.a((Throwable)var1_1);
        var1_1 = tl2_2.a(var2_4);
        if (var1_1 == null) {
            var0.M(var2_4);
            return Unit.a;
        } else {
            var0.c((Throwable)var1_1);
        }
        return Unit.a;
    }

    public final Object a(Function2 object, f80_0 object2) {
        x00_0 x00_02 = y00_0.b();
        gb3_0 gb3_02 = (gb3_0)this.h.getValue();
        CoroutineContext coroutineContext = object2.getContext();
        X53$a$b x53$a$b = new X53$a$b((Function2)object, x00_02, gb3_02, coroutineContext);
        this.j.a(x53$a$b);
        object = x00_02.D((f80_0)object2);
        object2 = j90_0.COROUTINE_SUSPENDED;
        return object;
    }

    public final File c() {
        return (File)this.g.getValue();
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(f80_0 var1_1) {
        block17: {
            block18: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                var2_3 = var1_1 instanceof X53$c;
                                if (!var2_3) ** GOTO lbl-1000
                                var3_4 = var1_1;
                                var3_4 = (X53$c)var1_1;
                                var4_5 = var3_4.i;
                                var5_6 = -1 << -1;
                                var6_7 = var4_5 & var5_6;
                                if (var6_7 != 0) {
                                    var3_4.i = var4_5 -= var5_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var3_4 = new X53$c(this, (f80_0)var1_1);
                                }
                                var1_1 = var3_4.g;
                                var7_8 = j90_0.COROUTINE_SUSPENDED;
                                var5_6 = var3_4.i;
                                var6_7 = 3;
                                var8_9 = 2;
                                var9_10 = 1;
                                if (var5_6 == 0) break block13;
                                if (var5_6 == var9_10) break block14;
                                if (var5_6 == var8_9) break block15;
                                if (var5_6 != var6_7) break block16;
                                var7_8 = (hs1_2)var3_4.d;
                                var10_11 = (Ref$BooleanRef)var3_4.c;
                                var11_12 = (Ref$ObjectRef)var3_4.b;
                                var3_4 = var3_4.a;
                                vl2_2.b(var1_1);
                                break block17;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var10_11 = var3_4.f;
                        var12_13 = var3_4.e;
                        var13_14 = (Ref$BooleanRef)var3_4.d;
                        var14_15 = (Ref$ObjectRef)var3_4.c;
                        var15_16 = (hs1_2)var3_4.b;
                        var16_17 = var3_4.a;
                        vl2_2.b(var1_1);
                        ** GOTO lbl86
                    }
                    var10_11 = (Ref$ObjectRef)var3_4.d;
                    var12_13 = (Ref$ObjectRef)var3_4.c;
                    var13_14 = (hs1_2)var3_4.b;
                    var14_15 = var3_4.a;
                    vl2_2.b(var1_1);
                    break block18;
                }
                vl2_2.b(var1_1);
                var1_1 = this.h;
                var10_11 = var1_1.getValue();
                var12_13 = Iv3.a;
                var5_6 = (int)Intrinsics.areEqual(var10_11, var12_13);
                if (var5_6 == 0 && !(var17_18 = (var1_1 = var1_1.getValue()) instanceof AE2)) {
                    var3_4 = "Check failed.".toString();
                    var1_1 = new IllegalStateException((String)var3_4);
                    throw var1_1;
                }
                var13_14 = ls1_2.a();
                var10_11 = new Iterator<T>();
                var3_4.a = this;
                var3_4.b = var13_14;
                var3_4.c = var10_11;
                var3_4.d = var10_11;
                var3_4.i = var9_10;
                var1_1 = this.h((f80_0)var3_4);
                if (var1_1 == var7_8) {
                    return var7_8;
                }
                var14_15 = this;
                var12_13 = var10_11;
            }
            var10_11.element = var1_1;
            var1_1 = new Ref$BooleanRef();
            var10_11 = new Iterator<T>((hs1_2)var13_14, (Ref$BooleanRef)var1_1, (Ref$ObjectRef)var12_13, (X53)var14_15);
            var15_16 = var14_15.i;
            if (var15_16 == null) {
                var10_11 = var1_1;
                var1_1 = var3_4;
                var3_4 = var14_15;
            } else {
                var15_16 = ((Iterable)var15_16).iterator();
                var16_17 = var14_15;
                var14_15 = var12_13;
                var12_13 = var10_11;
                var10_11 = var15_16;
                var15_16 = var13_14;
                var13_14 = var1_1;
lbl86:
                // 3 sources

                while (var17_18 = var10_11.hasNext()) {
                    var1_1 = (Function2)var10_11.next();
                    var3_4.a = var16_17;
                    var3_4.b = var15_16;
                    var3_4.c = var14_15;
                    var3_4.d = var13_14;
                    var3_4.e = var12_13;
                    var3_4.f = var10_11;
                    var3_4.i = var8_9;
                    if ((var1_1 = var1_1.invoke(var12_13, var3_4)) != var7_8) continue;
                    return var7_8;
                }
                var1_1 = var3_4;
                var10_11 = var13_14;
                var12_13 = var14_15;
                var13_14 = var15_16;
                var3_4 = var16_17;
            }
            var3_4.i = null;
            var1_1.a = var3_4;
            var1_1.b = var12_13;
            var1_1.c = var10_11;
            var1_1.d = var13_14;
            var1_1.e = null;
            var1_1.f = null;
            var1_1.i = var6_7;
            var1_1 = var13_14.d((f80_0)var1_1, null);
            if (var1_1 == var7_8) {
                return var7_8;
            }
            var11_12 = var12_13;
            var7_8 = var13_14;
        }
        var10_11.element = var9_10;
        var1_1 = Unit.a;
        var1_1 = var3_4.h;
        var7_8 = var11_12.element;
        if (var7_8 != null) {
            var5_6 = var7_8.hashCode();
        } else {
            var5_6 = 0;
            var10_11 = null;
        }
        var3_4 = new Yh0(var7_8, var5_6);
        var1_1.getClass();
        var1_1.k(null, var3_4);
        return Unit.a;
        finally {
            var7_8.b(null);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object e(f80_0 var1_1) {
        block11: {
            block10: {
                var2_5 = var1_1 instanceof X53$e;
                if (!var2_5) ** GOTO lbl-1000
                var3_6 = var1_1;
                var3_6 = (X53$e)var1_1;
                var4_7 = var3_6.d;
                var5_8 = -1 << -1;
                var6_9 = var4_7 & var5_8;
                if (var6_9 != 0) {
                    var3_6.d = var4_7 -= var5_8;
                } else lbl-1000:
                // 2 sources

                {
                    var3_6 = new X53$e(this, (f80_0)var1_1);
                }
                var1_1 = var3_6.b;
                var7_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var5_8 = var3_6.d;
                var6_9 = 1;
                if (var5_8 != 0) {
                    if (var5_8 == var6_9) {
                        var3_6 = var3_6.a;
                        try {
                            vl2_2.b(var1_1);
                            break block10;
                        }
                        catch (Throwable var1_2) {
                            break block11;
                        }
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                var3_6.a = this;
                var3_6.d = var6_9;
                try {
                    var1_1 = this.d((f80_0)var3_6);
                    if (var1_1 != var7_10 /* !! */ ) break block10;
                    return var7_10 /* !! */ ;
                }
                catch (Throwable var1_3) {
                    var3_6 = this;
                }
            }
            return Unit.a;
        }
        var3_6 = var3_6.h;
        var7_10 /* !! */  = new AE2((Throwable)var1_4);
        var3_6.getClass();
        var3_6.k(null, (Object)var7_10 /* !! */ );
        throw var1_4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f(f80_0 var1_1) {
        block11: {
            block12: {
                var2_5 = var1_1 instanceof X53$f;
                if (!var2_5) ** GOTO lbl-1000
                var3_6 = var1_1;
                var3_6 = (X53$f)var1_1;
                var4_7 = var3_6.d;
                var5_8 = -1 << -1;
                var6_9 = var4_7 & var5_8;
                if (var6_9 != 0) {
                    var3_6.d = var4_7 -= var5_8;
                } else lbl-1000:
                // 2 sources

                {
                    var3_6 = new X53$f(this, (f80_0)var1_1);
                }
                var1_1 = var3_6.b;
                var7_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var5_8 = var3_6.d;
                var6_9 = 1;
                if (var5_8 != 0) {
                    if (var5_8 == var6_9) {
                        var3_6 = var3_6.a;
                        try {
                            vl2_2.b(var1_1);
                            break block11;
                        }
                        catch (Throwable var1_2) {
                            break block12;
                        }
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                var3_6.a = this;
                var3_6.d = var6_9;
                try {
                    var1_1 = this.d((f80_0)var3_6);
                    if (var1_1 == var7_10 /* !! */ ) {
                        return var7_10 /* !! */ ;
                    }
                    break block11;
                }
                catch (Throwable var1_3) {
                    var3_6 = this;
                }
            }
            var3_6 = var3_6.h;
            var7_10 /* !! */  = new AE2(var1_4);
            var3_6.getClass();
            var1_4 = null;
            var3_6.k(null, (Object)var7_10 /* !! */ );
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object g(f80_0 var1_1) {
        block19: {
            block18: {
                block17: {
                    var2_6 = var1_1 instanceof X53$g;
                    if (!var2_6) ** GOTO lbl-1000
                    var3_7 = var1_1;
                    var3_7 = (X53$g)var1_1;
                    var4_9 = var3_7.e;
                    var5_10 = -1 << -1;
                    var6_11 = var4_9 & var5_10;
                    if (var6_11 != 0) {
                        var3_7.e = var4_9 -= var5_10;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_7 = new X53$g(this, (f80_0)var1_1);
                    }
                    var1_1 = var3_7.c;
                    var7_12 = j90_0.COROUTINE_SUSPENDED;
                    var5_10 = var3_7.e;
                    var6_11 = 1;
                    if (var5_10 != 0) {
                        if (var5_10 != var6_11) {
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var7_12 = var3_7.b;
                        var3_7 = var3_7.a;
                        try {
                            vl2_2.b(var1_1);
                            break block17;
                        }
                        catch (Throwable var1_2) {
                            break block18;
                        }
                    }
                    vl2_2.b(var1_1);
                    var8_13 = this.c();
                    var1_1 = new FileInputStream((File)var8_13);
                    var8_13 = this.b;
                    var3_7.a = this;
                    var3_7.b = var1_1;
                    var3_7.e = var6_11;
                    var3_7 = var8_13.b((FileInputStream)var1_1);
                    if (var3_7 == var7_12) {
                        return var7_12;
                    }
                    var7_12 = var1_1;
                    var1_1 = var3_7;
                    var3_7 = this;
                }
                var5_10 = 0;
                var8_13 = null;
                xj3_1.b((Closeable)var7_12, null);
                return var1_1;
                {
                    catch (FileNotFoundException var1_3) {}
                }
                catch (Throwable var3_8) {}
                var7_12 = var1_1;
                var1_1 = var3_8;
                var3_7 = this;
            }
            try {
                throw var1_1;
            }
            catch (Throwable var8_14) {
                xj3_1.b((Closeable)var7_12, (Throwable)var1_1);
                throw var8_14;
            }
            break block19;
            catch (FileNotFoundException var1_4) {
                var3_7 = this;
            }
        }
        var7_12 = var3_7.c();
        var4_9 = (int)var7_12.exists();
        if (var4_9 == 0) {
            return var3_7.b.getDefaultValue();
        }
        throw var1_5;
    }

    public final es0_2 getData() {
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object h(f80_0 var1_1) {
        block22: {
            block21: {
                var2_7 = var1_1 instanceof X53$h;
                if (!var2_7) ** GOTO lbl-1000
                var3_8 = var1_1;
                var3_8 = (X53$h)var1_1;
                var4_9 = var3_8.e;
                var5_10 = -1 << -1;
                var6_11 = var4_9 & var5_10;
                if (var6_11 != 0) {
                    var3_8.e = var4_9 -= var5_10;
                } else lbl-1000:
                // 2 sources

                {
                    var3_8 = new X53$h(this, (f80_0)var1_1);
                }
                var1_1 = var3_8.c;
                var7_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var5_10 = var3_8.e;
                var6_11 = 3;
                var8_13 = 2;
                var9_14 = 1;
                if (var5_10 == 0) ** GOTO lbl41
                if (var5_10 != var9_14) {
                    if (var5_10 != var8_13) {
                        if (var5_10 == var6_11) {
                            var7_12 /* !! */  = var3_8.b;
                            var3_8 = (CorruptionException)var3_8.a;
                            try {
                                vl2_2.b(var1_1);
                                break block21;
                            }
                            catch (IOException var1_2) {
                                break block22;
                            }
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var10_15 = (CorruptionException)var3_8.b;
                    var11_16 = (X53)var3_8.a;
                    vl2_2.b(var1_1);
                } else {
                    block24: {
                        block23: {
                            var10_15 = (X53)var3_8.a;
                            try {
                                vl2_2.b(var1_1);
                                break block23;
                            }
                            catch (CorruptionException var1_3) {
                                break block24;
                            }
lbl41:
                            // 1 sources

                            vl2_2.b(var1_1);
                            var3_8.a = this;
                            var3_8.e = var9_14;
                            try {
                                var1_1 = this.g((f80_0)var3_8);
                                if (var1_1 != var7_12 /* !! */ ) break block23;
                                return var7_12 /* !! */ ;
                            }
                            catch (CorruptionException var1_4) {
                                var10_15 = this;
                            }
                        }
                        return var1_1;
                    }
                    var12_17 = var10_15.c;
                    var3_8.a = var10_15;
                    var3_8.b = var1_1;
                    var3_8.e = var8_13;
                    var11_16 = var12_17.a((CorruptionException)var1_1);
                    if (var11_16 == var7_12 /* !! */ ) {
                        return var7_12 /* !! */ ;
                    }
                    var13_18 = var10_15;
                    var10_15 = var1_1;
                    var1_1 = var11_16;
                    var11_16 = var13_18;
                }
                var3_8.a = var10_15;
                var3_8.b = var1_1;
                var3_8.e = var6_11;
                try {
                    var3_8 = var11_16.j((f80_0)var3_8, var1_1);
                    if (var3_8 == var7_12 /* !! */ ) {
                        return var7_12 /* !! */ ;
                    }
                    var7_12 /* !! */  = var1_1;
                }
                catch (IOException var1_5) {
                    var3_8 = var10_15;
                }
            }
            return var7_12 /* !! */ ;
        }
        yc0_2.a((Throwable)var3_8, (Throwable)var1_6);
        throw var3_8;
    }

    /*
     * Unable to fully structure code
     */
    public final Object i(f80_0 var1_1, CoroutineContext var2_2, Function2 var3_3) {
        block14: {
            block12: {
                block13: {
                    block9: {
                        block10: {
                            block11: {
                                var4_4 = var1_1 instanceof g63;
                                if (var4_4 == 0) ** GOTO lbl-1000
                                var5_5 = var1_1;
                                var5_5 = (g63)var1_1;
                                var6_6 = var5_5.f;
                                var7_7 = -1 << -1;
                                var8_8 = var6_6 & var7_7;
                                if (var8_8 != 0) {
                                    var5_5.f = var6_6 -= var7_7;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var5_5 = new g63(this, (f80_0)var1_1);
                                }
                                var1_1 = var5_5.d;
                                var9_9 = j90_0.COROUTINE_SUSPENDED;
                                var7_7 = var5_5.f;
                                var8_8 = 2;
                                var10_10 = 1;
                                if (var7_7 == 0) break block9;
                                if (var7_7 == var10_10) break block10;
                                if (var7_7 != var8_8) break block11;
                                var2_2 = var5_5.b;
                                var3_3 = var5_5.a;
                                vl2_2.b(var1_1);
                                break block12;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var2_2 = var5_5.c;
                        var3_3 = (Yh0)var5_5.b;
                        var11_11 = var5_5.a;
                        vl2_2.b(var1_1);
                        break block13;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = (Yh0)this.h.getValue();
                    var1_1.a();
                    var12_12 = var1_1.a;
                    var11_11 = new h63((Function2)var3_3, var12_12, null);
                    var5_5.a = this;
                    var5_5.b = var1_1;
                    var5_5.c = var12_12;
                    var5_5.f = var10_10;
                    var2_2 = Ae3.g(var5_5, (CoroutineContext)var2_2, (Function2)var11_11);
                    if (var2_2 == var9_9) {
                        return var9_9;
                    }
                    var11_11 = this;
                    var3_3 = var1_1;
                    var1_1 = var2_2;
                    var2_2 = var12_12;
                }
                var3_3.a();
                var13_13 = Intrinsics.areEqual(var2_2, var1_1);
                if (var13_13) break block14;
                var5_5.a = var11_11;
                var5_5.b = var1_1;
                var5_5.c = null;
                var5_5.f = var8_8;
                var2_2 = var11_11.j(var5_5, var1_1);
                if (var2_2 == var9_9) {
                    return var9_9;
                }
                var2_2 = var1_1;
                var3_3 = var11_11;
            }
            var1_1 = var3_3.h;
            if (var2_2 != null) {
                var4_4 = var2_2.hashCode();
            } else {
                var4_4 = 0;
                var5_5 = null;
            }
            var3_3 = new Yh0(var2_2, var4_4);
            var1_1.getClass();
            var1_1.k(null, var3_3);
        }
        return var2_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object j(f80_0 var1_1, Object var2_4) {
        block20: {
            block22: {
                var3_7 = "Unable to rename ";
                var4_8 = var1_1 instanceof i63;
                if (!var4_8) ** GOTO lbl-1000
                var5_9 = var1_1;
                var5_9 = (i63)var1_1;
                var6_10 = var5_9.g;
                var7_11 = -1 << -1;
                var8_12 = var6_10 & var7_11;
                if (var8_12 != 0) {
                    var5_9.g = var6_10 -= var7_11;
                } else lbl-1000:
                // 2 sources

                {
                    var5_9 = new i63(this, (f80_0)var1_1);
                }
                var1_1 = var5_9.e;
                var9_13 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var7_11 = var5_9.g;
                var8_12 = 1;
                if (var7_11 == 0) break block22;
                if (var7_11 != var8_12) {
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var2_4 = var5_9.d;
                var9_13 /* !! */  = var5_9.c;
                var10_14 = var5_9.b;
                var5_9 = var5_9.a;
                try {
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl91
                }
            }
            vl2_2.b(var1_1);
            var1_1 = this.c();
            var10_14 = var1_1.getCanonicalFile().getParentFile();
            if (var10_14 != null) {
                var10_14.mkdirs();
                var7_11 = (int)var10_14.isDirectory();
                if (var7_11 == 0) {
                    var1_1 = Intrinsics.stringPlus("Unable to create parent directories of ", var1_1);
                    var2_4 = new IOException((String)var1_1);
                    throw var2_4;
                }
            }
            var1_1 = this.c().getAbsolutePath();
            var11_15 = this.f;
            var1_1 = Intrinsics.stringPlus((String)var1_1, var11_15);
            var10_14 = new File((String)var1_1);
            var1_1 = new FileOutputStream(var10_14);
            {
                block21: {
                    catch (IOException var1_3) {
                        break block20;
                    }
                    try {
                        var11_15 = this.b;
                        var12_16 = new X53$b((FileOutputStream)var1_1);
                        var5_9.a = this;
                        var5_9.b = var10_14;
                        var5_9.c = var1_1;
                        var5_9.d = var1_1;
                        var5_9.g = var8_12;
                        var2_4 = var11_15.a(var2_4, var12_16);
                        if (var2_4 == var9_13 /* !! */ ) {
                            return var9_13 /* !! */ ;
                        }
                        var5_9 = this;
                        var2_4 = var1_1;
                        var9_13 /* !! */  = var1_1;
                    }
                    catch (Throwable var2_5) {
                        ** continue;
                    }
lbl68:
                    // 1 sources

                    while (true) {
                        var9_13 /* !! */  = var1_1;
                        var1_1 = var2_5;
                        break block21;
                        break;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = var2_4.getFD();
                        var1_1.sync();
                        var1_1 = Unit.a;
                        var13_17 = false;
                        var1_1 = null;
                    }
                    {
                        xj3_1.b((Closeable)var9_13 /* !! */ , null);
                        var1_1 = var5_9.c();
                        var13_17 = var10_14.renameTo((File)var1_1);
                        if (var13_17) {
                            return Unit.a;
                        }
                        var2_4 = new StringBuilder(var3_7);
                        var2_4.append(var10_14);
                        var3_7 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.";
                        var2_4.append(var3_7);
                        var2_4 = var2_4.toString();
                        var1_1 = new IOException((String)var2_4);
                        throw var1_1;
                    }
                }
                try {
                    throw var1_1;
                }
                catch (Throwable var2_6) {}
                {
                    xj3_1.b((Closeable)var9_13 /* !! */ , (Throwable)var1_1);
                    throw var2_6;
                }
            }
        }
        var14_18 = var10_14.exists();
        if (var14_18) {
            var10_14.delete();
        }
        throw var1_3;
    }
}

