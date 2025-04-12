/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1;
import kotlin.Unit;

public final class SessionDatastoreImpl$special$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$special$$inlined$map$1$2(fs0_2 fs0_22, SessionDatastoreImpl sessionDatastoreImpl) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = sessionDatastoreImpl;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof SessionDatastoreImpl$special$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (SessionDatastoreImpl$special$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new SessionDatastoreImpl$special$$inlined$map$1$2$1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.result;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.label;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.$this_unsafeFlow;
            var1_1 = (my2_0)var1_1;
            var9_9 = this.this$0;
            var1_1 = SessionDatastoreImpl.access$mapSessionsData(var9_9, (my2_0)var1_1);
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

