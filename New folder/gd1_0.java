/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.AnimatedImageDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Gd1
 */
public final class gd1_0
implements dj0 {
    public final Fe1 a;
    public final ba2 b;
    public final boolean c;

    public gd1_0(Fe1 fe1, ba2 ba22, boolean bl2) {
        this.a = fe1;
        this.b = ba22;
        this.c = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(f80_0 var1_1) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var2_2 = var1_1 instanceof Gd1$b;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (Gd1$b)var1_1;
                            var4_4 = var3_3.e;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.e = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new Gd1$b(this, (f80_0)var1_1);
                            }
                            var1_1 = var3_3.c;
                            var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var3_3.e;
                            var6_6 = 2;
                            var8_8 = 1;
                            if (var5_5 == 0) break block4;
                            if (var5_5 == var8_8) break block5;
                            if (var5_5 != var6_6) break block6;
                            var3_3 = (Ref$BooleanRef)var3_3.a;
                            vl2_2.b(var1_1);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var9_9 = var3_3.b;
                    var10_10 = (gd1_0)var3_3.a;
                    vl2_2.b(var1_1);
                    break block8;
                }
                vl2_2.b(var1_1);
                var1_1 = new Ref$BooleanRef();
                var9_9 = new fd1_0(this, (Ref$BooleanRef)var1_1);
                var3_3.a = this;
                var3_3.b = var1_1;
                var3_3.e = var8_8;
                var9_9 = mj1_2.a((Function0)var9_9, (h80_0)var3_3);
                if (var9_9 == var7_7 /* !! */ ) {
                    return var7_7 /* !! */ ;
                }
                var10_10 = this;
                var11_11 = var9_9;
                var9_9 = var1_1;
                var1_1 = var11_11;
            }
            var1_1 = (Drawable)var1_1;
            var3_3.a = var9_9;
            var3_3.b = null;
            var3_3.e = var6_6;
            var1_1 = var10_10.c((Drawable)var1_1, (f80_0)var3_3);
            if (var1_1 == var7_7 /* !! */ ) {
                return var7_7 /* !! */ ;
            }
            var3_3 = var9_9;
        }
        var1_1 = (Drawable)var1_1;
        var2_2 = var3_3.element;
        var7_7 /* !! */  = new aj0((Drawable)var1_1, var2_2);
        return var7_7 /* !! */ ;
    }

    public final ImageDecoder.Source b(Fe1 fe1) {
        int n3;
        Object object = fe1.b();
        if (object != null) {
            return Bd1.a(((hn2_2)object).e());
        }
        object = fe1.c();
        int n4 = object instanceof dq_0;
        ba2 ba22 = this.b;
        if (n4 != 0) {
            fe1 = ba22.a.getAssets();
            object = ((dq_0)object).a;
            return Cd1.a((AssetManager)fe1, (String)object);
        }
        n4 = object instanceof v60_0;
        if (n4 != 0) {
            fe1 = ba22.a.getContentResolver();
            object = ((v60_0)object).a;
            return Dd1.a((ContentResolver)fe1, (Uri)object);
        }
        n4 = object instanceof PK2;
        if (n4 != 0) {
            object = (PK2)object;
            String string2 = ((PK2)object).a;
            String string3 = ba22.a.getPackageName();
            n4 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
            if (n4 != 0) {
                fe1 = ba22.a.getResources();
                int n7 = ((PK2)object).b;
                return Ed1.a((Resources)fe1, n7);
            }
        }
        fe1 = (n3 = Build.VERSION.SDK_INT) >= (n4 = 31) ? pd1_0.a(fe1.d().h0()) : (n3 == (n4 = 30) ? qd1.a(ByteBuffer.wrap(fe1.d().h0())) : Bd1.a(fe1.a().e()));
        return fe1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Drawable c(Drawable var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof Jd1;
        if (var3_3 == 0) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (Jd1)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Jd1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var3_3 = var4_4.c;
        if (var3_3 == 0) ** GOTO lbl26
        var9_9 = 1;
        if (var3_3 == var9_9) {
            vl2_2.b(var2_2);
            var9_9 = 0;
            var1_1 /* !! */  = null;
            var10_10 = false;
            var2_2 = null;
        } else {
            var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1 /* !! */ ;
lbl26:
            // 1 sources

            vl2_2.b(var2_2);
            var10_11 = yd1.a(var1_1 /* !! */ );
            if (!var10_11) {
                return var1_1 /* !! */ ;
            }
            var2_2 = zd1.a(var1_1 /* !! */ );
            var4_4 = this.b;
            var8_8 = var4_4.l.a;
            var11_12 = "coil#repeat_count";
            var8_8 = (Hm2$b)var8_8.get(var11_12);
            Ad1.a((AnimatedImageDrawable)var2_2);
            var2_2 = var4_4.l;
            var4_4 = var2_2.a;
            var8_8 = "coil#animation_start_callback";
            var4_4 = (Hm2$b)var4_4.get(var8_8);
            var2_2 = var2_2.a;
            var4_4 = "coil#animation_end_callback";
            var2_2 = (Hm2$b)var2_2.get(var4_4);
            var2_2 = this;
        }
        var2_2 = var2_2.b.e;
        var4_4 = new XS2(var1_1 /* !! */ , (WS2)var2_2);
        return var4_4;
    }
}

