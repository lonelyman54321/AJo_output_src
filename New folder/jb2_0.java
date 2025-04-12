/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 */
import android.content.IntentFilter;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jB2
 */
public abstract class jb2_0 {
    public final jb2$a_0 a;
    public final Xv1 b;
    public boolean c;

    public jb2_0() {
        jb2$a_0 jb2$a_0;
        Xz3.h();
        this.a = jb2$a_0 = new jb2$a_0(this);
        Xv1 xv1 = Xv1.a(FacebookSdk.a());
        String string2 = "getInstance(FacebookSdk.getApplicationContext())";
        Intrinsics.checkNotNullExpressionValue(xv1, string2);
        this.b = xv1;
        boolean bl2 = this.c;
        if (!bl2) {
            boolean bl3;
            String string3 = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
            string2.addAction(string3);
            xv1.b(jb2$a_0, (IntentFilter)string2);
            this.c = bl3 = true;
        }
    }

    public abstract void a(Profile var1);
}

