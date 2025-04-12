/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ji0
 */
public final class ji0_0
extends qg3_2
implements Function2 {
    public Iterator a;
    public gi0_1 b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;

    public ji0_0(List list, ArrayList arrayList, f80_0 f80_02) {
        this.f = list;
        this.g = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.g;
        List list = this.f;
        ji0_0 ji0_02 = new ji0_0(list, arrayList, f80_02);
        ji0_02.e = object;
        return ji0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (f80_0)object2;
        object = (ji0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ji0_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block8: {
            block5: {
                block6: {
                    block7: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.d;
                        var4_4 = 2;
                        var5_5 = 1;
                        if (var3_3 == 0) break block5;
                        if (var3_3 == var5_5) break block6;
                        if (var3_3 != var4_4) break block7;
                        var6_6 = this.a;
                        var7_7 = (List)this.e;
                        vl2_2.b(var1_1);
                        break block8;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var6_6 = this.c;
                var7_7 = this.b;
                var8_8 = this.a;
                var9_9 = (List)this.e;
                vl2_2.b(var1_1);
                var10_10 = var9_9;
                var9_9 = var7_7;
                var7_7 = var10_10;
                ** GOTO lbl46
            }
            vl2_2.b(var1_1);
            var1_1 = this.e;
            var6_6 = ((Iterable)this.f).iterator();
            var7_7 = this.g;
        }
        block0: while (var11_11 = var6_6.hasNext()) {
            var8_8 = (gi0_1)var6_6.next();
            this.e = var7_7;
            this.a = var6_6;
            this.b = var8_8;
            this.c = var1_1;
            this.d = var5_5;
            var9_9 = var8_8.b();
            if (var9_9 == var2_2) {
                return var2_2;
            }
            var10_10 = var6_6;
            var6_6 = var1_1;
            var1_1 = var9_9;
            var9_9 = var8_8;
            var8_8 = var10_10;
lbl46:
            // 2 sources

            var1_1 = (Boolean)var1_1;
            var12_12 = var1_1.booleanValue();
            if (var12_12) {
                var3_3 = 0;
                var6_6 = null;
                var1_1 = new ji0$a((gi0_1)var9_9, null);
                var7_7.add(var1_1);
                this.e = var7_7;
                this.a = var8_8;
                this.b = null;
                this.c = null;
                this.d = var4_4;
                var1_1 = var9_9.a();
                if (var1_1 == var2_2) {
                    return var2_2;
                }
lbl62:
                // 3 sources

                while (true) {
                    var6_6 = var8_8;
                    continue block0;
                    break;
                }
            }
            var1_1 = var6_6;
            ** continue;
        }
        return var1_1;
    }
}

