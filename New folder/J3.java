/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class J3
implements n {
    public final /* synthetic */ K3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ w3 c;
    public final /* synthetic */ x3 d;

    public /* synthetic */ J3(K3 k3, String string2, w3 w34, x3 x32) {
        this.a = k3;
        this.b = string2;
        this.c = w34;
        this.d = x32;
    }

    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(object2, "event");
        object = i$a.ON_START;
        K3 k3 = this.a;
        String string2 = this.b;
        if (object == object2) {
            object = k3.e;
            w3 w34 = this.c;
            x3 x32 = this.d;
            object2 = new K3$a(x32, w34);
            object.put(string2, object2);
            object = k3.f;
            boolean bl2 = object.containsKey(string2);
            if (bl2) {
                object2 = ((LinkedHashMap)object).get(string2);
                object.remove(string2);
                w34.a(object2);
            }
            if ((object2 = (ActivityResult)BE.a((Bundle)(object = k3.g), string2)) != null) {
                object.remove(string2);
                int n3 = ((ActivityResult)object2).a;
                object2 = ((ActivityResult)object2).b;
                object = x32.c(n3, (Intent)object2);
                w34.a(object);
            }
        } else {
            object = i$a.ON_STOP;
            if (object == object2) {
                object = k3.e;
                object.remove(string2);
            } else {
                object = i$a.ON_DESTROY;
                if (object == object2) {
                    k3.f(string2);
                }
            }
        }
    }
}

