/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.remoteconfig.devsettings.view;

import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ConfigEditActivity$c
implements ZR2 {
    public final /* synthetic */ ConfigEditActivity a;
    public final /* synthetic */ Data b;
    public final /* synthetic */ int c;

    public ConfigEditActivity$c(ConfigEditActivity configEditActivity, Data data, int n3) {
        this.a = configEditActivity;
        this.b = data;
        this.c = n3;
    }

    public final void a(String object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "text");
        Object object2 = this.a;
        Object object3 = ((ConfigEditActivity)object2).k0;
        Object object4 = this.b;
        if (object3 != null) {
            string2 = ((Data)object4).a;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNullParameter(string2, "key");
            String string3 = "value";
            Intrinsics.checkNotNullParameter(object, string3);
            object3 = ((ao0_0)object3).d.edit().putString(string2, (String)object);
            object3.apply();
        }
        if ((object2 = ((ConfigEditActivity)object2).Y) != null) {
            object4.getClass();
            Intrinsics.checkNotNullParameter(object, "editedValue");
            string2 = ((Data)object4).a;
            object4 = ((Data)object4).b;
            object3 = new Data(string2, (String)object4, (String)object);
            Intrinsics.checkNotNullParameter(object3, "data");
            object = ((i40)object2).c;
            int n3 = this.c;
            ((ArrayList)object).remove(n3);
            ((ArrayList)object).add(n3, object3);
            ((RecyclerView$f)object2).notifyItemChanged(n3);
        }
    }
}

