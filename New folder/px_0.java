/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.b;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Px
 */
public final class px_0
implements ic1_1 {
    public final sx_2 a;

    public px_0(sx_2 sx_22) {
        Intrinsics.checkNotNullParameter(sx_22, "bitmapDownloader");
        this.a = sx_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final rs0_1 a(ox_0 object) {
        String string2;
        block19: {
            Object object2;
            Object object3;
            block20: {
                block17: {
                    Object object4;
                    block18: {
                        Object object5;
                        Object object6;
                        int n3;
                        long l2;
                        boolean bl2;
                        boolean bl3;
                        Intrinsics.checkNotNullParameter(object, "bitmapDownloadRequest");
                        b.j();
                        object3 = ((ox_0)object).a;
                        string2 = "status";
                        if (object3 == null || (bl3 = kotlin.text.b.k((CharSequence)object3))) break block19;
                        object2 = "/";
                        int n4 = 0;
                        Object object7 = null;
                        object3 = kotlin.text.b.n(kotlin.text.b.n(kotlin.text.b.n((String)object3, "///", (String)object2, false), "//", (String)object2, false), "http:/", "http://", false);
                        object4 = "https:/";
                        object2 = "https://";
                        object3 = kotlin.text.b.n((String)object3, (String)object4, (String)object2, false);
                        object = ((ox_0)object).c;
                        if (object != null && !(bl2 = tu1_1.h((Context)object))) {
                            b.j();
                            object7 = rs0$a_0.NO_NETWORK;
                            Intrinsics.checkNotNullParameter(object7, string2);
                            object4 = object;
                            return new rs0_1(null, (rs0$a_0)((Object)object7), -1, null);
                        }
                        object = this.a;
                        object.getClass();
                        object4 = "connection";
                        Intrinsics.checkNotNullParameter(object3, "srcUrl");
                        b.j();
                        object2 = yz3_0.a;
                        ((sx_2)object).d = l2 = System.currentTimeMillis();
                        object2 = null;
                        try {
                            object7 = new URL((String)object3);
                            ((sx_2)object).e = object3 = ((sx_2)object).a((URL)object7);
                            ((URLConnection)object3).connect();
                            n4 = ((HttpURLConnection)object3).getResponseCode();
                            n3 = 200;
                            if (n4 != n3) {
                                b.c();
                                rs0$a_0 rs0$a_0 = rs0$a_0.DOWNLOAD_FAILED;
                                Intrinsics.checkNotNullParameter((Object)rs0$a_0, string2);
                                long l3 = -1;
                                Object object8 = object3;
                                object3 = new rs0_1(null, rs0$a_0, l3, null);
                                object = ((sx_2)object).e;
                                if (object != null) break block17;
                                break block18;
                            }
                            b.j();
                            n4 = ((URLConnection)object3).getContentLength();
                            object6 = ((sx_2)object).c;
                            object5 = ((Pair)object6).a;
                            object5 = (Boolean)object5;
                            boolean bl4 = (Boolean)object5;
                            object6 = ((Pair)object6).b;
                            object6 = (Number)object6;
                            n3 = ((Number)object6).intValue();
                            if (bl4 && n4 > n3) {
                                b.j();
                                rs0$a_0 rs0$a_0 = rs0$a_0.SIZE_LIMIT_EXCEEDED;
                                Intrinsics.checkNotNullParameter((Object)rs0$a_0, string2);
                                Object var13_15 = null;
                                long l4 = -1;
                                object3 = new rs0_1(null, rs0$a_0, l4, null);
                                object = ((sx_2)object).e;
                                if (object != null) break block17;
                                break block18;
                            }
                            object7 = ((sx_2)object).b;
                            object6 = ((URLConnection)object3).getInputStream();
                            object5 = "inputStream";
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                            long l7 = ((sx_2)object).d;
                            object3 = ((ly_0)object7).a((InputStream)object6, (HttpURLConnection)object3, l7);
                            object = ((sx_2)object).e;
                            if (object != null) break block17;
                        }
                        catch (Throwable throwable) {
                            try {
                                b.j();
                                object5 = rs0$a_0.DOWNLOAD_FAILED;
                                Intrinsics.checkNotNullParameter(object5, string2);
                                n3 = 0;
                                object6 = null;
                                long l8 = -1;
                                Object var19_23 = null;
                                object7 = object3;
                                object3 = new rs0_1(null, (rs0$a_0)((Object)object5), l8, null);
                            }
                            catch (Throwable throwable2) {
                                try {
                                    object = ((sx_2)object).e;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                    } else {
                                        object2 = object;
                                    }
                                    ((HttpURLConnection)object2).disconnect();
                                    throw throwable2;
                                }
                                catch (Throwable throwable3) {
                                    b.l();
                                }
                                throw throwable2;
                            }
                            try {
                                object = ((sx_2)object).e;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                } else {
                                    object2 = object;
                                }
                                ((HttpURLConnection)object2).disconnect();
                                return object3;
                            }
                            catch (Throwable throwable4) {
                                b.l();
                            }
                            return object3;
                        }
                    }
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    break block20;
                }
                object2 = object;
            }
            ((HttpURLConnection)object2).disconnect();
            return object3;
        }
        rs0$a_0 rs0$a_0 = rs0$a_0.NO_IMAGE;
        Intrinsics.checkNotNullParameter((Object)rs0$a_0, string2);
        Object object9 = object;
        return new rs0_1(null, rs0$a_0, -1, null);
    }
}

