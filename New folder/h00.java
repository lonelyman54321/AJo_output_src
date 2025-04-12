/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.AdaptiveIconDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.UserPrincipal;

public final class h00 {
    public static /* bridge */ /* synthetic */ AclEntry.Builder a(AclEntry.Builder builder, UserPrincipal userPrincipal) {
        return builder.setPrincipal(userPrincipal);
    }

    public static /* bridge */ /* synthetic */ boolean b(Drawable drawable2) {
        return drawable2 instanceof AdaptiveIconDrawable;
    }
}

