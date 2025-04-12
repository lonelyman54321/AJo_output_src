/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest$b;
import com.facebook.f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class jz3
implements GraphRequest$b {
    public final /* synthetic */ lz3$a a;
    public final /* synthetic */ String b;

    public /* synthetic */ jz3(lz3$a lz3$a, String string2) {
        this.a = lz3$a;
        this.b = string2;
    }

    public final void b(f object) {
        Object object2;
        block4: {
            block3: {
                String string2;
                lz3$a lz3$a;
                block2: {
                    lz3$a = this.a;
                    Intrinsics.checkNotNullParameter(lz3$a, "$callback");
                    string2 = this.b;
                    Intrinsics.checkNotNullParameter(string2, "$accessToken");
                    Intrinsics.checkNotNullParameter(object, "response");
                    object2 = ((f)object).c;
                    if (object2 == null) break block2;
                    object = ((FacebookRequestError)object2).i;
                    lz3$a.b((FacebookException)object);
                    break block3;
                }
                object = ((f)object).d;
                if (object == null) break block4;
                object2 = gb2_0.a;
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(object, "value");
                object2 = gb2_0.a;
                ((ConcurrentHashMap)object2).put(string2, object);
                lz3$a.a((JSONObject)object);
            }
            return;
        }
        object2 = "Required value was null.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

