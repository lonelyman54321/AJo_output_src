/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/*
 * Renamed from TC1
 */
public final class tc1_0
implements ny_0 {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final ZC1 a;
    public final Set b;
    public final TC1$a c;
    public final long d;
    public long e;

    public tc1_0(long l2) {
        TC1$a tC1$a;
        E63 e63 = new E63();
        Bitmap.Config config = Arrays.asList(Bitmap.Config.values());
        Set<Bitmap.Config> set = new Set<Bitmap.Config>((Collection<Bitmap.Config>)config);
        int n3 = Build.VERSION.SDK_INT;
        set.add(null);
        int n4 = 26;
        if (n3 >= n4) {
            config = Kh.a();
            set.remove(config);
        }
        set = Collections.unmodifiableSet(set);
        this.d = l2;
        this.a = e63;
        this.b = set;
        this.c = tC1$a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n3) {
        String string2 = "LruBitmapPool";
        int n4 = 3;
        Log.isLoggable((String)string2, (int)n4);
        int n7 = 40;
        if (n3 < n7) {
            n7 = Build.VERSION.SDK_INT;
            n4 = 23;
            int n8 = 20;
            if (n7 < n4 || n3 < n8) {
                if (n3 < n8) {
                    n7 = 15;
                    if (n3 != n7) return;
                }
                long l2 = 2;
                long l3 = this.d / l2;
                this.g(l3);
                return;
            }
        }
        this.b();
    }

    public final void b() {
        Log.isLoggable((String)"LruBitmapPool", (int)3);
        this.g(0L);
    }

    public final Bitmap c(int n3, int n4, Bitmap.Config config) {
        Bitmap bitmap = this.f(n3, n4, config);
        if (bitmap == null) {
            if (config == null) {
                config = f;
            }
            bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        }
        return bitmap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Bitmap object) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                if (object != null) {
                    Object object2;
                    int n3;
                    int n4;
                    block7: {
                        boolean bl2;
                        block8: {
                            try {
                                Object object3;
                                n4 = object.isRecycled();
                                if (n4 != 0) {
                                    String string2 = "Cannot pool recycled bitmap";
                                    object = new IllegalStateException(string2);
                                    throw object;
                                }
                                n4 = object.isMutable();
                                n3 = 2;
                                if (n4 == 0) break block7;
                                object2 = this.a;
                                object2 = (E63)object2;
                                object2.getClass();
                                n4 = dz3.c(object);
                                long l2 = n4;
                                long l3 = this.d;
                                n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                                if (n4 > 0 || (n4 = (int)((object2 = this.b).contains(object3 = object.getConfig()) ? 1 : 0)) == 0) break block7;
                                object2 = this.a;
                                object2 = (E63)object2;
                                object2.getClass();
                                n4 = dz3.c(object);
                                object3 = this.a;
                                object3 = (E63)object3;
                                ((E63)object3).e((Bitmap)object);
                                object3 = this.c;
                                object3.getClass();
                                l2 = this.e;
                                l3 = n4;
                                this.e = l2 += l3;
                                object2 = "LruBitmapPool";
                                n4 = (int)(Log.isLoggable((String)object2, (int)n3) ? 1 : 0);
                                if (n4 == 0) break block8;
                                object2 = this.a;
                                object2 = (E63)object2;
                                object2.getClass();
                                n4 = dz3.c(object);
                                object = object.getConfig();
                                E63.c(n4, (Bitmap.Config)object);
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        if (bl2 = Log.isLoggable((String)(object = "LruBitmapPool"), (int)n3)) {
                            object = this.a;
                            Objects.toString(object);
                        }
                        long l4 = this.d;
                        this.g(l4);
                        return;
                    }
                    if ((n4 = Log.isLoggable((String)(object2 = "LruBitmapPool"), (int)n3)) != 0) {
                        object2 = this.a;
                        object2 = (E63)object2;
                        object2.getClass();
                        n4 = dz3.c(object);
                        Bitmap.Config config = object.getConfig();
                        E63.c(n4, config);
                        object.isMutable();
                        object2 = this.b;
                        config = object.getConfig();
                        object2.contains(config);
                    }
                    object.recycle();
                    return;
                }
                String string3 = "Bitmap must not be null";
                object = new NullPointerException(string3);
                throw object;
            }
            throw throwable2;
        }
    }

    public final Bitmap e(int n3, int n4, Bitmap.Config config) {
        Bitmap bitmap = this.f(n3, n4, config);
        if (bitmap != null) {
            n3 = 0;
            bitmap.eraseColor(0);
        } else {
            if (config == null) {
                config = f;
            }
            bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        }
        return bitmap;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap f(int var1_1, int var2_2, Bitmap.Config var3_3) {
        synchronized (this) {
            block12: {
                block11: {
                    try {
                        var4_4 = Build.VERSION.SDK_INT;
                        var5_5 = 26;
                        if (var4_4 < var5_5 || var3_3 != (var6_6 = Kh.a())) {
                        }
                        ** GOTO lbl57
                    }
                    catch (Throwable var9_9) {
                        break block12;
                    }
                    {
                        var6_6 = this.a;
                        var7_7 = var3_3 != null ? var3_3 : tc1_0.f;
                        var6_6 = (E63)var6_6;
                        var6_6 = var6_6.b(var1_1, var2_2, (Bitmap.Config)var7_7);
                        if (var6_6 != null) break block11;
                        var7_7 = "LruBitmapPool";
                        var8_8 = 3;
                        var5_5 = (int)Log.isLoggable((String)var7_7, (int)var8_8);
                        if (var5_5 == 0) ** GOTO lbl43
                        var7_7 = this.a;
                        var7_7 = (E63)var7_7;
                        var7_7.getClass();
                        var5_5 = var1_1 * var2_2;
                    }
                    {
                        var8_8 = dz3.d((Bitmap.Config)var3_3) * var5_5;
                    }
                    E63.c(var8_8, (Bitmap.Config)var3_3);
                    ** GOTO lbl43
                }
                var10_12 = this.e;
                var12_13 = this.a;
                var12_13 = (E63)var12_13;
                var12_13.getClass();
                var13_14 = dz3.c((Bitmap)var6_6);
                var14_15 = var13_14;
                {
                    this.e = var10_12 -= var14_15;
                    var7_7 = this.c;
                    var7_7.getClass();
                    var5_5 = 1;
                    var6_6.setHasAlpha((boolean)var5_5);
                    var6_6.setPremultiplied((boolean)var5_5);
lbl43:
                    // 3 sources

                    if ((var5_5 = (int)Log.isLoggable((String)(var7_7 = "LruBitmapPool"), (int)(var8_8 = 2))) == 0) ** GOTO lbl52
                    var7_7 = this.a;
                    var7_7 = (E63)var7_7;
                    var7_7.getClass();
                    var1_1 *= var2_2;
                }
                {
                    var2_2 = dz3.d((Bitmap.Config)var3_3) * var1_1;
                }
                {
                    E63.c(var2_2, (Bitmap.Config)var3_3);
lbl52:
                    // 2 sources

                    if ((var1_1 = (int)Log.isLoggable((String)(var9_10 = "LruBitmapPool"), (int)var8_8)) != 0) {
                        var9_10 = this.a;
                        Objects.toString(var9_10);
                    }
                    return var6_6;
lbl57:
                    // 1 sources

                    var6_6 = "Cannot create a mutable Bitmap with config: ";
                    var16_16 /* !! */  = new StringBuilder((String)var6_6);
                    var16_16 /* !! */ .append(var3_3);
                    var3_3 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions";
                    var16_16 /* !! */ .append((String)var3_3);
                    var16_16 /* !! */  = var16_16 /* !! */ .toString();
                    var9_11 = new IllegalArgumentException((String)var16_16 /* !! */ );
                    throw var9_11;
                }
            }
            throw var9_9;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    int n3;
                    long l3;
                    Integer n4;
                    Object object;
                    Object object2;
                    long l4;
                    while (true) {
                        long l7 = this.e;
                        l4 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
                        if (l4 <= 0) break block10;
                        object2 = this.a;
                        object2 = (E63)object2;
                        object = ((E63)object2).b;
                        object = ((R11)object).c();
                        if ((object = (Bitmap)object) != null) {
                            l4 = dz3.c((Bitmap)object);
                            n4 = (int)l4;
                            ((E63)object2).a(n4, (Bitmap)object);
                        }
                        if (object == null) {
                            Object object3 = "LruBitmapPool";
                            int n7 = 5;
                            boolean bl2 = Log.isLoggable((String)object3, (int)n7);
                            if (bl2) {
                                object3 = this.a;
                                Objects.toString(object3);
                            }
                            this.e = l2 = 0L;
                            return;
                        }
                        object2 = this.c;
                        object2.getClass();
                        l3 = this.e;
                        object2 = this.a;
                        object2 = (E63)object2;
                        object2.getClass();
                        n3 = dz3.c((Bitmap)object);
                        break;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    {
                        long l8 = n3;
                        l3 -= l8;
                        this.e = l3;
                        object2 = "LruBitmapPool";
                        l4 = 3;
                        n3 = (int)(Log.isLoggable((String)object2, (int)l4) ? 1 : 0);
                        if (n3 != 0) {
                            object2 = this.a;
                            object2 = (E63)object2;
                            object2.getClass();
                            n3 = dz3.c((Bitmap)object);
                            n4 = object.getConfig();
                            E63.c(n3, (Bitmap.Config)n4);
                        }
                        if ((n3 = (int)(Log.isLoggable((String)(object2 = "LruBitmapPool"), (int)(l4 = (long)2)) ? 1 : 0)) != 0) {
                            object2 = this.a;
                            Objects.toString(object2);
                        }
                        object.recycle();
                        continue;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

