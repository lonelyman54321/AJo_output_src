/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.query.QueryCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class D4$a
extends qg3_2
implements Function2 {
    public Iterator a;
    public List b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ g4_0 g;

    public D4$a(List list, ArrayList arrayList, g4_0 g4_02, f80_0 f80_02) {
        this.e = list;
        this.f = arrayList;
        this.g = g4_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        List list = this.e;
        ArrayList arrayList = (ArrayList)this.f;
        g4_0 g4_02 = this.g;
        D4$a d4$a = new D4$a(list, arrayList, g4_02, f80_02);
        d4$a.d = object;
        return d4$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (D4$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((D4$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block7: {
            var2_2 = j90_0.COROUTINE_SUSPENDED;
            var3_3 = this.c;
            var4_4 = 3;
            var5_5 = this.g;
            var6_6 = 1;
            if (var3_3 == 0) break block7;
            if (var3_3 != var6_6) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            var7_7 = this.b;
            var8_8 = this.a;
            var9_9 = (i90_0)this.d;
            try {
                vl2_2.b(var1_1);
                ** GOTO lbl-1000
            }
            catch (Exception v0) {
                ** GOTO lbl46
            }
        }
        vl2_2.b(var1_1);
        var1_1 = (i90_0)this.d;
        var7_7 = this.e.iterator();
        var9_9 = var1_1;
        var8_8 = var7_7;
        while (true) {
            if (!(var10_10 = var8_8.hasNext())) {
                return Unit.a;
            }
            var1_1 = (String)var8_8.next();
            var7_7 = new QueryCart();
            var7_7.setProductCode((String)var1_1);
            var7_7.setQuantity(var6_6);
            var7_7.setImsBatchId(null);
            var1_1 = new D4$a$a(var5_5, (QueryCart)var7_7, null);
            var1_1 = Ae3.a((i90_0)var9_9, null, (Function2)var1_1, var4_4);
            {
                var7_7 = this.f;
                this.d = var9_9;
                this.a = var8_8;
                var11_11 /* !! */  = var7_7;
                this.b = var11_11 /* !! */  = (List)var7_7;
                this.c = var6_6;
                var1_1 = var1_1.D(this);
                var11_11 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                if (var1_1 != var2_2) ** GOTO lbl-1000
                return var2_2;
            }
lbl-1000:
            // 2 sources

            {
                var7_7.add(var1_1);
lbl46:
                // 2 sources

                var5_5.getClass();
            }
            var1_1 = md3_0.c(var5_5);
            var12_12 = 2;
            var7_7 = new qg3_2(var12_12, null);
            Ae3.d((i90_0)var1_1, null, null, (Function2)var7_7, var4_4);
        }
    }
}

