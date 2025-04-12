/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/*
 * Renamed from Wx
 */
public final class wx_0
implements ek2_0 {
    public static final U92 b;
    public static final U92 c;
    public final Kp a;

    static {
        U92 u92;
        b = U92.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
        u92$a_0 u92$a_0 = U92.e;
        c = u92 = new U92("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, u92$a_0);
    }

    public wx_0(Kp kp) {
        this.a = kp;
    }

    public final cz0_0 a(Z92 z92) {
        return cz0_0.TRANSFORMED;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(Object object, File object2, Z92 object3) {
        boolean bl2;
        int n3;
        Bitmap.CompressFormat compressFormat;
        U92 u92;
        String string2;
        block22: {
            block21: {
                OutputStream outputStream;
                block20: {
                    block18: {
                        block17: {
                            FileOutputStream fileOutputStream;
                            block16: {
                                object = (wk2_0)object;
                                string2 = "BitmapEncoder";
                                object = (Bitmap)object.get();
                                u92 = c;
                                compressFormat = (Bitmap.CompressFormat)((Z92)object3).c(u92);
                                if (compressFormat == null) {
                                    boolean bl3 = object.hasAlpha();
                                    compressFormat = bl3 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                                }
                                object.getWidth();
                                object.getHeight();
                                n3 = kx1.a;
                                SystemClock.elapsedRealtimeNanos();
                                Object object4 = b;
                                object4 = (Integer)((Z92)object3).c((U92)object4);
                                n3 = (Integer)object4;
                                outputStream = null;
                                fileOutputStream = new FileOutputStream((File)object2);
                                object2 = this.a;
                                if (object2 == null) break block16;
                                try {
                                    outputStream = new qE(fileOutputStream, (Kp)object2);
                                    break block17;
                                }
                                catch (IOException iOException) {
                                    outputStream = fileOutputStream;
                                    break block18;
                                }
                                catch (Throwable throwable) {}
                                outputStream = fileOutputStream;
                                break block20;
                            }
                            outputStream = fileOutputStream;
                        }
                        object.compress(compressFormat, n3, outputStream);
                        outputStream.close();
                        try {
                            outputStream.close();
                        }
                        catch (Throwable throwable) {
                            throw throwable;
                        }
                        catch (IOException iOException) {}
                        bl2 = true;
                        break block22;
                        catch (Throwable throwable) {
                            break block20;
                        }
                        catch (IOException iOException) {}
                    }
                    bl2 = 3 != 0;
                    {
                        Log.isLoggable((String)string2, (int)(bl2 ? 1 : 0));
                        if (outputStream == null) break block21;
                    }
                    try {
                        outputStream.close();
                        break block21;
                    }
                    catch (IOException iOException) {}
                }
                if (outputStream == null) throw object;
                try {
                    outputStream.close();
                    throw object;
                }
                catch (IOException iOException) {}
                throw object;
            }
            bl2 = false;
            object2 = null;
        }
        n3 = 2;
        boolean bl4 = Log.isLoggable((String)string2, (int)n3);
        if (!bl4) return bl2;
        Objects.toString(compressFormat);
        dz3.c((Bitmap)object);
        SystemClock.elapsedRealtimeNanos();
        object3 = ((Z92)object3).c(u92);
        Objects.toString(object3);
        object.hasAlpha();
        return bl2;
    }
}

