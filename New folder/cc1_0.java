/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Typeface
 *  android.util.Base64
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.LottieTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/*
 * Renamed from cC1
 */
public final class cc1_0 {
    public static final HashMap a;
    public static final HashSet b;
    public static final byte[] c;
    public static final byte[] d;

    static {
        byte[] byArray;
        Object object = new HashMap();
        a = object;
        object = new HashSet();
        b = object;
        byte[] byArray2 = byArray = new byte[4];
        byte[] byArray3 = byArray;
        byArray2[0] = 80;
        byArray3[1] = 75;
        byArray2[2] = 3;
        byArray3[3] = 4;
        c = byArray;
        Object object2 = object = (Object)new byte[3];
        object2[0] = 31;
        object2[1] = -117;
        object2[2] = 8;
        d = (byte[])object;
    }

    public static LottieTask a(String string2, Callable object, Runnable object2) {
        boolean bl2;
        LottieTask lottieTask = null;
        Object object3 = string2 == null ? null : RB1.b.a(string2);
        if (object3 != null) {
            lottieTask = new LottieTask((QB1)object3);
        }
        object3 = a;
        if (string2 != null && (bl2 = ((HashMap)object3).containsKey(string2))) {
            lottieTask = (LottieTask)((HashMap)object3).get(string2);
        }
        if (lottieTask != null) {
            if (object2 != null) {
                object2.run();
            }
            return lottieTask;
        }
        lottieTask = null;
        object2 = new LottieTask((Callable)object, false);
        if (string2 != null) {
            object = new AtomicBoolean(false);
            EC1 eC1 = new zb1_0(string2, (AtomicBoolean)object);
            ((LottieTask)object2).b(eC1);
            eC1 = new ac1_1(string2, (AtomicBoolean)object);
            ((LottieTask)object2).a(eC1);
            boolean n3 = ((AtomicBoolean)object).get();
            if (!n3) {
                ((HashMap)object3).put(string2, object2);
                int n4 = ((HashMap)object3).size();
                int n7 = 1;
                if (n4 == n7) {
                    cc1_0.l(false);
                }
            }
        }
        return object2;
    }

    public static void b(Context object) {
        a.clear();
        File[] fileArray = RB1.b.a;
        fileArray.evictAll();
        object = Yo1.a((Context)object).c();
        boolean bl2 = ((File)object).exists();
        if (bl2) {
            int n3;
            fileArray = ((File)object).listFiles();
            if (fileArray != null && (n3 = fileArray.length) > 0) {
                for (File file : fileArray) {
                    file.delete();
                }
            }
            ((File)object).delete();
        }
    }

