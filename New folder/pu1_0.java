/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import java.util.HashMap;

/*
 * Renamed from pu1
 */
public final class pu1_0 {
    public final HashMap a;
    public final dK2$b b;

    public pu1_0(dK2$b dK2$b) {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        this.b = dK2$b;
    }

    public final RequestManager a(Context object, a object2, i i3, FragmentManager object3, boolean bl2) {
        dz3.a();
        dz3.a();
        object3 = this.a;
        Object object4 = (RequestManager)((HashMap)object3).get(i3);
        if (object4 == null) {
            object4 = new ju1_0(i3);
            pu1$b pu1$b = new Object();
            dK2$b dK2$b = this.b;
            object = dK2$b.a((a)object2, (fu1_0)object4, pu1$b, (Context)object);
            ((HashMap)object3).put(i3, object);
            object2 = new pu1$a(this, i3);
            ((ju1_0)object4).b((ku1_0)object2);
            if (bl2) {
                ((RequestManager)object).onStart();
            }
            object4 = object;
        }
        return object4;
    }
}

