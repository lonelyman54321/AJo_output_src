/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lW0
 */
public abstract class lw0_0
extends cw0_0 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final tw0_0 d;

    public lw0_0(FragmentActivity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = object;
        this.b = object;
        this.c = handler;
        this.d = object = new FragmentManager();
    }

    public abstract void d(PrintWriter var1, String[] var2);

    public abstract FragmentActivity e();

    public abstract LayoutInflater f();

    public abstract boolean g(String var1);

    public final void h(Fragment object, Intent object2, int n3, Bundle bundle) {
        String string2 = "fragment";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "intent";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = -1;
        if (n3 == n4) {
            t70.startActivity(this.b, object2, bundle);
            return;
        }
        object2 = "Starting activity with a requestCode requires a FragmentActivity host".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public abstract void i();
}

