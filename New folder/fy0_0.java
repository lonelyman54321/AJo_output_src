/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  org.json.JSONObject
 */
import android.app.Application;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from FY0
 */
public final class fy0_0 {
    public final wy0_1 a;
    public final Application b;
    public final List c;
    public final String d;
    public final hh3_2 e;

    public fy0_0(wy0_1 object, Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = object;
        this.b = application;
        this.c = object = xx_2.i("uiel=Mobile", "site=rilfnl", "isAppsFlag=true");
        this.d = object = em_1.a(AJIOApplication.Companion);
        object = new rg0_2(1);
        this.e = object = yr1_2.b((Function0)object);
    }

    public final void gamezoneLandingShare() {
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        String string2 = "gamezoneLandingShare>>>>>>>";
        ((yn3$a)object).a(string2, objectArray);
        object = this.a;
        if (object != null) {
            object.Y1();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void openGame(String object) {
        Exception exception2;
        Object object2;
        block4: {
            String string2;
            Object object3;
            block3: {
                object2 = "redirectUrl>>>>>>>";
                Object[] objectArray = "gameName>>>>>>>";
                String string3 = "openGame>>>>>>>";
                try {
                    Intrinsics.checkNotNull(object);
                    object3 = new JSONObject((String)object);
                    string2 = "redirectUrl";
                    string2 = object3.getString(string2);
                    Object object4 = "gameName";
                    object3 = object3.getString((String)object4);
                    object4 = yn3_0.a;
                    Object[] objectArray2 = new StringBuilder(string3);
                    objectArray2.append((String)object);
                    object = objectArray2.toString();
                    string3 = null;
                    objectArray2 = new Object[]{};
                    ((yn3$a)object4).a((String)object, objectArray2);
                    object = new StringBuilder((String)objectArray);
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    objectArray = new Object[]{};
                    ((yn3$a)object4).a((String)object, objectArray);
                    object = new StringBuilder((String)object2);
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    object2 = new Object[]{};
                    ((yn3$a)object4).a((String)object, (Object[])object2);
                    object = this.e;
                    object = ((hh3_2)object).getValue();
                    object2 = "getValue(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object = (UserInformation)object;
                    boolean bl2 = ((UserInformation)object).isUserOnline();
                    object2 = this.a;
                    if (bl2) break block3;
                    if (object2 == null) return;
                }
                catch (Exception exception2) {
                    break block4;
                }
                Intrinsics.checkNotNull(string2);
                object2.o0(string2);
                return;
            }
            if (object2 == null) return;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(object3);
            object2.y0(string2, (String)object3);
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
    }

    public final void openTncPage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object = yn3_0.a;
        String string3 = kp1_0.c("openTncPage>>>>>>>", string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a(string3, objectArray);
        object = this.a;
        if (object != null) {
            object.e(string2);
        }
    }

    public final void startPlaying(String string2) {
        block9: {
            Object object = yn3_0.a;
            Object object2 = kp1_0.c("startPlaying>>>>>>>", string2);
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray);
            Intrinsics.checkNotNull(string2);
            object = new JSONObject(string2);
            string2 = "gameUrl";
            string2 = object.getString(string2);
            object2 = "gameName";
            object = object.getString((String)object2);
            object2 = this.a;
            if (object2 == null) break block9;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(object);
            try {
                object2.O(string2, (String)object);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public final void viewApplicableProducts(String string2) {
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        String string3 = "viewApplicableProducts>>>>>>>";
        ((yn3$a)object).a(string3, objectArray);
        if (string2 != null && (object = this.a) != null) {
            object.a(string2);
        }
    }

    public final void viewTC(String string2) {
        wy0_1 wy0_12;
        if (string2 != null && (wy0_12 = this.a) != null) {
            wy0_12.e(string2);
        }
    }
}

