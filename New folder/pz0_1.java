/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Pz0
 */
public final class pz0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ kz0_0 b;
    public final /* synthetic */ pe1_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ba2 e;
    public final /* synthetic */ GB0 f;
    public final /* synthetic */ MemoryCache$Key g;
    public final /* synthetic */ mj1$a h;

    public pz0_1(kz0_0 kz0_02, pe1_0 pe1_02, Object object, ba2 ba22, GB0 gB0, MemoryCache$Key memoryCache$Key, se2_0 se2_02, f80_0 f80_02) {
        this.b = kz0_02;
        this.c = pe1_02;
        this.d = object;
        this.e = ba22;
        this.f = gB0;
        this.g = memoryCache$Key;
        this.h = se2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        GB0 gB0 = this.f;
        Object object2 = this.h;
        mj1$a mj1$a = object2;
        mj1$a = (se2_0)object2;
        kz0_0 kz0_02 = this.b;
        pe1_0 pe1_02 = this.c;
        Object object3 = this.d;
        ba2 ba22 = this.e;
        MemoryCache$Key memoryCache$Key = this.g;
        object2 = object;
        object = new pz0_1(kz0_02, pe1_02, object3, ba22, gB0, memoryCache$Key, (se2_0)mj1$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pz0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pz0_1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block16: {
            block15: {
                var2_3 = j90_0.COROUTINE_SUSPENDED;
                var3_4 = this.a;
                var4_5 = 1;
                if (var3_4 != 0) {
                    if (var3_4 != var4_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var1_1);
                } else {
                    vl2_2.b(var1_1);
                    var5_6 = this.b;
                    var6_7 = this.c;
                    var7_8 = this.d;
                    var8_9 = this.e;
                    var9_10 = this.f;
                    this.a = var4_5;
                    var10_11 = this;
                    var1_1 = kz0_0.c((kz0_0)var5_6, var6_7, var7_8, (ba2)var8_9, (GB0)var9_10, this);
                    if (var1_1 == var2_3) {
                        return var2_3;
                    }
                }
                var1_1 = (Kz0$a)var1_1;
                var2_3 = this.b.b;
                synchronized (var2_3) {
                    block14: {
                        try {
                            var11_12 = var2_3.a;
                            var11_12 = var11_12.get();
                            var11_12 = (OE2)var11_12;
                            if (var11_12 == null) break block14;
                            var5_6 = var2_3.b;
                            if (var5_6 == null) {
                                var11_12 = var11_12.a;
                                var2_3.b = var11_12;
                                var11_12.registerComponentCallbacks((ComponentCallbacks)var2_3);
                            }
                            break block15;
                        }
                        catch (Throwable var1_2) {
                            ** break block17
                        }
                    }
                    var2_3.c();
                }
            }
            var2_3 = this.b.d;
            var11_12 = this.g;
            var5_6 = this.c;
            var2_3.getClass();
            var5_6 = var5_6.t;
            var12_13 = var5_6.getWriteEnabled();
            var6_7 = null;
            var7_8 = null;
            if (!var12_13) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var13_14 = false;
                    var2_3 = null;
                    break block16;
                    break;
                }
            }
            var2_3 = var2_3.a.d();
            if (var2_3 == null || var11_12 == null) ** GOTO lbl-1000
            var5_6 = var1_1.a;
            var14_15 = var5_6 instanceof BitmapDrawable;
            if (var14_15) {
                var5_6 = (BitmapDrawable)var5_6;
            } else {
                var12_13 = false;
                var5_6 = null;
            }
            if (var5_6 != null && (var5_6 = var5_6.getBitmap()) != null) ** break;
            ** while (true)
            var8_9 = new LinkedHashMap();
            var15_16 = var1_1.b;
            var9_10 = var15_16;
            var10_11 = "coil#is_sampled";
            var8_9.put(var10_11, var9_10);
            var9_10 = var1_1.d;
            if (var9_10 != null) {
                var10_11 = "coil#disk_cache_key";
                var8_9.put(var10_11, var9_10);
            }
            var9_10 = new MemoryCache$b((Bitmap)var5_6, (Map)var8_9);
            var2_3.c((MemoryCache$Key)var11_12, (MemoryCache$b)var9_10);
            var13_14 = true;
        }
        var9_10 = var1_1.a;
        var10_11 = this.c;
        var16_17 = var1_1.c;
        var11_12 = this.g;
        var17_18 = var13_14 != false ? var11_12 : null;
        var18_19 = var1_1.d;
        var19_20 = var1_1.b;
        var1_1 = (se2_0)this.h;
        var2_3 = m.a;
        var13_14 = var1_1 instanceof se2_0;
        var21_22 = var13_14 != false && (var20_21 = ((se2_0)var1_1).g) != false;
        var8_9 = var1_1;
        return new cg3_2((Drawable)var9_10, (pe1_0)var10_11, var16_17, (MemoryCache$Key)var17_18, var18_19, var19_20, var21_22);
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }
}

