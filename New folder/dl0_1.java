/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from DL0
 */
public final class dl0_1 {
    public static final AtomicLong h;
    public final String a;
    public final DL0$d b;
    public final File c;
    public boolean d;
    public final ReentrantLock e;
    public final Condition f;
    public final AtomicLong g;

    static {
        AtomicLong atomicLong;
        h = atomicLong = new AtomicLong();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public dl0_1(String object, DL0$d object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object3 = "limits";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.a = object;
        this.b = object2;
        object2 = FacebookSdk.a;
        Xz3.h();
        object2 = FacebookSdk.j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
            n3 = 0;
            object2 = null;
        }
        if ((object3 = (CountDownLatch)((aj_0)object2).b) != null) {
            try {
                ((CountDownLatch)object3).await();
            }
            catch (InterruptedException interruptedException) {}
        }
        object2 = (File)((aj_0)object2).a;
        object3 = this.a;
        this.c = object = new File((File)object2, (String)object3);
        this.e = object2 = new ReentrantLock();
        this.f = object2 = ((ReentrantLock)object2).newCondition();
        long l2 = 0L;
        this.g = object2 = new AtomicLong(l2);
        n3 = ((File)object).mkdirs();
        if (n3 != 0 || (n3 = ((File)object).isDirectory()) != 0) {
            Intrinsics.checkNotNullParameter(object, "root");
            object2 = DL0$a.b;
            object = ((File)object).listFiles((FilenameFilter)object2);
            if (object != null) {
                n3 = ((Object)object).length;
                object3 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object4 = object[i3];
                    ((File)object4).delete();
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BufferedInputStream a(String object, String string2) {
        Throwable throwable222222;
        File file;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block9: {
            boolean bl2;
            block8: {
                block7: {
                    object6 = "Setting lastModified to ";
                    object5 = "key";
                    Intrinsics.checkNotNullParameter(object, (String)object5);
                    object4 = this.c;
                    object3 = lz3_0.a;
                    Intrinsics.checkNotNullParameter(object, (String)object5);
                    lz3_0.a.getClass();
                    object3 = Charsets.UTF_8;
                    object3 = ((String)object).getBytes((Charset)object3);
                    Intrinsics.checkNotNullExpressionValue(object3, "this as java.lang.String).getBytes(charset)");
                    object2 = "MD5";
                    object3 = lz3_0.u((String)object2, (byte[])object3);
                    file = new File((File)object4, (String)object3);
                    object4 = null;
                    object3 = new FileInputStream(file);
                    int n3 = 8192;
                    object2 = new BufferedInputStream((InputStream)object3, n3);
                    try {
                        object3 = DL0$g.a((BufferedInputStream)object2);
                        if (object3 != null) break block7;
                    }
                    catch (Throwable throwable222222) {}
                    ((BufferedInputStream)object2).close();
                    return null;
                }
                object5 = object3.optString((String)object5);
                bl2 = Intrinsics.areEqual(object5, object);
                if (bl2) break block8;
                ((BufferedInputStream)object2).close();
                return null;
            }
            object = "tag";
            object = object3.optString((String)object, null);
            if (string2 != null || (bl2 = Intrinsics.areEqual(string2, object))) break block9;
            ((BufferedInputStream)object2).close();
            return null;
        }
        object = new Date();
        long l2 = ((Date)object).getTime();
        object5 = sx1.d;
        object5 = Ax1.CACHE;
        object4 = "DL0";
        object3 = "TAG";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object3 = new StringBuilder((String)object6);
        object6 = l2;
        ((StringBuilder)object3).append(object6);
        object6 = " for ";
        ((StringBuilder)object3).append((String)object6);
        object6 = file.getName();
        ((StringBuilder)object3).append((String)object6);
        object6 = ((StringBuilder)object3).toString();
        sx1$a.a((Ax1)((Object)object5), (String)object4, (String)object6);
        file.setLastModified(l2);
        return object2;
        ((BufferedInputStream)object2).close();
        throw throwable222222;
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final BufferedOutputStream b(String object, String object2) {
        File file;
        CharSequence charSequence;
        block8: {
            Throwable throwable2;
            Object object3;
            block6: {
                JSONException jSONException2;
                String string2;
                String string3;
                block7: {
                    Object object4;
                    block9: {
                        charSequence = "TAG";
                        string3 = "DL0";
                        string2 = "Error creating JSON header for cache file: ";
                        String string4 = "key";
                        Intrinsics.checkNotNullParameter(object, string4);
                        object3 = this.c;
                        object4 = new StringBuilder("buffer");
                        Object object5 = h;
                        long l2 = ((AtomicLong)object5).incrementAndGet();
                        ((StringBuilder)object4).append(l2);
                        object4 = ((StringBuilder)object4).toString();
                        file = new File((File)object3, (String)object4);
                        file.delete();
                        boolean bl2 = file.createNewFile();
                        if (!bl2) break block8;
                        try {
                            object3 = new FileOutputStream(file);
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            object2 /* !! */  = sx1.d;
                            object2 /* !! */  = Ax1.CACHE;
                            Intrinsics.checkNotNullExpressionValue(string3, (String)charSequence);
                            charSequence = new StringBuilder("Error creating buffer output stream: ");
                            ((StringBuilder)charSequence).append(fileNotFoundException);
                            charSequence = ((StringBuilder)charSequence).toString();
                            sx1$a.c((Ax1)((Object)object2 /* !! */ ), string3, (String)charSequence);
                            String string5 = fileNotFoundException.getMessage();
                            object2 /* !! */  = new IOException(string5);
                            throw object2 /* !! */ ;
                        }
                        long l3 = System.currentTimeMillis();
                        object5 = object4;
                        object4 = new el0_2(l3, this, file, (String)object);
                        object5 = new DL0$b((FileOutputStream)object3, (el0_2)object4);
                        int n3 = 8192;
                        object3 = new BufferedOutputStream((OutputStream)object5, n3);
                        object4 = new JSONObject();
                        object4.put(string4, object);
                        boolean bl3 = lz3_0.A((String)object2 /* !! */ );
                        if (bl3) break block9;
                        object = "tag";
                        object4.put((String)object, object2 /* !! */ );
                        break block9;
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        catch (JSONException jSONException2) {
                            break block7;
                        }
                    }
                    object = "stream";
                    Intrinsics.checkNotNullParameter(object3, (String)object);
                    object = "header";
                    Intrinsics.checkNotNullParameter(object4, (String)object);
                    object = object4.toString();
                    object2 /* !! */  = "header.toString()";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2 /* !! */ );
                    object2 /* !! */  = Charsets.UTF_8;
                    object = ((String)object).getBytes((Charset)object2 /* !! */ );
                    object2 /* !! */  = "this as java.lang.String).getBytes(charset)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2 /* !! */ );
                    int n4 = 0;
                    object2 /* !! */  = null;
                    ((OutputStream)object3).write(0);
                    n4 = ((Object)object).length >> 16 & 0xFF;
                    ((OutputStream)object3).write(n4);
                    n4 = ((Object)object).length >> 8 & 0xFF;
                    ((OutputStream)object3).write(n4);
                    n4 = ((Object)object).length & 0xFF;
                    ((OutputStream)object3).write(n4);
                    ((OutputStream)object3).write((byte[])object);
                    return object3;
                }
                object2 /* !! */  = sx1.d;
                object2 /* !! */  = Ax1.CACHE;
                Intrinsics.checkNotNullExpressionValue(string3, (String)charSequence);
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append((Object)jSONException2);
                charSequence = ((StringBuilder)charSequence).toString();
                sx1$a.c((Ax1)((Object)object2 /* !! */ ), string3, (String)charSequence);
                String string6 = jSONException2.getMessage();
                object2 /* !! */  = new IOException(string6);
                throw object2 /* !! */ ;
            }
            ((OutputStream)object3).close();
            throw throwable2;
        }
        object2 /* !! */  = new StringBuilder("Could not create file at ");
        charSequence = file.getAbsolutePath();
        ((StringBuilder)object2 /* !! */ ).append((String)charSequence);
        object2 /* !! */  = ((StringBuilder)object2 /* !! */ ).toString();
        object = new IOException((String)object2 /* !! */ );
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{FileLruCache: tag:");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(" file:");
        string2 = this.c.getName();
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

