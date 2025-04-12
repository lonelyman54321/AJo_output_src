/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.ViewIndexer$a;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from YC3
 */
public final class yc3_0
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ ViewIndexer b;

    public /* synthetic */ yc3_0(String string2, ViewIndexer viewIndexer) {
        this.a = string2;
        this.b = viewIndexer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Class<ViewIndexer> clazz;
        block4: {
            String string2;
            Object object;
            Object object2 = this.a;
            ViewIndexer viewIndexer = this.b;
            clazz = ViewIndexer.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            Object object3 = "$tree";
            try {
                boolean bl3;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = "this$0";
                Intrinsics.checkNotNullParameter(viewIndexer, (String)object3);
                object3 = lz3_0.a;
                object3 = "key";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = lz3_0.a;
                object3.getClass();
                object3 = Charsets.UTF_8;
                object3 = ((String)object2).getBytes((Charset)object3);
                object = "this as java.lang.String).getBytes(charset)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                object = "MD5";
                object3 = lz3_0.u((String)object, (byte[])object3);
                object = AccessToken.l;
                object = AccessToken$b.b();
                if (object3 != null && (bl3 = Intrinsics.areEqual(object3, string2 = viewIndexer.d))) {
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            string2 = ViewIndexer.e;
            string2 = FacebookSdk.b();
            object2 = ViewIndexer$a.a((String)object2, (AccessToken)object, string2);
            viewIndexer.b((GraphRequest)object2, (String)object3);
            return;
        }
        td0.a(clazz, throwable2);
    }
}

