/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.a$a;
import androidx.compose.foundation.gestures.a$b;
import androidx.compose.foundation.gestures.a$d;
import androidx.compose.foundation.gestures.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class f$a
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ b e;

    public f$a(Ref$ObjectRef ref$ObjectRef, b b2, f80_0 f80_02) {
        this.d = ref$ObjectRef;
        this.e = b2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.d;
        b b2 = this.e;
        f$a f$a = new f$a(ref$ObjectRef, b2, f80_02);
        f$a.c = object;
        return f$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Function1)object;
        object2 = (f80_0)object2;
        object = (f$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((f$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block4: {
            block5: {
                var2_2 = j90_0.COROUTINE_SUSPENDED;
                var3_3 = this.b;
                var4_4 = 1;
                if (var3_3 == 0) break block4;
                if (var3_3 != var4_4) break block5;
                var5_5 = this.a;
                var6_6 = (Function1)this.c;
                vl2_2.b(var1_1);
                ** GOTO lbl34
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var6_6 = var1_1 = (Function1)this.c;
        while (true) {
            block6: {
                var5_5 = this.d;
                var1_1 = var5_5.element;
                var7_7 = var1_1 instanceof a$d;
                if (var7_7 || (var7_7 = var1_1 instanceof a$a)) break;
                var7_7 = var1_1 instanceof a$b;
                var8_8 = null;
                var1_1 = var7_7 != false ? (a$b)var1_1 : null;
                if (var1_1 != null) {
                    var6_6.invoke(var1_1);
                }
                if ((var1_1 = this.e.t) != null) {
                    this.c = var6_6;
                    this.a = var5_5;
                    this.b = var4_4;
                    if ((var1_1 = var1_1.g(this)) == var2_2) {
                        return var2_2;
                    } else {
                        ** GOTO lbl34
                    }
                }
                break block6;
lbl34:
                // 3 sources

                var8_8 = var1_1;
                var8_8 = (a)var1_1;
            }
            var5_5.element = var8_8;
        }
        return Unit.a;
    }
}

