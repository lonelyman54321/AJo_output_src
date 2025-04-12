/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.media.ExifInterface
 *  android.net.Uri
 *  android.os.Environment
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Audio$Media
 *  android.provider.MediaStore$Images$Media
 *  android.provider.MediaStore$Video$Media
 */
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from Bz3
 */
public final class bz3_0 {
    public static int a;
    public static int b;

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public static int a(Context object, Uri uri, int n3) {
        int n4;
        int n7;
        BitmapFactory.Options options;
        block11: {
            Object object2;
            block10: {
                void var1_4;
                block9: {
                    options = new BitmapFactory.Options();
                    n7 = 1;
                    options.inJustDecodeBounds = n7;
                    object2 = null;
                    object = object.getContentResolver();
                    object = object.openInputStream(uri);
                    try {
                        BitmapFactory.decodeStream((InputStream)object, null, (BitmapFactory.Options)options);
                    }
                    catch (Throwable throwable) {
                        object2 = object;
                        break block9;
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        object2 = object;
                        break block10;
                    }
                    bz3_0.b((Closeable)object);
                    break block11;
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                bz3_0.b(object2);
                throw var1_4;
                catch (FileNotFoundException fileNotFoundException) {}
            }
            bz3_0.b(object2);
        }
        a = options.outWidth;
        b = n4 = options.outHeight;
        while ((n4 = options.outWidth / n7) > n3 || (n4 = options.outHeight / n7) > n3) {
            n7 *= 2;
        }
        return n7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bitmap c(Context var0, Uri var1_7, int var2_9) {
        block14: {
            block13: {
                var3_10 = null;
                var4_11 = var0.getContentResolver();
                var4_11 = var4_11.openInputStream(var1_7);
                if (var4_11 == null) break block13;
                try {
                    var5_12 = new BitmapFactory.Options();
                    var5_12.inSampleSize = var6_13 = bz3_0.a(var0, var1_7, var2_9);
                    var6_13 = 0;
                    var0 = null;
                    var5_12.inJustDecodeBounds = false;
                    var3_10 = BitmapFactory.decodeStream((InputStream)var4_11, null, (BitmapFactory.Options)var5_12);
                }
                catch (Throwable var0_1) {
                    var3_10 = var4_11;
                }
lbl16:
                // 2 sources

                while (true) {
                    if (var3_10 == null) throw var0_6;
                    try {
                        var3_10.close();
                        throw var0_6;
                    }
                    catch (IOException var1_8) {
                        var1_8.getMessage();
                    }
                    throw var0_6;
                }
                catch (FileNotFoundException var0_2) {
                    ** GOTO lbl-1000
                }
            }
            if (var4_11 == null) return var3_10;
            try {}
            catch (IOException var0_3) {
                var0_3.getMessage();
                return var3_10;
            }
            break block14;
            catch (Throwable var0_4) {
                ** continue;
            }
            catch (FileNotFoundException var0_5) {
                var4_11 = null;
                ** GOTO lbl-1000
            }
        }
        var4_11.close();
        return var3_10;
lbl-1000:
        // 2 sources

        {
            var0.getMessage();
            if (var4_11 == null) return var3_10;
        }
        {
            var4_11.close();
        }
        return var3_10;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String d(Context context, Uri object, String string2, String[] stringArray) {
        void var1_4;
        Context context2;
        block8: {
            block7: {
                int n3;
                int n4;
                String string3 = "_data";
                String string4 = "_display_name";
                String[] stringArray2 = new String[]{string3, string4};
                context2 = null;
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    context = contentResolver.query((Uri)object, stringArray2, string2, stringArray, null);
                    if (context == null) break block7;
                }
                catch (Throwable throwable) {
                    // empty catch block
                    break block8;
                }
                try {
                    n4 = context.moveToFirst();
                }
                catch (Throwable throwable) {
                    context2 = context;
                    break block8;
                }
                if (n4 != 0 && (n3 = (n3 = ((String)(object = object.toString())).startsWith(string2 = "content://com.google.android.gallery3d")) != 0 ? context.getColumnIndex(string4) : context.getColumnIndex(string3)) != (n4 = -1)) {
                    object = context.getString(n3);
                    context.close();
                    return object;
                }
            }
            if (context != null) {
                context.close();
            }
            return null;
        }
        if (context2 != null) {
            context2.close();
        }
        throw var1_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int e(Context var0, Uri var1_3) {
        block36: {
            block35: {
                block40: {
                    block38: {
                        block37: {
                            block43: {
                                block42: {
                                    block41: {
                                        block39: {
                                            block34: {
                                                block33: {
                                                    block32: {
                                                        var2_4 = var1_3.getAuthority().toLowerCase();
                                                        var3_9 = var2_4.endsWith("media");
                                                        var4_10 = 0;
                                                        if (!var3_9) break block39;
                                                        var5_11 = new String[]{"orientation"};
                                                        var3_9 = false;
                                                        var2_4 = null;
                                                        try {
                                                            var6_13 = var0.getContentResolver();
                                                            var7_15 = false;
                                                            var8_17 = null;
                                                            var9_19 = var1_3;
                                                            var2_4 = var6_13.query((Uri)var1_3, var5_11, null, null, null);
                                                            if (var2_4 == null || !(var10_22 = var2_4.moveToFirst())) break block32;
                                                            var4_10 = var2_4.getInt(0);
                                                        }
                                                        catch (Throwable var0_1) {
                                                            break block33;
                                                        }
                                                        catch (RuntimeException v0) {
                                                            break block34;
                                                        }
lbl16:
                                                        // 3 sources

                                                        while (true) {
                                                            var2_4.close();
                                                            return var4_10;
                                                        }
                                                    }
                                                    if (var2_4 == null) return var4_10;
                                                    ** GOTO lbl16
                                                }
                                                if (var2_4 == null) throw var0_1;
                                                var2_4.close();
                                                throw var0_1;
                                            }
                                            if (var2_4 == null) return var4_10;
                                            ** while (true)
                                        }
                                        var3_9 = DocumentsContract.isDocumentUri((Context)var0, (Uri)var1_3);
                                        var6_14 = null;
                                        if (!var3_9) break block40;
                                        var2_4 = var1_3.getAuthority();
                                        var9_20 = "com.android.externalstorage.documents";
                                        var3_9 = var9_20.equals(var2_4);
                                        var11_26 = 1;
                                        var5_12 = ":";
                                        if (!var3_9) break block41;
                                        var2_4 = "primary";
                                        var0 = DocumentsContract.getDocumentId((Uri)var1_3).split(var5_12);
                                        var12_27 = var2_4.equalsIgnoreCase((String)(var1_3 = var0[0]));
                                        if (var12_27 == 0) ** GOTO lbl-1000
                                        var1_3 = new StringBuilder();
                                        var2_4 = Environment.getExternalStorageDirectory();
                                        var1_3.append(var2_4);
                                        var2_4 = "/";
                                        var1_3.append((String)var2_4);
                                        var0 = var0[var11_26];
                                        var1_3.append((String)var0);
                                        var0 = var1_3.toString();
                                        break block35;
                                    }
                                    var2_4 = "com.android.providers.downloads.documents";
                                    var8_18 = var1_3.getAuthority();
                                    var3_9 = var2_4.equals(var8_18);
                                    if (!var3_9) break block42;
                                    if ((var1_3 = DocumentsContract.getDocumentId((Uri)var1_3)) != null && (var3_9 = var1_3.startsWith((String)(var2_4 = "raw:")))) {
                                        var10_23 = 4;
                                        var0 = var1_3.substring(var10_23);
                                        break block35;
                                    } else {
                                        var2_4 = Uri.parse((String)"content://downloads/public_downloads");
                                        var13_28 = Long.valueOf((String)var1_3);
                                        var1_3 = ContentUris.withAppendedId((Uri)var2_4, (long)var13_28);
                                        var0 = bz3_0.d((Context)var0, (Uri)var1_3, null, null);
                                    }
                                    break block35;
                                }
                                var2_4 = "com.android.providers.media.documents";
                                var8_18 = var1_3.getAuthority();
                                var3_9 = var2_4.equals(var8_18);
                                if (!var3_9) break block43;
                                var5_12 = "image";
                                var2_4 = (var1_3 = DocumentsContract.getDocumentId((Uri)var1_3).split(var5_12))[0];
                                var15_29 = var5_12.equals(var2_4);
                                if (var15_29) {
                                    var2_4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                } else {
                                    var5_12 = "video";
                                    var15_29 = var5_12.equals(var2_4);
                                    if (var15_29) {
                                        var2_4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                    } else {
                                        var5_12 = "audio";
                                        var3_9 = var5_12.equals(var2_4);
                                        if (var3_9) {
                                            var2_4 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                        } else {
                                            var3_9 = false;
                                            var2_4 = null;
                                        }
                                    }
                                }
                                var1_3 = var1_3[var11_26];
                                var1_3 = new String[]{var1_3};
                                var9_20 = "_id=?";
                                var0 = bz3_0.d((Context)var0, (Uri)var2_4, (String)var9_20, (String[])var1_3);
                                break block35;
                            }
                            var2_4 = "com.google.android.apps.docs.storage";
                            var9_20 = var1_3.getAuthority();
                            var3_9 = var2_4.equals(var9_20);
                            if (!var3_9) ** GOTO lbl-1000
                            var9_20 = var0.getCacheDir();
                            var5_12 = "tmp";
                            var2_4 = new File((File)var9_20, var5_12);
                            var2_4 = var2_4.getAbsolutePath();
                            try {
                                var0 = var0.getContentResolver();
                                var9_20 = "r";
                                var0 = var0.openFileDescriptor((Uri)var1_3, (String)var9_20);
                                if (var0 == null) break block36;
                                var0 = var0.getFileDescriptor();
                                var1_3 = new FileInputStream((FileDescriptor)var0);
                            }
                            catch (Throwable var2_8) {
                                var10_25 = false;
                                var0 = null;
                                break block37;
                            }
                            catch (IOException v1) {
                                var10_23 = 0;
                                var0 = null;
                                var12_27 = 0;
                                var1_3 = null;
                                break block38;
                            }
                            try {
                                var0 = new FileOutputStream((String)var2_4);
                                var11_26 = 4096;
                            }
                            catch (Throwable var2_7) {
                                var10_24 = false;
                                var0 = null;
                                ** GOTO lbl-1000
                            }
                            catch (IOException v2) {
                                var10_23 = 0;
                                var0 = null;
                                break block38;
                            }
                            try {
                                var9_20 = new byte[var11_26];
                                while ((var15_30 = var1_3.read((byte[])var9_20)) != (var7_16 = -1)) {
                                    var0.write((byte[])var9_20, 0, var15_30);
                                }
                            }
                            catch (Throwable var2_5) lbl-1000:
                            // 2 sources

                            {
                                var6_14 = var1_3;
                                break block37;
                            }
                            var9_20 = new File((String)var2_4);
                            bz3_0.b((Closeable)var1_3);
                            bz3_0.b((Closeable)var0);
                            var6_14 = var9_20;
                            break block36;
                        }
                        bz3_0.b((Closeable)var6_14);
                        bz3_0.b((Closeable)var0);
                        throw var2_6;
                        catch (IOException v3) {}
                    }
                    bz3_0.b((Closeable)var1_3);
                    bz3_0.b((Closeable)var0);
                    break block36;
                }
                var9_21 = "content";
                var2_4 = var1_3.getScheme();
                var3_9 = var9_21.equalsIgnoreCase((String)var2_4);
                if (var3_9) {
                    var2_4 = "com.google.android.apps.photos.content";
                    var9_21 = var1_3.getAuthority();
                    var3_9 = var2_4.equals(var9_21);
                    var0 = var3_9 ? var1_3.getLastPathSegment() : bz3_0.d((Context)var0, (Uri)var1_3, null, null);
                } else {
                    var0 = "file";
                    var2_4 = var1_3.getScheme();
                    var10_23 = var0.equalsIgnoreCase((String)var2_4);
                    if (var10_23 != 0) {
                        var0 = var1_3.getPath();
                    } else lbl-1000:
                    // 3 sources

                    {
                        var10_23 = 0;
                        var0 = null;
                    }
                }
            }
            if (var0 != null) {
                var6_14 = new File((String)var0);
            }
        }
        if (var6_14 == null) {
            return var4_10;
        }
        try {
            var1_3 = var6_14.getAbsolutePath();
            var0 = new ExifInterface((String)var1_3);
            var1_3 = "Orientation";
            var10_23 = var0.getAttributeInt((String)var1_3, 0);
            var12_27 = 3;
            if (var10_23 == var12_27) {
                return 180;
            }
            var12_27 = 6;
            if (var10_23 == var12_27) {
                return 90;
            }
            var12_27 = 8;
            if (var10_23 == var12_27) return 270;
            return var4_10;
        }
        catch (IOException var0_2) {
            var0_2.getMessage();
        }
        return var4_10;
    }
}

