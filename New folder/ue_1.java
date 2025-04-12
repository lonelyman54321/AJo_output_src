/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/*
 * Renamed from ue
 */
public final class ue_1
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ we b;

    public ue_1(we we2, String string2) {
        this.b = we2;
        this.a = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = "removing value for key ";
        Object object2 = "Cannot remove value for key ";
        Object object3 = this.b;
        CleverTapInstanceConfig cleverTapInstanceConfig = ((we)object3).e;
        Object object4 = this.a;
        if (object4 == null) {
            object4 = "";
        }
        try {
            Object object5 = ((we)object3).k;
            object5.getClass();
            object4 = ha3_1.c((String)object4);
            object5 = ((da3_1)object4).c;
            object5 = object5.toString();
            int n3 = ((String)object5).isEmpty();
            ea3_1 ea3_12 = ((we)object3).j;
            if (n3 != 0) {
                object = null;
                object = new String[]{};
                int n4 = 512;
                int n7 = 6;
                object = zB1.a((String[])object, n4, n7);
                ea3_12.b((da3_1)object);
                object2 = cleverTapInstanceConfig.b();
                object = ((da3_1)object).b;
                object2.getClass();
                com.clevertap.android.sdk.b.f((String)object);
                return null;
            }
            n3 = ((da3_1)object4).a;
            if (n3 != 0) {
                ea3_12.b((da3_1)object4);
            }
            object4 = ((String)object5).toLowerCase();
            String string2 = "identity";
            boolean bl2 = ((String)object4).contains(string2);
            string2 = " from user profile";
            if (bl2) {
                object = cleverTapInstanceConfig.b();
                object3 = cleverTapInstanceConfig.a;
                object4 = new StringBuilder((String)object2);
                ((StringBuilder)object4).append((String)object5);
                ((StringBuilder)object4).append(string2);
                object2 = ((StringBuilder)object4).toString();
                ((b)object).b((String)object3, (String)object2);
                return null;
            }
            object2 = new JSONObject();
            object4 = "$delete";
            boolean bl3 = true;
            object2 = object2.put((String)object4, bl3);
            object4 = new JSONObject();
            object2 = object4.put((String)object5, object2);
            object3 = ((we)object3).c;
            ((k0_0)object3).W((JSONObject)object2, bl3);
            object2 = cleverTapInstanceConfig.b();
            object3 = cleverTapInstanceConfig.a;
            object4 = new StringBuilder((String)object);
            ((StringBuilder)object4).append((String)object5);
            ((StringBuilder)object4).append(string2);
            object = ((StringBuilder)object4).toString();
            ((b)object2).b((String)object3, (String)object);
            return null;
        }
        catch (Throwable throwable) {
            object = cleverTapInstanceConfig.b();
            object.getClass();
            com.clevertap.android.sdk.b.m();
        }
        return null;
    }
}

