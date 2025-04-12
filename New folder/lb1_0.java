/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import androidx.room.e;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lb1
 */
public final class lb1_0 {
    public final ChuckerDatabase a;

    public lb1_0(ChuckerDatabase chuckerDatabase) {
        Intrinsics.checkNotNullParameter(chuckerDatabase, "database");
        this.a = chuckerDatabase;
    }

    public final LiveData a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Object object = "path";
        Intrinsics.checkNotNullParameter(string3, (String)object);
        int c2 = string3.length();
        String string4 = "%";
        if (c2 > 0) {
            char c3 = '%';
            string3 = oj_0.b(c3, string4, string3);
        } else {
            string3 = string4;
        }
        object = this.a.b();
        string2 = Intrinsics.stringPlus(string2, string4);
        return object.h(string2, string3);
    }

    public final kn1_0 b(long l2) {
        e e2 = this.a.b().a(l2);
        kb1_0 kb1_02 = kb1_0.c;
        return ft0.b(e2, kb1_02, 1);
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(HttpTransaction var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof Lb1$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (Lb1$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Lb1$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.a.b();
            var4_4.a = var1_1;
            var4_4.d = var7_7;
            var2_2 = var2_2.e((HttpTransaction)var1_1, (Lb1$a)var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var2_2 = (Long)var2_2;
        var9_9 = var2_2 == null ? 0L : var2_2.longValue();
        var1_1.setId(var9_9);
        return Unit.a;
    }
}

