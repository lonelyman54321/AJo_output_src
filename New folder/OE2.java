/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.memory.MemoryCache;
import coil.memory.MemoryCache$Key;
import coil.request.NullRequestDataException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;

public final class OE2
implements ce1_0 {
    public final Context a;
    public final Om0 b;
    public final rq1_2 c;
    public final GB0$b d;
    public final ee1 e;
    public final c80 f;
    public final hK2 g;
    public final n10_0 h;
    public final ArrayList i;

    public OE2(Context object, Om0 object2, rq1_2 object3, hh3_2 object4, hh3_2 hh3_22, n10_0 object5, ee1 ee12) {
        Object object6 = GB0$b.a;
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object6;
        this.e = ee12;
        object = be_1.a();
        object2 = ir0_2.a;
        object = CoroutineContext$Element$a.d(bg1_1.a.N0(), (CoroutineContext$Element)object);
        object2 = new RE2(this);
        this.f = object = kotlinx.coroutines.d.a(object.plus((CoroutineContext)object2));
        object = new oh3_0(this);
        this.g = object2 = new hK2(this, (oh3_0)object);
        object3 = new n10$a((n10_0)object5);
        object5 = new Object();
        ((n10$a)object3).b((bH1)object5, ob1_1.class);
        object5 = new Object();
        ((n10$a)object3).b((bH1)object5, String.class);
        object5 = new Object();
        object6 = Uri.class;
        ((n10$a)object3).b((bH1)object5, (Class)object6);
        object5 = new Object();
        ((n10$a)object3).b((bH1)object5, (Class)object6);
        object5 = new Object();
        ((n10$a)object3).b((bH1)object5, Integer.class);
        object5 = new Object();
        ((n10$a)object3).b((bH1)object5, byte[].class);
        object5 = new Object();
        ArrayList arrayList = ((n10$a)object3).c;
        Pair pair = new Pair(object5, object6);
        arrayList.add(pair);
        boolean bl2 = ee12.a;
        object5 = new wL0(bl2);
        Class<File> clazz = File.class;
        pair = new Pair(object5, clazz);
        arrayList.add(pair);
        boolean bl3 = ee12.c;
        object5 = new Nb1$a(hh3_22, (hh3_2)object4, bl3);
        ((n10$a)object3).a((eL0$a)object5, (Class)object6);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, clazz);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, (Class)object6);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, (Class)object6);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, (Class)object6);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, Drawable.class);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, Bitmap.class);
        object4 = new Object();
        ((n10$a)object3).a((eL0$a)object4, ByteBuffer.class);
        int n3 = ee12.d;
        object5 = ee12.e;
        object4 = new ay$b(n3, (yE0)((Object)object5));
        ((n10$a)object3).e.add(object4);
        this.h = object3 = ((n10$a)object3).c();
        object3 = ((n10_0)object3).a;
        object4 = new kz0_0(this, (oh3_0)object, (hK2)object2);
        this.i = object = CollectionsKt.X((Collection)object3, object4);
        new AtomicBoolean(false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object e(OE2 var0, pe1_0 var1_1, int var2_2, f80_0 var3_3) {
        block38: {
            block42: {
                block37: {
                    block35: {
                        block40: {
                            block34: {
                                block36: {
                                    block39: {
                                        var4_4 = var0;
                                        var5_5 = var1_1;
                                        var6_10 = var3_3;
                                        var0.getClass();
                                        var7_11 = var3_3 instanceof pe2_0;
                                        if (var7_11 == 0) ** GOTO lbl-1000
                                        var8_12 = var3_3;
                                        var8_12 = (pe2_0)var3_3;
                                        var9_13 = var8_12.h;
                                        var10_14 = -1 << -1;
                                        var11_15 = var9_13 & var10_14;
                                        if (var11_15 != 0) {
                                            var8_12.h = var9_13 -= var10_14;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var8_12 = new pe2_0((OE2)var4_4, (f80_0)var6_10);
                                        }
                                        var12_16 = var8_12;
                                        var6_10 = var8_12.f;
                                        var13_17 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                        var7_11 = var8_12.h;
                                        var14_18 = 3;
                                        var15_19 = 2;
                                        var16_20 = 1;
                                        if (var7_11 == 0) break block39;
                                        if (var7_11 != var16_20) {
                                            if (var7_11 != var15_19) {
                                                if (var7_11 != var14_18) {
                                                    var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var5_5;
                                                }
                                                var4_4 = var8_12.d;
                                                var8_12 = var8_12.c;
                                                var17_21 = var12_16.b;
                                                var18_22 = var12_16.a;
                                                try {
                                                    vl2_2.b(var6_10);
                                                    var5_5 = var6_10;
                                                    var6_10 = var4_4;
                                                    var4_4 = var18_22;
                                                    break block34;
                                                }
                                                catch (Throwable var5_6) {
                                                    var6_10 = var4_4;
                                                    var4_4 = var18_22;
                                                    break block35;
                                                }
                                            }
                                            var5_5 = var8_12.e;
                                            var4_4 = var8_12.d;
                                            var8_12 = var8_12.c;
                                            var17_21 = var12_16.b;
                                            var18_22 = var12_16.a;
                                            {
                                                vl2_2.b(var6_10);
                                                var19_23 = var5_5;
                                                var20_24 = var6_10;
                                                var6_10 = var4_4;
                                                var4_4 = var18_22;
                                                var18_22 = var20_24;
                                                break block36;
                                            }
                                        }
                                        var4_4 = var8_12.d;
                                        var8_12 = var8_12.c;
                                        var17_21 = var12_16.b;
                                        var18_22 = var12_16.a;
                                        {
                                            vl2_2.b(var6_10);
                                            var6_10 = var4_4;
                                            var4_4 = var18_22;
                                            ** GOTO lbl-1000
                                        }
                                    }
                                    vl2_2.b(var6_10);
                                    var21_25 = mm0.e(var8_12.getContext());
                                    var6_10 = var4_4.g;
                                    var6_10.getClass();
                                    var22_26 = var5_5.A;
                                    var8_12 = var5_5.c;
                                    var9_13 = var8_12 instanceof nd3_0;
                                    if (var9_13 != 0) {
                                        var17_21 = var6_10.a;
                                        var18_22 = var8_12;
                                        var18_22 = (nd3_0)var8_12;
                                        var6_10 = var23_27;
                                        var8_12 = var17_21;
                                        var17_21 = var1_1;
                                        var17_21 = var23_27 = new pd3_0((ce1_0)var8_12, var1_1, (nd3_0)var18_22, (androidx.lifecycle.i)var22_26, (i)var21_25);
                                    } else {
                                        var17_21 = var6_10 = new tw((androidx.lifecycle.i)var22_26, (i)var21_25);
                                    }
                                    var17_21.u();
                                    var5_5 = pe1_0.a(var1_1);
                                    var5_5.b = var6_10 = var4_4.b;
                                    var5_5.O = null;
                                    var8_12 = var5_5.a();
                                    var5_5 = var4_4.d;
                                    var5_5.getClass();
                                    var6_10 = GB0.a;
                                    try {
                                        var5_5 = var8_12.b;
                                        var18_22 = dl_2.b;
                                        if (var5_5 != var18_22) {
                                        }
                                        ** GOTO lbl207
                                    }
                                    catch (Throwable var5_7) {
                                        break block35;
                                    }
                                    {
                                        var17_21.start();
                                        if (var2_2 != 0) ** GOTO lbl-1000
                                        var5_5 = var8_12.A;
                                        var12_16.a = var4_4;
                                        var12_16.b = var17_21;
                                        var12_16.c = var8_12;
                                        var12_16.d = var6_10;
                                        var12_16.h = var16_20;
                                        if ((var5_5 = h.a((androidx.lifecycle.i)var5_5, (f80_0)var12_16)) != var13_17 /* !! */ ) ** GOTO lbl-1000
                                        return var13_17 /* !! */ ;
                                    }
lbl-1000:
                                    // 3 sources

                                    {
                                        var5_5 = var4_4.d();
                                        if (var5_5 == null) ** GOTO lbl-1000
                                        var18_22 = var8_12.E;
                                        if (var18_22 != null) {
                                            var5_5 = var5_5.b((MemoryCache$Key)var18_22);
                                        } else {
                                            var24_28 = false;
                                            var5_5 = null;
                                        }
                                        if (var5_5 != null) {
                                            var5_5 = var5_5.a;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var24_28 = false;
                                            var5_5 = null;
                                        }
                                        if (var5_5 != null) {
                                            var18_22 = var8_12.a;
                                            var18_22 = var18_22.getResources();
                                            var22_26 = new BitmapDrawable((Resources)var18_22, (Bitmap)var5_5);
                                        } else {
                                            var18_22 = var8_12.M;
                                            var18_22 = var18_22.j;
                                            var22_26 = var8_12.G;
                                            var21_25 = var8_12.F;
                                            var22_26 = j.b((pe1_0)var8_12, (Drawable)var22_26, (Integer)var21_25, (Drawable)var18_22);
                                        }
                                        var18_22 = var8_12.c;
                                        if (var18_22 != null) {
                                            var18_22.a((Drawable)var22_26);
                                        }
                                        var6_10.getClass();
                                        var18_22 = var8_12.B;
                                        var12_16.a = var4_4;
                                        var12_16.b = var17_21;
                                        var12_16.c = var8_12;
                                        var12_16.d = var6_10;
                                        var12_16.e = var5_5;
                                        var12_16.h = var15_19;
                                        var18_22 = var18_22.j((pe2_0)var12_16);
                                        if (var18_22 == var13_17 /* !! */ ) {
                                            return var13_17 /* !! */ ;
                                        }
                                        var19_23 = var5_5;
                                    }
                                }
                                var25_29 = var18_22;
                                {
                                    var25_29 = (B63)var18_22;
                                    var6_10.getClass();
                                    var5_5 = var8_12.w;
                                    var23_27 = var18_22;
                                    var18_22 = new QE2((pe1_0)var8_12, (OE2)var4_4, (B63)var25_29, (GB0)var6_10, (Bitmap)var19_23, null);
                                    var12_16.a = var4_4;
                                    var12_16.b = var17_21;
                                    var12_16.c = var8_12;
                                    var12_16.d = var6_10;
                                    var12_16.e = null;
                                    var12_16.h = var14_18;
                                    var5_5 = Ae3.g((f80_0)var12_16, (CoroutineContext)var5_5, (Function2)var18_22);
                                    if (var5_5 != var13_17 /* !! */ ) break block34;
                                    return var13_17 /* !! */ ;
                                }
                            }
                            var13_17 /* !! */  = var5_5;
                            {
                                var13_17 /* !! */  = (se1_0)var5_5;
                            }
                            var24_28 = var13_17 /* !! */  instanceof cg3_2;
                            if (!var24_28) break block40;
                            var5_5 = var13_17 /* !! */ ;
                            {
                                var5_5 = (cg3_2)var13_17 /* !! */ ;
                                var18_22 = var8_12.c;
                                var4_4.getClass();
                                var22_26 = var5_5.b;
                            }
                            var26_30 = var18_22 instanceof Nr3;
                            if (!var26_30) ** GOTO lbl190
                            {
                                var21_25 = var22_26.m;
                                var12_16 = var18_22;
                            }
                            var12_16 = (Nr3)var18_22;
                            var26_30 = (var5_5 = var21_25.a((Nr3)var12_16, (se1_0)var5_5)) instanceof n42_0;
                            if (!var26_30) ** GOTO lbl187
                            {
                                block41: {
                                    var18_22.getClass();
                                    break block41;
lbl187:
                                    // 1 sources

                                    var6_10.getClass();
                                    var5_5.a();
                                }
                                var6_10.getClass();
                                var5_5 = var22_26.d;
                                break block37;
                            }
                        }
                        var24_28 = var13_17 /* !! */  instanceof hb0_0;
                        if (!var24_28) ** GOTO lbl-1000
                        var5_5 = var13_17 /* !! */ ;
                        {
                            var5_5 = (hb0_0)var13_17 /* !! */ ;
                            var18_22 = var8_12.c;
                            var4_4.getClass();
                            OE2.f((hb0_0)var5_5, (ji3_0)var18_22, (GB0)var6_10);
                            break block37;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var5_5 = new NoWhenBranchMatchedException();
                            throw var5_5;
lbl207:
                            // 1 sources

                            var5_5 = new NullRequestDataException();
                            throw var5_5;
                        }
                    }
                    var10_14 = var5_8 instanceof CancellationException;
                    if (var10_14 == 0) {
                        try {
                            var4_4 = var4_4.g;
                            var4_4.getClass();
                            var13_17 /* !! */  = hK2.a((pe1_0)var8_12, (Throwable)var5_8);
                            var5_8 = var8_12.c;
                            OE2.f((hb0_0)var13_17 /* !! */ , var5_8, (GB0)var6_10);
                        }
                        catch (Throwable var5_9) {
                            break block38;
                        }
                    }
                    break block42;
                }
                var17_21.a();
                return var13_17 /* !! */ ;
            }
            var4_4.getClass();
            var6_10.getClass();
            var4_4 = var8_12.d;
            throw (Throwable)var5_8;
        }
        var17_21.a();
        throw var5_9;
    }

    public static void f(hb0_0 object, ji3_0 ji3_02, GB0 gB0) {
        pe1_0 pe1_02 = ((hb0_0)object).b;
        boolean bl2 = ji3_02 instanceof Nr3;
        if (bl2) {
            pr3$a pr3$a = pe1_02.m;
            ji3_0 ji3_03 = ji3_02;
            ji3_03 = (Nr3)ji3_02;
            bl2 = (object = pr3$a.a((Nr3)ji3_03, (se1_0)object)) instanceof n42_0;
            if (bl2) {
                ji3_02.getClass();
            } else {
                gB0.getClass();
                object.a();
            }
        }
        gB0.getClass();
        object = pe1_02.d;
    }

    public final Om0 a() {
        return this.b;
    }

    public final zr0 b(pe1_0 object) {
        f80_0 f80_02 = new OE2$a(null, (pe1_0)object, this);
        int n3 = 3;
        c80 c802 = this.f;
        f80_02 = Ae3.a(c802, null, f80_02, n3);
        object = ((pe1_0)object).c;
        boolean bl2 = object instanceof nd3_0;
        object = bl2 ? m.c(((nd3_0)object).getView()).a((wn0_2)f80_02) : new w92((wn0_2)f80_02);
        return object;
    }

    public final Object c(pe1_0 pe1_02, f80_0 f80_02) {
        Object object = pe1_02.c;
        boolean bl2 = object instanceof nd3_0;
        if (bl2) {
            object = new OE2$b(null, pe1_02, this);
            return kotlinx.coroutines.d.c((Function2)object, f80_02);
        }
        object = ir0_2.a;
        object = bg1_1.a.N0();
        OE2$c oE2$c = new OE2$c(null, pe1_02, this);
        return Ae3.g(f80_02, (CoroutineContext)object, oE2$c);
    }

    public final MemoryCache d() {
        return (MemoryCache)this.c.getValue();
    }

    public final n10_0 getComponents() {
        return this.h;
    }
}

