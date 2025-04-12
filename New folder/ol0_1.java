/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 */
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OL0
 */
public final class ol0_1 {
    public final yc1_2 a;
    public final sl0_0 b;
    public final jf1_1 c;
    public final Hf1 d;
    public final fl0_1 e;
    public final Map f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ol0_1(Context context, yc1_2 objectArray) {
        Object object;
        rl0_1 rl0_12;
        Object object2;
        Object object3;
        Object object4;
        File file;
        File file2;
        int n3;
        Object object5;
        Object object6;
        block6: {
            File file3;
            Object object7;
            ol0_1 ol0_12 = this;
            object6 = context;
            object5 = objectArray;
            n3 = 3;
            Intrinsics.checkNotNullParameter(context, "context");
            file2 = context.getDir("CleverTap.Images.", 0);
            Intrinsics.checkNotNullExpressionValue(file2, "context.getDir(IMAGE_DIR\u2026ME, Context.MODE_PRIVATE)");
            file = context.getDir("CleverTap.Gif.", 0);
            Intrinsics.checkNotNullExpressionValue(file, "context.getDir(GIF_DIREC\u2026ME, Context.MODE_PRIVATE)");
            object6 = context.getDir("CleverTap.Files.", 0);
            Intrinsics.checkNotNullExpressionValue(object6, "context.getDir(ALL_FILE_\u2026ME, Context.MODE_PRIVATE)");
            DH$a dH$a = dh_1.d;
            Intrinsics.checkNotNullParameter(file2, "diskMemoryLocation");
            long l2 = Runtime.getRuntime().maxMemory();
            int n4 = 32768;
            long l3 = n4;
            long l4 = l2 / l3;
            object4 = file3;
            long l7 = l3;
            l3 = l4;
            object3 = file3;
            file3 = file2;
            ((rn1_1)object4)(20480L, l4, file2);
            object4 = new kf1_1((rn1_1)object3, (yc1_2)objectArray);
            Intrinsics.checkNotNullParameter(file, "diskMemoryLocation");
            long l8 = Runtime.getRuntime().maxMemory() / l7;
            object2 = object3;
            rl0_12 = object7;
            object7 = file;
            object3 = new rn1_1(5120L, l8, file);
            object7 = new if1_1((rn1_1)object3, (yc1_2)objectArray);
            Intrinsics.checkNotNullParameter(object6, "diskMemoryLocation");
            long l12 = Runtime.getRuntime().maxMemory();
            l8 = l12 / l7;
            long l14 = 15360L;
            object2 = object3;
            object = object7;
            object7 = object6;
            object3 = new rn1_1(l14, l8, (File)object6);
            object2 = new gl0_1((rn1_1)object3, (yc1_2)objectArray);
            Intrinsics.checkNotNullParameter(object4, "inAppImageMemoryV1");
            Intrinsics.checkNotNullParameter(object, "inAppGifMemoryV1");
            Intrinsics.checkNotNullParameter(object2, "fileMemory");
            object3 = dh_1.e;
            if (object3 == null) {
                synchronized (dH$a) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                object3 = dh_1.e;
                                if (object3 != null) break block4;
                                dh_1.e = object3 = new dh_1((kf1_1)object4, (if1_1)object, (gl0_1)object2);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        object3 = Unit.a;
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object3 = dh_1.e;
        Intrinsics.checkNotNull(object3);
        object = new jf1_1((dh_1)object3, (yc1_2)object5);
        object4 = new Hf1((dh_1)object3, (yc1_2)object5);
        object2 = new fl0_1((dh_1)object3, (yc1_2)object5);
        Intrinsics.checkNotNullParameter(file2, "images");
        Intrinsics.checkNotNullParameter(file, "gifs");
        Intrinsics.checkNotNullParameter(object6, "allFileTypesDir");
        Intrinsics.checkNotNullParameter(rl0_12, "inAppRemoteSource");
        Intrinsics.checkNotNullParameter(object3, "ctCaches");
        Intrinsics.checkNotNullParameter(object, "imageMAO");
        Intrinsics.checkNotNullParameter(object4, "gifMAO");
        Intrinsics.checkNotNullParameter(object2, "fileMAO");
        ol0_12.a = object5;
        ol0_12.b = rl0_12;
        ol0_12.c = object;
        ol0_12.d = object4;
        ol0_12.e = object2;
        object6 = ie0_0.IMAGE;
        object5 = new mn1_0[n3];
        object5[0] = object;
        int n7 = 1;
        object5[n7] = object2;
        int n8 = 2;
        object5[n8] = object4;
        object5 = xx_2.i(object5);
        Pair pair = new Pair(object6, object5);
        object6 = ie0_0.GIF;
        object5 = new mn1_0[n3];
        object5[0] = object4;
        object5[n7] = object2;
        object5[n8] = object;
        object5 = xx_2.i(object5);
        Pair pair2 = new Pair(object6, object5);
        object6 = ie0_0.FILES;
        object5 = new mn1_0[n3];
        object5[0] = object2;
        object5[n7] = object;
        object5[n8] = object4;
        object5 = xx_2.i(object5);
        object = new Pair(object6, object5);
        object6 = new Pair[n3];
        object6[0] = pair;
        object6[n7] = pair2;
        object6[n8] = object;
        ol0_12.f = object6 = fh1_2.i(object6);
    }

    public static final Pair a(ol0_1 object, rs0_1 object2) {
        object.getClass();
        object = ((rs0_1)object2).b;
        int[] nArray = OL0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) {
            object2 = ((rs0_1)object2).d;
            Intrinsics.checkNotNull(object2);
            object = new Pair(object2, object2);
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final Bitmap b(String object) {
        ie0_0 ie0_02 = ie0_0.IMAGE;
        Pair pair = new Pair(object, (Object)ie0_02);
        object = sn1$a_0.a;
        return (Bitmap)this.c(pair, (sn1_1)object);
    }

    public final Object c(Pair object, sn1_1 object2) {
        Object object3;
        String string2 = (String)((Pair)object).a;
        object = (ie0_0)((Object)((Pair)object).b);
        Object object4 = "FileDownload";
        Object object5 = this.a;
        if (object5 != null) {
            object3 = new StringBuilder();
            String string3 = ((Enum)object).name();
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append(" data for key ");
            ((StringBuilder)object3).append(string2);
            string3 = " requested";
            ((StringBuilder)object3).append(string3);
            object3 = ((StringBuilder)object3).toString();
            object5.b((String)object4, (String)object3);
        }
        object3 = null;
        if (string2 == null) {
            if (object5 != null) {
                object2 = new StringBuilder();
                object = ((Enum)object).name();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" data for null key requested");
                object = ((StringBuilder)object2).toString();
                object5.b((String)object4, (String)object);
            }
            return null;
        }
        object4 = this.f;
        if ((object = (List)object4.get(object)) != null) {
            block8: {
                boolean bl2;
                object = (Iterable)object;
                object4 = object.iterator();
                while (bl2 = object4.hasNext()) {
                    object5 = ((mn1_0)object4.next()).f(string2, (sn1_1)object2);
                    if (object5 == null) continue;
                    break block8;
                }
                bl2 = false;
                object5 = null;
            }
            if (object5 == null) {
                boolean bl3;
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    object4 = ((mn1_0)object.next()).d(string2, (sn1_1)object2);
                    if (object4 == null) continue;
                    object3 = object4;
                    break;
                }
            } else {
                object3 = object5;
            }
        }
        return object3;
    }

    public final Object d(Pair object, mn1_0 object2, Function1 object3, Function1 object4) {
        Object object5 = ((Pair)object).a;
        object3 = object3.invoke(object5);
        char c2 = ' ';
        String string2 = "Returning requested ";
        String string3 = "FileDownload";
        yc1_2 yc1_22 = this.a;
        Object object6 = ((Pair)object).b;
        if (object3 != null) {
            if (yc1_22 != null) {
                object = new StringBuilder(string2);
                object5 = (String)object5;
                ((StringBuilder)object).append((String)object5);
                ((StringBuilder)object).append(c2);
                object6 = (ie0_0)((Object)object6);
                object2 = ((Enum)object6).name();
                ((StringBuilder)object).append((String)object2);
                object2 = " from cache";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                yc1_22.b(string3, (String)object);
            }
            return object3;
        }
        object = this.b.a((Pair)object);
        object3 = ((rs0_1)object).b;
        int[] nArray = OL0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object3).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) == n4) {
            object = object4.invoke(object);
            Intrinsics.checkNotNull(object);
            object = (Pair)object;
            object5 = (String)object5;
            object3 = (byte[])((Pair)object).b;
            object3 = object2.c((String)object5, (byte[])object3);
            object = ((Pair)object).a;
            object4 = new Pair(object, object3);
            object2.e((String)object5, (Pair)object4);
            if (yc1_22 != null) {
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append((String)object5);
                ((StringBuilder)object2).append(c2);
                object6 = (ie0_0)((Object)object6);
                object3 = ((Enum)object6).name();
                ((StringBuilder)object2).append((String)object3);
                object3 = " with network, saved in cache";
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
                yc1_22.b(string3, (String)object2);
            }
        } else {
            if (yc1_22 != null) {
                object2 = new StringBuilder("There was a problem fetching data for ");
                object6 = (ie0_0)((Object)object6);
                object3 = ((Enum)object6).name();
                ((StringBuilder)object2).append((String)object3);
                object3 = ", status: ";
                ((StringBuilder)object2).append((String)object3);
                object = ((rs0_1)object).b;
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                yc1_22.b(string3, (String)object);
            }
            object = null;
        }
        return object;
    }

    public final byte[] e(String string2) {
        OL0$c oL0$c;
        OL0$b oL0$b;
        Intrinsics.checkNotNullParameter(string2, "url");
        ie0_0 ie0_02 = ie0_0.FILES;
        Pair pair = new Pair(string2, (Object)ie0_02);
        Object object = oL0$b;
        oL0$b = new FunctionReferenceImpl(1, this, ol0_1.class, "cachedFileInBytes", "cachedFileInBytes(Ljava/lang/String;)[B", 0);
        object = oL0$c;
        oL0$c = new FunctionReferenceImpl(1, this, ol0_1.class, "downloadedBytesFromApi", "downloadedBytesFromApi(Lcom/clevertap/android/sdk/network/DownloadedBitmap;)Lkotlin/Pair;", 0);
        object = this.e;
        return (byte[])this.d(pair, (mn1_0)object, oL0$b, oL0$c);
    }

    public final byte[] f(String string2) {
        OL0$e oL0$e;
        OL0$d oL0$d;
        Intrinsics.checkNotNullParameter(string2, "url");
        ie0_0 ie0_02 = ie0_0.GIF;
        Pair pair = new Pair(string2, (Object)ie0_02);
        Object object = oL0$d;
        oL0$d = new FunctionReferenceImpl(1, this, ol0_1.class, "cachedInAppGifV1", "cachedInAppGifV1(Ljava/lang/String;)[B", 0);
        object = oL0$e;
        oL0$e = new FunctionReferenceImpl(1, this, ol0_1.class, "downloadedBytesFromApi", "downloadedBytesFromApi(Lcom/clevertap/android/sdk/network/DownloadedBitmap;)Lkotlin/Pair;", 0);
        object = this.d;
        return (byte[])this.d(pair, (mn1_0)object, oL0$d, oL0$e);
    }
}

