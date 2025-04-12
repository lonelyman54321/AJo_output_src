/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.GraphRequest$b;
import com.facebook.f;
import com.facebook.internal.WebDialog$d;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pF3
 */
public final class pf3_2
implements GraphRequest$b {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WebDialog$d c;
    public final /* synthetic */ CountDownLatch d;

    public /* synthetic */ pf3_2(String[] stringArray, int n3, WebDialog$d webDialog$d, CountDownLatch countDownLatch) {
        this.a = stringArray;
        this.b = n3;
        this.c = webDialog$d;
        this.d = countDownLatch;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        CountDownLatch countDownLatch;
        block7: {
            Exception exception2;
            Object object2;
            WebDialog$d webDialog$d;
            block6: {
                Object object3;
                int n3 = this.b;
                String[] stringArray = this.a;
                Intrinsics.checkNotNullParameter(stringArray, "$results");
                webDialog$d = this.c;
                Intrinsics.checkNotNullParameter((Object)webDialog$d, "this$0");
                countDownLatch = this.d;
                Intrinsics.checkNotNullParameter(countDownLatch, "$latch");
                object2 = "response";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                try {
                    object2 = ((f)object).c;
                    object3 = "Error staging photo.";
                    if (object2 != null) {
                        if ((object2 = object2.a()) != null) {
                            object3 = object2;
                        }
                        object2 = new FacebookGraphResponseException((f)object, (String)object3);
                        throw object2;
                    }
                }
                catch (Exception exception2) {
                    break block6;
                }
                object = ((f)object).b;
                if (object == null) {
                    object = new FacebookException((String)object3);
                    throw object;
                }
                object2 = "uri";
                if ((object = object.optString((String)object2)) == null) {
                    object = new FacebookException((String)object3);
                    throw object;
                }
                stringArray[n3] = object;
                break block7;
            }
            object2 = webDialog$d.c;
            object2[n3] = exception2;
        }
        countDownLatch.countDown();
    }
}

