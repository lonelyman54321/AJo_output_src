/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.Drawable
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from fF
 */
public final class ff_1
implements BK2 {
    public static final fF$a f;
    public static final fF$b g;
    public final Context a;
    public final List b;
    public final fF$b c;
    public final fF$a d;
    public final sz0_1 e;

    static {
        Object object = new Object();
        f = object;
        g = object = new fF$b();
    }

    public ff_1(Context object, ArrayList arrayList, ny_0 ny_02, Kp kp) {
        fF$a fF$a = f;
        this.a = object = object.getApplicationContext();
        this.b = arrayList;
        this.d = fF$a;
        super(ny_02, kp);
        this.e = object;
        object = g;
        this.c = object;
    }

    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        object = (ByteBuffer)object;
        U92 u92 = NZ0.b;
        boolean bl3 = (Boolean)(object2 = (Boolean)((Z92)object2).c(u92));
        if (!bl3 && (object = com.bumptech.glide.load.a.c(this.b, (ByteBuffer)object)) == (object2 = ImageHeaderParser$ImageType.GIF)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        Object object3 = object;
        object3 = (ByteBuffer)object;
        object = this.c;
        // MONITORENTER : object
        Object object4 = ((fF$b)object).a;
        object4 = ((ArrayDeque)object4).poll();
        object4 = (IZ0)object4;
        if (object4 == null) {
            object4 = new IZ0();
        }
        Object object2 = object4;
        object4 = null;
        ((IZ0)object2).b = null;
        object4 = ((IZ0)object2).a;
        ByteOrder byteOrder = null;
        Arrays.fill((byte[])object4, (byte)0);
        ((IZ0)object2).c = object4 = new GZ0();
        ((IZ0)object2).d = 0;
        ((IZ0)object2).b = object4 = ((ByteBuffer)object3).asReadOnlyBuffer();
        ((ByteBuffer)object4).position(0);
        object4 = ((IZ0)object2).b;
        byteOrder = ByteOrder.LITTLE_ENDIAN;
        ((ByteBuffer)object4).order(byteOrder);
        // MONITOREXIT : object
        object4 = this;
        try {
            object = this.c((ByteBuffer)object3, n3, n4, (IZ0)object2, z92);
            return object;
        }
        finally {
            this.c.a((IZ0)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zz0_2 c(ByteBuffer byteBuffer, int n3, int n4, IZ0 iZ0, Z92 z92) {
        Throwable throwable2;
        int n7;
        String string2;
        block12: {
            int n8;
            block10: {
                Bitmap bitmap;
                qb3_1 qb3_12;
                Object object;
                Object object2;
                Object object3;
                Object object4;
                yZ0$a yZ0$a;
                Object object5;
                ff_1 ff_12;
                block11: {
                    ff_12 = this;
                    string2 = "BufferGifDecoder";
                    n8 = kx1.a;
                    SystemClock.elapsedRealtimeNanos();
                    n7 = 2;
                    try {
                        object5 = iZ0.b();
                        int n10 = ((GZ0)object5).c;
                        yZ0$a = null;
                        if (n10 <= 0 || (n10 = ((GZ0)object5).b) != 0) break block10;
                        object4 = NZ0.a;
                        object3 = z92;
                        object4 = (object4 = z92.c((U92)object4)) == (object3 = Yi0.PREFER_RGB_565) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                        int n14 = ((GZ0)object5).g;
                        n14 /= n4;
                        int n15 = ((GZ0)object5).f;
                        if ((n14 = Math.min(n14, n15 /= n3)) == 0) {
                            n14 = 0;
                            object3 = null;
                        } else {
                            n14 = Integer.highestOneBit(n14);
                        }
                        n15 = 1;
                        n14 = Math.max(n15, n14);
                        Log.isLoggable((String)string2, (int)n7);
                        object2 = ff_12.d;
                        object = ff_12.e;
                        object2.getClass();
                        object2 = byteBuffer;
                        qb3_12 = new qb3_1((wZ0$a)object, (GZ0)object5, byteBuffer, n14);
                        qb3_12.h((Bitmap.Config)object4);
                        qb3_12.b();
                        bitmap = qb3_12.a();
                        if (bitmap != null) break block11;
                    }
                    catch (Throwable throwable2) {}
                    n8 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                    if (n8 != 0) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return null;
                }
                cw3 cw32 = cw3.b;
                object4 = ff_12.a;
                object = com.bumptech.glide.a.a((Context)object4);
                object2 = object3;
                object3 = new DZ0((com.bumptech.glide.a)object, qb3_12, n3, n4, cw32, bitmap);
                yZ0$a = new yZ0$a((DZ0)object3);
                object5 = new yz0_2(yZ0$a);
                object4 = new gu0_0((Drawable)object5);
                break block12;
                n8 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                if (n8 != 0) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return object4;
            }
            n8 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
            if (n8 != 0) {
                SystemClock.elapsedRealtimeNanos();
            }
            return null;
        }
        boolean bl2 = Log.isLoggable((String)string2, (int)n7);
        if (bl2) {
            SystemClock.elapsedRealtimeNanos();
        }
        throw throwable2;
    }
}