    public static HC1 c(Context object, String object2, String string2) {
        QB1 qB1 = string2 == null ? null : RB1.b.a(string2);
        if (qB1 != null) {
            object = new HC1(qB1);
            return object;
        }
        try {
            qB1 = object.getAssets();
        }
        catch (IOException iOException) {
            object2 = new HC1(iOException);
            return object2;
        }
        object2 = qB1.open((String)object2);
        return cc1_0.d(object, (InputStream)object2, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HC1 d(Context object, InputStream object2, String string2) {
        Object object3;
        boolean bl2;
        if (string2 == null) {
            bl2 = false;
            object3 = null;
        } else {
            object3 = RB1.b.a(string2);
        }
        if (object3 != null) {
            return new HC1((QB1)object3);
        }
        try {
            object2 = o72_0.h((InputStream)object2);
            object2 = o72_0.b((a93_0)object2);
            object3 = c;
            object3 = cc1_0.k((ie2_2)object2, (byte[])object3);
            bl2 = (Boolean)object3;
            if (bl2) {
                IE2$a iE2$a = new IE2$a((ie2_2)object2);
                object3 = new ZipInputStream(iE2$a);
                return cc1_0.i((Context)object, (ZipInputStream)object3, string2);
            }
        }
        catch (IOException iOException) {
            return new HC1(iOException);
        }
        object = d;
        boolean bl3 = (Boolean)(object = cc1_0.k((ie2_2)object2, (byte[])object));
        if (bl3) {
            object3 = new IE2$a((ie2_2)object2);
            object = new GZIPInputStream((InputStream)object3);
            return cc1_0.e((InputStream)object, string2);
        }
        object = gm1_0.e;
        object = new vm1_1((ie2_2)object2);
        boolean bl4 = true;
        return cc1_0.f((vm1_1)object, string2, bl4);
    }

    public static HC1 e(InputStream closeable, String string2) {
        closeable = o72_0.b(o72_0.h(closeable));
        Object object = gm1_0.e;
        object = new vm1_1((ie2_2)closeable);
        return cc1_0.f((vm1_1)object, string2, true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HC1 f(vm1_1 var0, String var1_1, boolean var2_4) {
        block9: {
            block11: {
                block10: {
                    block8: {
                        block12: {
                            if (var1_1 != null) break block12;
                            var3_5 = null;
                            ** GOTO lbl8
                        }
                        try {
                            var3_5 = RB1.b;
                            var3_5 = var3_5.a((String)var1_1);
lbl8:
                            // 2 sources

                            if (var3_5 != null) {
                                var1_1 = new HC1((QB1)var3_5);
                                if (!var2_4) break block8;
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var1_2) {
                            break block9;
                        }
                        catch (Exception var1_3) {
                            ** GOTO lbl-1000
                        }
                        wz3.b(var0);
                    }
                    return var1_1;
lbl-1000:
                    // 1 sources

                    {
                        var3_5 = dc1_0.a(var0);
                        if (var1_1 != null) {
                            var4_6 = RB1.b;
                            var4_6 = var4_6.a;
                            var4_6.put(var1_1, var3_5);
                        }
                        var1_1 = new HC1((QB1)var3_5);
                        if (!var2_4) break block10;
                    }
                    wz3.b(var0);
                }
                return var1_1;
lbl-1000:
                // 1 sources

                {
                    var3_5 = new HC1(var1_3);
                    if (!var2_4) break block11;
                }
                wz3.b(var0);
            }
            return var3_5;
        }
        if (var2_4) {
            wz3.b(var0);
        }
        throw var1_2;
    }

    public static LottieTask g(Context context, int n3, String string2) {
        WeakReference<Context> weakReference = new WeakReference<Context>(context);
        context = context.getApplicationContext();
        bc1_1 bc1_12 = new bc1_1(weakReference, context, n3, string2);
        return cc1_0.a(string2, bc1_12, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HC1 h(Context object, int n3, String string2) {
        Object object2;
        Object object3;
        boolean bl2;
        if (string2 == null) {
            bl2 = false;
            object3 = null;
        } else {
            object3 = RB1.b.a(string2);
        }
        if (object3 != null) {
            return new HC1((QB1)object3);
        }
        try {
            object3 = object.getResources();
            object2 = object3.openRawResource(n3);
            object2 = o72_0.h((InputStream)object2);
            object2 = o72_0.b((a93_0)object2);
            object3 = c;
            object3 = cc1_0.k((ie2_2)object2, (byte[])object3);
            bl2 = (Boolean)object3;
            if (bl2) {
                IE2$a iE2$a = new IE2$a((ie2_2)object2);
                object3 = new ZipInputStream(iE2$a);
                return cc1_0.i((Context)object, (ZipInputStream)object3, string2);
            }
        }
        catch (Resources.NotFoundException notFoundException) {
            return new HC1(notFoundException);
        }
        object = d;
        boolean bl3 = (Boolean)(object = cc1_0.k((ie2_2)object2, (byte[])object));
        if (!bl3) {
            object = gm1_0.e;
            object = new vm1_1((ie2_2)object2);
            n3 = 1;
            return cc1_0.f((vm1_1)object, string2, n3 != 0);
        }
        try {
            object3 = new IE2$a((ie2_2)object2);
            object = new GZIPInputStream((InputStream)object3);
            return cc1_0.e((InputStream)object, string2);
        }
        catch (IOException iOException) {
            return new HC1(iOException);
        }
    }

    public static HC1 i(Context object, ZipInputStream zipInputStream, String string2) {
        try {
            object = cc1_0.j(object, zipInputStream, string2);
            return object;
        }
        finally {
            wz3.b(zipInputStream);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HC1 j(Context var0, ZipInputStream var1_3, String var2_4) {
        block37: {
            var3_5 /* !! */  = new HashMap();
            var4_6 = new HashMap();
            if (var2_4 != null) break block37;
            var5_7 = 0;
            var6_8 = null;
            ** GOTO lbl11
        }
        try {
            var6_8 = RB1.b;
            var6_8 = var6_8.a((String)var2_4);
lbl11:
            // 2 sources

            if (var6_8 != null) {
                return new HC1((QB1)var6_8);
            }
        }
        catch (IOException var0_1) {
            return new HC1(var0_1);
        }
        var6_8 = var1_3.getNextEntry();
        var7_9 /* !! */  = null;
        while (true) {
            block41: {
                block40: {
                    block39: {
                        block38: {
                            var8_10 = 1;
                            var9_11 = 0;
                            var10_12 /* !! */  = null;
                            if (var6_8 == null) break;
                            var11_16 = var6_8.getName();
                            var13_19 = var11_16.contains((CharSequence)(var12_17 = "__MACOSX"));
                            if (!var13_19) break block38;
                            var1_3.closeEntry();
                            ** GOTO lbl155
                        }
                        var12_17 = var6_8.getName();
                        var13_19 = var12_17.equalsIgnoreCase((String)(var14_20 = "manifest.json"));
                        if (!var13_19) break block39;
                        var1_3.closeEntry();
                        ** GOTO lbl155
                    }
                    var5_7 = (var6_8 = var6_8.getName()).contains((CharSequence)(var12_17 = ".json"));
                    if (var5_7 == 0) break block40;
                    var6_8 = o72_0.h((InputStream)var1_3);
                    var6_8 = o72_0.b((a93_0)var6_8);
                    var7_9 /* !! */  = gm1_0.e;
                    var7_9 /* !! */  = new vm1_1((ie2_2)var6_8);
                    var6_8 = cc1_0.f((vm1_1)var7_9 /* !! */ , null, false);
                    var6_8 = var6_8.a;
                    var7_9 /* !! */  = var6_8;
                    var7_9 /* !! */  = (QB1)var6_8;
                    ** GOTO lbl155
                }
                var6_8 = ".png";
                var5_7 = var11_16.contains((CharSequence)var6_8);
                var12_17 = "/";
                if (var5_7 != 0 || (var5_7 = (int)var11_16.contains((CharSequence)(var6_8 = ".webp"))) != 0 || (var5_7 = (int)var11_16.contains((CharSequence)(var6_8 = ".jpg"))) != 0 || (var5_7 = (int)var11_16.contains((CharSequence)(var6_8 = ".jpeg"))) != 0) ** GOTO lbl149
                var6_8 = ".ttf";
                var5_7 = (int)var11_16.contains((CharSequence)var6_8);
                if (var5_7 != 0 || (var5_7 = (int)var11_16.contains((CharSequence)(var6_8 = ".otf"))) != 0) break block41;
                var1_3.closeEntry();
                ** GOTO lbl155
            }
            var6_8 = var11_16.split((String)var12_17);
            var15_22 = ((String[])var6_8).length - var8_10;
            var6_8 = var6_8[var15_22];
            var16_23 /* !! */  = "\\.";
            var16_23 /* !! */  = var6_8.split((String)var16_23 /* !! */ );
            var16_23 /* !! */  = var16_23 /* !! */ [0];
            if (var0 == null) {
                var2_4 = new StringBuilder();
                var3_5 /* !! */  = "Unable to extract font ";
                var2_4.append((String)var3_5 /* !! */ );
                var2_4.append((String)var16_23 /* !! */ );
                var3_5 /* !! */  = " please pass a non-null Context parameter";
                var2_4.append((String)var3_5 /* !! */ );
                var2_4 = var2_4.toString();
                var1_3 = new IllegalStateException((String)var2_4);
                return new HC1((Throwable)var1_3);
            }
            var12_17 = var0.getCacheDir();
            var11_16 = new File((File)var12_17, (String)var6_8);
            var12_17 = new FileOutputStream((File)var11_16);
            {
                block34: {
                    catch (Throwable var10_14) {
                        ** GOTO lbl-1000
                    }
                    var14_20 = new FileOutputStream((File)var11_16);
                    var17_24 = 4096;
                    {
                        block35: {
                            catch (Throwable var10_15) {
                                break block34;
                            }
                            try {
                                var18_25 = new byte[var17_24];
                                while ((var19_26 = var1_3.read(var18_25)) != (var20_27 = -1)) {
                                    var14_20.write(var18_25, 0, var19_26);
                                }
                            }
                            catch (Throwable var10_13) {
                                break block35;
                            }
                            var14_20.flush();
                            {
                                var14_20.close();
                            }
                            {
                                var12_17.close();
                                ** GOTO lbl131
                            }
                        }
                        try {
                            var14_20.close();
                            throw var10_13;
                        }
                        catch (Throwable var14_21) {}
                        {
                            var10_13.addSuppressed(var14_21);
                            throw var10_13;
                        }
                    }
                }
                try {
                    var12_17.close();
                    throw var10_15;
                }
                catch (Throwable var12_18) {}
                {
                    var10_15.addSuppressed(var12_18);
                    throw var10_15;
                }
            }
lbl-1000:
            // 1 sources

            {
                var12_17 = new StringBuilder();
                var14_20 = "Unable to save font ";
                var12_17.append((String)var14_20);
                var12_17.append((String)var16_23 /* !! */ );
                var14_20 = " to the temporary file: ";
                var12_17.append((String)var14_20);
                var12_17.append((String)var6_8);
                var6_8 = ". ";
                var12_17.append((String)var6_8);
                var6_8 = var12_17.toString();
                rx1.c((String)var6_8, var10_14);
lbl131:
                // 2 sources

                var6_8 = Typeface.createFromFile((File)var11_16);
                var9_11 = (int)var11_16.delete();
                if (var9_11 == 0) {
                    var10_12 /* !! */  = new StringBuilder();
                    var12_17 = "Failed to delete temp font file ";
                    var10_12 /* !! */ .append((String)var12_17);
                    var11_16 = var11_16.getAbsolutePath();
                    var10_12 /* !! */ .append((String)var11_16);
                    var11_16 = ".";
                    var10_12 /* !! */ .append((String)var11_16);
                    var10_12 /* !! */  = var10_12 /* !! */ .toString();
                    rx1.b((String)var10_12 /* !! */ );
                }
                var4_6.put(var16_23 /* !! */ , var6_8);
                ** GOTO lbl155
lbl149:
                // 1 sources

                var6_8 = var11_16.split((String)var12_17);
                var9_11 = ((String[])var6_8).length - var8_10;
            }
            {
                var6_8 = var6_8[var9_11];
                var16_23 /* !! */  = BitmapFactory.decodeStream((InputStream)var1_3);
                var3_5 /* !! */ .put(var6_8, var16_23 /* !! */ );
lbl155:
                // 6 sources

                var6_8 = var1_3.getNextEntry();
                continue;
            }
            break;
        }
        if (var7_9 /* !! */  == null) {
            var1_3 = new IllegalArgumentException("Unable to parse composition");
            return new HC1((Throwable)var1_3);
        }
        var0 = var3_5 /* !! */ .entrySet().iterator();
        while (var21_28 = var0.hasNext()) {
            block36: {
                var1_3 = (Map.Entry)var0.next();
                var6_8 = (String)var1_3.getKey();
                var11_16 = var7_9 /* !! */ .c().values().iterator();
                while (var13_19 = var11_16.hasNext()) {
                    var12_17 = (DC1)var11_16.next();
                    var14_20 = var12_17.d;
                    var22_29 = var14_20.equals(var6_8);
                    if (!var22_29) continue;
                    break block36;
                }
                var13_19 = false;
                var12_17 = null;
            }
            if (var12_17 == null) continue;
            var1_3 = (Bitmap)var1_3.getValue();
            var5_7 = var12_17.a;
            var15_22 = var12_17.b;
            var1_3 = wz3.d((Bitmap)var1_3, var5_7, var15_22);
            var12_17.f = var1_3;
        }
        var0 = var4_6.entrySet().iterator();
        while (var21_28 = var0.hasNext()) {
            var1_3 = (Map.Entry)var0.next();
            var4_6 = var7_9 /* !! */ .f.values().iterator();
            var5_7 = 0;
            var6_8 = null;
            while ((var15_22 = var4_6.hasNext()) != 0) {
                var11_16 = (MU0)var4_6.next();
                var12_17 = var11_16.a;
                var14_20 = var1_3.getKey();
                var13_19 = var12_17.equals(var14_20);
                if (!var13_19) continue;
                var6_8 = (Typeface)var1_3.getValue();
                var11_16.d = var6_8;
                var5_7 = 1;
            }
            if (var5_7 != 0) continue;
            var6_8 = "Parsed font for ";
            var4_6 = new StringBuilder((String)var6_8);
            var1_3 = (String)var1_3.getKey();
            var4_6.append((String)var1_3);
            var4_6.append(" however it was not found in the animation.");
            var1_3 = var4_6.toString();
            rx1.b((String)var1_3);
        }
        var23_30 = var3_5 /* !! */ .isEmpty();
        if (var23_30) {
            var0 = var7_9 /* !! */ .c().entrySet().iterator();
            while (var21_28 = var0.hasNext()) {
                var1_3 = (DC1)((Map.Entry)var0.next()).getValue();
                if (var1_3 == null) {
                    return null;
                }
                var3_5 /* !! */  = new BitmapFactory.Options();
                var3_5 /* !! */ .inScaled = var8_10;
                var3_5 /* !! */ .inDensity = var24_31 = 160;
                var4_6 = var1_3.d;
                var6_8 = "data:";
                var5_7 = (int)var4_6.startsWith((String)var6_8);
                if (var5_7 == 0 || (var5_7 = var4_6.indexOf((String)(var6_8 = "base64,"))) <= 0) continue;
                var5_7 = 44;
                try {
                    var5_7 = var4_6.indexOf(var5_7) + var8_10;
                    var4_6 = var4_6.substring(var5_7);
                }
                catch (IllegalArgumentException var0_2) {
                    rx1.c("data URL did not have correct base64 format.", var0_2);
                    return null;
                }
                var3_5 /* !! */  = BitmapFactory.decodeByteArray((byte[])(var4_6 = (Object)Base64.decode((String)var4_6, (int)0)), (int)0, (int)(var5_7 = ((Object)var4_6).length), (BitmapFactory.Options)var3_5 /* !! */ );
                if (var3_5 /* !! */  == null) continue;
                var24_31 = var1_3.a;
                var5_7 = var1_3.b;
                var3_5 /* !! */  = wz3.d((Bitmap)var3_5 /* !! */ , var24_31, var5_7);
                var1_3.f = var3_5 /* !! */ ;
            }
        }
        if (var2_4 == null) return new HC1((QB1)var7_9 /* !! */ );
        var0 = RB1.b.a;
        var0.put(var2_4, var7_9 /* !! */ );
        return new HC1((QB1)var7_9 /* !! */ );
    }

    public static Boolean k(ie2_2 object, byte[] byArray) {
        object = ((ie2_2)object).b();
        int n3 = byArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2 = byArray[i3];
            byte by4 = ((ie2_2)object).readByte();
            if (by4 == by2) continue;
            return Boolean.FALSE;
        }
        try {
            ((ie2_2)object).close();
            return Boolean.TRUE;
        }
        catch (Exception exception) {
            rx1.a.getClass();
            object = Yo1.a;
            return Boolean.FALSE;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return Boolean.FALSE;
        }
    }

    public static void l(boolean bl2) {
        int n3;
        HashSet hashSet = b;
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet = null;
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            IC1 iC1 = (IC1)arrayList.get(i3);
            iC1.a();
        }
    }

    public static String m(int n3, Context object) {
        String string2 = "rawRes";
        StringBuilder stringBuilder = new StringBuilder(string2);
        object = object.getResources().getConfiguration();
        int n4 = object.uiMode & 0x30;
        int n7 = 32;
        object = n4 == n7 ? "_night_" : "_day_";
        stringBuilder.append((String)object);
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

