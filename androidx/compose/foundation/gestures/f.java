/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.a$a;
import androidx.compose.foundation.gestures.a$c;
import androidx.compose.foundation.gestures.a$d;
import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.f$a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.d;

public final class f
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public Ref$ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b e;

    public f(b b2, f80_0 f80_02) {
        this.e = b2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        b b2 = this.e;
        f f5 = new f(b2, f80_02);
        f5.d = object;
        return f5;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (f)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((f)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block27: {
            block30: {
                block29: {
                    block28: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.c;
                        var4_4 = this.e;
                        switch (var3_3) {
                            default: {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            case 6: {
                                var5_5 = (i90_0)this.d;
                                vl2_2.b(var1_1);
                                ** break;
                            }
                            case 5: {
                                var5_5 = (i90_0)this.d;
lbl14:
                                // 2 sources

                                while (true) {
                                    try {
                                        vl2_2.b(var1_1);
                                        ** break;
                                    }
                                    catch (CancellationException v0) {
                                        break block27;
                                    }
                                    break;
                                }
                            }
                            case 4: {
                                var5_5 = (i90_0)this.d;
                                ** continue;
                            }
                            case 3: {
                                var5_5 = this.a;
                                var7_7 = (i90_0)this.d;
                                try {
                                    vl2_2.b(var1_1);
                                    ** GOTO lbl35
                                }
                                catch (CancellationException v1) {
                                    var5_5 = var7_7;
                                    break block27;
                                }
                            }
lbl32:
                            // 3 sources

                            while (true) {
                                var6_6 = var5_5;
                                break block28;
lbl35:
                                // 2 sources

                                while (true) {
                                    var6_6 = var7_7;
                                    break block29;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                var5_5 = this.a;
                                var7_7 = (i90_0)this.d;
                                vl2_2.b(var1_1);
                                ** GOTO lbl-1000
                            }
                            case 1: {
                                var5_5 = this.b;
                                var7_7 = this.a;
                                var6_6 = (i90_0)this.d;
                                vl2_2.b(var1_1);
                                ** GOTO lbl66
                            }
                            case 0: 
                        }
                        vl2_2.b(var1_1);
                        var6_6 = var1_1 = (i90_0)this.d;
                    }
lbl53:
                    // 4 sources

                    while (true) {
                        if ((var8_8 = kotlinx.coroutines.d.d((i90_0)var6_6)) == 0) {
                            return Unit.a;
                        }
                        var5_5 = new Ref$ObjectRef();
                        var1_1 = var4_4.t;
                        if (var1_1 != null) {
                            this.d = var6_6;
                            this.a = var5_5;
                            this.b = var5_5;
                            this.c = var9_9 = 1;
                            if ((var1_1 = var1_1.g(this)) == var2_2) {
                                return var2_2;
                            }
                            var7_7 = var5_5;
lbl66:
                            // 2 sources

                            var1_1 = (a)var1_1;
                        } else {
                            var7_7 = var5_5;
                            var8_8 = 0;
                            var1_1 = null;
                        }
                        var5_5.element = var1_1;
                        var1_1 = var7_7.element;
                        var3_3 = var1_1 instanceof a$c;
                        if (var3_3 == 0) continue;
                        var1_1 = (a$c)var1_1;
                        this.d = var6_6;
                        this.a = var7_7;
                        this.b = null;
                        this.c = var3_3 = 2;
                        if ((var1_1 = androidx.compose.foundation.gestures.b.v1(var4_4, (a$c)var1_1, this)) == var2_2) {
                            return var2_2;
                        }
                        var5_5 = var7_7;
                        var7_7 = var6_6;
lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new f$a((Ref$ObjectRef)var5_5, var4_4, null);
                            this.d = var7_7;
                            this.a = var5_5;
                            this.c = var10_10 = 3;
                            if ((var1_1 = var4_4.y1((f$a)var1_1, this)) != var2_2) ** continue;
                            return var2_2;
                        }
                        break;
                    }
                }
                try {
                    var1_1 = var5_5.element;
                }
                catch (CancellationException v2) {
                    var5_5 = var6_6;
                    break block27;
                }
                var3_3 = var1_1 instanceof a$d;
                if (var3_3 == 0) break block30;
                var5_5 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped";
                {
                    Intrinsics.checkNotNull(var1_1, (String)var5_5);
                    var1_1 = (a$d)var1_1;
                    this.d = var7_7;
                    this.a = null;
                    this.c = var3_3 = 4;
                    if ((var1_1 = androidx.compose.foundation.gestures.b.w1(var4_4, (a$d)var1_1, this)) != var2_2) ** GOTO lbl53
                    return var2_2;
                }
            }
            var8_8 = var1_1 instanceof a$a;
            if (var8_8 == 0) ** GOTO lbl53
            {
                this.d = var7_7;
                this.a = null;
                this.c = var8_8 = 5;
                var1_1 = androidx.compose.foundation.gestures.b.u1(var4_4, this);
                if (var1_1 == var2_2) ** break;
                ** continue;
                return var2_2;
            }
        }
        this.d = var5_5;
        this.a = null;
        this.c = var8_8 = 6;
        ** while ((var1_1 = androidx.compose.foundation.gestures.b.u1((b)var4_4, (f80_0)this)) != var2_2)
lbl122:
        // 1 sources

        return var2_2;
    }
}

