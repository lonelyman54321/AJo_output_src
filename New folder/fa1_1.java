/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from fa1
 */
public final class fa1_1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public final tx1_2 a;
    public final StringBuilder b;
    public final StringBuilder c;
    public final xl1_2 d;
    public final xl1_2 e;
    private volatile /* synthetic */ int requestLogged;
    private volatile /* synthetic */ int responseLogged;

    static {
        Class<fa1_1> clazz = fa1_1.class;
        f = AtomicIntegerFieldUpdater.newUpdater(clazz, "requestLogged");
        g = AtomicIntegerFieldUpdater.newUpdater(clazz, "responseLogged");
    }

    public fa1_1(tx1_2 object) {
        Intrinsics.checkNotNullParameter(object, "logger");
        this.a = object;
        this.b = object = new StringBuilder();
        this.c = object = new StringBuilder();
        this.d = object = mm0.a();
        this.e = object = mm0.a();
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void a() {
        Throwable throwable2;
        xl1_2 xl1_22;
        block9: {
            block8: {
                CharSequence charSequence;
                xl1_22 = this.d;
                Object object = f;
                boolean bl2 = ((AtomicIntegerFieldUpdater)object).compareAndSet(this, 0, 1);
                if (!bl2) {
                    return;
                }
                try {
                    charSequence = this.b;
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                charSequence = StringsKt.m0(charSequence);
                charSequence = ((Object)charSequence).toString();
                int n3 = ((String)charSequence).length();
                if (n3 <= 0) break block8;
                object = this.a;
                object.a((String)charSequence);
            }
            xl1_22.a();
            return;
        }
        xl1_22.a();
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(f80_0 var1_1) {
        var2_2 = var1_1 instanceof fa1$a;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (fa1$a)var1_1;
        var4_4 = var3_3.d;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.d = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new fa1$a(this, (f80_0)var1_1);
        }
        var1_1 = var3_3.b;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.d;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var3_3 = var3_3.a;
            vl2_2.b(var1_1);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = fa1_1.g;
            var5_5 = 0;
            var8_8 = var1_1.compareAndSet(this, 0, var6_6);
            if (!var8_8) {
                return Unit.a;
            }
            var1_1 = this.d;
            var3_3.a = this;
            var3_3.d = var6_6;
            if ((var1_1 = var1_1.I0((f80_0)var3_3)) == var7_7) {
                return var7_7;
            }
            var3_3 = this;
        }
        var1_1 = StringsKt.m0(var3_3.c).toString();
        var4_4 = var1_1.length();
        if (var4_4 > 0) {
            var3_3 = var3_3.a;
            var3_3.a((String)var1_1);
        }
        return Unit.a;
    }

    public final void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        string2 = ((Object)StringsKt.m0(string2)).toString();
        StringBuilder stringBuilder = this.b;
        stringBuilder.append(string2);
        stringBuilder.append('\n');
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(String var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof fa1$b;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (fa1$b)var2_2;
        var5_5 = var4_4.e;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.e = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new fa1$b(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.e;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.b;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.e;
            var4_4.a = this;
            var4_4.b = var1_1;
            var4_4.e = var7_7;
            var2_2 = var2_2.I0((f80_0)var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
            var4_4 = this;
        }
        var4_4.c.append((String)var1_1);
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(String var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof fa1$c;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (fa1$c)var2_2;
        var5_5 = var4_4.e;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.e = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new fa1$c(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.e;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.b;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.d;
            var4_4.a = this;
            var4_4.b = var1_1;
            var4_4.e = var7_7;
            var2_2 = var2_2.I0((f80_0)var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
            var4_4 = this;
        }
        var2_2 = var4_4.a;
        var1_1 = StringsKt.m0((CharSequence)var1_1).toString();
        var2_2.a((String)var1_1);
        return Unit.a;
    }

    public final void f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        string2 = ((Object)StringsKt.m0(string2)).toString();
        StringBuilder stringBuilder = this.c;
        stringBuilder.append(string2);
        stringBuilder.append('\n');
        this.e.a();
    }
}

