/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 */
import android.content.IntentFilter;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

public abstract class G1 {
    public static final /* synthetic */ int d;
    public final G1$a a;
    public final Xv1 b;
    public boolean c;

    public G1() {
        G1$a g1$a;
        Xz3.h();
        this.a = g1$a = new G1$a(this);
        Xv1 xv1 = Xv1.a(FacebookSdk.a());
        String string2 = "getInstance(FacebookSdk.getApplicationContext())";
        Intrinsics.checkNotNullExpressionValue(xv1, string2);
        this.b = xv1;
        boolean bl2 = this.c;
        if (!bl2) {
            boolean bl3;
            String string3 = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
            string2.addAction(string3);
            xv1.b(g1$a, (IntentFilter)string2);
            this.c = bl3 = true;
        }
    }

    public abstract void a();
}

