/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Eq3
 */
public final class eq3_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ aq3_0 a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ zn2 c;
    public final /* synthetic */ HttpTransaction d;

    public eq3_0(aq3_0 aq3_02, Uri uri, zn2 zn22, HttpTransaction httpTransaction, f80_0 f80_02) {
        this.a = aq3_02;
        this.b = uri;
        this.c = zn22;
        this.d = httpTransaction;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        zn2 zn22 = this.c;
        HttpTransaction httpTransaction = this.d;
        aq3_0 aq3_02 = this.a;
        Uri uri = this.b;
        object = new eq3_0(aq3_02, uri, zn22, httpTransaction, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (eq3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((eq3_0)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        String string2;
        Throwable throwable222222;
        Object object2;
        Object object3;
        block25: {
            long l2;
            object3 = j90_0.COROUTINE_SUSPENDED;
            vl2_2.b(object);
            object = this.a;
            object = ((Fragment)object).requireContext();
            object = object.getContentResolver();
            object3 = this.b;
            Object object4 = "w";
            object = object.openFileDescriptor((Uri)object3, (String)object4);
            if (object == null) {
                return Boolean.TRUE;
            }
            object3 = this.c;
            object4 = this.d;
            Object object5 = object.getFileDescriptor();
            object2 = new FileOutputStream((FileDescriptor)object5);
            {
                catch (Throwable throwable222222) {}
            }
            object5 = Eq3$a.$EnumSwitchMapping$0;
            Object object6 = ((Enum)object3).ordinal();
            object6 = object5[object6];
            Object object7 = 1;
            string2 = "Transaction not ready";
            String string3 = "(this as java.lang.String).getBytes(charset)";
            if (object6 != object7) {
                object7 = 2;
                if (object6 != object7) {
                    object3 = new NoWhenBranchMatchedException();
                    throw object3;
                }
                object3 = ((HttpTransaction)object4).getResponseBody();
                if (object3 == null) {
                    object7 = 0;
                    object5 = null;
                } else {
                    object4 = Charsets.UTF_8;
                    object3 = ((String)object3).getBytes((Charset)object4);
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    object5 = new ByteArrayInputStream((byte[])object3);
                    l2 = ol3_0.b((InputStream)object5, (OutputStream)object2);
                    object5 = new Long(l2);
                }
                if (object5 == null) {
                    object3 = new IOException(string2);
                    throw object3;
                }
                l2 = (Long)object5;
            } else {
                object3 = ((HttpTransaction)object4).getRequestBody();
                if (object3 == null) {
                    object7 = 0;
                    object5 = null;
                } else {
                    object4 = Charsets.UTF_8;
                    object3 = ((String)object3).getBytes((Charset)object4);
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    object5 = new ByteArrayInputStream((byte[])object3);
                    l2 = ol3_0.b((InputStream)object5, (OutputStream)object2);
                    object5 = new Long(l2);
                }
                if (object5 == null) break block25;
                l2 = (Long)object5;
            }
            object5 = new Long(l2);
            xj3_1.b((Closeable)object2, null);
            l2 = ((Number)object5).longValue();
            object2 = new Long(l2);
            xj3_1.b((Closeable)object, null);
            return Boolean.TRUE;
        }
        try {
            object3 = new IOException(string2);
            throw object3;
        }
        catch (Throwable throwable3) {}
        try {
            throw throwable3;
        }
        catch (Throwable throwable4) {
            xj3_1.b((Closeable)object2, throwable3);
            throw throwable4;
        }
        try {
            throw throwable222222;
        }
        catch (Throwable throwable5) {
            try {
                xj3_1.b((Closeable)object, throwable222222);
                throw throwable5;
            }
            catch (FileNotFoundException fileNotFoundException) {
                return Boolean.FALSE;
            }
            catch (IOException iOException) {
                return Boolean.FALSE;
            }
        }
    }
}

