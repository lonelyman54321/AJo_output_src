/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.google.common.io.ByteStreams;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] a(DataSource dataSource, String string2, byte[] byArray, Map map2) {
        Throwable throwable22;
        Object object;
        Object object2 = dataSource;
        yc3 yc32 = new yc3(dataSource);
        Collections.emptyMap();
        Object object3 = Uri.parse((String)string2);
        object2 = "The uri must be set.";
        ct3.i(object3, (String)object2);
        int n3 = 1;
        long l2 = 0L;
        int n4 = 2;
        long l3 = 0L;
        long l4 = -1;
        Object object4 = byArray;
        Object object5 = map2;
        ti0_1 ti0_12 = new ti0_1((Uri)object3, l2, n4, byArray, map2, l3, l4, null, n3, null);
        object3 = ti0_12;
        int n7 = 0;
        while (true) {
            object = new si0((ti0_1)object3, yc32);
            object2 = ByteStreams.toByteArray((InputStream)object);
            gz3.f((Closeable)object);
            return object2;
            {
                Exception exception;
                catch (Exception exception2) {
                    exception = exception2;
                }
                Object object6 = yc32.c;
                object6.getClass();
                object4 = yc32.a.c();
                long l7 = yc32.b;
                object = ti0_12;
                MediaDrmCallbackException mediaDrmCallbackException = new MediaDrmCallbackException(ti0_12, (Uri)object6, (Map)object4, l7, exception);
                throw mediaDrmCallbackException;
                catch (Throwable throwable22) {
                    break;
                }
                catch (HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException) {}
                object6 = httpDataSource$InvalidResponseCodeException;
                {
                    int n8 = httpDataSource$InvalidResponseCodeException.d;
                    int n10 = 307;
                    object5 = null;
                    if ((n8 == n10 || n8 == (n10 = 308)) && n7 < (n8 = 5) && (object2 = ((HttpDataSource$InvalidResponseCodeException)object6).e) != null) {
                        object4 = "Location";
                        object2 = object2.get(object4);
                        if ((object2 = (List)object2) != null && (n10 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                            object5 = object2 = object2.get(0);
                            object5 = (String)object2;
                        }
                    }
                    if (object5 == null) throw object6;
                    ++n7;
                    object2 = ((ti0_1)object3).a();
                    object3 = Uri.parse((String)object5);
                    ((ti0$a)object2).a = object3;
                    object3 = ((ti0$a)object2).a();
                }
                {
                    gz3.f((Closeable)object);
                    continue;
                }
            }
            break;
        }
        {
            gz3.f((Closeable)object);
            throw throwable22;
        }
    }

    public static boolean b(Throwable object) {
        boolean bl2;
        String string2;
        int n3 = gz3.a;
        int n4 = 34;
        if (n3 == n4 && (n3 = object instanceof NoSuchMethodError) != 0 && (string2 = ((Throwable)object).getMessage()) != null && (bl2 = ((String)(object = ((Throwable)object).getMessage())).contains(string2 = "Landroid/media/NotProvisionedException;.<init>("))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean c(Throwable object) {
        boolean bl2;
        String string2;
        int n3 = gz3.a;
        int n4 = 34;
        if (n3 == n4 && (n3 = object instanceof NoSuchMethodError) != 0 && (string2 = ((Throwable)object).getMessage()) != null && (bl2 = ((String)(object = ((Throwable)object).getMessage())).contains(string2 = "Landroid/media/ResourceBusyException;.<init>("))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

