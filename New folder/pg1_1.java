/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.clevertap.android.sdk.inapp.InAppController;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/*
 * Renamed from pg1
 */
public final class pg1_1
implements Callable {
    public final /* synthetic */ JSONArray a;
    public final /* synthetic */ qg1_1 b;

    public pg1_1(qg1_1 qg1_12, JSONArray jSONArray) {
        this.b = qg1_12;
        this.a = jSONArray;
    }

    public final Object call() {
        InAppController inAppController = this.b.c.l;
        JSONArray jSONArray = this.a;
        inAppController.e(jSONArray);
        return null;
    }
}

