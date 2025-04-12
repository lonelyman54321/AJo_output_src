/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class W33$a
extends qg3_2
implements Function2 {
    public Iterator a;
    public HashMap b;
    public String c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ e43_0 g;
    public final /* synthetic */ HashMap h;

    public W33$a(ArrayList arrayList, e43_0 e43_02, HashMap hashMap, f80_0 f80_02) {
        this.f = arrayList;
        this.g = e43_02;
        this.h = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.f;
        e43_0 e43_02 = this.g;
        HashMap hashMap = this.h;
        W33$a w33$a = new W33$a(arrayList, e43_02, hashMap, f80_02);
        w33$a.e = object;
        return w33$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (W33$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((W33$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block13: {
            block14: {
                var2_2 = j90_0.COROUTINE_SUSPENDED;
                var3_3 = this.d;
                var4_4 = 1;
                if (var3_3 == 0) break block13;
                if (var3_3 != var4_4) break block14;
                var5_5 = this.c;
                var6_6 = this.b;
                var7_7 = this.a;
                var8_8 = (i90_0)this.e;
                vl2_2.b(var1_1);
                ** GOTO lbl54
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var1_1 = (i90_0)this.e;
        var5_5 = this.f.iterator();
        var8_8 = var1_1;
        var7_7 = var5_5;
        while ((var9_9 = var7_7.hasNext()) != 0) {
            block12: {
                var1_1 = (BannerData)var7_7.next();
                var5_5 = var1_1.getUuid();
                if (var5_5 == null) continue;
                var6_6 = this.g;
                var10_10 /* !! */  = var6_6.c;
                var11_11 = var10_10 /* !! */ .containsKey(var5_5);
                if (var11_11) continue;
                var1_1 = var1_1.getProductIds();
                Intrinsics.checkNotNull(var1_1);
                var10_10 /* !! */  = new W33$a$a((e43_0)var6_6, (String)var1_1, null);
                var9_9 = 3;
                var1_1 = Ae3.a((i90_0)var8_8, null, (Function2)var10_10 /* !! */ , var9_9);
                try {
                    var6_6 = this.h;
                }
                catch (Exception v0) {}
                this.e = var8_8;
                this.a = var7_7;
                this.b = var6_6;
                this.c = var5_5;
                this.d = var4_4;
                var1_1 = var1_1.D(this);
                var10_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                if (var1_1 != var2_2) break block12;
                return var2_2;
            }
            var6_6.put(var5_5, var1_1);
        }
        return Unit.a;
    }
}

