/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class Qn3
extends ContextWrapper {
    public static final Object a;

    public static void a(Context context) {
        Resources resources;
        boolean bl2 = context instanceof Qn3;
        if (!bl2 && !(bl2 = (resources = context.getResources()) instanceof sn3_0)) {
            context.getResources();
        }
    }
}

