/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class lo
implements kJ0$a,
Uc1$a {
    public boolean a(int n3, int n4, int n7, int n8, int n10) {
        int n14 = 67;
        int n15 = 2;
        int n16 = 77;
        n3 = n4 == n14 && n7 == (n14 = 79) && n8 == n16 && (n10 == n16 || n3 == n15) || n4 == n16 && n7 == (n4 = 76) && n8 == n4 && (n10 == (n4 = 84) || n3 == n15) ? 1 : 0;
        return n3 != 0;
    }

    public void b(boolean bl2) {
        int n3 = 1;
        if (bl2) {
            GraphRequest graphRequest;
            String string2 = "null cannot be cast to non-null type kotlin.String";
            String string3 = vn_0.b;
            Object object = "/cloudbridge_settings";
            un_0 un_02 = new Object();
            Object object2 = FacebookSdk.b();
            String string4 = ((String)object2).concat((String)object);
            Qa1 qa1 = Qa1.GET;
            Object[] objectArray = null;
            int n4 = 32;
            object2 = graphRequest;
            graphRequest = new GraphRequest(null, string4, null, qa1, un_02, n4);
            object = sx1.d;
            object = Ax1.APP_EVENTS;
            Intrinsics.checkNotNull(string3, string2);
            object2 = " \n\nCreating Graph Request: \n=============\n%s\n\n ";
            objectArray = new Object[n3];
            objectArray[0] = graphRequest;
            try {
                sx1$a.b((Ax1)((Object)object), string3, (String)object2, objectArray);
                graphRequest.d();
            }
            catch (JSONException jSONException) {
                object2 = sx1.d;
                object2 = Ax1.APP_EVENTS;
                Intrinsics.checkNotNull(string3, string2);
                string2 = yc0_2.b(jSONException);
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = string2;
                string2 = " \n\nGraph Request Exception: \n=============\n%s\n\n ";
                sx1$a.b((Ax1)((Object)object2), string3, string2, objectArray2);
            }
        }
    }
}

