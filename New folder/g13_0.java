/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.j;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G13
 */
public class g13_0
extends qi0_0 {
    public static final /* synthetic */ int i;
    public final boolean g;
    public final ArrayList h;

    static {
        dK$c.Share.toRequestCode();
    }

    public g13_0(mw0_0 object, int n3) {
        Intrinsics.checkNotNullParameter(object, "fragmentWrapper");
        super((mw0_0)object, n3);
        int n4 = 1;
        this.g = n4;
        Object object2 = new G13$e(this);
        G13$c g13$c = new G13$c(this);
        G13$g g13$g = new G13$g(this);
        G13$a g13$a = new G13$a(this);
        G13$f g13$f = new G13$f(this);
        Object[] objectArray = new qI0$a[5];
        objectArray[0] = object2;
        objectArray[n4] = g13$c;
        objectArray[2] = g13$g;
        objectArray[3] = g13$a;
        objectArray[4] = g13$f;
        this.h = object = xx_2.d(objectArray);
        object = dk_1.b;
        object2 = new u13_0(n3);
        ((dK$b)object).a(n3, (dk$a_0)object2);
    }

    public g13_0(Activity object, int n3) {
        Intrinsics.checkNotNullParameter(object, "activity");
        super((Activity)object, n3);
        int n4 = 1;
        this.g = n4;
        Object object2 = new G13$e(this);
        G13$c g13$c = new G13$c(this);
        G13$g g13$g = new G13$g(this);
        G13$a g13$a = new G13$a(this);
        G13$f g13$f = new G13$f(this);
        Object[] objectArray = new qI0$a[5];
        objectArray[0] = object2;
        objectArray[n4] = g13$c;
        objectArray[2] = g13$g;
        objectArray[3] = g13$a;
        objectArray[4] = g13$f;
        object = xx_2.d(objectArray);
        this.h = object;
        object = dk_1.b;
        object2 = new u13_0(n3);
        ((dK$b)object).a(n3, (dk$a_0)object2);
    }

    public static final void e(g13_0 object, Activity object2, ShareContent object3, G13$d object4) {
        int n3 = (int)(((g13_0)object).g ? 1 : 0);
        if (n3) {
            object4 = G13$d.AUTOMATIC;
        }
        object = G13$h.$EnumSwitchMapping$0;
        int n4 = ((Enum)object4).ordinal();
        n3 = object[n4];
        n4 = 1;
        String string2 = "unknown";
        object = n3 != n4 ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? string2 : "native") : "web") : "automatic";
        object3 = G13$b.a(object3.getClass());
        object4 = h13_0.SHARE_DIALOG;
        if (object3 == object4) {
            string2 = "status";
        } else {
            object4 = h13_0.PHOTOS;
            if (object3 == object4) {
                string2 = "photo";
            } else {
                object4 = h13_0.VIDEO;
                if (object3 == object4) {
                    string2 = "video";
                }
            }
        }
        object3 = FacebookSdk.b();
        object4 = new g((Context)object2, (String)object3);
        Intrinsics.checkNotNullParameter(object4, "loggerImpl");
        object2 = "fb_share_dialog_show";
        object3 = "fb_share_dialog_content_type";
        object = px1_2.b((String)object2, (String)object, (String)object3, string2);
        boolean bl2 = j.c();
        if (bl2) {
            ((g)object4).h((Bundle)object, (String)object2);
        }
    }

    public pm_0 a() {
        int n3 = this.d;
        pm_0 pm_02 = new pm_0(n3);
        return pm_02;
    }

    public List c() {
        return this.h;
    }

    public boolean f() {
        return false;
    }
}

