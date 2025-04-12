/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$d;
import com.facebook.f;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from O01
 */
public final class o01_0
implements GraphRequest$b {
    public final /* synthetic */ GraphRequest$d a;

    public /* synthetic */ o01_0(GraphRequest$d graphRequest$d) {
        this.a = graphRequest$d;
    }

    public final void b(f f5) {
        Intrinsics.checkNotNullParameter(f5, "response");
        GraphRequest$d graphRequest$d = this.a;
        if (graphRequest$d != null) {
            f5 = f5.b;
            graphRequest$d.a((JSONObject)f5);
        }
    }
}

