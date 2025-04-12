/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class D3$a {
    public static ResolveInfo a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context = context.getPackageManager();
        Intent intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        return context.resolveActivity(intent, 0x110000);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String b(D3$f object) {
        String string2 = "input";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof D3$d;
        if (bl2) {
            return "image/*";
        }
        bl2 = object instanceof D3$e;
        if (!bl2) {
            boolean bl3 = object instanceof d3_0.c;
            if (bl3) return null;
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = (D3$e)object;
        object.getClass();
        return null;
    }
}

